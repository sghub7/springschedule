/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dbs.rp.sc.gsam.batch.utilities;

import com.sg.dbs.rp.sc.gsam.batch.service.WfsServices;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author shoukat
 */
@Component
public class Scheduler {
    @Autowired
    WfsServices wfs;
    private static final Logger log = LoggerFactory.getLogger(Scheduler.class);
    
    @Scheduled(fixedDelayString = "${schedule.fixedrate}", initialDelayString = "${schedule.initialrate}")
    @Transactional
	public void daily() {

		log.info("-- Trigger Daily Batch Methods--");
                wfs.batchUpdateWF("Hello2", "Hello1");
                
		
	}
    
}
