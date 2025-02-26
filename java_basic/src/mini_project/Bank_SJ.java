package mini_project;
import java.util.Scanner;

public class Bank_SJ {
	public static void main(String [] args) {
		int age=0, money=0, num, inmon; 
		String menu="", id="", pw="", inid="", inpw="";
		char yn;
		Scanner scanner=new Scanner(System.in); 
		
		menu="======Bank======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료";
		System.out.println("WELCOME! (주)**** Bank\n");

		for(;;) {
			System.out.print(menu+"\n입력>>> ");
			num=scanner.nextInt();
			int find=-1;
			if(num==1) {
				System.out.print("추가기능 입니다.\n아이디 입력 : ");
				id=scanner.next();
				System.out.print("비밀번호 입력 : ");
				pw=scanner.next();
				System.out.print("나이 입력 : ");
				age=scanner.nextInt();
				System.out.print("잔액 입력 : ");
				money=scanner.nextInt();
			}else if(num==2 ||  num==3 || num==4 ||  num==5 ) {
				inid=scanner.next();
				System.out.print("password : ");
				inpw=scanner.next();
				if(inid.equals(id) && inpw.equals(pw)) { find=1;}
				else {System.out.println("다시 확인해주세요");};
			}else if(num==9) {System.out.println("종료기능 입니다."); break;}
			
			if(find!=-1) {
				if(num==2) {
					System.out.print("조회기능 입니다.\nid : ");
					System.out.println("==계좌조회\nID : "+id+"\nPASS : "+pw+"\n나이 : "+age+"\n잔액 : "+money);
				}
				else if(num==3) {
						System.out.print("입금기능 입니다.\n  : ");
						System.out.print("입금 : ");
						inmon=scanner.nextInt();
						money+=inmon;
						System.out.println("==입금완료\n잔액 : "+money);
				}
				else if(num==4) {
						System.out.print("출금기능 입니다.\n  : ");
						System.out.print("출금 : ");
						inmon=scanner.nextInt();
						if(money>=inmon) {
							money-=inmon;
							System.out.println("==출금완료\n잔액 : "+money);
						} else {System.out.println("잔액이 부족합니다");}
				}
				else if(num==5) {
						System.out.print("삭제기능 입니다.\n  : ");
						System.out.print("계좌를 삭제하시겠습니까? (Y/N) ");
						yn=scanner.next().charAt(0);
						if(yn=='y') {
							id="";
							pw="";
							System.out.println("처리되었습니다");
						}
				}
			}
		}
	}
}

// 1. 동영상찍기  
// 2. github 에 올리기  
// 3. 배열버젼 도전!
//	  String []id=new String[3];
//    String []pw=new String[3];   
//    int    [] money = new int[3];



