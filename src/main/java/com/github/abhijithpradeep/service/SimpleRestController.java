package com.github.abhijithpradeep.service;

import com.github.abhijithpradeep.manager.ISimpleManager;
import com.github.abhijithpradeep.manager.SimpleManager;
import com.github.abhijithpradeep.requestCache.annotations.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abhijithpradeep on 12/9/17.
 */
@RestController
@RequestMapping("/simple")
public class SimpleRestController {

    @Autowired
    private ISimpleManager simpleManager;

    @RequestMapping("/hi")
    @Request
    public List<Integer> returnHi(){
        return simpleManager.addIntegerAndReturnList();
    }


}
