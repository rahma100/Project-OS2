/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingDO;

/**
 *
 * @author mahmo
 */
public class Doctor_Assistant implements Runnable{
    
    private Clinic clinic;
    private int DO_ID;

    public Doctor_Assistant(Clinic clinic, int DO_ID) {
        this.clinic = clinic;
        this.DO_ID = DO_ID;
    }
    
    @Override
    public void run(){
        while (true) {            
            clinic.Examination_done(DO_ID);
        }
    }
    
}
