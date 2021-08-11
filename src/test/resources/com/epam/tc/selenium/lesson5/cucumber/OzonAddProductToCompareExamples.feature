Feature: Ozon add products to compare list example

  Scenario Outline: Add product to compare list from <subcategory> subcategory in <category> category
    Given I open Ozon Home page
    And I open '<subcategory>' subcategory in '<category>' category from catalog in header
    When I add products '1, 2, 3' to the Compare list on Catalog Item page
    Then all selected products should be visible on Compare Products page

    Examples:
      | category           | subcategory |
      | Электроника        | Смартфоны   |
      | Одежда             | Девочкам    |
      | Красота и здоровье | Глаза       |
