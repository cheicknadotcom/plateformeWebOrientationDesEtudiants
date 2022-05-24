package com.webPlateformeOrientation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webPlateformeOrientation.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByAddresseEmailAndPassword(String addresseEmail,String password);
	//Page<User> findBytypeid(String type, Pageable pageable);
//	@Query("select * from T_utilisateur where addresse_email = ?1  and password = ?1")
//	User giveUserByEmailPassword(@Param("addresseEmail") String email,@Param("password") String password);	
	User findByid(Long id);
	
	
	
}
