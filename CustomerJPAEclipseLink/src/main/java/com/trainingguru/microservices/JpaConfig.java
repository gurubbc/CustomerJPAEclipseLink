package com.trainingguru.microservices;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.logging.SessionLog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration
public class JpaConfig extends JpaBaseConfiguration {

   protected JpaConfig(DataSource dataSource, JpaProperties properties,
      ObjectProvider<JtaTransactionManager> jtaTransactionManager) {
      super(dataSource, properties, jtaTransactionManager);
   }

   @Override
   protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
      return new EclipseLinkJpaVendorAdapter();
   }

   @Override
   protected Map<String, Object> getVendorProperties() {
      Map<String, Object> map = new HashMap<>();
      map.put(PersistenceUnitProperties.WEAVING, "false");
      map.put(PersistenceUnitProperties.LOGGING_LEVEL, SessionLog.FINER_LABEL); 
      map.put(PersistenceUnitProperties.DDL_GENERATION, PersistenceUnitProperties.DROP_AND_CREATE);
      map.put(PersistenceUnitProperties.LOGGING_LEVEL, SessionLog.FINER_LABEL); 
      return map;
   }

   @Bean
   public static DataSource dataSource() {
	   // @Bean is a method level annotation
	   // If you use this annotation before any method, that will be called automatically
	   // The code you write in this method will be executed
	   // Creating the datasorce object automatically
	   System.out.println("Creating DataSource Object.......");
      final DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
      dataSource.setUrl("jdbc:oracle:thin:@//localhost:1521:orcl1");
      dataSource.setUsername("system");
      dataSource.setPassword("Password1234567");
      return dataSource;
   }
}