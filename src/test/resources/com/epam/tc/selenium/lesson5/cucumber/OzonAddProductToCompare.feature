Feature: Ozon add products to compare list

  Scenario: Add product to compare list from category
    Given I open Ozon Home page
    And I open 'Смартфоны' subcategory in 'Электроника' category from catalog in header
    When I add products '1, 2, 3' to the Compare list on Catalog Item page
    Then all selected products should be visible on Compare Products page

Scenario: Search product
  Given I open Ozon Home page
