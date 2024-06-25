Feature: Is it Friday yet?
  Everybody wants to know when its Friday

  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When i ask whether it is Friday yet
    Then i should be told "<answer>"

    Examples:
    |day | answer|
    |Friday | Yes|
    |Sunday | Nope|
    |anything else | Nope|