package com.main;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main2().init();
	}
	public void init(){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			long num = scanner.nextLong();
			//System.out.println(str);
			fun(num);
		}
	}
	public void fun(long num){
		if(num>=60000){
			System.out.println(num);
			return ;
		}
		int size = (""+num).length();
		int [] nums = new int[size];
		for(int i=size-1;i>=0;i--){
			nums[i] = (int) (num%10); 
			num/=10;
		}
		for(int i=1;i<size;i++){
			nums[i] = (nums[i]+6)%10;
		}
		int i=1;
		int j=size-1;
		while(i<=j){
			int tep = nums[i];
			nums[i] = nums[j];
			nums[j] = tep;
			i++;
			j--;
		}
		StringBuffer sb  = new StringBuffer();
		for(int a:nums){
			sb.append(""+a);
		}
		System.out.println(sb.toString());
	}
}
