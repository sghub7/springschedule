/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dbs.rp.sc.gsam.batch.controller;

import com.sg.dbs.rp.sc.gsam.batch.entity.Workflow;
import com.sg.dbs.rp.sc.gsam.batch.service.WfsServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author shoukat
 */
@RestController
public class WfsController {
    @Autowired
    WfsServices wfs;
     @RequestMapping(value = "/gsam/wf/{lcin}/{ccode}", method = RequestMethod.GET)
     public List<Workflow> getWorkflow (@PathVariable String lcin, @PathVariable String ccode){
         System.out.println("Hittt");
         return wfs.getWorkflow(lcin, ccode);
     }
     
     @RequestMapping(value = "/gsam/wf", method = RequestMethod.POST)
     public Long addWorkflow (@RequestBody Workflow w){
         
         return wfs.addWF(w);
     }
     
     
     @RequestMapping(value = "/gsam/wf/{wfid}", method = RequestMethod.PUT)
     public Long editWorkflow (@RequestBody Workflow w,@PathVariable long wfid){
         
         return wfs.editWF(w,wfid);
     }
     
     
     
     
}
