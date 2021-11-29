package FengTest;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class MainPage {
    private static final String Page_test="http://automationpractice.com/";
    private static final String Forgot_password="http://automationpractice.com/index.php?controller=password";
    private static final By create_error=By.xpath("//*[@id=\"create_account_error\"]/ol");
    private static final By forget_password_error=By.xpath("//*[@id=\"center_column\"]/div/div/ol/li");
    private static final By Newsletter_error=By.xpath("//*[@id=\"columns\"]/p");
    private static final By Search_error=By.xpath("//*[@id=\"center_column\"]/p");
    private static final By Register_error=By.xpath("//*[@id=\"center_column\"]/div/ol/li");

  @FindBy(className = "login")
  private WebElement SignIn;
  @FindBy(id = "SubmitCreate")
  private WebElement SubmitCreate;
  @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
  private WebElement Retrieve_password;
  @FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
  private WebElement SubmitNewsletter;
  @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
  private WebElement SearchButton;
  @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
  private WebElement RegisterAccount;


  private WebDriver wdriver;
    public MainPage(WebDriver wdriver) {this.wdriver=wdriver;
    }

  public void forget_password()
  {
          wdriver.get(Forgot_password);
      PageFactory.initElements(wdriver,this);
  }

public void OpenPage()
{
wdriver.get(Page_test);
PageFactory.initElements(wdriver,this);
}

    public void FillField(String fieldName,String msg)
    {
        getValue(By.id(fieldName)).clear();
        getValue(By.id(fieldName)).sendKeys(msg);
    }

public Boolean SearchResult(String name)
{
List<WebElement> resultlist=wdriver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));
for(int i=0;i< resultlist.size();i++)
{
String result=resultlist.get(i).getText();
if (result.contains(name))
{
    return true;
}
}
return false;
}
    public void SelectDropDown(String fieldName , String text){
        Select select = new Select(getValue(By.id(fieldName)));
        select.selectByVisibleText(text);
    }

public WebElement getValue(By locator){return wdriver.findElement(locator);}
    public void clickRetrieve(){Retrieve_password.click();};
public void clickSignIn(){SignIn.click();};
public void FillSpace(String space,String value ){getValue(By.id(space)).sendKeys(value);}
public void clickSubmitCreat(){SubmitCreate.click();}
    public void clickSubmitNewsletter(){SubmitNewsletter.click();};
public void clickSearchButton(){SearchButton.click();}
public void clickRegisterButton(){RegisterAccount.click();}


  public Optional<String>getCreatError(){return getErrorMessage(create_error);}
 public Optional<String>getForgetPwdError(){return getErrorMessage(forget_password_error);}
public Optional<String>getNewsLetterError(){return getErrorMessage(Newsletter_error);}
public Optional<String>getSearchError(){return getErrorMessage(Search_error);}
public Optional<String>getRegisterError(){return getErrorMessage(Register_error);}


    private Optional<String> getErrorMessage(By errorLocator) {
        Optional<WebElement> error = getError(errorLocator);
        if (error.isPresent()) {
            WebElement errorElement = error.get();
            return Optional.of(errorElement.getText());
        } else {
            return Optional.empty();
        }
    }
    private Optional<WebElement> getError(By errorLocator) {
        List<WebElement> elements = wdriver.findElements(errorLocator);
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }
}
