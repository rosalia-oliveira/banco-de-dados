package com.br.praticasstorage.QABugs.service;

import com.br.praticasstorage.QABugs.model.TestCase;
import com.br.praticasstorage.QABugs.repository.TestCaseRepository;
import com.br.praticasstorage.QABugs.service.interfaces.ITestCase;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class TestCaseService implements ITestCase {

    private final TestCaseRepository repository;

    @Override
    public TestCase create(TestCase newTestCase) {
        if(newTestCase == null) throw new DataIntegrityViolationException("Entity cannot be null!");
        if(newTestCase.getId_case() != null) throw new IllegalArgumentException("To create a new entity the id must not be informed!");
        newTestCase.setLastUpdate(LocalDate.now());
        return repository.save(newTestCase);
    }

    @Override
    public List<TestCase> getAll() {
        return repository.findAll();
    }

    @Override
    public TestCase getById(Long id) {
        TestCase findElement = repository.findById(id).orElse(null);
        if (findElement == null) throw new NoSuchElementException();
        return findElement;
    }

    @Override
    public TestCase update(TestCase updated) {
        TestCase getById = getById(updated.getId_case());
        if(getById == null) throw new NoSuchElementException();
        return repository.saveAndFlush(updated);
    }

    @Override
    public void deleteById(Long id) {
        getById(id);
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public List<TestCase> getLastUpdate(Date date) {
        List<TestCase> result = repository.findByLastUpdateAfter(date);
        if(result == null) throw new NoSuchElementException();
        return result;
    }
}
