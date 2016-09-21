package th.co.baiwa.common.config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import th.co.baiwa.common.constant.CommonConstants.ENCODING;

@Configuration
@EnableWebMvc
@ComponentScan(
	useDefaultFilters = false,
	basePackages = {
		"th.co.baiwa",
		"th.co.saic"
	},
	includeFilters = {
		@ComponentScan.Filter(
			type = FilterType.ANNOTATION,
			value = {
				Controller.class,
				RestController.class
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
public class MvcConfig extends WebMvcConfigurerAdapter {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//        registry.addResourceHandler("/tmb/app/**").addResourceLocations("/tmb/app/");
//        registry.addResourceHandler("/tmb/libs/**").addResourceLocations("/tmb/libs/");
//        registry.addResourceHandler("/tmb/node_modules/**").addResourceLocations("/tmb/node_modules/");
//        registry.addResourceHandler("/tmb/*.js").addResourceLocations("/tmb/");
//        registry.addResourceHandler("/tmb/*.css").addResourceLocations("/tmb/");
    }
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		logger.info("Configure View Resolvers");
		
		registry.tiles();
	}
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		logger.info("Tiles Configurer");
		
		TilesConfigurer tilesconfigurer = new TilesConfigurer();
		
		// TODO Add Tiles Configure Here
		tilesconfigurer.setDefinitions(new String[] {
			"/WEB-INF/defs/baiwa/baiwaTiles.xml",
			"/WEB-INF/defs/saic/saicTiles.xml"
		});
		
		tilesconfigurer.setCheckRefresh(true);
		
		return tilesconfigurer;
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
		logger.info("Multipart Resolver");

		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding(ENCODING.UTF8);
		
		return resolver;
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		Gson gson = new GsonBuilder()
			//.excludeFieldsWithoutExposeAnnotation()
			.setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss")
			.serializeNulls()
			.create();

		GsonHttpMessageConverter gsonConverter = new GsonHttpMessageConverter();
		gsonConverter.setGson(gson);
		
		converters.add(gsonConverter);
	}
	
}
