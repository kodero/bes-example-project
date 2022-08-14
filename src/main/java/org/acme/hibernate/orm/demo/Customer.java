package org.acme.hibernate.orm.demo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Filter;

import com.corvid.bes.model.AbstractModelBase;

@Entity
@Table(name = "customers")
@Filter(name = "filterByDeleted")
public class Customer extends AbstractModelBase{
    
    @NotEmpty
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty
    @Column(name = "other_names")
    private String otherNames;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deduction_type", referencedColumnName = "id")
    private IDType idType;

    @NotEmpty
    @Column(name = "id_number")
    private String idNumber;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @Filter(name = "filterByDeleted")
    private Collection<Contact> contacts = new ArrayList<>();

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtherNames() {
        return this.otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public IDType getIdType() {
        return this.idType;
    }

    public void setIdType(IDType idType) {
        this.idType = idType;
    }

    public Collection<Contact> getContacts() {
        return this.contacts;
    }

    public void setContacts(Collection<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
