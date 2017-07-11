package com.dxy.repository;

import com.dxy.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dongx on 2017/6/11.
 */
public interface GirlRepository extends JpaRepository<Girl,Long> {

    public List<Girl> findByAge(Integer age);
}
