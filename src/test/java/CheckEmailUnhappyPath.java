import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


    public class CheckEmailUnhappyPath {
        private Email emailValidator;

        @DataProvider
        public Object[][] InvalidEmailProvider() {
            return new Object[][]{
                    {
                            new String[]{
                                    "oleksandra",
                                    "Sasha@.com.ua",
                                    "Sasha123@com.1",
                                    "Sasha123@.com",
                                    "Sasha23@.com.com",
                                    "Sasha()*@gmail.com",
                                    "Sasha@%*.com",
                                    "Sasha..@gmail.com",
                                    "Sasha@@gmail.com",
                                    "Sasha@gmail.com.1ua900"
                            }
                    }
            };
        }

        @Test(dataProvider = "InvalidEmailProvider")
        public void ValidEmailTest(String[] Email) {

            for (String elem : Email) {
                boolean valid = emailValidator.isEmailCorrect(elem);
                System.out.println("Email: " + elem + " -> " + valid);
                Assert.assertEquals(valid, false);
            }

        }
    }

