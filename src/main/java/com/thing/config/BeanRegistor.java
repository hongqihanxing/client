package com.thing.config;

import com.thing.bean.BeanComponet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * bean注册器
 *
 * @author zhanghongqi21
 * @create 2019-12-24 21:50
 **/
@Configuration
@EnableWebMvc
public class BeanRegistor {

  @Bean
  public BeanComponet beanComponet(){
    return new BeanComponet();
  }
}
