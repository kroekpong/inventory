package th.co.baiwa.framework.common.util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class WebContextUtils {
	
	public static WebApplicationContext getWebApplicationContext() {
		return WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	}
	
	public static Object getBean(String beanName) {
		return getWebApplicationContext().getBean(beanName);
	}

	public static <T> T getBean(Class<T> classType) {
		return getWebApplicationContext().getBean(classType);
	}
	
	public static HttpServletRequest getHttpServletRequest() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpServletRequest request = attr.getRequest();
		return request;
	}
	
	public static HttpSession getHttpSession() {
		HttpSession session = getHttpServletRequest().getSession();
		return session;
	}
	
	public static ServletContext getServletContext() {
		ServletContext context = getHttpSession().getServletContext();
		return context;
	}
	
}
