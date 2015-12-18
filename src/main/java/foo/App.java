package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static  ApplicationContext applicationContext;
	
    public static void main( String[] args )
    {
    	applicationContext = new ClassPathXmlApplicationContext("services.xml");
        System.out.println( "Hello World!" );
    }
}
