package com.me.demo.impl;

import com.me.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/2/6.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
