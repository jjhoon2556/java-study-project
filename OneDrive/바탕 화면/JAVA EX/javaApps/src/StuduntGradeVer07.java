

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StuduntGradeVer07 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(ver 0.7.0)");
		Scanner sc=new Scanner(System.in);
		String input=null;
		File file=new File("data.bin");
		//없으면 만들고
		while(true){
			System.out.print("1.보기 2.입력 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("---------------------------------------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("---------------------------------------------------------------------");
				try {
					FileInputStream fis=new FileInputStream(file);
					while(true){
						int su=fis.read();
						if(su==-1){break;}
						System.out.print((char)su);
					}
					fis.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("---------------------------------------------------------------------");
			}else if(input.equals("2")){
				System.out.print("학번>");
				input=sc.nextLine()+"\t";
				System.out.print("국어>");
				input+=sc.nextLine()+"\t";
				System.out.print("영어>");
				input+=sc.nextLine()+"\t";
				System.out.print("수학>");
				input+=sc.nextLine()+"\n";
				try {
				////
					byte[] before=new byte[(int)file.length()];
					FileInputStream fis=new FileInputStream(file);
					fis.read(before);
					fis.close();
				////
					FileOutputStream fos=new FileOutputStream(file);
					fos.write(before);
					fos.write(input.getBytes());
					fos.flush();
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
