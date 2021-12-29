

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeVer051 {
	static Scanner sc;

	public static void main(String[] args) {
		// 
		System.out.println("학생성적관리프로그램(ver 0.5.1)");
		ArrayList<HashMap<String,String>> data=new ArrayList<>();
		sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("---------------------------------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("---------------------------------------------------------------");
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> stu=data.get(i);
					System.out.println(stu.get("num")+"\t"+stu.get("kor")+"\t"+stu.get("eng")+"\t"+stu.get("math"));
				}
				System.out.println("---------------------------------------------------------------");
			}else if(input.equals("2")){
				HashMap<String,String> stu=getStu();
				data.add(stu);
			}else if(input.equals("3")){
				System.out.print("수정할 ");
				HashMap<String,String> stu=getStu();
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> ele=data.get(i);
					if(ele.get("num").equals(stu.get("num"))){
						data.set(i, stu);
					}
				}
			}else if(input.equals("4")){
				System.out.print("삭제할 학번>");
				input=sc.nextLine();
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> ele=data.get(i);
					if(ele.get("num").equals(input)){
						data.remove(i);
					}
				}
			}
		}
	}
	
	public static HashMap<String,String> getStu(){
		HashMap<String,String> stu=new HashMap<>();
		System.out.print("학번>");
		stu.put("num", sc.nextLine());
		System.out.print("국어>");
		stu.put("kor", sc.nextLine());
		System.out.print("영어>");
		stu.put("eng", sc.nextLine());
		System.out.print("수학>");
		stu.put("math", sc.nextLine());
		return stu;
	}

}



