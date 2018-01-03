package com.wyj.exampleJDBC;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * JdbcJob
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月28日 下午10:04:03
 */
public class JdbcJob implements Job{

	private Logger logger = LoggerFactory.getLogger(JdbcJob.class);

	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		logger.debug("MyJDBCJob is start ...");
		
		logger.debug("MyJDBCJob quzrtz "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));
		
		logger.debug("MyJDBCJob is end ...");
		
	}
	
	
}
