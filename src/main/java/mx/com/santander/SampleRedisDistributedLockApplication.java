package mx.com.santander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import mx.com.santander.arquitecturatecnica.redis.distributedlock.autoconfig.EnableDistributedLocksWithRedis;

@SpringBootApplication
@EnableDistributedLocksWithRedis
@EnableScheduling
// @EnableAspectJAutoProxy
public class SampleRedisDistributedLockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRedisDistributedLockApplication.class, args);
	}
}
