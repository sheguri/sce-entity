package foo;

import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static  ApplicationContext applicationContext;
	
    public static void main( String[] args )
    {
    	//applicationContext = new ClassPathXmlApplicationContext("services.xml");
        System.out.println( "Hello World!" );
        
      
        
        DateTime coverageEndDate = DateTime.now().plusDays(1);
        
        
        DateTime maxduration = DateTime.now();
        System.out.println(coverageEndDate.compareTo(maxduration)>0);
    }
}
