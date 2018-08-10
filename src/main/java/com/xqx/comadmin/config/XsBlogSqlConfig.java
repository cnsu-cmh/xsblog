package com.xqx.comadmin.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@SpringBootConfiguration
@MapperScan(basePackages = "com.xqx.xsblog.mapper",sqlSessionFactoryRef = "xsBlogSqlSessionFactory" )
public class XsBlogSqlConfig {

    @Bean
    public SqlSessionFactory xsBlogSqlSessionFactory(@Qualifier("xsblogdb")DataSource xsBlogDataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(xsBlogDataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/xsblog/*Mapper.xml"));
        bean.setTypeAliasesPackage("com.xqx.xsblog.entity");
        return bean.getObject();
    }

    /**
     * 使用事务时调用的是默认的@Transactional，如果调用本数据源事物使用：
     * @Transactional（transactionManager="xsBlogTransactionManager"）
     * @return
     */
    @Bean
    public PlatformTransactionManager xsBlogTransactionManager(@Qualifier("xsblogdb")DataSource xsBlogDataSource) {
        return new DataSourceTransactionManager(xsBlogDataSource);
    }

}
