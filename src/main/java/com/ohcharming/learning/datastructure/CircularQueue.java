package com.ohcharming.learning.datastructure;


public class CircularQueue {
   
    int[]data;//数组存储数据
    
    int front;//队头指针
    
    int rear;//队尾指针
   
    int usedSize = 0;//数据个数
  
    int queueSize = 0;//数组的长度

//队列的初始化
public CircularQueue (int size) {
        this.data = new int[size+1];
        this.front = 0;
        this.rear = 0;
        this.queueSize = size+1;
    }


//入队
public void push(int val)
{
    //如果队满直接返回
    if(isFull())
    {
        return ;
    }else
    //插入数据
    data[rear] = val;
    //更新队尾
    rear = (rear+1)% queueSize;
    usedSize++;
}
//出队
public int pop()
{   //如果队为空 返回0
    if(isEmpty())
    {
       System.out.println("栈空，出栈失败");//return 0 是不对的。和返回值有冲突，需要考虑如何处理
    }
    //获得当前数据
    int x = data[front];
    //清空数据
    data[front] = -1;
    //更新队头
    front = (front+1)% queueSize;
    usedSize--;
    return x;

}

//打印队列
public void show ()
{
    for (int i = 0; i < usedSize; i++) {
        System.out.print(data[(front+i)% queueSize]+" ");
    }
}
//判断是否为空
public boolean isEmpty() {

    return front==rear;
}
//判断是否已满
public boolean isFull()
{
    return (rear+1)% queueSize == front;
}

public static void main(String[] args) {
	CircularQueue a = new CircularQueue (10);
	
    for (int i = 0; i < 7; i++) {
        a.push(i);
    }
    a.show();
    System.out.println();
    
    
    for (int i = 0; i < 7; i++) {
        a.push(i);
    }
    a.show();
    System.out.println();
    
    for (int i = 0; i <1; i++) {
        System.out.println("出队元素"+a.pop()+"");
    
    }
    System.out.println();
    for (int i = 0; i <11; i++) {
        System.out.println("出队元素"+a.pop()+"");
}
   
}}
