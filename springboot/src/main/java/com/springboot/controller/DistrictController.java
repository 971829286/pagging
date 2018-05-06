package com.springboot.controller;

import com.springboot.domian.CustomType;
import com.springboot.domian.District;
import com.springboot.domian.Pager;
import com.springboot.service.DistrictService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DistrictController {

    @Resource
    private DistrictService districtService;

    @RequestMapping(value = "/find.do", method = RequestMethod.POST)
    public ResponseEntity<?> find(@RequestParam("name") String name,
                                  @RequestParam("page") Integer page,
                                  @RequestParam("size") Integer size) {
        // ---------------------- 调试数据 ----------------------
        System.out.println("关键字：" + name);
        System.out.println("当前页：" + page);
        System.out.println("每页条数：" + size);
        // ---------------------- 调试数据 ----------------------

        CustomType customType = new CustomType(400, "查无此数据！");
        Optional<Pager<District>> optionalPager =
                districtService.find(name, page, size);
        if (optionalPager.isPresent()) {
            customType.setCode(200);
            customType.setResult(optionalPager.get());
        }
        return ResponseEntity.ok(customType);
    }
}
