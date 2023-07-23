package org.acme.repository;

import org.acme.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentsRepository extends PagingAndSortingRepository<Student, Long> {

}
