package com.company.project001.member;

import org.apache.ibatis.annotations.Param;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.company.project001.domain.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberMapper       memberMapper;
	private final PasswordEncoder    passwordEncoder;
	
	public  Member     insert(Member member) {
		 member.setNickname( member.getUsername() );
		 member.setImage(    "/images/thejoa.png");
		 member.setRole(     MemberRole.MEMBER);
		 member.setProvider( "thejoa");
		 member.setPassword(passwordEncoder.encode(member.getPassword()));
		 memberMapper.insert(member);
		return member;
	}

//	public  List<Member>  findAll();   
	public  Member  findByUsername( String username ) {
		return   memberMapper.findByUsername(username);
	};
	public  Member  findById(Long id) {
		return   memberMapper.findById(id);
	}
	
	public  int     updateByIdAndPassword( Member member,   String oldPassword ) {
		Member find = memberMapper.findById(member.getId());  //유저찾기 - db pass
		if(find != null  &&  passwordEncoder.matches(oldPassword, find.getPassword())) { //old pass
			String newPassword = passwordEncoder.encode(member.getPassword());  // 사용자가 입력한값
			return memberMapper.updateByIdAndPassword(find.getId(), 
													find.getPassword(), newPassword);
		}
		return 0;
	}
//	public  int     update(Member member);
	public  boolean     delete(Long id , String password) {
		Member find = memberMapper.findById(id);  //유저찾기 - db pass
		if(find != null  &&  passwordEncoder.matches(password, find.getPassword())) {
			return memberMapper.delete(id) > 0 ;
		}
		return false;
	}

}
