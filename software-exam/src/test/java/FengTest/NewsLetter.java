package FengTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class NewsLetter extends AbsStDe{





    @Then("the {string} error message comes up")
    public void theMsgErrorMessageComesUp(String msg3) {
        Optional<String> errorMessage = mainpage.getNewsLetterError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg3, errorMessage.get());
        } else {
            fail();
        }

    }

    @When("submitNewsletter clicked")
    public void submitnewsletterClicked() {mainpage.clickSubmitNewsletter();
    }
}
