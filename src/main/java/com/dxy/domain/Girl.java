package com.dxy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by dongx on 2017/6/11.
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Long id;

    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;
    private String cupSize;

    public Girl() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
