package com.crud.storage.service;

import com.crud.storage.model.SystemUser;
import java.util.List;

public interface ISystemUserService {
    public Object create(SystemUser newUser);
    public List<SystemUser> getAll();
    public SystemUser update(SystemUser updated);
    public SystemUser getById(Long id);
    public SystemUser getByName (String name);
    public void delete(Long id);
}
