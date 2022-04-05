@stories
  Feature: Test Choucair
    @scenario1
    Scenario: standard user product selection
      Given than the user Pedro wants to select a product
      When he search Sauce Labs Backpack on the portal web
      And he add the item Sauce Labs Backpack to the shopping cart
      And input data for the shipment name Pedro, lastname Lopez, postal code 050001 and continue
      And Click in button finish
      Then Validate successful purchase CHECKOUT: COMPLETE!



