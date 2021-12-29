
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuduntGradeVer071 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.7.0)
		// 꼈다가 켜도 입력한 데이터가 계속 살아있도록...
		Scanner sc=new Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.7.0)");
		String input=null;
		String data="";

		File file=new File("data.bin");
		// 읽어오기
		if(file.exists()){
			 try {
				FileInputStream fis=new FileInputStream(file);
//				int fsize=(int) file.length();
//				byte[] buf=new byte[fsize];
//				fis.read(buf);
//				data=new String(buf);
				////////////////////
//				ArrayList<Integer> list=new ArrayList<>();
//				while(true){
//					/
				while(true){
					int su=fis.read();
					if(su==-1){break;}
					data+=(char)su;
				}int su=fis.read();
//					if(su==-1){break;}
//					list.add(su);
//				}
//				Object[] arr2=list.toArray();
//				byte[] arr3=new byte[arr2.length];
//				for(int i=0; i<arr3.length; i++){
//					arr3[i]=Byte.parseByte(arr2[i].toString());
//				}
//				data=new String(arr3);
				///////////////////
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
		}
		//////////
		while(true){
			System.out.print("1.보기 2.입력 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("---------------------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("---------------------------------------------------");
				System.out.print(data);
				System.out.println("---------------------------------------------------");
			}else if(input.equals("2")){
				System.out.print("학번>");
				input=sc.nextLine()+"\t";
				System.out.print("국어>");
				input+=sc.nextLine()+"\t";
				System.out.print("영어>");
				input+=sc.nextLine()+"\t";
				System.out.print("수학>");
				input+=sc.nextLine()+"\n";
				data+=input;
			}
		}
		// 저장
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(data.getBytes());
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
