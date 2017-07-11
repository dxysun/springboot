package com.dxy.service;

import com.dxy.domain.Girl;
import com.dxy.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dongx on 2017/6/11.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;


    //同时操作，一个插入失败，两个都不会插入
    @Transactional
    public void insertTwo()
    {
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("C");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(18);
        girlB.setCupSize("B");
        girlRepository.save(girlB);
    }
    public Girl findOne(Long id) {
        return girlRepository.findOne(id);
    }
}
