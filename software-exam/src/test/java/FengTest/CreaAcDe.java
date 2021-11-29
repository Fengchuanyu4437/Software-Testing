package FengTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class CreaAcDe extends AbsStDe{

    @Given("the {string} is filled with {string}")
    public void theSpaceIsFilledWithValue(String space,String value) {mainpage.FillSpace(space,value);
    }
    @When("the Create an account button is clicked")
    public void theSignInButtonIsClicked() {mainpage.clickSubmitCreat();
    }

    @Then("the {string} error message is shown")
    public void theMsgErrorMessageIsShown(String msg) {
        Optional<String> errorMessage = mainpage.getCreatError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        } else {
            fail();
        }
    }


    @And("the Sign In link is clicked")
    public void theSignInLinkIsClicked() {mainpage.clickSignIn();
    }
}
