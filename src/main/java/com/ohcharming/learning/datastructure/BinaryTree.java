package learning.datastructure;

public class BinaryTree {
    private Node root;//树根
    private class Node{
    	private int data;//数据域
    	private Node lift;//左子树
    	private Node right;//右子树
        //构造函数
    	Node(int data){
    		super();
    		this.data=data;
    		Node lift=null;
    		Node right=null;
    	}
    	//插入节点
    	public void addNode(Node newNode,int data) {
    		if(this.data>newNode.data) {     //比根数据小的放在左边
    			if(this.lift==null) {
    				this.lift=newNode;
    				System.out.println(" 插入左结点 ");
    			}else {
    				this.lift.addNode(newNode,data);
    			}
    		
    		}
    	if(this.data<=newNode.data) {       //比根数据大的放在右边
    		if(this.right==null) {
    			this.right=newNode;
    			System.out.println(" 插入右结点 ");
    		}else {
    			this.right.addNode(newNode,data);
    		}
    		
    	}
    	}
    }
    public void add(int data) {
    	Node newNode=new Node(data);
    	if(root==null) {
    		this.root=newNode;
    		System.out.println(" 插入根节点 ");
    	}
    	else {
    		this.root.addNode(newNode,data);
    	}
    	
    }

	public static void main(String[]args) {
		BinaryTree list=new BinaryTree();
		list.add(50);
		list.add(100);
		list.add(3);
		list.add(2);
	
	}}

