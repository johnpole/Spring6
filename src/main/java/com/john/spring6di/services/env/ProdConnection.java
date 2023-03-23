package com.john.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("PROD")
@Service("datasourceConnection")
public class ProdConnection implements ConnectionDetails{
    @Override
    public String getConnection() {
        return "PROD Connections";
    }
}
