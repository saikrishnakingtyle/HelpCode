package com.practice.helpcode;

import java.util.ArrayList;

public class singleton {
    private static singleton singleinstance =null;
    public static ArrayList<Object[]> alobj = new ArrayList<Object[]>();
    private singleton(){

    }
    public static singleton getInstance(){
        if(singleinstance==null){
            singleton s = new singleton();
        }
        return singleinstance;
    }
    public ArrayList<Object[]> getValue(){
        return alobj;
    }
    public void setValue(Object[] obj){
        alobj.add(obj);
    }
}
