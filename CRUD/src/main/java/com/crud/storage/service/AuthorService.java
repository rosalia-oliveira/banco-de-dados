package com.crud.storage.service;

import com.crud.storage.model.Author;
import com.crud.storage.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AuthorService implements IAuthorService {

    private final AuthorRepository authorRepo;

    @Override
    public List<Author> getAuthors() {
        return authorRepo.findAll();
    }
}
