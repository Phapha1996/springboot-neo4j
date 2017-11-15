package org.fage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年10月30日
 * @description 创建步骤：
 * 						1.在pom中导入包坐标
 *						2.编写节点、关系域对象
 *						3.配置application.yml、neo4jConfiguration
 *						4.编写测试用例尝试
 */

@SpringBootApplication
@Import(value=MyNeo4jConfiguration.class)
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
