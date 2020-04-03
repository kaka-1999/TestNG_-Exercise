package ParameterAndParrallel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test

    @Parameters({"brower","response"})
    public void ParameterTestMethod(String brower,String response){
        System.out.println("-----ParameterTest--------ParameterTestMethod---");
        System.out.println("brower Parameter values:"+brower);
        System.out.println("response Parameter values:"+response);
        String[] array=response.split(",");
        System.out.println("response[0] Parameter values:"+array[0]);
        System.out.println("response[1] Parameter values:"+array[1]);
    }
}
