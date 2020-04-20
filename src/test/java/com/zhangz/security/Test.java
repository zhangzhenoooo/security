package com.zhangz.security;

/**
 * @author zhangz
 * @version 1.0
 * @date 2020/4/6 14:16
 */
public class Test {

    @org.junit.Test
    public void name() {

        double s = getS(3);
        System.out.println(s);
    }

    double getS (int n){
        double s = 0;
        double temp = 1;

        for(int i = 1;i<= n;i++){
           s = s+ temp*(1/(2*i - 1));
           temp = -temp;
        }
        return  s;
    }

}
