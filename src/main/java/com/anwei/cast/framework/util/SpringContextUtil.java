package com.anwei.cast.framework.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 静态获取Bean for test
 * @author Anwei
 *
 */
public class SpringContextUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext;

	// 实现
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextUtil.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static Object getBean(String name) throws BeansException {
		try {
			return applicationContext.getBean(name);
		} catch (Exception e) {
			throw new RuntimeException("获取的Bean不存在！");
		}
	}

	public static <T> T getBean(String name, Class<T> requiredType)
			throws BeansException {
		return applicationContext.getBean(name, requiredType);
	}

	public static <T> T getBean(Class<T> requiredType) {
		return applicationContext.getBean(requiredType);
	}

	public static boolean containsBean(String name) {
		return applicationContext.containsBean(name);
	}

	public static boolean isSingleton(String name)
			throws NoSuchBeanDefinitionException {
		return applicationContext.isSingleton(name);
	}

	public static Class<? extends Object> getType(String name)
			throws NoSuchBeanDefinitionException {
		return applicationContext.getType(name);
	}

	public static String[] getAliases(String name)
			throws NoSuchBeanDefinitionException {
		return applicationContext.getAliases(name);
	}

}