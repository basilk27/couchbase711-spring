package com.mbsystems.couchbase711spring.repository;

import com.mbsystems.couchbase711spring.entity.Task;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CouchbaseRepository<Task, String> {
}
