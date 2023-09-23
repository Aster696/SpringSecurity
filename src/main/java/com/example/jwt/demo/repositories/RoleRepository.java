package com.example.jwt.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jwt.demo.models.RolesEntity;

public interface RoleRepository extends JpaRepository<RolesEntity, Integer>{
    Optional<RolesEntity> findByName(String name);
}
