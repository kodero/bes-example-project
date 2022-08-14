package org.acme.hibernate.orm.demo;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger.Level;

import com.corvid.bes.rest.BaseEntityResource;
import com.corvid.genericdto.util.LoggingUtil;

@Transactional
@RequestScoped
@Path("/v2/customers")
public class CustomerResource extends BaseEntityResource<Customer>{

    public CustomerResource(){
        super(Customer.class);
    }

    @POST
    @Path("/test")
    public Response test(String req){
        //log.info("Some log :" + req);
        LoggingUtil.log(CustomerResource.class, Level.INFO, "Some log info :" + req);
        return Response.ok("req").build();
    }
}
