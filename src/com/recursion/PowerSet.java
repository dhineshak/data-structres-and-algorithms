package com.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PowerSet {
	
	public static ArrayList<String> subSet(String s,String cur,int index,ArrayList<String> list){
        if(index == s.length()){
            list.add(cur);
            return list;
        }else{
            list = subSet(s,cur,index+1,list);
            list = subSet(s,cur+s.charAt(index),index+1,list);
            Collections.sort(list);
            return list;
        }
    }
    
    public static ArrayList<String> powerSet(String s)
    {
        return subSet(s,"",0,new ArrayList<String>());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerSet("abc"));
	}

}
