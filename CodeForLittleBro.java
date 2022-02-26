package com.practice.helpcode;

import java.util.ArrayList;

public class CodeForLittleBro {
    public static singleton s =singleton.getInstance();
    public static ArrayList<Object[]> alobj= singleton.alobj;
    static int arrayTotal=singleton.alobj.size();
    public static void function1(){
        Object[] input={1};
    if (alobj.get(0)!=null){
        //update
            if (alobj.get(0).hashCode() == input.hashCode()){
                alobj.set(0, input);
            }
    }else{
        //add
        alobj.add(input);
    }

        for(int i=0;i==0;i++){
            //display
        }
    }
    public static void function2(){
        Object[] input={1};
        //checks if the element is already there by first checking if a=the element is actually not null
        if (alobj.get(1)!=null){
        for(int i=0;i<=arrayTotal-1;i++) {
            //checks if there is any on=bj macthes
            if (alobj.get(i).hashCode() == input.hashCode()) {
                alobj.set(i, input);

            }
        }
            for(int i=0;i<=1;i++) {
                //display
            }
        }else{
            alobj.add(input);
            for(int i=0;i<=1;i++){
                //display
            }
        }
    }
    public static void function3(){

    }
    public static void function4(){

    }
    public static void function5(){

    }
    public static void main(String args[]){
        Object[] obj1={1,2};
        Object[] obj2={3,4};
        ArrayList<Object[]> ar = new ArrayList<Object[]>();
        ar.add(obj1);
        ar.add(obj2);
        for (int i= 0; i<=ar.size()-1;i++) {
            for (int j= 0; j<=ar.size()-1;j++) {
                if (ar.get(i) == ar.get(j)) {
                    System.out.println("The aobject array named :"+ar.get(i)+" and "+ar.get(j)+" are "+(ar.get(i) == ar.get(j)));
                }else{
                    System.out.println("The aobject array named :"+ar.get(i)+" and "+ar.get(j)+" are "+(ar.get(i) == ar.get(j)));
                }
            }
        }
    }
}
