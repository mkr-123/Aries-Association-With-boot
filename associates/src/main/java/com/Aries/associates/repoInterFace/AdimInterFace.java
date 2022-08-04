package com.Aries.associates.repoInterFace;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Aries.associates.model.Buyer;

public interface AdimInterFace extends JpaRepository<Buyer, Long> {

	@Query("select b from Buyer b where  b.buyerName LIKE CONCAT('%',:name,'%') ")
	List<Buyer> getBuyersName(@Param("name") String name);

	

}
