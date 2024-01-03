Feature: Воздух
  Scenario: Создание воздуха
    When Создать элемент Air
    Then Проверить, что элемент Air создан

  Scenario Outline: Объединения воздуха
    When Создать элемент Air
    And Объеденить элемент Air с элементом <secondElement>
    Then Проверить создание элемента <newElement> в результате соединения

    Examples:
      | secondElement | newElement |
      | Air           | Pressure   |
      | Earth         | Dust       |
      | Fire          | Energy     |
      | Water         | Rain       |
