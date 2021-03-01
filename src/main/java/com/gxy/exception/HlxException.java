package com.gxy.exception;

public class HlxException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public HlxException(String msg){
        super(msg);
        this.msg = msg;
    }

    public HlxException(String msg, Throwable e){
        super(msg,e);
        this.msg = msg;

    }
    public HlxException(String msg,int code){
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public HlxException(String msg, int code, Throwable e){
        super(msg,e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
