package com.github.abhijithpradeep;

import com.github.abhijithpradeep.manager.ISimpleManager;
import com.github.abhijithpradeep.manager.SimpleManager;
import com.github.abhijithpradeep.manager.SimpleManager2;
import com.github.abhijithpradeep.requestCache.config.RequestCacheConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * Created by abhijithpradeep on 12/9/17.
 */
@Configuration
@EnableCaching(proxyTargetClass = true)
@Import(RequestCacheConfiguration.class)
public class SimpleConfiguration {

    @Bean
    public ISimpleManager simpleManager() {
        SimpleManager simpleManager = new SimpleManager();
        simpleManager.simpleManager = simpleManager2();
        return simpleManager;
    }

    @Bean()
    @Order(Integer.MIN_VALUE)
    public SimpleManager2 simpleManager2() {
        SimpleManager2 simpleManager2 = new SimpleManager2();
        return simpleManager2;
    }

}
