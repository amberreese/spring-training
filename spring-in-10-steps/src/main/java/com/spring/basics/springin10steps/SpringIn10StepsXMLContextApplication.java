package com.spring.basics.springin10steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.basics.springin10steps.xml.XmlPersonDAO;

public class SpringIn10StepsXMLContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsXMLContextApplication.class);

	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
		
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
			
		}
		
	}

}
