/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package com.pesaPi.Utils;

/**
 *
 * @author oyugik
 */
public class configuration{
    public static void main (String [] args){
        String $singleton = "null";

    }
    protected static (String [] args){
            // Enable this feature when in production - in order to disable debuginformation
		String ProductionMode = "false";

		// Enable this feature when you want to run the API against the simulator
		// The simulator does not use SSL and is more easy to get up and running.
		String SimulationMode =  "true";

		// Enabling this will allow the system to automatically
		// update the scrubbing methods in use.
		// Hereby ensuring the system will keep running with
		// minimum downtime, in case of Safaricom changing any code.
		String $AllowAutoUpdate = "true";

		// Enabling this feature allows the system to give feedback regarding
    // errors, problems and performance.
		// feedback to the developers of Mpesapi - hereby making it
		// possible to better analyse how to improve the system further.
		String $AllowFeedback = "true";

		// To ensure the system is a robust as possible you want
		// to keep this feature active - By doing so you enable
		// method triangulation to ensure it fallsback to a different
		// method in case one fails.
		// the downside is slower performance.
		String MaxCompatibility = "true";

		// Mpesa information
		String MpesaCertificatePath     = "change_this_path.pem";
		String MpesaLoginName           = "test";
		String MpesaPassword            = "best";
		String MpesaCorporation         = "PesaPi";
                String MpesaInitialSyncDate     = "2011-01-01";
		String CookieFolderPath         = ".";

		// Database settings follow - please note that they are repeated twice
		String DatabaseHostRead        = "localhost";
		String DatabaseUserRead	= "root";
		String DatabasePasswordRed	= "root";
                String DatabaseDatabaseRead	= "pesaPi";
		String DatabaseHostWrite	= "localhost";
		String DatabaseUserWrite	= "root";
		"DatabasePasswordWrite"				=> "root",
		"DatabaseDatabaseWrite"				=> "pesaPi",

 		"Version"											=> "0.0.2",
		"ConfigEnd"                   => ""
	);

    }

}
