package com.kite.util;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;


/**
 * 
 * 类ConvertFile.java的实现描述：公司对于代码进行了加密，对于自己的代码上传github有影响 
 * @author pengliang 2016年10月17日 下午5:42:15
 */
public class ConvertFile {
	
	public static void backFile(String filePath) throws IOException {
		File file = new File(filePath);
		if(file.exists()) {
			if(file.isDirectory()) {
				File[] listFiles = file.listFiles();
				for(File backFile : listFiles) {
					backFile(backFile.getAbsolutePath());
				}
			} else {
				File backFile = new File(file.getAbsoluteFile() + "x");
				Files.copy(file, backFile);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		backFile("E:/workspace/zhongansouxian/guava-test/src/main/java");
	}
}
