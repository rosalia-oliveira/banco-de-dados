package com.crud.storage.service;

import com.crud.storage.model.SystemUser;
import com.crud.storage.repository.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SystemUserService implements ISystemUser {
    @Autowired
    private SystemUserRepository userRepo;

    @Override
    public SystemUser create(SystemUser newUser) {
        userRepo.save(newUser);
        return newUser;
    }

    @Override
    @Transactional(readOnly = true)
    public List<SystemUser> getAll() {
        return userRepo.findAll();
    }

    @Override
    @Transactional
    public SystemUser update(SystemUser updated) {
        SystemUser userId = getById(updated.getId());
        if(userId != null) {
            userRepo.save(updated);
        } else {
            throw new NoSuchElementException();
        };
        return userId;
    }

    @Override
    @Transactional(readOnly = true)
    public SystemUser getById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}
