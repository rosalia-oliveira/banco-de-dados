package com.crud.storage.service;

import com.crud.storage.model.Subject;

import java.util.List;

public interface ISubjectService {
    Subject getById(Long id);
    List<Subject> getAll();
}
