package org.acme.hibernate.orm.demo;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.Path;

import com.corvid.bes.rest.BaseEntityResource;

@Transactional
@RequestScoped
@Path("/v2/id-types")
public class IDTypeResource extends BaseEntityResource<IDType>{
    public IDTypeResource(){
        super(IDType.class);
    }
}
