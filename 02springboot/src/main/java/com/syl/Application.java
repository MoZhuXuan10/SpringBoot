package com.syl;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		//1.定义一个convert转换消息对象
		FastJsonHttpMessageConverter converter=new FastJsonHttpMessageConverter();
		//2.添加fastjson的配置信息
		FastJsonConfig config=new FastJsonConfig();
		//设置格式化特性
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//2-1 处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<MediaType>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		converter.setSupportedMediaTypes(fastMediaTypes);
		//3.转换器converter中增加配置信息
		converter.setFastJsonConfig(config);
		//4.将converter添加到converters中
		converters.add(converter);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
