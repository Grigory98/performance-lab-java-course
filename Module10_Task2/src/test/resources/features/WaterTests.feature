Feature: Вода
  Scenario: Создание воды
    When Создать элемент Water
    Then Проверить, что элемент Water создан

  Scenario Outline: Объединения воды
    When Создать элемент Water
    And Объеденить элемент Water с элементом <secondElement>
    Then Проверить создание элемента <newElement> в результате соединения

    Examples:
      | secondElement | newElement |
      | Air           | Rain       |
      | Earth         | Mud        |
      | Water         | Sea        |
      | Fire          | Steam      |
