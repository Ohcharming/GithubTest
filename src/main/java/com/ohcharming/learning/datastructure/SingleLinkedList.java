package com.ohcharming.learning.datastructure;

/**
 * 〈单链表的一种实现-数据结构〉
 *
 * @author cuiyanwei
 * @create 2020/5/18
 * @since 1.0.0
 */
public class SingleLinkedList {
    public static void main(String[] args) {
    }
    // TODO Auto-generated method stub
    public  AnyType data;
    public  MyLinkedList<AnyType> next;
    public MyLinkedList(AnyType data,MyLinkedList<AnyType> next){
        this.data=data;
        this.next=next;
    }

}

class MyLinkedList<AnyType> {

    //首元节点
    private MyLinkedList<AnyType> first;

    //头指针
    private MyLinkedList<AnyType> head;

    //链表长度
    int thesize;

    //初始化链表
    public boolean initlist() {
        thesize = 0;
        first = new MyLinkedList<>(null, null);
        head = new MyLinkedList<>(null, first);
        return true;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return thesize == 0;
    }

    //获取节点
    public MyLinkedList<AnyType> getMyLinkedList(int i) {
        MyLinkedList<AnyType> renode = head;
        for (int j = -2; j < i; j++) {
            renode = renode.next;
        }
        return renode;
    }

    //在末尾添加元素
    public void add(AnyType a) {
        MyLinkedList<AnyType> renode = new MyLinkedList<>(a, null);
        getMyLinkedList(thesize - 1).next = renode;
        thesize++;
    }

    //删除i位置节点，并返回删掉的数据
    public AnyType remove(int i) {
        if (i == thesize - 1) {
            AnyType a = getMyLinkedList(thesize - 1).data;
            getMyLinkedList(thesize - 2).next = null;
            return a;
        }
        MyLinkedList<AnyType> prev = getMyLinkedList(i - 1);
        AnyType a = prev.next.data;
        prev.next = prev.next.next;
        thesize--;
        return a;
    }

    //在i位置插入新节点
    public void insert(int i, AnyType a) {
        MyLinkedList<AnyType> prev = getMyLinkedList(i - 1);
        MyLinkedList<AnyType> renode = new MyLinkedList<>(a, prev.next);
        prev.next = renode;
        thesize++;
    }

    //获取i位置节点的数据
    public AnyType get(int i) {
        return getMyLinkedList(i).data;
    }

    //为i位置元素重新赋值
    public void set(int i, AnyType a) {
        getMyLinkedList(i).data = a;
    }

    //返回链表节点个数
    public int length() {
        return thesize;
    }

    //清空链表
    public void clear() {
        initlist();
    }

    //打印链表
    public void print() {
        for (int i = 0; i < thesize; i++) {
            System.out.println(getMyLinkedList(i).data);
        }
    }
}