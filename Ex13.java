package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.*;

public class Ex13 {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p1 = new Panel();//�гλ���
		BorderLayout layout1=new BorderLayout();
		p1.setLayout(layout1);
		
		GridLayout textlayout=new GridLayout(1,1);
		GridLayout numlayout=new GridLayout(4,3);
		Panel ptop = new Panel();// text �гλ��� 
		Panel pcenter = new Panel();//���� �гλ���
		ptop.setLayout(textlayout); 
		pcenter.setLayout(numlayout);
		
		//text�ڽ�
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,50) {};
		TextField text = new TextField(10);
		text.setFont(font);
		ptop.add(text);
		
		p1.add(ptop,BorderLayout.NORTH);
		p1.add(pcenter,BorderLayout.CENTER);
		//��ư����
		Button b1 = new Button("1");//��ư����
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button b0 = new Button("0");
		Button bstar = new Button("*");
		Button bshap = new Button("#");
		//���ڹ�ư layout��ġ			
		pcenter.add(b1);
		pcenter.add(b2);
		pcenter.add(b3);
		pcenter.add(b4);
		pcenter.add(b5);
		pcenter.add(b6);
		pcenter.add(b7);
		pcenter.add(b8);
		pcenter.add(b9);
		pcenter.add(bstar);
		pcenter.add(b0);
		pcenter.add(bshap);
		
		f.add(p1);
		f.setTitle("��ȭ��GUI");//����	
		f.setSize(300,350); //ũ��
		f.setVisible(true);//����
	}
}
	