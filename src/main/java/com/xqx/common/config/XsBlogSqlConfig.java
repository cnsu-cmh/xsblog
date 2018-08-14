package com.xqx.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@SpringBootConfiguration
@MapperScan(basePackages = "com.xqx.xsblog.mapper")
public class XsBlogSqlConfig {

    @Bean
    @Primary
    public SqlSessionFactory xsBlogSqlSessionFactory(DataSource xsBlogDataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(xsBlogDataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/xsblog/*Mapper.xml"));
        bean.setTypeAliasesPackage("com.xqx.xsblog.entity");
        return bean.getObject();
    }

    /**
     * 使用事务时调用的是默认的@Transactional，
     * @return
     */
    @Bean
    @Primary
    public PlatformTransactionManager xsBlogTransactionManager(DataSource xsBlogDataSource) {
        return new DataSourceTransactionManager(xsBlogDataSource);
    }

}
