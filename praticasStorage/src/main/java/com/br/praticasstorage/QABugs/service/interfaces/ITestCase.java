package com.br.praticasstorage.QABugs.service.interfaces;

import com.br.praticasstorage.QABugs.model.TestCase;

import java.util.Date;
import java.util.List;

public interface ITestCase {
    TestCase create(TestCase newTestCase);
    void deleteById(Long id);
    void deleteAll();
    List<TestCase> getAll();
    TestCase getById(Long id);
    List<TestCase> getLastUpdate(Date date);
    TestCase update(TestCase updated);
}
