package org.acme.hibernate.orm.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Filter;

import com.corvid.bes.model.AbstractModelBase;
import com.corvid.bes.validation.ValidateAt;
import com.corvid.bes.validation.ValidationMethod;

import io.quarkus.runtime.annotations.RegisterForReflection;

@Entity
@Table(name = "id_types")
@Filter(name = "filterByDeleted")
@RegisterForReflection
public class IDType extends AbstractModelBase{

    @NotEmpty
    @Column(name = "name")
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ValidationMethod(when = ValidateAt.CREATE)
    public void validateName(){
        if(name.equalsIgnoreCase("X")){
            throw new ValidationException("X character not allowed!");
        }
    }
}
