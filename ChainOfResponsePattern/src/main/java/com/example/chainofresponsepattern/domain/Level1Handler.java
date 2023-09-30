package com.example.chainofresponsepattern.domain;

public class Level1Handler extends Handler {
    @Override
    public void processHandler(Request request) {
        if(request.getRequestLevel().equals("1")){
            System.out.println("一级处理逻辑");
        }else {
            this.superior.processHandler(request);
        }
    }
}
