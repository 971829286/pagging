package com.springboot.service;

import com.springboot.domian.District;
import com.springboot.domian.Pager;
import com.springboot.mapper.DistrictMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class DistrictService {
    @Resource
    private DistrictMapper districtMapper;

    public Optional<Pager<District>> find(String name, Integer page, Integer size) {

        // 1.查询数据库
        // 1.1 查询总记录数
        Long total = districtMapper.getTotal(name);
        // 1.2 根据total判断查询结果
        Optional<Pager<District>> optionalPager = Optional.empty();
        if (total > 0) {
            // 封装分页数据
            Pager<District> pager = new Pager<>();
            List<District> districts = districtMapper.find(name, (page - 1) * size, size); // 注意开始行的处理
            pager.setPage(page);
            pager.setSize(size);
            pager.setTotal(total);
            pager.setList(districts);

            optionalPager = Optional.of(pager);
        }
        return optionalPager;
    }
}
