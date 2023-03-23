package com.john.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("QA")
@Service("datasourceConnection")
public class QaConnection implements  ConnectionDetails{
    @Override
    public String getConnection() {
        return "QA Connection";
    }
}
