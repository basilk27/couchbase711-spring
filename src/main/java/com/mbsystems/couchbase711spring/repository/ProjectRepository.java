package com.mbsystems.couchbase711spring.repository;

import com.mbsystems.couchbase711spring.entity.Project;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CouchbaseRepository<Project, String> {
}
