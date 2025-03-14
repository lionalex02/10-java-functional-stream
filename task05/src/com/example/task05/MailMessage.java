package com.example.task05;

public class MailMessage implements IMail<String>{
    final private String from;
    final private String to;
    final private String content;

    public MailMessage(String from, String to, String content){
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom(){
        return from;
    }

    @Override
    public String getTo(){
        return to;
    }

    @Override
    public String getContent(){
        return content;
    }
}