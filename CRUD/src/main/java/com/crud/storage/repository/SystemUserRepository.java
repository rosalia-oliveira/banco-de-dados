package com.crud.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.storage.model.SystemUser;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {

    public SystemUser findByName(String name);
}
