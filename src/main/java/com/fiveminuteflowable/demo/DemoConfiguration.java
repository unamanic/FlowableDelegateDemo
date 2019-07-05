package com.fiveminuteflowable.demo;



import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
@AutoConfigureOrder(Ordered.LOWEST_PRECEDENCE)
@ConditionalOnBean(type = "org.flowable.engine.ProcessEngine")
public class DemoConfiguration{

    @Configuration
    @ComponentScan({"com.fiveminuteflowable.demo.delegates"})
    public static class ComponentScanConfiguration {

    }

}
