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
		System.out.println(getInitParameter("jdbcDriver"));
		System.out.println(getInitParameter("jdbcUrl"));
		System.out.println(getInitParameter("jdbcId"));
		System.out.println(getInitParameter("jdbcPwd"));
		System.out.println(getInitParameter("poolName"));
		driverLoad();
		initConnectionPool();
	}

	// 드라이버 클래스 로드
	void driverLoad() {
		try {
			Class.forName(getInitParameter("jdbcDriver"));
		} catch (Exception e) {
			
		}
	}
	
	// 커넥션풀 초기화
	void initConnectionPool() {
		try {
			// ConnectionFactory 객체 생성
			ConnectionFactory connFactory = 
					new DriverManagerConnectionFactory(
							getInitParameter("jdbcUrl"), 
							getInitParameter("jdbcId"), 
							getInitParameter("jdbcPwd"));
			PoolableConnectionFactory poolableConnFactory = 
					new PoolableConnectionFactory(connFactory, null);
			poolableConnFactory.setValidationQuery("select 1");
			
			// 설정
			GenericObjectPoolConfig<PoolableConnection> poolConfig = 
					new GenericObjectPoolConfig<PoolableConnection>();
			poolConfig.setTimeBetweenEvictionRunsMillis(1000*60*3); // 유효검사시간 주기
			poolConfig.setMinIdle(5); // 최소개수
			poolConfig.setMaxTotal(100); // 최대개수
			poolConfig.setTestWhileIdle(true);
			
			// 풀생성
			GenericObjectPool<PoolableConnection> pool = 
						new GenericObjectPool<PoolableConnection>(poolableConnFactory, poolConfig);
			poolableConnFactory.setPool(pool);
			
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = (PoolingDriver)DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			// 풀등록
			driver.registerPool(getInitParameter("poolName"), pool);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
