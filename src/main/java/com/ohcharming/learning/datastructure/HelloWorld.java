package com.ohcharming.learning.datastructure;

/**
 * 测试一下累加
 * @author cuiyanwei
 * @create 2020/5/18
 * @since 1.0.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i=1;
        int sum=0;

        while(i<=100)
        {
            sum+=i;
            i++;
        }
        System.out.println("累加求和结束");
        System.out.println("sum的累加值:"+sum);
    }
}