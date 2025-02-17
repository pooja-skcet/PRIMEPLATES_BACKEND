package com.example.demo.repository;

import com.example.demo.entity.Menu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByDayOfWeekAndSessionAndTypeAndVeg(String dayOfWeek, String session, String type, boolean veg);
}

