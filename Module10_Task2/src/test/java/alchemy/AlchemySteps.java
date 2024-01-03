package alchemy;

import Module3.Task1.NatureElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import steps.Steps;

import java.util.HashMap;

public class AlchemySteps extends Steps {
    @When("^Создать элемент (.+)")
    public void createFireElement(String elementName) {
        var element = NatureElement.create(elementName);
        scContext.put(Context.natureElement, element);
        System.out.println("Создан элемент " + elementName);
    }

    @Then("^Проверить, что элемент (.+) создан")
    public void checkElementCreated(String elementName) {
        System.out.println("Проверка создания элемента " + elementName);
        NatureElement natureElement = (NatureElement) scContext.get(Context.natureElement);
        Assertions.assertEquals(
                "Module3.Task1.baseElements." + elementName,
                natureElement.getClass().getName(),
                "Создан элемент " + elementName
        );
    }

    @When("^Объеденить элемент (.+) с элементом (.+)")
    public void connect(String firstElementName, String secondElementName) {
        NatureElement firstElement = (NatureElement) scContext.get(Context.natureElement);
        NatureElement secondElement = NatureElement.create(secondElementName);
        NatureElement resultElement = firstElement.connect(secondElement);
        scContext.put(Context.resultElement, resultElement);
        System.out.printf("Объедиение %s и %s\n", firstElementName, secondElementName);
    }

    @Then("^Проверить создание элемента (.+) в результате соединения")
    public void checkResultElement(String resultElementName) {
        System.out.println("Проверка создания элемента " + resultElementName);
        NatureElement natureElement = (NatureElement) scContext.get(Context.resultElement);
        Assertions.assertEquals(
                "Module3.Task1.resultElements." + resultElementName,
                natureElement.getClass().getName(),
                "Результат соединения элементов должен быть - " + resultElementName
        );
    }

    @Then("^Проверить отсутствие соединения у элементов (.+) и (.+)")
    public void checkUnsucessfullResultElement(String firestElement, String secondElement) {
        System.out.println("Проверить отсутствие соединения у элементов " + firestElement + " и " + secondElement);
        NatureElement natureElement = (NatureElement)  scContext.get(Context.resultElement);
        Assertions.assertNull(natureElement, "Соединение невозможно.");
    }

    public static class Context
    {
        public static final String natureElement = "natureElement";
        public static final String resultElement = "resultElement";
    }

    public AlchemySteps(HashMap<String, Object> scContext) { super(scContext); }
}
