package com.realtime.java.ex;
import com.realtime.java.ex.*;
public class StudentClient
{

	public static void main(String[] args)
	{
      // call the institute data
		InstituteInfo instituteInfo=new InstituteInfo();
		instituteInfo.info();
		// call the faculty data
		FacultyInfo facultyinfo = new FacultyInfo();
		facultyinfo.info();
	}

}
