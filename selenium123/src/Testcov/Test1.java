package Testcov;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
 @Test
 public void data()
 {
	 Reporter.log("world",true);
 }
 @Test
	 public void data1()
	 {
		 Reporter.log("hello",true);
	 }
 }
