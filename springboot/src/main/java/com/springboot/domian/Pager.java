package com.springboot.domian;

import java.util.List;

/**
 * 分页封装类
 *
 * @param <T>
 */
public class Pager<T> {
    // 查询页码
    private Integer page;
    // 每页条数
    private Integer size;
    // 总记录数
    private Long total;
    // 分页数据
    List<T> list;

    public Pager() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
