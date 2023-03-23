package com.john.spring6di.controllers.env;

import com.john.spring6di.services.env.ConnectionDetails;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final ConnectionDetails connectionDetails;

    public EnvironmentController(ConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
    }

    public String getConnectionString(){
        return connectionDetails.getConnection();
    }
}
