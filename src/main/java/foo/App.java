package foo;

import org.joda.time.DateTime;
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
    	applicationContext = new ClassPathXmlApplicationContext("springcontext.xml");
    	applicationContext.getApplicationName();
    	applicationContext.getDisplayName();
    	for(String string : applicationContext.getBeanDefinitionNames()){
    		System.out.println(string);
    	}
    	applicationContext.getBeanDefinitionNames();
    	
        System.out.println( "Hello World!" + applicationContext.getBeanDefinitionCount() );
        
      
        
        DateTime coverageEndDate = DateTime.now().plusDays(1);
        
        
        DateTime maxduration = DateTime.now();
        System.out.println(coverageEndDate.compareTo(maxduration)>0);
    }
}
