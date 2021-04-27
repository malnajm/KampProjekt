Feature: I need to be able to add and remove contestants so I can log their results

  Scenario Outline: add a new contestant

    Given    I have entered "<name>"
    And    I have also entered "<city>"
    And    I have typed "<country>"
    Given    I have written "<gender>"
    Given    I have added "<age>"
    When    I press enter
    Then    they should be displayed on the screen

    Examples:
      | name | city   | country | gender | age |
      | Lisa | Orebro | Sweden  | Boy    | 22  |
      | Kalle | Orebro | Sweden  | Girl    | 22  |