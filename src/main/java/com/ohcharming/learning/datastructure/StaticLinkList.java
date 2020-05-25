package com.ohcharming.learning.datastructure;

public class StaticLinkList {

	  private Element[] List = null; //定义静态链表
	
	    private int MAXSIZE = 4;//默认存储大小
	    private int currentNode = 0;//指向当前空闲位置
	    private int size = 1;
	    class Element{
	        int data;
	        int cur;
	    }
	    //静态链表的长度
	    public int length(){
	        return size-1;
	    }
	    //初始化静态链表
	    public StaticLinkList(){
	        List = new Element[MAXSIZE];
	        for (int i = 0; i < List.length; i++) {
	            List[i] = new Element();
	            List[i].data = -1;
	            List[i].cur = i+1;
	        }
	        currentNode = 1;
	    }
	    //如果静态链表满了就增加链表的空间
	    public void add(int data){
	        if(size<List.length){
	            List[currentNode].data = data;
	            currentNode = List[currentNode].cur;
	            size++;
	        }else{
	            addLinkSpace();
	            List[currentNode].data = data;
	            currentNode = List[currentNode].cur;
	            size++;
	        }
	    }
	  //得到指定数据
	    public int get(int index){
	        if(index>size-1&&index<0)
	            throw new IndexOutOfBoundsException("数组越界，索引不合法");
	        else{
	            //这里index+1也是因为多了一个空的头节点
	            return List[index+1].data;
	        }
	    }
	   //删除数据
	    public void delete(int index){

	        index = index+1;
	        if(index<1||index>=size){
	            System.out.println("超出链表长度");
	        }else if(index == size-1){
	            size--;
	            List = (Element[]) getTrueIndex(List,size);
	        }else{
	            int i = 0;
	            while(index!=List[i].cur){
	                i++;
	            }
	            int j = 0;
	            while(currentNode!=List[j].cur){
	                j++;
	            }
	            List[i].cur = List[index].cur;
	            List[j].cur = index;
	            List[index].cur = currentNode;
	            currentNode = index;
	            size--;
	            List = (Element[]) getTrueIndex(List,size);
	        }
	    }
	  //增加链表空间
	    public void addLinkSpace(){
	        MAXSIZE+=8;
	        Element[] link = List;
	        List = new Element[MAXSIZE];
	        System.arraycopy(link, 0, List, 0, link.length);
	        for (int i = link.length; i < MAXSIZE; i++) {
	            List[i] = new Element();
	            List[i].data = -1;
	            List[i].cur = i+1;
	        }
	        currentNode = link.length;
	    }

	   //插入数据
	    public void insert(int index,int data){
	        index = index + 1;
	        if(size<List.length){
	            if(index>size&&index<0)
	                System.out.println("数组越界，超出数组长度");
	            else if(index == size){
	                List[currentNode].data = data;
	                currentNode = List[currentNode].cur;
	                size++;
	            }else{
	                int i = 0;
	                while(index!=List[i].cur){
	                    i++;
	                }
	                int j = 0;
	                while(currentNode!=List[j].cur){
	                    j++;
	                }
	                List[i].cur = currentNode;
	                List[j].cur = List[currentNode].cur;
	                List[currentNode].data = data;
	                List[currentNode].cur = index;
	                currentNode = List[j].cur;
	                size++;
	                List = (Element[]) getTrueIndex(List,size);
	            }
	        }else{
	            addLinkSpace();
	            insert(index, data);
	        }
	    }
	  //重新排序
	    public Object getTrueIndex(Element[] link,int size){
	        Element[] linkList1 = new Element[List.length];
	        int k =0;
	        for (int i = 0; i < List.length; i++) {
	            linkList1[i] = new Element();
	            linkList1[i].data = link[k].data;
	            k = link[k].cur;
	            linkList1[i].cur = i+1;
	        }
	        currentNode = size;
	        return linkList1;
	    }
	   

	        public static void main(String[] args) {
	            // TODO Auto-generated method stub
	            StaticLinkList listA = new StaticLinkList();
	            int la[]={
	                   1,2,3,4,5,6,7,8,9,10
	            };
	            for (int i = 0; i < la.length; i++) {
	                listA.add(la[i]);
	            }
	        
	            listA.delete(12);
	            listA.delete(0);

	            listA.insert(2, 999);
	            listA.insert(6, 788);
	            for (int i = 0; i < listA.length(); i++) {
	                System.out.println(listA.get(i));
	            }
	        }
	   
	}
	