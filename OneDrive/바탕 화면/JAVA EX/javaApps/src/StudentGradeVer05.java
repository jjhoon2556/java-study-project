

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentGradeVer05 {

	

	public static void main(String[] args) {
		//학생성적관리 프로그램(ver0.5.0)
		//1.보기 2.입력 3.수정 4.삭제 0.종료 >
		
		int kor=0, math=0, eng=0;
		int number;
		String name;
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<Integer> korList = new ArrayList<>();
		ArrayList<Integer> mathList = new ArrayList<>();
		ArrayList<Integer> engList = new ArrayList<>();
		
		System.out.println("학생성적관리 프로그램(ver0.5.0)");
				
		while(true) {
		System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
			//1. 보기
			if(input.equals("1")) {
				System.out.println("-----------------------------------");
				System.out.println("번호\t이름\t국어\t수학\t영어");
				System.out.println("-----------------------------------");
				for(int i=0; i<korList.size(); i++) { 
					System.out.print(i+1+"\t");
					System.out.print(nameList.get(i)+"\t");
					System.out.print(korList.get(i)+"\t");
				    System.out.print(mathList.get(i)+"\t");
				    System.out.print(engList.get(i)+"\t");//값 출력
				    System.out.println(); //값 출력
				}
			
				System.out.print("-----------------------------------");
				System.out.println(); 
			}
			
			//2. 입력
			else if(input.equals("2")) {
				System.out.print("이름>>> ");
				name = sc.next();
				nameList.add(name);
				System.out.print("국어>>> ");
				kor = sc.nextInt();
				korList.add(kor);
				System.out.print("수학>>> ");
				math = sc.nextInt();
				mathList.add(math);
				System.out.print("영어>>> ");
				eng = sc.nextInt();
				engList.add(eng);
				
			}
			//수정
			else if(input.equals("3")) {
				System.out.print("수정할 번호>>");
				number = sc.nextInt();
				System.out.print("국어>>");
				kor = sc.nextInt();
				korList.set(number-1,kor);	
				System.out.print("수학>>");
				math = sc.nextInt();
				mathList.set(number-1,kor);	 
				System.out.print("영어>>");
				eng = sc.nextInt();
				engList.set(number-1,kor);	 
				 }
			
			//삭제
			else if(input.equals("4")) {
				System.out.print("삭제할 번호>> ");
				number = sc.nextInt();
				korList.remove(number-1);
				mathList.remove(number-1);
				engList.remove(number-1);
			}
			//종료
			else if(input.equals("0")) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력했습니다.");
				
			}
		}
	}


}
