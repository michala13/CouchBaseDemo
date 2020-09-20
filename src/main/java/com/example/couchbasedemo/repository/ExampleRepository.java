package com.example.couchbasedemo.repository;

import com.example.couchbasedemo.domain.Example;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExampleRepository extends PagingAndSortingRepository<Example, String> {

}
