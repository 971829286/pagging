package com.springboot.domian;


/**
 * @classDesc: 城市模型
 * @author: Vipin Zheng
 * @createDate: 2018-05-06 11:08:33
 * @version: v1.0
 */

public class City {

    private Long cid;

    private String cname;

    private String areacode;

    private Province province;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "City{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", areacode='" + areacode + '\'' +
                ", province=" + province +
                '}';
    }
}
