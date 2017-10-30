/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dbs.rp.sc.gsam.batch.dao;

import com.sg.dbs.rp.sc.gsam.batch.entity.Workflow;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author shoukat
 */
public interface WorkflowRepository extends JpaRepository<Workflow,Long>{  
  
    public List <Workflow> findByLcinAndCcode(String lcin,String ccode);
    
    
    @Modifying(clearAutomatically = true)
    @Query("UPDATE Workflow w SET w.stage = :newStage WHERE w.stage = :oldStage")
    int updateWorkflow(@Param("newStage") String newStage, @Param("oldStage") String oldStage);
     
     
}
