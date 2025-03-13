package com.company.java018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JavaIO003_char {
	public static void main(String[] args) {
		//#1. 경로
		String folder_rel="src/com/company/java018/";
		String file_rel="file003.txt";
		
		File folder=new File(folder_rel);
		File file=new File(folder_rel + file_rel);
		
		//폴더 파일 만들기 ctrl+f11 / f5
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		}catch(Exception e) {e.printStackTrace();}
		
		//#2. char 쓰기 Reader > [프로그램] > Writer #
		try {
			Writer writer=new FileWriter(file);
			writer.write("hello");
			writer.flush();
			writer.close();
			System.out.println("Writer 쓰기완료");
		} catch (IOException e) { e.printStackTrace(); }
		
		//#3. char 읽기    Reader # > [프로그램] > Writer
		try {
			Reader reader=new FileReader(file);
			//System.out.println(reader.read());
			int cnt=0;
			while( (cnt=reader.read()) !=-1) {
				System.out.println((char)cnt);
			}
			reader.close();
			System.out.println("Reader 읽기완료");
			
		} catch (Exception e) { e.printStackTrace(); }
	}
}
