package com.example.backend.domain.jwt.repository;

import com.example.backend.domain.jwt.entity.RefreshEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

public interface RefreshRepository extends JpaRepository<RefreshEntity, Long> {
    @Transactional
    void deleteByRefresh(String refresh);

    Boolean existsByRefresh(String refreshToken);

    @Transactional
    void deleteByUsername(String username);

    @Transactional
    void deleteByCreatedDateBefore(LocalDateTime createdDate);
}
