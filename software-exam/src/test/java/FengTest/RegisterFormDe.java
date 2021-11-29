package FengTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class RegisterFormDe extends AbsStDe{
    @And("the email address filled with {string}")
    public void theEmailAddressFilledWith(String msg5) {
        mainpage.FillField("email_create",msg5);
    }

    @And("Your Firstname is filled with {string}")
    public void yourFirstnameIsFilledWith(String arg0) {
        mainpage.FillField("customer_firstname",arg0);
    }

    @And("Your Lastname is filled with {string}")
    public void yourLastnameIsFilledWith(String arg0) {
        mainpage.FillField("customer_lastname",arg0);
    }

    @And("Your Firstname_address is filled with {string}")
    public void yourFirstname_addressIsFilledWith(String arg0) {
        mainpage.FillField("firstname",arg0);
    }

    @And("Your Lastname_address is filled with {string}")
    public void yourLastname_addressIsFilledWith(String arg0) {
        mainpage.FillField("lastname",arg0);
    }

    @And("Your City is filled with {string}")
    public void yourCityIsFilledWith(String arg0) {
        mainpage.FillField("city",arg0);
    }

    @And("The state is selected to {string}")
    public void theStateIsSelectedTo(String arg0) {
mainpage.SelectDropDown("id_state",arg0);
    }

    @And("The Country Field is selected to {string}")
    public void theCountryFieldIsSelectedTo(String arg0) {
        mainpage.SelectDropDown("id_country",arg0);
    }

    @And("The alias for furture field is filled with {string}")
    public void theAliasForFurtureFieldIsFilledWith(String arg0) {
        mainpage.FillField("alias",arg0);
    }

    @And("The Zipcode is filled with {string}")
    public void theZipcodeIsFilledWith(String arg0) {
        mainpage.FillField("postcode",arg0);

    }

    @And("the address is filled with {string}")
    public void theAddressIsFilledWith(String arg0) {
 mainpage.FillField("address1",arg0);
    }

    @And("the phonenumber is filled with {string}")
    public void thePhonenumberIsFilledWith(String arg0) {
        mainpage.FillField("phone_mobile",arg0);

    }

    @When("register button clicked")
    public void registerButtonClicked() {
        mainpage.clickRegisterButton();
    }


    @Then("the {string} is display")
    public void theMsgIsDisplay(String msg6) {
        Optional<String> errorMessage = mainpage.getRegisterError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg6, errorMessage.get());
        } else {
            fail();
        }
    }



    @And("the password is filled with {string}")
    public void thePasswordIsFilledWith(String arg0) {
        mainpage.FillField("passwd",arg0);
    }
}
