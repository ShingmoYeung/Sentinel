package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA 2021.
 * FileName:  NacosProperties.java
 *
 * @Author: Yang Chengwu
 * @Date: 2021/12/2 10:52
 * @Version: 1.0
 * To change this template use File Or Preferences | Settings | Editor | File and Code Templates.
 * File Description: Nacos Properties
 */
@ConfigurationProperties(prefix = "sentinel.datasource.nacos")
public class NacosProperties {
    /**
     * Nacos Server Address
     */
    private String serverAddress;
    /**
     * Nacos Server Config Namespace
     */
    private String namespace;
    /**
     * Nacos Server Username
     */
    private String username;
    /**
     * Nacos Server Password
     */
    private String password;
    /**
     * 获取 Nacos Server Address
     *
     * @return serverAddress Nacos Server Address
     */
    public String getServerAddress() {
        return this.serverAddress;
    }

    /**
     * 设置 Nacos Server Address
     *
     * @param serverAddress Nacos Server Address
     */
    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    /**
     * 获取 Nacos Server Config Namespace
     *
     * @return namespace Nacos Server Config Namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * 设置 Nacos Server Config Namespace
     *
     * @param namespace Nacos Server Config Namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * 获取 Nacos Server Username
     *
     * @return username Nacos Server Username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置 Nacos Server Username
     *
     * @param username Nacos Server Username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取 Nacos Server Password
     *
     * @return password Nacos Server Password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置 Nacos Server Password
     *
     * @param password Nacos Server Password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}