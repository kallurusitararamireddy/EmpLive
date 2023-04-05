package com.emp.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class  DataUtility 
{
	public String  Data_info(String keys) throws IOException
	{
	
	 FileInputStream fis=new FileInputStream("C:\\Live_Site_EMP_PR\\Live_site_Emp_Monitor\\src\\main\\java\\com\\emp\\qa\\config\\EMP_File_paths");
 
	Properties pobj=new Properties();
	pobj.load(fis); 
	return pobj.getProperty(keys); 
	}
}
