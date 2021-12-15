package clinic.programming.training;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

 public class Application {
    
public int ctwords(String word){
   
    String[] separateWords = StringUtils.split(word, ' ');
    return (separateWords == null)? 0 :separateWords.length;
  }

    
    public Application() {
        System.out.println ("Inside Application");
     }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
 }
 }