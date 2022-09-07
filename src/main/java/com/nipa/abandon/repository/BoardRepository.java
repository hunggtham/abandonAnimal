package com.nipa.abandon.repository;


import com.nipa.abandon.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardRepository extends CrudRepository<Board, Long> {

//desertion_no,filename,happen_day,process_state,kind,special_mark,care_addr,officetel
    @Query(value = "SELECT * " +
            "FROM animal ORDER BY desertion_no DESC" , nativeQuery = true)
    Page<Board> findAllSortedByNameUsingNative(Pageable pageable);


    @Query(value = "select count(process_state) from animal where process_state regexp '종료';", nativeQuery = true)
    int getEndProcess();

    @Query(value = "select count(process_state) from animal where process_state regexp '보호';", nativeQuery = true)
    int getPendingProcess();


    //    detail animal repository
    @Query(value = "SELECT * " +
            "FROM animal ORDER BY desertion_no DESC" , nativeQuery = true)
    List<Board> findAll();

    @Query(value = "select neuter_yn from animal a where a.desertion_no = ?1" , nativeQuery = true)
    String getNeuterYN(long desertionNo);

    @Query(value = "select sex_cd from animal a where a.desertion_no = ?1" , nativeQuery = true)
    String getSex(long desertionNo);

}
