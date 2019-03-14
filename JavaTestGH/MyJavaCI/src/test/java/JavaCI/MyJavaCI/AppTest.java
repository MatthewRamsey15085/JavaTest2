package JavaCI.MyJavaCI;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    

    
    public void trueTest()
    {
    	boolean expected = true;
    	boolean actual = new App().isTrue();
    	
    	assertEquals(expected, actual);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
   

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( false );
    }
    
    public void randomTest()
    {
    	assertEquals(0, 0* 10);
    }
}
