package com.john.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("datasourceConnection")
public class DevConnection implements ConnectionDetails{
    @Override
    public String getConnection() {
        return "From Dev Service";
    }
}
