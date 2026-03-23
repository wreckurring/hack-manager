package com.hackmanager.repository;

import com.hackmanager.model.Hack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;









































@Repository
public interface HackRepository extends JpaRepository<Hack, Long> {
    List<Hack> findByCompleted(boolean completed);

}