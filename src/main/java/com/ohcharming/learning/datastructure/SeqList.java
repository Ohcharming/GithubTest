package com.ohcharming.learning.datastructure;

public class SeqList{
	
   
    private int[] data;//数组存储数据
    private int size;//数据占用空间的大小

    //初始化线性表声明数组的大小
    public SeqList(int initial_size) {
    	if(initial_size>=0) {
    		this.data=new int[initial_size];//初始化数组
    		this.size=0;//初始元素第几位
    	}else
    		System.out.println("初始值不能小于0");
    }

     //判断线性表是否为空
      public boolean isEmpty() {
      if(this.size==0) {
    	  return true;
     }else {
    	 return false;
     }
}
      //判断线性表是否为满
      public boolean isFull() {
    	  if(this.size==data.length) {
    		  return true;
    	  }else {
    		  return false;
    	  }
      }
      //增加元素
      public void addElem(int value,int index) {
    	  if(isFull()) {
    		  System.out.println("此顺序表已满");
    	  }else if(index<0||index>data.length) {
    		  System.out.println("应该插入正的下标");
    	  }else {
    		  for(int i=this.size-1;i>=index;i--) {
    			data[i+1]=data[i];//依次向后移  
    		  }
    		  data[index]=value;
    		  this.size++;//元素下标增加
    	  }
      }
      //删除元素
      public void deleteElem(int value) {
          int pos =value;
          if (pos == -1) {
              System.out.println( + value + " 元素不在该表中");
          } else {
              System.out.println( + value + " 元素下标为：" + pos);
          }

          for (int j = pos; j <= this.size - 2; j++) {
              data[j] = data[j + 1];
          }
          this.size--;
      }
      //查找元素在第几位
      public int find(int value) {
    	  int pos=-1;
    	  if(isEmpty()) {
    		  System.out.println("线性表是空的没有元素可以删除");
    	  }else {
    		  for(int i=0;i<=this.size-1;i++) {
    			  if(data[i]==value) {
    				  pos=i;
    			  }
    		  }
    	  }
    	  return pos;
      }
      
      public void print() {
    	  for(int i=0;i<=this.size-1;i++) {
    		  System.out.println(data[i]+" ");
    	  }
    	  System.out.println();
      }
      public static void main(String[]args) {
    	  SeqList SeqList=new SeqList(10);
    	  for(int i=0;i<10;i++) {
    		  SeqList.addElem(i+1,i);
    	  }
    	  SeqList.print();
    	  //删除元素
          SeqList.deleteElem(5);
          SeqList.print();
    	 
         //查找表内的元素
         int find_value=2;
	     int pos=SeqList.find(find_value);
	     if(pos==-1) {
		  System.out.println(+ find_value + " 元素不在该表中");
	  }else
		  System.out.println( + find_value + " 元素下标为：" + pos);
  }
    	 
      }