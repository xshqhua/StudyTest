package com.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main3 {
	public Stack<int[]> stack = new Stack<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main3().init();
	}
	public void init(){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int num = Integer.parseInt(scanner.nextLine());
			int []end = {num-1,num-1};
			List<String> start = new ArrayList<>();
			for(int i=0;i<num;i++){
				start.add(scanner.nextLine());
			}
			num = Integer.parseInt(scanner.nextLine());
			int [][]migong = new int[num][];
			for(int i=0;i<num;i++){
				String l2 = scanner.nextLine();
				//line.add(toInt(l2));
				migong[i] = toInt(l2);
			}
			for(String str:start){
				fun(migong,toInt(str),end);
				printStack();
			}
			
			/*for(int i=0;i<migong[0].length;i++){
				for(int j=0;j<migong[i].length;j++){
					System.out.println(migong[i][j]);
				}
				System.err.println();
			}*/
			
			
			
		}
	}
	public void fun(int[][] migong,int []start,int []end){
		stack.push(start);
		fun1(migong,start,end,1);
		
	}
	
	public boolean fun1(int [][] migong,int []curr,int []end,int tag){
		if(tag==1){
			curr[0]-=1;
		}else if(tag==2){
			curr[1]+=1;
		}else if(tag==3){
			curr[0]+=1;
		}else if(tag==4){
			curr[1]-=1;
		}else {
			return false;
		}
		
		if(!checked(curr, migong[0].length)||!checked(migong, curr)){
			tuiyibu(curr, tag);
			stack.pop();
			stack.push(curr);
			return fun1(migong,curr,end,tag+1);
		}
		
		if(equal(curr, end)){
			return true;
		}else{
			stack.push(curr);
			return fun1(migong,curr,end,1);
		}
		
	}
	public boolean checked(int []nums,int size){
		for(int a:nums)
			if(a<0||a>=size)
				return false;
		return true;
	}
	
	public int tuiyibu(int [] curr,int tag){
		if(tag==1){
			curr[0]+=1;
		}else if(tag==2){
			curr[1]-=1;
		}else if(tag==3){
			curr[0]-=1;
		}else if(tag==4){
			curr[1]+=1;
		}
		return tag - 1;
	}
	public boolean checked(int [][]migong,int[]curr){
		if(migong[curr[0]][curr[1]]==1)
			return false;
		return true;
	}
	
	public boolean equal(int []curr,int []end){
		for(int i=0;i<curr.length;i++){
			if(curr[i]!=end[i])
				return false;
		}
		return true;
	}
	public int[] toInt(String str){
		String [] strs = str.split(" ");
		int [] nums = new int[strs.length];
		for(int i=0;i<nums.length;i++){
			nums[i] = Integer.parseInt(strs[i]);	
		}
		return nums;
	}
	public void printStack(){
		while(!stack.isEmpty()){
			int [] curr = stack.pop();
			System.out.println(curr[0]+" "+curr[1]);
		}
	}
}
