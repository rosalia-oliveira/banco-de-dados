package com.crud.storage.service;

import com.crud.storage.model.SystemUser;
import com.crud.storage.repository.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SystemUserServiceService implements ISystemUserService {
    @Autowired
    private SystemUserRepository userRepo;

    @Override
    public SystemUser create(SystemUser newUser) {
        if(getByName(newUser.getName()) != null) {
            throw new KeyAlreadyExistsException(newUser.getName() + " Already exists in DB!");
        }
        return userRepo.saveAndFlush(newUser);
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
            throw new NoSuchElementException("User Not Found!");
        };
        return userId;
    }

    @Override
    @Transactional(readOnly = true)
    public SystemUser getById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public SystemUser getByName(String name) {
        return userRepo.findByName(name);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}
