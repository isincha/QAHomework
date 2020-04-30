package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItCoronatime{
    public static String isItCoronatime(int numberofill){
         return 10 == numberofill ? "Quarantine is over!" : "Quarantine is going on!";
     }
}
public class Stepdefs {
    private int numberofill;
    private String Quarantineisover;
    private String actualAnswer;
    @Given("number of ill people is {int}")
    public void number_of_ill_people_is(int numberOfIllPeople) {
        this.numberofill = numberofill;
    }
    @When("I ask whether it's quarantine is over")
    public void i_ask_whether_it_s_quarantine_is_over() {
        actualAnswer = IsItCoronatime.isItCoronatime(numberofill);
    }
    @Then("I should be told {string}")
    public void I_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
    @Given("quarantine is over")
    public void quarantine_is_over() {
        Quarantineisover = "Yes, you can!";
    }
    @When("I ask whether i can go to cinema")
    public void i_ask_whether_i_can_go_to_cinema() {
        actualAnswer =  Quarantineisover;
    }
}



