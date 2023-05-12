package com.blog.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServlet;

public class Helper extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public static boolean deletePath(String path) {
		boolean f=false;
		
		
		
		try {
			
			File file=new File(path);
			//delete method returns true if file is deleted successfully 
			f=file.delete();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return f;
		
		
		
		
	}
	//is input stream se data read karke path mein daalna hoga 
	public static boolean saveFile(InputStream is,String path) {
		boolean f=false;
		try {
			
			//is.avaialbe gives the no f byte data ,which is coming 
			byte b[]=new byte[is.available()];
			
			
			//ye function is se data read karega aur byte wali array mein rakh dega .
			is.read(b);
			  FileOutputStream fos=new FileOutputStream(path);
			  
			  //data write kar rahe hain fos mein .
			  fos.write(b);
			  fos.flush();
			  fos.close();
			  f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

}
