package org.ibase4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author ShenHuaJie
 * @since 2018年4月21日 下午3:30:20
 */
@SpringBootApplication(scanBasePackages = {"top.ibase4j", "org.ibase4j"})
public class BizWebApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(BizWebApplication.class, args);
	}
}
