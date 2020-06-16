package com.ohcharming.learning.datastructure;

public class RecursionCount {
	
	static int count(int n) {
		if(n>0) {
			return n+count(n-1);
		}else {
			return 0;
		}
	}
	public static void main(String args[]) {
		System.out.println(count(100));
	}
	} 
	