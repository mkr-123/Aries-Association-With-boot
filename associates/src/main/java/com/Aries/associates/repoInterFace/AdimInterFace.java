package com.Aries.associates.repoInterFace;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Aries.associates.model.Buyer;

public interface AdimInterFace extends JpaRepository<Buyer, Long> {

	

}
