//Calculator class with methos to test

package testing;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return a/b;
	}	
}



//CalculatorTest class to test methods

package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class CalculatorTest {
	Calculator calculator;
	TestInfo testinfo;
	TestReporter reporter;
	
    @BeforeAll
    static void beforeAllInit() {
    	System.out.println("Before all");
    }
    @AfterAll
    static void afterAllInit() {
    	System.out.println("After all");
    }
    
	@BeforeEach
	void init(TestInfo testinfo,TestReporter reporter) {
		this.testinfo=testinfo;
		this.reporter=reporter;
		reporter.publishEntry("Running "+testinfo.getDisplayName());
		calculator=new Calculator();
	}
	
	@AfterEach
	void end(TestInfo testinfo,TestReporter reporter) {
		this.testinfo=testinfo;
		this.reporter=reporter;
		reporter.publishEntry("Ending "+testinfo.getDisplayName());
		System.out.println("Cleans up");
	}
	
	@Test
	@DisplayName("Add method")
	void testAdd() {
		assertEquals(2,calculator.add(1,1));
	}
	
	@Test
	@DisplayName("Subtract method")
	void testSubtract() {
		assertEquals(2,calculator.subtract(5,3));
	}
	
	@Test
	@DisplayName("Multiply method")
	void testMultiply() {
		assertEquals(2,calculator.multiply(1,2));
	}
	
	@Test
	@DisplayName("Divide method")
	void testDivide() {
		assertEquals(2,calculator.divide(4,2));
	}

}
