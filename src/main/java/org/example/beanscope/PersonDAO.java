package org.example.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

    @Autowired
    private JdbcConnection connection;

    public JdbcConnection getConnection() {
        return connection;
    }

    public void setConnection(JdbcConnection connection) {
        this.connection = connection;
    }
}
