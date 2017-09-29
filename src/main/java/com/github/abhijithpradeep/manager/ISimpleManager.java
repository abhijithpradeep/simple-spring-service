package com.github.abhijithpradeep.manager;

import com.github.abhijithpradeep.requestCache.annotations.Request;
import com.github.abhijithpradeep.requestCache.annotations.RequestCacheable;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by abhijithpradeep on 21/9/17.
 */
public interface ISimpleManager {

    public List<Integer> addIntegerAndReturnList();

}
