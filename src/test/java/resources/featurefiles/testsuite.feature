Feature: Product Sorting Test
  As a User I should arrange product in alphabetic order

  @Sanity
  Scenario: I should arrange product in Name: Z to A
    Given I am on homepage
    When I select computers menu
    And I select desktops
    And I select sort by position Name: Z to A
    Then I should see the product in descending order

  @Regression
  Scenario: I should add product to shopping cart successFully
    Given I am on homepage
    When I select computers menu
    And I select desktops
    And I select sort by position Name: A to Z
    And I click on Add to Cart
    And I should navigate to Build your computer page
    And I select 2.2 GHz Intel Pentium Dual-Core E2200 Processor
    And I select 8GB [+$60.00] RAM
    And I select 400GB [+$100.00] HDD
    And I select Vista Premium [+$60.00] OS
    And I select Total Commander [+$5.00] Software
    And I verify total price $1,475.00
    And I click on Add to cart button
    Then I should able to add product in shopping cart