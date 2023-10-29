import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{    

    public void onTestFailure (ITestResult result){
        System.out.println("Taking Screenshot for : "+result.getName());
    }

    public void onTestSuccess (ITestResult result){
        System.out.println("Test case is successful %%%%%%%%%%%%%% : "+result.getName());
    }
    
    public void onStart (ITestResult context){
        System.out.println("Test case executuion started %%%%%%%%%%%%%% : "+context.getName());
    }
   
}