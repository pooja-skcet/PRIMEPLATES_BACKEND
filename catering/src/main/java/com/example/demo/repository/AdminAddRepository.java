package com.example.demo.repository;

import com.example.demo.entity.AdminAdd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//JpaRepository provides CRUD operations and pagination for the AdminAdd entity
public interface AdminAddRepository extends JpaRepository<AdminAdd, Long> {
    // You can define custom query methods here if needed
}
