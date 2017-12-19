package com.springboot.web.vvijay26demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// proxy parameter in @Scope annonation is required to instantiate multiple
// instances
// of bean for JdbcConnection class.
// Only using scope_prototype on JdbcConnection class doesnt work since Person
// DAO will
// still be same bean everytime and this
// results in JdbcConnection also resulting in single bean even with just
// Scope_Prototype. But with proxy mode set, the PersonDAO will be singleton
// bean but its dependency JdbcConnection will be different beans each time.
// The other method to achieve this by adding SCOPE_PROTOTYPE on both Jdbc and
// PersonDAO is not efficient
// because mutliple beans for PersonDAO would also get created and let's say
// thats not what is required as per business requirements.
// ---***Even on the same instance, multiple calls will return differnt JdbcConn
// objects
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection successful");
	}
}
