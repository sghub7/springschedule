/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dbs.rp.sc.gsam.batch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author shoukat
 */
@Entity
public class Workflow {

   
   public Workflow(Long id, String stage, String currActionItem, String nextActionItem, String nextActionDate, String lastUpdateDate, String lcin, String ccode) {
        this.id = id;
        this.stage = stage;
        this.currActionItem = currActionItem;
        this.nextActionItem = nextActionItem;
        this.nextActionDate = nextActionDate;
        this.lastUpdateDate = lastUpdateDate;
        this.lcin = lcin;
        this.ccode = ccode;
    }
   

    public Workflow() {
    }
    

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    private String stage;
    private String currActionItem;
    private String nextActionItem;
    private String nextActionDate;
    private String lastUpdateDate;
    private String lcin;
    private String ccode;

 

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getCurrActionItem() {
        return currActionItem;
    }

    public void setCurrActionItem(String currActionItem) {
        this.currActionItem = currActionItem;
    }

    public String getNextActionItem() {
        return nextActionItem;
    }

    public void setNextActionItem(String nextActionItem) {
        this.nextActionItem = nextActionItem;
    }

    public String getNextActionDate() {
        return nextActionDate;
    }

    public void setNextActionDate(String nextActionDate) {
        this.nextActionDate = nextActionDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLcin() {
        return lcin;
    }

    public void setLcin(String lcin) {
        this.lcin = lcin;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }
    
}
