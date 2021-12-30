package org.example;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//create new class my step defs (all feature files)
public class MyStepDefs {
    //create objects for relevant class
    HomePage homePg = new HomePage();
    RegistrationPage registrationPg = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopResult desktopResult = new DesktopResult();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    ReferProductToFriendResultPage referProductToFriendResultPage = new ReferProductToFriendResultPage();
    NewsCommentResult newsCommentResult = new NewsCommentResult();
    CategoryURLPage categoryURLPage = new CategoryURLPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    BillingAdressPage billingAdressPage=new BillingAdressPage();
    ShippingMethodPage shippingMethodPage=new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage=new PaymentMethodPage();
    PaymentCardInformationPage paymentCardInformationPage=new PaymentCardInformationPage();
    ConfirmOrderPage confirmOrderPage=new ConfirmOrderPage();

    //Register feature
    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePg.clickOnTheRegister();
    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPg.userEntersRegistrationDetails();
    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {
        registrationPg.clickOnRegisterButton();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationResultPage.verifyUserRegisterSuccessfully();
    }

    //Refer a product to friend feature
    @Given("Valid registered user is on homepage on nopcommerce website")
    public void validRegisteredUserIsOnHomepageOnNopcommerceWebsite() {
        homePg.clickOnTheRegister();
        registrationPg.userEntersRegistrationDetails();
        registrationPg.clickOnRegisterButton();
    }

    //News Comment feature
    @Given("user is on homepage on nopcommerce website")
    public void user_is_on_homepage_on_nopcommerce_website() {
    }
    @When("user clicks on details under new store open under news option")
    public void user_clicks_on_details_under_new_store_open_under_news_option() {
        homePg.clickOnTheNewsComment();
    }
    @And("user enters required details")
    public void userEntersRequiredDetails() {
        newsCommentPage.userShouldBeAbleToAddCommentSuccessfully();
    }
    @Then("user should be able to submit comment successfully")
    public void user_should_be_able_to_submit_comment_successfully() {
        newsCommentResult.userShouldBeAbleToAddNewsComment();
    }

    //Navigate to desktop page
    @When("user clicks on computers category")
    public void user_clicks_on_computers_category() {
        homePg.clickOnElementComputers();
    }
    @When("user clicks on desktop category")
    public void user_clicks_on_desktop_category() {
        computersPage.clickOnTheDesktopButton();
    }
    @Then("user should be navigate to desktop page successfully")
    public void user_should_be_navigate_to_desktop_page_successfully() {
        desktopResult.verifyUserNavigatesToDeskTopPage();
    }

    //Refer a product to friend
    @When("user clicks on Build your own computer category")
    public void user_clicks_on_build_your_own_computer_category() {
        desktopResult.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.verifyUserIsOnBuildYourOwncomputerPage();
    }
    @When("user clicks on email a friend button")
    public void user_clicks_on_email_a_friend_button() {
        desktopResult.clickOnSendEmail();
    }
    @When("user enters required details on email a friend")
    public void user_enters_required_details_on_email_a_friend() {
        emailAFriendPage.detailsToAddForReferProduct();
    }
    @When("user clicks on send email button")
    public void user_clicks_on_send_email_button() {
        emailAFriendPage.clickOnEmailButton();
    }
    @Then("user should be able to refer a product to a friend successfully")
    public void user_should_be_able_to_refer_a_product_to_a_friend_successfully() {
        referProductToFriendResultPage.userShouldBeAbleToSendEmailToFriendSuccessfully();
    //category pagetitle and url
    }
    @Given("I am on homepage")
    public void i_am_on_homepage() {
    }
    @When("I click on {string} button")
    public void i_click_on_button(String string) {
        homePg.clickOnCategoryButton(string);
    }
    @Then("I should able to verify the {string} accordingly")
    public void i_should_able_to_verify_the_accordingly(String url_name) {
     Utils.verifyCurrentURL(url_name);
    }

    @Then("I should able to verify the the page title as {string}accordingly")
    public void iShouldAbleToVerifyTheThePageTitleAsAccordingly(String text) {
        categoryURLPage.verifyCategoryTitle(text);
    }
    //subcategory
    @When("I click on {string}")
    public void i_click_on(String subcategory) {
        homePg.clickSubcategoryButton(subcategory);
    }

    //end to end testing
    @When("user choose configuration as per given requirement")
    public void user_choose_configuration_as_per_given_requirement() {
        buildYourOwnComputerPage.configurationDetailsForBuildYourOwnComputer();
    }
    @When("user clicks on Add To Cart Button")
    public void user_clicks_on_add_to_cart_button() {
        buildYourOwnComputerPage.clickOnAddToCartButton();
    }
    @When("user clicks on Shopping Cart")
    public void user_clicks_on_shopping_cart() {
        buildYourOwnComputerPage.clickOnShoppingCart();
    }
    @When("user clicks on Terms and Conditions check box")
    public void user_clicks_on_terms_and_conditions_check_box() {
        shoppingCartPage.tickCheckboxTerms();
    }
    @When("user clicks on Checkout Button")
    public void user_clicks_on_checkout_button() {
        shoppingCartPage.clickCheckoutButtonOnShoppingCartPage();
    }
    @When("user fills all mandatory fields in Billing Address Page")
    public void user_fills_all_mandatory_fields_in_billing_address_page() {
        billingAdressPage.fillMandatoryFieldsBillingAddress();
    }
    @When("user clicks on Continue button")
    public void user_clicks_on_continue_button() {
        billingAdressPage.clickOnContinueOnBillingAddress();
    }
    @When("user chooses Shipping option and shipping address and click Continue")
    public void user_chooses_shipping_option_and_shipping_address_and_click_continue() {
        shippingMethodPage.clickContinueShipping();
    }
    @When("user chooses Payment Method Credit Card and click Continue")
    public void user_chooses_payment_method_credit_card_and_click_continue() {
        paymentMethodPage.selectPaymentMethod();
    }
    @When("user fills in all required details for Credit Card and clicks Continue")
    public void user_fills_in_all_required_details_for_credit_card_and_clicks_continue() {
        paymentCardInformationPage.enterPaymentCreditCardDetails();
        paymentCardInformationPage.clickOnContinueButtonPaymentInfo();
    }
    @When("user clicks on Confirm button on Confirm Order page")
    public void user_clicks_on_confirm_button_on_confirm_order_page() {
        confirmOrderPage.confirmationOrder();
    }
    @Then("user should be able to place order successfully")
    public void user_should_be_able_to_place_order_successfully() {
        confirmOrderPage.verifyUserPlacedOrderSuccessfully();

    //facebook multi window handling
    }
    @When("user clicks continue")
    public void user_clicks_continue() {
        homePg.clickOnContinueOnHomePage();

    //new online store add comment
    }
    @Given("user is on homepage as a registered user")
    public void userIsOnHomepageAsARegisteredUser() {
        homePg.clickOnTheRegister();
        registrationPg.userEntersRegistrationDetails();
        registrationPg.clickOnRegisterButton();
        homePg.clickOnContinueOnHomePage();
    }
    @When("user clicks on Details under New Online Store is Open")
    public void user_clicks_on_details_under_new_online_store_is_open() {
       homePg.clickDetailsButton();
    }
    @When("user clicks on New Comment")
    public void user_clicks_on_new_comment() {
         newsCommentPage.userShouldBeAbleToAddCommentSuccessfully();
    }
    @Then("user should be able to verify that the added comment is last on the list.")
    public void user_should_be_able_to_verify_that_the_added_comment_is_last_on_the_list() {
        newsCommentResult.verifyAllRequiredFields();
        newsCommentResult.verifyAddedCommentIsLast();
    }

    //facebook multi window handling
    @When("I click on Facebook Button")
    public void i_click_on_facebook_button() {
        homePg.windowsHandle();
    }
    @When("I accept all cookies on Facebook WebPage")
    public void i_accept_all_cookies_on_facebook_web_page() {
    }
    @Then("I should be able to verify that I am on Facebook page through nopCommerce")
    public void i_should_be_able_to_verify_that_i_am_on_facebook_page_through_nop_commerce() {
    }

    //vote button
    @When("I click on Vote button")
    public void i_click_on_vote_button() {
        homePg.voteButton();
    }
    @Then("I handle pop up as per requirement")
    public void i_handle_pop_up_as_per_requirement() {
        homePg.popUpHandle();
    }
    @And("I should be able to verify alert message accordingly")
    public void i_should_be_able_to_verify_alert_message_accordingly() {
        homePg.verifyAlertMessage();
    }

}
