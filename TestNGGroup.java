package com_FrameworkAssignment;

import org.testng.annotations.Test;

public class TestNGGroup {
 
  @Test(groups = "bit")
  public void bit1()
  {
	  System.out.println("this is  bit1");
  }

@Test(groups = "bit")
public void bit2()
{
	  System.out.println("this is  bit2");
}
@Test(groups = {"bit","apple"})
public void bit3()
{
	  System.out.println("this is  bit3");
}
@Test(groups = "apple")
public void apple1()
{
	  System.out.println("this is apple1");
}
@Test(groups = "apple")
public void apple2()
{
	  System.out.println("this is apple2");
}
@Test(groups = "apple")
public void apple3()
{
	  System.out.println("this is apple3");
}
}






