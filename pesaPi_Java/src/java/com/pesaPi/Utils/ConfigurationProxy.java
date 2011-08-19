/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pesaPi.Utils;

/**
 *
 * @author oyugik
 */
public interface ConfigurationProxy {

    /**
     * Returns true if the initSyncDate exists for this service
     *
     * @param initSyncDate
     * @return
     */
    public boolean exists(String initSyncDate);

     /**
     * Returns true if the initSyncDate exists for this service
     *
     * @param lastSyncSetting
     * @return
     */
    public boolean forceSync (String lastSyncSetting);

}

