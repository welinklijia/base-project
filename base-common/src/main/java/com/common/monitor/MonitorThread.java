package com.common.monitor;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
 * 定时监控指定目录文件下的所有文件
 */
public class MonitorThread extends Thread {
	private static Logger logger = LoggerFactory.getLogger(MonitorThread.class);
	private String path;
	public MonitorThread(String path){
		this.path = path;
	}
	@Override
	public void run() {
		while(true){
			List<File> list = new ArrayList<>();
			list = loopDirectory(path,list);
			for(File file : list){
				logger.info(file.getPath());
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	//获取指定目录下的说有文件
	private List<File> loopDirectory(String path,List<File> list){
		File file = new File(path);
		if(file.exists()){
			if(null!=file.listFiles()){
				List<File> temfileList = Arrays.asList(file.listFiles());
				for(File temfile:temfileList){
					if(temfile.isFile()){
						list.add(temfile);
						continue;
					}
					loopDirectory(temfile.getPath(),list);
				}
			}
		}else{
			logger.warn("当前目录:{}不存在",path);
		}
		return list;
	}
}
