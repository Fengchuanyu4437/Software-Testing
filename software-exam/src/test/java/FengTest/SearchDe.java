package FengTest;

import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class SearchDe extends AbsStDe {
    @Then("the search button is clicked")
    public void theSearchButtonIsClicked() {mainpage.clickSearchButton();

    }

    @Then("the {string} error is shown")
    public void theMsgErrorIsShown(String msg4) {
        Optional<String> errorMessage = mainpage.getSearchError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg4, errorMessage.get());
        } else {
            fail();
        }
    }

    @Then("the result item {string} display")
    public void theResultItemDisplay(String name) {
  Assert.assertEquals(true,mainpage.SearchResult(name));
    }
}
