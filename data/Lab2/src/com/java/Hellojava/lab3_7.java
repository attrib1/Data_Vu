package com.java.Hellojava;

import javax.swing.JOptionPane;

public class lab3_7 {
	public static void main(String[] args) {
		String input;
		float price,total = 0;
		float resule,vat;
		
		input = JOptionPane.showInputDialog("Input Price :");
		price = Float.parseFloat(input);
		int[] array1 = {10000,5000,2000,1000,0};
		int[] array2 = {10,9,7,5,3};
		for(int i=0;i<5;i++){
			if(price>=array1[i]){
				total = price - ((price*array2[i])/100);
			}
		}
			
				vat = ((total*7)/100);
				
				resule = total+vat; 
			
		JOptionPane.showMessageDialog( null,"ราคา  : "+total+"\nvat : "
		+vat+"\nราคาสุทธิ : "+resule);
	}

}
