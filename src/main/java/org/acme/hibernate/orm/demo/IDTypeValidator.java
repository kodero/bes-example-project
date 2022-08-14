package org.acme.hibernate.orm.demo;

import javax.inject.Named;

import com.corvid.bes.validation.ValidateAt;
import com.corvid.bes.validation.ValidationMethod;

@Named
public class IDTypeValidator {

    @ValidationMethod(when = ValidateAt.CREATE)
    public void validateName(IDType idType){
        
    }
}
