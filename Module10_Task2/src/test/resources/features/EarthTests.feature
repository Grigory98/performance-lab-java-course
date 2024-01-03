Feature: Земля
  Scenario: Создание земли
    When Создать элемент Earth
    Then Проверить, что элемент Earth создан

  Scenario Outline: Объединения земли
    When Создать элемент Earth
    And Объеденить элемент Earth с элементом <secondElement>
    Then Проверить создание элемента <newElement> в результате соединения

    Examples:
      | secondElement | newElement |
      | Air           | Dust       |
      | Earth         | Pressure   |
      | Water         | Mud        |
      | Fire          | Lava       |
