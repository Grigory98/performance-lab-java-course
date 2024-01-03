Feature: Огонь
  Scenario: Создание огня
    When Создать элемент Fire
    Then Проверить, что элемент Fire создан

  Scenario: Проверка отсутствия объединения огня
    When Создать элемент Fire
    And Объеденить элемент Fire с элементом Fire
    Then Проверить отсутствие соединения у элементов Fire и Fire

  Scenario Outline: Объединения огня
    When Создать элемент Fire
    And Объеденить элемент Fire с элементом <secondElement>
    Then Проверить создание элемента <newElement> в результате соединения

    Examples:
    | secondElement | newElement |
    | Air           | Energy     |
    | Earth         | Lava       |
    | Water         | Steam      |
