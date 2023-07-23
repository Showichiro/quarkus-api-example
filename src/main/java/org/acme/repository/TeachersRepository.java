package org.acme.repository;

import org.acme.entity.Teacher;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeachersRepository extends PagingAndSortingRepository<Teacher, Long> {

}
