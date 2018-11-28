# Spring Boot 三大核心特性

## 1、组件自动装配

1. @EableAutoConfiguration
2. /META-INF/spring.factories
3. XXXAutoConfiguration

## 2、嵌入式Web容器
1. Web Servlet：Tomcat、Jetty、Undertow
    - Servlet 组件：Servlet、Filter、Listener
    - Servlet 注册：WebServlet注解、Spring Bean、RegistrationBean
        * WebServlet注解
            1. 实现 @WebServlet
            2. URL映射 (urlPatterns = "/my/servlet")
            3. 注册 @ServletComponentScan(basePackages = "com.my.test.springboot1.web.servlet")
    - 异步非阻塞：异步Servlet（3.0）、非阻塞Servlet（3.1）
2. Web Reactive: Netty Web Server

## 3、生成准备特性
1. 指标（Metrics）：/actuator/metrics
2. 健康检查（Health Check）：/actuator/health
3. 外部化配置（Externalized Configuration）：/actuator/configprops

