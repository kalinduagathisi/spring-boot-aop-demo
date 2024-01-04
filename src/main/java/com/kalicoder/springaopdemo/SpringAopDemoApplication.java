package com.kalicoder.springaopdemo;

import com.kalicoder.springaopdemo.dao.AccountDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao){
		return runner -> {

			demoTheBeforeAdvice(accountDao);
		};
	}

	private void demoTheBeforeAdvice(AccountDao accountDao) {
		accountDao.addAccount();
	}


}
