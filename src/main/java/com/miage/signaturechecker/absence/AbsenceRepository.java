package com.miage.signaturechecker.absence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Integer> {

    List<Absence> findByEtudiantIdEtu(int id);

    @Query(value = "CALL count_absences_by_student();", nativeQuery = true)
    List<Map<String, Object>> findTotalAbsencesByStudent();

}
