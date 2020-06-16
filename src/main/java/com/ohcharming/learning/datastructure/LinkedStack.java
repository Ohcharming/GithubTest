package learning.datastructure;


public class LinkedStack {
	private Node top;
	private int size;
	
	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}
	}
 
	//入栈
	public int push(int value){
		Node pushNode = new Node(value);
		pushNode.next = top;
		top = pushNode;
		size++;
		return top.data;
	}
	
	//出栈
	public int pop(){
		Node oldNode = top;
		top = top.next;
		size--;
		return oldNode.data;
	}
	

	//栈长
	public int length(){
		return size;
	}
	
	public static void main(String[] args) {
		learning.datastructure.LinkedStack linkedStack = new learning.datastructure.LinkedStack();
		linkedStack.push(1);
		linkedStack.push(2);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(5);
		linkedStack.push(6);
	
		System.out.println(linkedStack.length());
		
	
		
	
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		
		
		
	}

}


