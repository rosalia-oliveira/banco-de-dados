package com.crud.storage.repository;

import com.crud.storage.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {
    public SystemUser findByName(String name);
}
