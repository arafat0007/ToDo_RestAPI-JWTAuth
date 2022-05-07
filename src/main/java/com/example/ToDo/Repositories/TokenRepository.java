package com.example.ToDo.Repositories;

import com.example.ToDo.Domain.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByToken(String token);
}
