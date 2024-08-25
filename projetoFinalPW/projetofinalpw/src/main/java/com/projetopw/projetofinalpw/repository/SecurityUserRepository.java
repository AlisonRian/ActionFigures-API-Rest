package com.projetopw.projetofinalpw.repository;

import com.projetopw.projetofinalpw.domain.SecurityUser;
import org.springframework.data.repository.CrudRepository;

public interface SecurityUserRepository extends CrudRepository<SecurityUser, Long> {
    SecurityUser findByUsername(String username);
}
