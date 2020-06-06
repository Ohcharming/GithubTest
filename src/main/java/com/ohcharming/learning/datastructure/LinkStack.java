package learning.datastructure;


public class LinkStack {
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
		LinkStack linkStack = new LinkStack();
		linkStack.push(1);
		linkStack.push(2);
		linkStack.push(3);
		linkStack.push(4);
		linkStack.push(5);
		linkStack.push(6);
	
		System.out.println(linkStack.length());
		
	
		
	
		System.out.println(linkStack.pop());
		System.out.println(linkStack.pop());
		System.out.println(linkStack.pop());
		System.out.println(linkStack.pop());
		
		
		
	}

}


