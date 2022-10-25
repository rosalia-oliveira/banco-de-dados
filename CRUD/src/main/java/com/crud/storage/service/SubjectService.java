package com.crud.storage.service;

import com.crud.storage.model.Subject;
import com.crud.storage.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService implements ISubjectService {

    private final SubjectRepository subjectRepo;

    @Override
    public Subject getById(Long id) {
        return subjectRepo.findById(id).orElse(null);
    }

    @Override
    public List<Subject> getAll() {
        return subjectRepo.findAll();
    }
}
