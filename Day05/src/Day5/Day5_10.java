package Day5;


import java.util.*;
public class Day5_10 {
	public static void main(String[] args) {
		
		String[] name = {"kim", "Park","Yi"};
		for(int i =0; i<name.length; i++) {
			System.out.println("name["+i+"] :" + name[i]);
		}
		String tmp = name[2];
		System.out.println("tmp : "+ tmp);
		
		name[0] = "Yu";
		
		for(String str : name) { 
		System.out.println(str);
		}
		
		
	
		

}
}