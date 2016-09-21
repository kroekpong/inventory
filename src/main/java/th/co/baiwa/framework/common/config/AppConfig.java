package th.co.baiwa.framework.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(
	useDefaultFilters = false,
	basePackages = {
		"th.co.baiwa.framework",
		"th.go.excise.poc"
	},
	includeFilters = {
		@ComponentScan.Filter(
			type = FilterType.REGEX,
			pattern = {
				".*.service",
				".*.dao"
			}
		),
		@ComponentScan.Filter(
			type = FilterType.ANNOTATION,
			value = {
				Service.class,
				Repository.class,
				Component.class
			}
		)
	},
	excludeFilters = {
		@ComponentScan.Filter(
			type = FilterType.ANNOTATION,
			value = Configuration.class
		)
	}
)
@PropertySource(value = {
	"classpath:/application.properties"
})
@Import({
	DataAccessConfig.class
})
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
