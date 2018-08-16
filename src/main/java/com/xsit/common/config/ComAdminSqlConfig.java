package com.xsit.common.config;

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
@MapperScan(basePackages = "com.xsit.admin.mapper*", sqlSessionFactoryRef = "comAdminSqlSessionFactory")
public class ComAdminSqlConfig {

    @Bean
    public SqlSessionFactory comAdminSqlSessionFactory(@Qualifier("admindb")DataSource comAdminDataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(comAdminDataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/admin/*Mapper.xml"));
        bean.setTypeAliasesPackage("com.xsit.admin.entity");
        return bean.getObject();
    }

    /**
     * 默认事物调用时使用：@Transactional,
     * 如果调用本数据源事物使用： @Transactional（transactionManager="comAdminTransactionManager"）
     * @return
     */
    @Bean
    public PlatformTransactionManager comAdminTransactionManager(@Qualifier("admindb")DataSource comAdminDataSource) {
        return new DataSourceTransactionManager(comAdminDataSource);
    }
}
