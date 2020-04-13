package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname: PaymentHystrixMain8001
 * @Author: Dsx
 * @Date: 2020/04/13/10:06
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class, args);
    }

    /**
     * 此配置是为了服务监控而配置，与服务器容错本身无关，springcloud升级后的坑
     * ServletRegistrationBean因为springboot的默认路径不是/hystrix.stream
     * 只要在自己的项目里配置上下文的servlet就可以了
     */
    //@Bean
    //public ServletRegistrationBean getservlet(){
    //    HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
    //    ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<>(streamServlet);
    //    registrationBean.setLoadOnStartup(1);
    //    registrationBean.addUrlMappings("/hystrix.stream");
    //    registrationBean.setName("HystrixMetricsStreamServlet");
    //    return registrationBean;
    //}

}
