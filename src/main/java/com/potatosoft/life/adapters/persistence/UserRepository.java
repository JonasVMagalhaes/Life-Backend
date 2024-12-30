package com.potatosoft.life.adapters.persistence;

import com.potatosoft.life.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
