package junitpractTest1;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junitprac1.TestUtils;

public class TestingUtils {
	TestUtils util;
	Scanner sc = new Scanner(System.in);
	@Before
	public void setup() {
		util = new TestUtils();
	}
	@After
	public void resourceClose() {
		this.util=null;
	}
	@Test
	public void checkSorted() {
		List<Integer> input = Arrays.asList(5,4,8,6,1);
		List<Integer> expected = Arrays.asList(1,4,5,6,8);
		List<Integer> actual = util.sortList(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void checkSortedList() {
		List<Integer> actual = Arrays.asList(5,4,8,6,1);
		List<Integer> expected =Arrays.asList(5,4,8,6,1);
		assertEquals(expected,actual);
	}
	@Test
	public void assertEqualsAddition() {
		System.out.println("Testing add method");
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		int result = util.add(x,y);
		assertEquals(x+y,result);
//		assertNotEquals(13,result);
	}
//  @Test
	@Ignore
	public void assertCheck() {
		
		List<Integer> data = Arrays.asList(1,2,3,4);
		List list = util.returnList(data);
		for(Object o : list) {
			//assertTrue(o instanceof Integer);
			Integer i =(Integer) o;
			assertTrue(i%2==0);
		}
	}
	@Test
	public void checkEqualArray() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,9};
		assertArrayEquals(arr1,arr2);
	}
	@Test
	public void checkException() {
		assertThrows(ArithmeticException.class,()->{
			util.div(10,0);
		});
	}
	@Test
	public void checkNull() {
	    assertNull(util.returnString("Demo"));
	}

	@Test
	public void checkNotNull() {
	    assertNotNull(util.returnString("Hello"));
	}

	@Test
	public void checkSum() {
	    List<Integer> input = Arrays.asList(5, 8, 3, 4, 2, 9);
	    List<Integer> output = util.CheckSameListAfterModifying(input);
	    assertSame(output, input);  
	}

	@Test
	public void checkNotSame() {
	    List<Integer> input = Arrays.asList(5, 8, 3, 4, 2, 9);
	    List<Integer> output = new ArrayList<>(util.CheckSameListAfterModifying(input));
	    assertNotSame(output, input); 
	}

	@Test
	public void checkMatchersInList() {
	    List<String> input = Arrays.asList("tom", "jerry", "spike");
	    List<String> output = util.checkMatchers(input);
	    
	    assertThat(output, hasItem("TOM"));
	    assertThat(output, hasItems("TOM", "JERRY", "SPIKE"));
	}
}
