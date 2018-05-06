package com.springboot;

import com.springboot.domian.District;
import com.springboot.mapper.DistrictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Resource
    private DistrictMapper districtMapper;

    @Test
    public void getTotal(){
        Long total = districtMapper.getTotal("湖南");
        System.out.println(total);
    }

    @Test
    public void find(){
        List<District> districts = districtMapper.find("湖南",5,25);
        districts.forEach(System.out::println);
    }
}
