/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;

/**
 *
 * @author oyugik
 */
public class autoloader implements Serializable {
    private String date_default_timezone;
   //getters and setters

    /**
     *
     * @return id
     */
    public String getdate_default_timezone(){
        return date_default_timezone;
    }
    /**
     *
     * @param id
     */
    public void setdate_default_timezone(String date_default_timezone) {
        this.date_default_timezone="Africa/Nairobi";
    }

    //Initailise all the variables that you will use
    //Set the Getters and Setters 
   /*
    * protected $initSyncDate = 0;
    * protected $lastSyncSetting = null;
    * $time = (int)$time;
    * //pubic function available balance
	$lastSync = $this->lastSyncSetting->getValue();
	$amount = 0;
    *

    */
    

    }

