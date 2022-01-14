package com.example.h2.flyway.dao.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.h2.flyway.dao.entity.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {

    Optional<RoleEntity> findByRoleId(UUID roleId);

    Optional<RoleEntity> findByName(String name);
}

