package com.github.abhijithpradeep.manager;

import com.github.abhijithpradeep.requestCache.annotations.Request;
import com.github.abhijithpradeep.requestCache.annotations.RequestCacheable;
import org.springframework.cache.annotation.Cacheable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhijithpradeep on 12/9/17.
 */
public class SimpleManager implements ISimpleManager{

    private static List<Integer> integerList = new ArrayList<Integer>();

    public SimpleManager2 simpleManager;

    @Request
    public List<Integer> addIntegerAndReturnList(){
        return simpleManager.addIntegerAndReturnList2();
    }

}
