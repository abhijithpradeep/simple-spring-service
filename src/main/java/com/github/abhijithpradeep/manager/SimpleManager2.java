package com.github.abhijithpradeep.manager;

import com.github.abhijithpradeep.requestCache.annotations.RequestCacheable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhijithpradeep on 27/9/17.
 */
public class SimpleManager2 {

    private static List<Integer> integerList = new ArrayList<Integer>();

    @RequestCacheable
    public List<Integer> addIntegerAndReturnList2(){
        integerList.add(1);
        System.out.print(" : Added 90 : ");
        return integerList;
    }
}
