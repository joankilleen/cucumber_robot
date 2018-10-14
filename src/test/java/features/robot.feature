Feature: Robot
Scenario: Tickle a happy robot
Given I am in a "good" mood
When you "tickle" me
Then I will "giggle"

Scenario: Tickle an unhappy robot
Given I am in a "bad" mood
When you "tickle" me
Then I will "cry"