package org.acme.hibernate.orm.demo;

import javax.enterprise.context.RequestScoped;

import org.jboss.logging.Logger.Level;

import com.corvid.bes.callbacks.During;
import com.corvid.bes.callbacks.EntityCallbackMethod;
import com.corvid.genericdto.util.LoggingUtil;

@RequestScoped
public class IDTypeCallback {

    @EntityCallbackMethod(when = During.AFTER_CREATE)
    public void sampleCallback(IDType idType){
        LoggingUtil.log(IDTypeCallback.class, Level.INFO, "IDType callback method....." + idType.getName());
        System.out.println("IDType callback method.....");
    }
}
