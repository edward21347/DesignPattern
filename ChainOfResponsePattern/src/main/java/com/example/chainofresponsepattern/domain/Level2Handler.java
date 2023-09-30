package com.example.chainofresponsepattern.domain;

public class Level2Handler extends Handler {
    @Override
    public void processHandler(Request request) {
        if(request.getRequestLevel().equals("2")){
            System.out.println("二级处理逻辑");
        }else {
            this.superior.processHandler(request);
        }
    }
}
