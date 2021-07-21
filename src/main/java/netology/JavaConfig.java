package netology;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	@ConditionalOnProperty(name = "dev", matchIfMissing = true)
	public SystemProfile devProfile() {
		return new DevProfile();
	}

	@Bean
	@ConditionalOnProperty(name = "prod")
	public SystemProfile prodProfile() {
		return new ProductionProfile();
	}
}
