Feature: I need to be able to add and remove contestants so I can log their results

  Scenario Outline: add a new contestant

    Given    I have entered <name>
    Given    I have entered <city>
    Given    I have entered <country>
    Given    I have entered <gender>
    Given    I have entered <age>
    When    I press enter
    Then    they should be displayed on the screen

    Examples:
      | name | city   | country | gender | age |
      | Lisa | Örebro | Sweden  | Boy    | 22  |