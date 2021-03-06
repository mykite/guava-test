package com.kite.test.guava.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSink;
import com.google.common.io.Files;

/**
 * 
 * 类EnCodingTest.java的实现描述：测试 guava BaseEncoding
 * @author pengliang 2016年10月17日 下午2:42:00
 */
public class EnCodingTest {
	
	/**
	 * 测试 以base64编码文件
	 * @throws IOException
	 */
	@Test
	public void encodeDecodeTest() throws IOException {
		File file = new File("C:/Users/Administrator/Desktop/test.png");
		byte[] byteArray = Files.toByteArray(file);
		BaseEncoding base64 = BaseEncoding.base64();
		String encode = base64.encode(byteArray);
		//base64.decode(encode) decode同样
		System.out.println(encode);
	}
	
	@Test
	public void encodeByteSinkTest() throws IOException {
		File srcFile = new File("C:/Users/Administrator/Desktop/srcfile.txt");
		File encodedFile = new File("C:/Users/Administrator/Desktop/encodedfile.txt");
		CharSink charSink = Files.asCharSink(encodedFile, Charsets.UTF_8);
		BaseEncoding baseEncoding = BaseEncoding.base64();
		ByteSink byteSink = baseEncoding.encodingSink(charSink); //将charSink转为ByteSink
		ByteSource byteSource = Files.asByteSource(srcFile);
		byteSource.copyTo(byteSink); //copy ByteSource to ByteSink
		String encodedBytes = baseEncoding.encode(byteSource.read());
	}
}
