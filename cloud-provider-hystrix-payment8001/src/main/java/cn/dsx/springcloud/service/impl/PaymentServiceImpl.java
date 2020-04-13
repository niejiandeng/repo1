package cn.dsx.springcloud.service.impl;

import cn.dsx.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @Classname: PaymentServiceImpl
 * @Author: Dsx
 * @Date: 2020/04/13/10:07
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    /**
     * 正常访问，肯定ok
     *
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池： " + Thread.currentThread().getName() + " PaymenyInfo_OK,id: " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @Override
    // HystrixCommand指定服务提供方 降级  commandProperties
    // 超时间3秒   如果超过3秒 调用 paymentInfo_TimeOutHandler
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        //int timeNumber = 2000;
        int timeNumber = 5000;
        //try {
        //    TimeUnit.MILLISECONDS.sleep(timeNumber);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        int i = 10 / 0;

        return "线程池： " + Thread.currentThread().getName() + " PaymenyInfo_TimeOut,id: " + id + "\t" + "O(∩_∩)O哈哈~" + " 耗时" + timeNumber + "毫秒";
    }

    // 降级方法
    public String paymentInfo_TimeOutHandler(Integer id)
    {
        return "线程池:  "+Thread.currentThread().getName()+"  8001系统繁忙或者运行报错，请稍后再试,id:  "+id+"\t"+"o(╥﹏╥)o";
    }


}
