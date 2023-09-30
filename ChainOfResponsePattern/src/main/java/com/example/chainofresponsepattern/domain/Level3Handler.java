package com.example.chainofresponsepattern.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Level3Handler extends Handler{
    @Override
    public void processHandler(Request request) {
        //此处需要闭环
        if(request.getRequestLevel().equals("3")){
            System.out.println("三级处理逻辑");
        }else {
            log.error("不存在的级别！");
        }
    }
}
