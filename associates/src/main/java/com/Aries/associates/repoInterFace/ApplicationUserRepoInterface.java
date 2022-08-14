package com.Aries.associates.repoInterFace;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aries.associates.model.ApplicationUser;


public interface ApplicationUserRepoInterface extends JpaRepository<ApplicationUser, Long>  {

}
