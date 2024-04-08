package com.rafaeldroid.WealthWise.repositories;

import com.rafaeldroid.WealthWise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
