package com.dxy.cntroller;

import com.dxy.domain.Girl;
import com.dxy.repository.GirlRepository;
import com.dxy.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by dongx on 2017/6/11.
 */
@RestController
public class GirlCntroller {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping("/girls")
    public  List<Girl> girlList()
    {
        return girlRepository.findAll();
    }

    @PostMapping("/girls")
    public Girl girlAdd(@Valid Girl girl, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
            return girlRepository.save(girl);
    }
    @GetMapping("/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Long id)
    {
        return girlRepository.findOne(id);
    }
    @PutMapping("girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Long id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age)
    {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girl.setId(id);
        return girlRepository.save(girl);
    }

    @DeleteMapping("/girls/{id}")
    public void girlDelete(@PathVariable("id") Long id)
    {
        girlRepository.delete(id);
    }

    @GetMapping("/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age)
    {
        return girlRepository.findByAge(age);
    }

    @PostMapping("/girls/two")
    public void girlTwo()
    {
        girlService.insertTwo();
    }

}
