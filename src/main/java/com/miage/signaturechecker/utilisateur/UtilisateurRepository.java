package com.miage.signaturechecker.utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {


    @Query(value = "SELECT check_password(:nomUser, :mdpUser);", nativeQuery = true)
    Boolean isUserExist(@Param("nomUser") String nomUser, @Param("mdpUser") String mdpUser);


    Utilisateur findByNomUser(String nomUser);

}
