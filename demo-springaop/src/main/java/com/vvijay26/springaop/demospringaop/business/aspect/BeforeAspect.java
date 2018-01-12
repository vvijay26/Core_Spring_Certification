package com.vvijay26.springaop.demospringaop.business.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect
@Configuration
public class BeforeAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	// format of @Before execution(* PACKAGE.*.*(..))
	@Before("execution(* com.vvijay26.springaop.demospringaop.business.*.*(..))")
	public void before(JoinPoint joinpoint) {
		// Advantage of AspectJ is that we can check for things like user access before
		// allowing them to execute methods in the entire class. Easy maintenance!

		logger.info("Check for User Access");
		logger.info("Intercepted method calls - {}", joinpoint);

	}

}
