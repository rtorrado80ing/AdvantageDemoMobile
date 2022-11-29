Feature: buy products in Advantage app
  I as a user want to buy some products in the advantage app

  Background:
    Given he is logged into the page Username  'rtorrado' and Password  'R1card080'
    When he has selected some products and add the product to the shopping cart

  Scenario: buy products
    Given he chooses to pay with mastercard
    When he enter card information and press click pay
      | CardHolderName  | User prueba  |
      | CardNumber      | 343568764534 |
      | expirationMonth |           5 |
      | expirationYear  |         5 |
      | CVVNumber       |         742 |
    Then he can see a transaction approval message 'Your cart was successfully purchased'