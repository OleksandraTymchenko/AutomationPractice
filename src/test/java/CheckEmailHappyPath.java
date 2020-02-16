import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    public class CheckEmailHappyPath {
        private Email emailValidator;

        @DataProvider
        public Object[][] ValidEmailProvider() {
            return new Object[][]{
                    {
                            new String[]{
                                    "_l5@gmail.com",
                                    "Oleksandra_Tymchenko@ukr.net",
                                    "_900Alexa@mail.com",
                                    "ALEXANDRA@mail.ru",
                            }
                    }
            };
        }

        @Test(dataProvider = "ValidEmailProvider")
        public void ValidEmailTest(String[] Email) {

            for (String elem : Email) {
                boolean valid = emailValidator.isEmailCorrect(elem);
                System.out.println("Email: " + elem + " -> " + valid);
                Assert.assertEquals(valid, true);
            }

        }
    }