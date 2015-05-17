package ebusiness.amazon;

/**
 * Created by shamimchy on 5/17/15.
 */
import baseApi.Base;
import homeFeatures.AmazonBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sun.plugin2.message.ShowDocumentMessage;
import utility.DataReader;





import java.io.IOException;

/**
 * Created by rrt on 4/12/2015.
 */
public class SignUp extends AmazonBase {
    public DataReader dr = new DataReader();
    String path = "/Users/shamimchy/Downloads/file1.xls";


    @Test
    public void signIn()throws IOException,InterruptedException{

        boolean result = false;
        try {

            String[][] value = dr.fileReader(path);
            sleepFor(1);
            clickByCss("#nav-tools  #nav-link-yourAccount  .nav-line-1");
            clickByCss(".nav-action-inner");
            sleepFor(1);
            String emailLocator = value[1][0];

            String email = value[1][1];
            String passLocator = value[2][0];

            String pass = value[2][1];
            typeByCss(emailLocator, email);
          //  typeByCss(passLocator, pass);
            sleepFor(4);

            clickByCss("#signInSubmit-input");


            String a=driver.findElement(By.cssSelector("#message_error")).getText();
            System.out.println(a);

          //  typeByCss(emailLocator, email);
            typeByCss(passLocator, pass);
            sleepFor(4);

            clickByCss("#signInSubmit-input");


            String b=driver.findElement(By.cssSelector("#message_error")).getText();
            System.out.println(b);

            typeByCss(emailLocator, email);
            typeByCss(passLocator, pass);
            sleepFor(4);

            clickByCss("#signInSubmit-input");


            String c =driver.findElement(By.cssSelector("#message_error")).getText();
            System.out.println(c);

            sleepFor(4);
        }catch(Exception ex){
            result = true;
        }
        if(result==true) {
            dr.writeBack("fail");
            System.out.print("fail");
        }else{
            dr.writeBack("pass");
            System.out.print("pass");
        }

    }
}
