package com.itergo.app.core;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Handler {

	private static final java.util.logging.Logger logger = (Logger) LoggerFactory.getLogger(Handler.class);

	public Handler() {
		logger.info("Within app");
	}
    
}
