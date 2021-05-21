package com.seul.springsecuritydemo.repository;


import com.seul.springsecuritydemo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
