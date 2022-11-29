package co.com.tcs.certification.advantage.stepdefinitions;

import co.com.tcs.certification.advantage.interactions.*;
import co.com.tcs.certification.advantage.questions.SendResultQuestion;
import co.com.tcs.certification.advantage.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BuyProductStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Junior");
    }

    @Given("^he is logged into the page Username  '(.*)' and Password  '(.*)'$")
    public void heIsLoggedIntoThePageUsernameUserPruebaAndPasswordIngreso(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
              BurgerMenuTask.buttonClic(),
              ButtonLoginTask.buttonClic(),
              LoginInterection.login(user, password)
        );
    }

    @When("^he has selected some products and add the product to the shopping cart$")
    public void heHasSelectedSomeProductsAndAddTheProductToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuyLaptopInteraction.buyLaptop(),

                BurgerMenuTask.buttonClic(),
                HomeInteraction.home(),

                BuyHeadInteration.buyHead(),

                BurgerMenuTask.buttonClic(),
                HomeInteraction.home(),

                BuyTabletInteraction.buyTablet()
        );
    }

    @Given("^he chooses to pay with mastercard$")
    public void heChoosesToPayWithMastercard() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ShoppingCartInteraction.shoppingCart(),
                GoToPayTask.goToPay()
                //PaymentMethodTask.paymentMethod()
        );
    }

    @When("^he enter card information and press click pay$")
    public void heEnterCardInformationAndPressClickPay(Map<String, String> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterInfoCardTask.enterInfoCard(data),
                ButtonPayTask.buttoPay()
        );
    }

    @Then("^he can see a transaction approval message '(.*)'$")
    public void heCanSeeATransactionApprovalMessageThankYouForBuyingWithAdvantage(String result) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(SendResultQuestion.sendResult(), Matchers.is(result))
        );
    }


}
