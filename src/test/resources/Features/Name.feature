Feature: I need to be able to add and remove contestants so I can log their results

  Scenario Outline: add a new contestant

    Given    I have entered "<name>"
    And    I have also entered "<city>"
    And    I have typed "<personnummer>"
    Given    I have written "<gender>"
    When    I press enter
    Then    they should be displayed on the screen

    Examples:
      | name | city   | personnummer | gender |
      | Lisa | Orebro | 9003205598  | Boy    |
      | Kalle | Orebro | 9305608855  | Girl    |