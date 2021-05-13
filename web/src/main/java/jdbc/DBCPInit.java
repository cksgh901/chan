package jdbc;

import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet {
	public void init() {
		driverLoad();
		initCoonectionPool();
		
	}
	
	//드라이버 클래스 로드
	void driverLoad() {
		try {
			Class.forName(getInitParameter("jdbcDriver"));

		}catch (Exception e) {
			
		}
	}
	// 커낵션풀 초기화
	void initCoonectionPool() {
		try {
			// ConnectionFactory 객체 생성
			ConnectionFactory connfactory = new DriverManagerConnectionFactory(getInitParameter("jdbcUrl"),getInitParameter("jdbcId"),getInitParameter("jdbcPwd"));
			PoolableConnectionFactory poolableConnFactory = new PoolableConnectionFactory(connfactory, null);
			poolableConnFactory.setValidationQuery("select 1");
			
			//설정
			GenericObjectPoolConfig<PoolableConnection> poolConfig = new GenericObjectPoolConfig<PoolableConnection>();
			poolConfig.setTimeBetweenEvictionRunsMillis(1000*60*3); //유효검사시간 주기 
			poolConfig.setMinIdle(5); // 최소 개수
			poolConfig.setMaxTotal(100); //최대 개수
			poolConfig.setTestWhileIdle(true);
			
			GenericObjectPool<PoolableConnection> pool = new GenericObjectPool<PoolableConnection>(poolableConnFactory ,poolConfig);
			
			poolableConnFactory.setPool(pool);
			
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = (PoolingDriver)DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			// 풀등록
			driver.registerPool(getInitParameter("poolname"), pool);
		}catch(Exception e) {
			
		}
	}
	

}
