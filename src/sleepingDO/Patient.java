/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingDO;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmo
 */
//Runabble to create a new thread 
public class Patient implements Runnable{
    
    private int Patient_ID;
    private Clinic clinic;
    private Date inTime;
    
    //constructor 
    public Patient(Clinic clinic) {
        this.clinic = clinic;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public void setPatient_ID(int Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public Date getInTime() {
        return inTime;
    }

    public int getPatient_ID() {
        return Patient_ID;
    }
    
    
    
    
    @Override
    //thread is started
    public void run(){
        // code to execute when thread is run
        try {
            //this code
            Make_Examine();
            //handle exception of interrupt thread 
        } catch (InterruptedException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //to prevent thread interference and memory consistency errors
    private synchronized void Make_Examine() throws InterruptedException {
        //patient is added to the list
       
        clinic.Enter_Clinic(this);
    }
    
}
