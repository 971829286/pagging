package com.springboot.domian;


/**
 * @classDesc: 区县模型
 * @author: Vipin Zheng
 * @createDate: 2018-05-06 11:11:17
 * @version: v1.0
 */

public class District {

    private Long did;

    private String dname;

    private String postcode;

    private City city;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "District{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city=" + city +
                '}';
    }
}
