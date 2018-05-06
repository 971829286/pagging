package com.springboot.domian;


/**
 * @classDesc: 省份模型
 * @author: Vipin Zheng
 * @createDate: 2018-05-06 11:06:37
 * @version: v1.0
 */
public class Province {

    private Long pid;

    private String pname;

    private Long orderid;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "Province{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", orderid=" + orderid +
                '}';
    }
}
