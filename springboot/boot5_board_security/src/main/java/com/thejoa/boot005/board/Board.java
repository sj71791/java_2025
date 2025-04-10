package com.thejoa.boot005.board;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.thejoa.boot005.member.Member;

import lombok.Getter;
import lombok.Setter;

//@Data
@Entity @Getter @Setter //@ToString(excludes = "member")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=200)
	private String btitle;
	
	@Column(columnDefinition = "text")
	private String bcontent;
	
	private String bfile;
	private Long bhit=0L;
	private String bip;
	private String bpass;
	
	@Column(updatable = false)
	private LocalDateTime create_date=LocalDateTime.now();
	
	@ManyToOne	@JoinColumn(name="Member_ID")
	private Member member;
}
