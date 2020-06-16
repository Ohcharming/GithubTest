package com.ohcharming.learning.datastructure;

public class LinkedQueue {
	   class DataNode{
		   int data;
		   DataNode next;
	   }
	   private DataNode front;
	   private DataNode rear;
	   
	   public LinkedQueue() {
		   front= new DataNode();
		   front.next=null;
		   rear=new DataNode();
		   rear=null;
	   }
	   
	   public boolean isEmpty() {
		   return rear==null;
	   }
	   //入队
	   public boolean enQueue(int element) {
		   DataNode data=new DataNode();
		   data.data=element;
		   if(isEmpty()) {
			   front.next=data;
			   rear=data;
			   return false;
		   }else {
			   rear.next=data;
			   rear=data;
			   return true;
		   }
	   }
	   //出队
	   public int deQueue(){
			if(isEmpty()) {
				throw new RuntimeException("队列为空");
			}
			if(front.next == rear) {//如果队列中只要一个节点时
				int result = front.next.data;
				front.next = null;
				rear = null;
				return result;
			}
			else {
				int result = front.next.data;
				front.next = front.next.next;
				return result;
			}
		}
	
	
	  
		   public static void main(String args[]) {
		   
		   try {
			   LinkedQueue queue=new LinkedQueue();
			   queue.enQueue(1);
			   queue.enQueue(2);
			   queue.enQueue(3);
			   queue.enQueue(4);
			   queue.enQueue(5);
			   queue.enQueue(6);
			   System.out.println(queue.deQueue());
			   System.out.println(queue.deQueue());
			   System.out.println(queue.deQueue());
			   System.out.println(queue.deQueue());
			   System.out.println(queue.deQueue());
			   System.out.println(queue.deQueue());
			   System.out.println(queue.deQueue());
			  
		
			 } 
			   catch (RuntimeException e) {
					
					System.out.println(e.getMessage());
		   
	   }
}}
