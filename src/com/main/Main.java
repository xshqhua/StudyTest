package com.main;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().init();
	}
	public void init(){
		byte tem1 = 00000100;
		byte tem2 = 00000010;
		fun2(tem1,tem2);
	}
	public void fun(byte t1,byte t2){
		P p = new P();
		P p1 = new P();
		System.out.println(p.compareTo(p1));
		Map<Integer, Integer> k = new HashMap<Integer, Integer>();
		if(k.containsKey(1)){
			
		}
//		Collections.sort(list);
		int [] t = {1,2,3};
		List<Integer> ww = (List) Arrays.asList(t);
		System.out.println();
		for(int tt:ww){
			System.out.println(tt);
		}
		for(Map.Entry<Integer,Integer> e:k.entrySet() ){
			e.getValue();
			e.getKey();
		}
	}
	public void fun2(byte t1,byte t2){
		System.out.println("t1"+t1);
		System.out.println("t2"+t2);
//		Byte t3 = new Byte((byte) (t1^t2));
		byte t3 = (byte)(t1^t2);
		String tep = Integer.toUnsignedString(t3, 8).toString();
		int index1 = tep.indexOf("1");
		int index2 = tep.lastIndexOf("1"); 
		
		System.out.println(index1);
		System.out.println(index2);
		if(index2-index1>1)
			System.out.println();
		
		
		
 	}
	class P implements Comparable{
		int value = 0;
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			P t = (P)o;
			return this.value-t.value;
		}
		
	}
}
