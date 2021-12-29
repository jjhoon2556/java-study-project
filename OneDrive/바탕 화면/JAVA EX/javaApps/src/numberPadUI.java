

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class numberPadUI extends Frame{

	public numberPadUI(){
		BorderLayout layout=new BorderLayout();
		Panel p=new Panel();
		p.setLayout(layout);
		
		GridLayout ltop=new GridLayout(1,1);
		GridLayout lcen=new GridLayout(4,3);
		Panel ptop=new Panel();
		Panel pcen=new Panel();
		ptop.setLayout(ltop);
		pcen.setLayout(lcen);
		
		Font f=new Font(Font.SANS_SERIF,Font.BOLD,50){};
		TextField tf=new TextField();
		tf.setFont(f);
		ptop.add(tf);
		String[] msg={"7","8","9","4","5","6","1","2","3","*","0","#"};
		Button[] arr=new Button[12];
		for(int i=0; i<arr.length; i++){
			arr[i]=new Button(msg[i]);
			pcen.add(arr[i]);
		}
		
		p.add(ptop,BorderLayout.NORTH);
		p.add(pcen,BorderLayout.CENTER);
		
		add(p);
		setLocation(100,100);
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new numberPadUI();
	}

}

