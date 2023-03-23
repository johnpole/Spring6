package com.john.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("UAT")
@Service("datasourceConnection")
public class UatConnection implements ConnectionDetails{
    @Override
    public String getConnection() {
        return "UAT Connection";
    }
}
