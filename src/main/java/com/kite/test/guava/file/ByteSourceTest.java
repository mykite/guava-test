package com.kite.test.guava.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;
import com.google.common.io.Closer;
import com.google.common.io.Files;

/**
 * 
 * 类ByteSourceTest.java的实现描述：测试 guava ByteSource
 * @author pengliang 2016年10月14日 下午5:23:38
 */
public class ByteSourceTest {
	
	/**
	 * 测试 创建ByteSource
	 * @throws IOException 
	 */
	@Test
	public void testCreateByteSource() throws IOException {
		File file = new File("C:/Users/Administrator/Desktop/quote1.txt");
		ByteSource byteSource = Files.asByteSource(file);
		byte[] read = byteSource.read();
		System.out.println(read);
		
	}
	
	/**
	 * 测试 创建ByteSlnk
	 * @throws IOException
	 */
	@Test
	public void testCreateByteSlnk() throws IOException {
		File dest = new File("C:/Users/Administrator/Desktop/dest.txt");
		ByteSink byteSink = Files.asByteSink(dest);
		File file = new File("C:/Users/Administrator/Desktop/quote1.txt");
		byteSink.write(Files.toByteArray(file));
	}
	
	/**
	 * 测试 将ByteSource复制到ByteSink
	 * @throws IOException
	 */
	@Test
	public void testByteSourceCopyToByteSink() throws IOException {
		File dest = new File("C:/Users/Administrator/Desktop/dest.txt");
		ByteSource byteSource = Files.asByteSource(dest);
		File file = new File("C:/Users/Administrator/Desktop/quote1.txt");
		ByteSink byteSink = Files.asByteSink(file);
		byteSource.copyTo(byteSink);
	}
	
	/**
	 * 测试closer
	 * @throws IOException
	 */
	@Test
	public void testCloser() throws IOException {
		Closer closer = Closer.create();
		try {
			File destination = new File("C:/Users/Administrator/Desktop/destfile.txt");
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Administrator/Desktop/srcfile.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
			closer.register(reader);
			closer.register(writer);
			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
			}
		} catch (Throwable t) {
			throw closer.rethrow(t);
		} finally {
			closer.close();
		}
	}
	
	
}
