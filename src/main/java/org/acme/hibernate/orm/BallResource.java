package org.acme.hibernate.orm;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.Path;

import com.corvid.bes.rest.BaseEntityResource;

@Transactional
@RequestScoped
@Path("/v2/balls")
public class BallResource extends BaseEntityResource<Ball>{

    public BallResource(){
        super(Ball.class);
    }
}
