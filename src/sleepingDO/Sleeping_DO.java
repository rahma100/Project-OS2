
package sleepingDO;


import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sleeping_DO {
    
    private int num_Patient;
    private int num_Chairs;
    private int num_DO;

    //constructor
    public Sleeping_DO(int num_Patient, int num_Chairs, int num_DO) {
        this.num_Patient = num_Patient;
        this.num_Chairs = num_Chairs;
        this.num_DO = num_DO;
    }
    
    
    
    public void Start(Session form) throws InterruptedException{
        ExecutorService exec = Executors.newFixedThreadPool(12);
        Clinic clinic = new Clinic(num_Chairs, num_DO, num_Patient, form);
        Random r = new Random();
        
        System.out.println("Clinic is opened with "+num_DO+" Doctors");
        
        long startTime  = System.currentTimeMillis();
        
        for (int i = 1; i <= num_DO; i++) {
            Doctor_Assistant DO = new Doctor_Assistant(clinic, i);
            Thread th_DO = new Thread(DO);
            exec.execute(th_DO);
        }
        
        for (int i = 1; i <= num_Patient; i++) {
            try {
                Patient patient = new Patient(clinic);
                patient.setInTime(new Date());
                patient.setPatient_ID(i);
                Thread th_Patient = new Thread(patient);
                exec.execute(th_Patient);
                
                double val = r.nextGaussian() * 2000 + 2000;			
                int Delay = Math.abs((int) Math.round(val));		
                Thread.sleep(Delay);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Sleeping_DO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        List<Patient> backLater = clinic.Backlater();
        if (backLater.size() > 0 ) {
            for (int i = 0; i < backLater.size(); i++) {
            try {
                Patient patient = backLater.get(i);
                patient.setInTime(new Date());
                Thread th_patient = new Thread(patient);
                exec.execute(th_patient);
                
                double val = r.nextGaussian() * 2000 + 2000;			
                int Delay = Math.abs((int) Math.round(val));		
                Thread.sleep(Delay);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Sleeping_DO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
        exec.awaitTermination(12, SECONDS);
        exec.shutdown();
        
        long elapsedTime = (System.currentTimeMillis() - startTime)/1000;
        
        System.out.println("Clinic is closed");
        System.out.println("\nTotal time elapsed in seconds"
        		+ " for Making "+num_Patient+" patients' Examination by "
        		+num_DO+" Doctors with "+num_Chairs+
        		" chairs in the waiting room is: "
        		+elapsedTime);
        System.out.println("\nTotal patients: "+num_Patient+
        		"\nTotal patients served: "+clinic.getTotal_Examined_done()
        		+"\nTotal patients returned: "+clinic.getBackLater_Counter());
    }
    
}