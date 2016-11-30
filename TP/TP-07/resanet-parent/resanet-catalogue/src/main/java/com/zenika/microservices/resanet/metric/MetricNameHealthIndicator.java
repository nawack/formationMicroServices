package com.zenika.microservices.resanet.metric;

import org.springframework.aop.aspectj.AspectJAdviceParameterNameDiscoverer.AmbiguousBindingException;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MetricNameHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		int errorCode = 10; //TODO a remplacer par l'appel a un endpoint
		if (errorCode != 0) {
			return Health.down().withDetail("ErrorCode", errorCode).build();
		}
		return Health.up().build();
	}
	
}