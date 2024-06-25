package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }

    @When("i ask whether it is Friday yet")
    public void iAskWhetherItIsFridayYet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("i should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "Yes" : "Nope";
    }
}
