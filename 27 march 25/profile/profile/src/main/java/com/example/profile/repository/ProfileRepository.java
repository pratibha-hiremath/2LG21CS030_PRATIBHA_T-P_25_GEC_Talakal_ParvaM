package com.example.profile.repository;
    
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.profile.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>  {
}
