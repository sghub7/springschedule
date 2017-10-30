package com.sg.dbs.rp.sc.gsam.batch.service;

import com.sg.dbs.rp.sc.gsam.batch.dao.WorkflowRepository;
import com.sg.dbs.rp.sc.gsam.batch.entity.Workflow;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shoukat
 */
@Service
public class WfsServices {
    private static final Logger log = LoggerFactory.getLogger(WfsServices.class);
    @Autowired
    WorkflowRepository wfr;
    
    public List<Workflow> getWorkflow (String lcin,String CCode){
        List<Workflow> w = new ArrayList();
        for (Workflow workflow : wfr.findByLcinAndCcode(lcin, CCode) ){
           w.add(workflow);
        };
       
        return w; 
    }
    
    public Long addWF (Workflow w){
        log.info(w.getCcode());
       wfr.save(w);
       log.info("workflow created with id = "+w.getId());
       return w.getId();
    }
    
    
    public Long editWF (Workflow w,Long id){
       log.info("Edit for workflow id ="+id);
       w.setId(id);
       wfr.save(w);
       log.info("workflow edited for id = "+w.getId());
       return w.getId();
    }
    
    
    public int batchUpdateWF (String newStage,String oldStage){
        
        return wfr.updateWorkflow(newStage, oldStage);
    }
}
