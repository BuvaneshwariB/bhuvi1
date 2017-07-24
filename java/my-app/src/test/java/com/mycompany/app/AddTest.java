package com.mycompany.app;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
@RunWith(Parameterized.class)
public class AddTest {
@Parameter(0)
public int arg1;
@Parameter(1)
public int arg2;

/*public ParameterizedTestUsingConstructor(String p1,String p2) {
this.arg1 = p1;
this.arg2 = p2;}*/
@Parameter(2)
public int expected;
public int actual;

@Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] 
{
    { 1, 2,3 }, {21474836, 1,21474837}, { 15, 2,17 }, { 0, 2,2 }, { 21, 2,23 },
{ 5, 3,8 }, { 121, 4 ,125} };
    //{"santhosh","kumar","santhoshkumar"},{"xxx","yyy","xxxyyy"},{"aaa","bbb","aaabbb"},{"ramya","bhuvi","ramyabhuvi"}
//};
    // { 1, 2 }, { 2147483647, 1 }, { 1.5, 2 }, { null, 2 }, { "string", 2 },
//{ 5, 3 }, { 121, 4 } };
return Arrays.asList(data);
}

Calc a= new Calc();

@Test
public void addTest() 
{
actual= a.add(arg1, arg2);
assertEquals(expected,actual);
}
}

