package com.example.demo.repository;

import com.example.demo.entity.Redirect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RedirectRepository extends JpaRepository<Redirect, Long> {
    Optional<Redirect> findByAlias(String alias);

    Boolean existsByAlias(String alias);
}
