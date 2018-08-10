package com.xqx.comadmin.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@SpringBootConfiguration
public class MybatisPlusConfig {

    /***
     * plus 的性能优化
     * @return
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor=new PerformanceInterceptor();
        /*<!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->*/
        performanceInterceptor.setMaxTime(1000);
        /*<!--SQL是否格式化 默认false-->*/
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

    //默认数据源
    @Primary
    @Bean(name = "comadmindb")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.comadmin" )
    public DataSource db1 () {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "xsblogdb")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.xsblog" )
    public DataSource db2 () {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
}
