//package com.nipa.abandon.config;
//
//
//import org.elasticsearch.node.NodeBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.nipa.abandon.repository")
//public class EsConfig {
//
//    @Bean
//    public NodeBuilder builder(){
//        return new NodeBuilder();
//    }
//    @Bean
//    public ElasticsearchOperations template(){
//        return new ElasticsearchTemplate(build().local(true).node().client());
//    }
//}
