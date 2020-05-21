package learning.datastructure;

public class SingleLinkedList <T>{
	
	private class Node{
		private T t;
		private Node next;
		public Node(T t,Node next){
			this.t = t;
			this.next = next;
		}
		public Node(T t){
			this(t,null);
		}
	}
	private Node head;    		//头结点
	private int size;			//链表元素个数
	
	public SingleLinkedList(){
		this.head = null;
		this.size = 0;
	}
	
	//获取链表元素的个数
	public int getSize(){
		return this.size;
	}
	
	
	//链表头部添加元素
	public void addFirst(T t){
		Node node = new Node(t);	//节点对象
		node.next = this.head;
		this.head = node;
		this.size++;
		
	}
	//向链表尾部插入元素
	public void addLast(T t){
		this.add(t, this.size);
	}
	//向链表中间插入元素
	public void add(T t,int index){
		if (index <0 || index >size){
			throw new IllegalArgumentException("index is error");
		}
		if (index == 0){
			this.addFirst(t);
		}
		Node preNode = this.head;
		//找到要插入节点的前一个节点
		for(int i = 0; i < index-1; i++){
			preNode = preNode.next;
		}
		Node node = new Node(t);
		//要插入的节点的下一个节点指向preNode节点的下一个节点
		node.next = preNode.next;
		//preNode的下一个节点指向要插入节点node
		preNode.next = node;
		this.size++;
	}
	//删除链表元素
	public void remove(T t){
		if(head == null){
			System.out.println("无元素可删除");
			return;
		}
		//要删除的元素与头结点的元素相同
		while(head != null && head.t.equals(t)){
			head = head.next;
			this.size--;
		}
				
		 //要对头结点的下一个结点进行判别
		
		Node cur = this.head;
		while(cur.next != null){
			if(cur.next.t.equals(t)){
				this.size--;
				cur.next = cur.next.next;
			}
			else cur = cur.next;
		}
		
	}
	//删除链表第一个元素
	public T removeFirst(){
		if(this.head == null){
			System.out.println("无元素可删除");
			return null;
		}
		Node delNode = this.head;
		this.head = this.head.next;
		delNode.next =null;
		this.size--;
		return delNode.t;
	}
	//删除链表的最后一个元素
	public T removeLast(){
		if(this.head == null){
			System.out.println("无元素可删除");
			return null;
		}
		//只有一个元素
		if(this.getSize() == 1){
			return this.removeFirst();
		}
		Node cur = this.head;	//记录当前结点
		Node pre = this.head;	//记录要删除结点的前一个结点
		while(cur.next != null){
			pre = cur;
			cur = cur.next;
		}
		pre.next = cur.next;
		this.size--;
		return cur.t;
	}
	//链表中是否包含某个元素
	public boolean contains(T t){
		Node cur = this.head;
		while(cur != null){
			if(cur.t.equals(t)){
				return true;
			}
			else cur = cur.next;
		}
		return false;
	}
	//1、可以表示下面的方法是重写的父类的方法
	//2、有注释的作用，加上这个标记就说明是重写的父类的方法，调试程序比较方便。
	//3、在方法的前面加上@override系统就可以帮助你检查方法的正确性。
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node cur = this.head;
		while(cur != null){
			sb.append(cur.t+"->");
			cur = cur.next;
		}
		sb.append("NULL");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SingleLinkedList<Integer> linked = new SingleLinkedList();
		for(int i = 1; i < 20; i++){
			linked.addFirst(i);
			System.out.println(linked);
		}
		//都是在分号的基础上继续下一个操作
		linked.addLast(33);
		
		linked.add(33, 10);
		System.out.println(linked);
		linked.remove(2);
		linked.remove(3);
		System.out.println(linked);
		System.out.println("删除第一个元素："+linked.removeFirst());
		System.out.println(linked);
		System.out.println("删除最后一个元素："+linked.removeLast());
		System.out.println(linked);
	}
}

	