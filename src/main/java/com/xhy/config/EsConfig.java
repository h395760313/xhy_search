package com.xhy.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Es配置类
 * @author xiehongyu
 * @date 2021/12/13 17:36
 */
@Configuration
@ConfigurationProperties(prefix = "elasticsearch")
public class EsConfig {
    private String host;
    private Integer port;

    public RestHighLevelClient client (){
        return new RestHighLevelClient(RestClient.builder(
                new HttpHost(host, port, "http")
        ));
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
