package com.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimony.entity.UserProfile;

@Repository
public interface GetProfileRepository extends JpaRepository<UserProfile, Long>{

}
