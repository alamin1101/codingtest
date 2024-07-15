package com.bracit.codingtest.repository;

import com.bracit.codingtest.entity.Battery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Long> {

    @Query("")
    List<Battery> findAllByPostCodeRange(int a,int b);
}
