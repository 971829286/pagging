package com.springboot.domian;

/**
 * @classDesc: 自定义返回值模型
 * @author: Vipin Zheng
 * @createDate: 2018-05-06 18:05:43
 * @version: v1.0
 */
public class CustomType {
    private Integer code;
    private Object result;

    public CustomType(Integer code, Object result) {
        this.code = code;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
