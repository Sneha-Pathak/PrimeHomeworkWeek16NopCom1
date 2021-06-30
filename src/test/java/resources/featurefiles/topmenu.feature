Feature: Top Menu Test
  As a user I want to navigate to top menu page into nop commerce website

  @Smoke
  Scenario: User should navigate to top menu page successfully
    Given I am on homepage
    When I select top menu catagory
    Then I should navigate to selected menu page successfully