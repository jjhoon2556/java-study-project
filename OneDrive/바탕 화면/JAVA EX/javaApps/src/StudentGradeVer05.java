

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentGradeVer05 {

	

	public static void main(String[] args) {
		//�л��������� ���α׷�(ver0.5.0)
		//1.���� 2.�Է� 3.���� 4.���� 0.���� >
		
		int kor=0, math=0, eng=0;
		int number;
		String name;
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<Integer> korList = new ArrayList<>();
		ArrayList<Integer> mathList = new ArrayList<>();
		ArrayList<Integer> engList = new ArrayList<>();
		
		System.out.println("�л��������� ���α׷�(ver0.5.0)");
				
		while(true) {
		System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
			//1. ����
			if(input.equals("1")) {
				System.out.println("-----------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����");
				System.out.println("-----------------------------------");
				for(int i=0; i<korList.size(); i++) { 
					System.out.print(i+1+"\t");
					System.out.print(nameList.get(i)+"\t");
					System.out.print(korList.get(i)+"\t");
				    System.out.print(mathList.get(i)+"\t");
				    System.out.print(engList.get(i)+"\t");//�� ���
				    System.out.println(); //�� ���
				}
			
				System.out.print("-----------------------------------");
				System.out.println(); 
			}
			
			//2. �Է�
			else if(input.equals("2")) {
				System.out.print("�̸�>>> ");
				name = sc.next();
				nameList.add(name);
				System.out.print("����>>> ");
				kor = sc.nextInt();
				korList.add(kor);
				System.out.print("����>>> ");
				math = sc.nextInt();
				mathList.add(math);
				System.out.print("����>>> ");
				eng = sc.nextInt();
				engList.add(eng);
				
			}
			//����
			else if(input.equals("3")) {
				System.out.print("������ ��ȣ>>");
				number = sc.nextInt();
				System.out.print("����>>");
				kor = sc.nextInt();
				korList.set(number-1,kor);	
				System.out.print("����>>");
				math = sc.nextInt();
				mathList.set(number-1,kor);	 
				System.out.print("����>>");
				eng = sc.nextInt();
				engList.set(number-1,kor);	 
				 }
			
			//����
			else if(input.equals("4")) {
				System.out.print("������ ��ȣ>> ");
				number = sc.nextInt();
				korList.remove(number-1);
				mathList.remove(number-1);
				engList.remove(number-1);
			}
			//����
			else if(input.equals("0")) {
				System.out.println("�����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸� �Է��߽��ϴ�.");
				
			}
		}
	}


}
