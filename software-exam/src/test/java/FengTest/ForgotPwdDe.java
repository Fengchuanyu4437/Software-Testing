package FengTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class ForgotPwdDe extends AbsStDe{
    @Then("Forgot your password clicked")
    public void forgotYourPasswordClicked() {mainpage.forget_password();

    }
    @When("Retrieve Password clicked")
    public void retrievePasswordClicked() {mainpage.clickRetrieve();
    }

    @Then("the {string} error message display")
    public void theMsgErrorMessageDisplay(String msg2) {
        Optional<String> errorMessage = mainpage.getForgetPwdError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg2, errorMessage.get());
        } else {
            fail();
        }
    }
}
