package com.imt.mines.bank.bdd;

import static org.junit.Assert.assertEquals;
import bankAccountApp.BankAccount;   // Ajusté pour votre package
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BankAccountBasicSteps {
    private BankAccount account;
    private double observedBalance;  // Changed to double (not int)

    @Given("I have a new bank account")
    public void i_have_a_new_bank_account() {
        // Create a new bank account with initial balance 0
        account = new BankAccount();
    }

    @When("I check its balance")
    public void i_check_its_balance() {
        // Read the balance from the account and store it
        observedBalance = account.getBalance();
    }

    @Then("the balance should be {int}")
    public void the_balance_should_be(Integer expected) {
        // Assert that observedBalance equals expected
        assertEquals(expected.doubleValue(), observedBalance, 0.01);
    }
}