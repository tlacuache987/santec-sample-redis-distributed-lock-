package mx.com.santander.demo;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.SneakyThrows;
import mx.com.santander.arquitecturatecnica.redis.distributedlock.Locked.Type;
import mx.com.santander.arquitecturatecnica.redis.distributedlock.alias.RedisLocked;

@Component
public class ScheduledTask {

	@SneakyThrows
	@Scheduled(cron = "0/30 * * * * *")
	@RedisLocked(lockedType = Type.KEEP_TRYING)
	public void task() {
		System.out.println("starts task: " + new Date());
		Thread.sleep(3000);
		System.out.println("finished task: " + new Date());
		System.out.println();
	}
}
