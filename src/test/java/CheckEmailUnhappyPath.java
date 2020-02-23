import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CheckEmailUnhappyPath {

    @DataProvider
    public Object[][] invalidEmailProvider() {
        return new Object[][]{
                {"oleksandra"},
                {"Sasha@.com.ua"},
                {"Sasha123@com.1"},
                {"Sasha123@.com"},
                {"Sasha23@.com.com"},
                {"Sasha()*@gmail.com"},
                {"Sasha@%*.com"},
                {"Sasha..@gmail.com"},
                {"Sasha@@gmail.com"},
                {"Sasha@gmail.com.1ua900"},
                {""},
                {"Sa sha@gmail.com.ua"},
        };
    }

    @Test(dataProvider = "invalidEmailProvider")
    public void invalidEmailTest(String email){
    boolean valid = Email.isEmailCorrect(email);
        Assert.assertFalse("correct email", valid);
    }

}


