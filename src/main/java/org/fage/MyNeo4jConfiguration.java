package org.fage;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年11月7日
 * @description neo4j配置类
 *
 */
@Configuration
@EnableTransactionManagement
@EnableNeo4jRepositories({"org.fage.node.repository"})
public class MyNeo4jConfiguration extends Neo4jConfiguration{
	// 定义实体包的位置
	@Override
	public SessionFactory getSessionFactory() {
		return new SessionFactory(configuration(),"org.fage.domain");
	}
	
	@Bean
	public org.neo4j.ogm.config.Configuration configuration() {
		org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
		// TODO: Temporary uses the embedded driver. We need to switch to http
		// driver. Then we can horizontally scale neo4j			.setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
		config.driverConfiguration()
		.setURI("http://localhost:7474")
		.setCredentials("neo4j", "root");
		return config;
	}
}
