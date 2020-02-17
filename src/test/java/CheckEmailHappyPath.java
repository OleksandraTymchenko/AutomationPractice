import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider
    public Object[][] validEmailProvider() {
        return new Object[][]{
                {"_l5@gmail.com"},
                {"!Alex!!@gmail.com"},
                {"ALEXANDRA@Mail4.ru"},
                {"ALEXANDRA@mail.yande"},
                {"Oleksandra_Tymchenko@ukr.net"},
                {"_900Alexa@mail.com"},
                {"ALEXANDRA@mail.ru"},
        };
    }

    @Test(dataProvider = "validEmailProvider")
    public void validEmailTest(String email) {
        boolean valid = Email.isEmailCorrect(email);
        Assert.assertTrue("incorrect email", valid);
    }
}
