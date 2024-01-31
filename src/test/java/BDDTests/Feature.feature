Feature: E2E scenario for buying 3 items from Eshop website

  Scenario:As A user i want to buy 3 items
    Given Click Login Profile Icon
    And Enter UserName Value
    And Enter Password Value
    And Click On Submit Button
    And Click On The First Item
    Then Click On Add To Cart
    And Navigate Back To Home Page
    And Click On The Second Item
    Then Add The Second Item To cart
    And Navigate Back To Home Page
    And Search For The Third Item
    Then Add The Third Item To cart