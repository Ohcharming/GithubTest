package learning.datastructure;

public class SequenceStack {
    
	  public Object[] data;       // 数组表示栈内元素
	    public int maxSize;       // 栈的空间大小
	    public int top;           // 指向栈顶元素的指针

	   //数组的初始化长度
	    public SequenceStack(int initialSize){
	        if(initialSize>=0){
	            this.data=new Object[initialSize];
	            this.maxSize=initialSize;
	            this.top=-1;
	        }
	        else{
	            System.out.println("初始化失败");
	        }
	    }

	  //判断栈是否为空
	    public boolean isEmpty(){
	        return top == -1 ? true : false;
	    }

	  //判断栈是否已满
	    public boolean isFull(){
	        return top == maxSize-1 ? true : false;
	    }

	  //push 元素进栈
	    public void push(Object value){
	        if(!isFull()){
	            System.out.print(value);
	            data[++top]=value;
	        }
	        else{
	            System.out.println("此栈已满");
	        }
	    }

	 //pop 元素出栈
	    public Object pop(){
	        Object num=null;
	        if(!isEmpty()){
	            num = data[top--];
	            return num;
	        }
	        else{
	            return "此栈是空栈没有元素可以出栈";
	        }

	    }
      //获得栈顶的元素
	    public Object getPeek(){
	        if(top>=0){
	            return data[top];
	        }
	        else{
	            return "栈顶指针为空，无栈顶元素!";
	        }
	    }

	  //打印栈顶元素
	    public void displayStack(){

	       
	        if(top>=0){
	            for(int i=top;i>=0;i--){
	                System.out.print(data[i] + " ");
	            }
	            System.out.println();
	        }
	        else{
	            System.out.println("栈内元素为空！");
	        }       
	    }

	   //获得栈顶指针为n的栈内元素
	    public Object getPeekN(int n){
	        if(n<top){
	            return data[n];
	        }
	        else{
	            return "无";
	        }
	    }

	    public static void main(String[] args) {

	        SequenceStack stack=new SequenceStack(5);
	       

	     
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);
	        stack.push(5);
	        stack.push(6);
	        System.out.print("栈内元素为：");
	        stack.displayStack();
	        
	        
	        System.out.println("栈是否为空："+stack.isEmpty());
	        System.out.println("是否为满栈："+stack.isFull());
	        System.out.println("栈顶指针为："+stack.top);
	    

	        System.out.println("出栈后的栈顶元素为："+stack.pop());
	      

	        System.out.println("栈顶元素为："+stack.getPeek());
	        System.out.println("栈顶指针为2的元素为："+stack.getPeekN(2));
	        System.out.println("栈顶指针为0的元素为："+stack.getPeekN(0));
	        
	      
	     
	    }

	}
