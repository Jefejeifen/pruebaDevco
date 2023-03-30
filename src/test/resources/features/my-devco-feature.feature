#Author: Dylan Mateo Llano Jaramillo

Feature: I as a user want to add information to the notepad

  Background: Enter to the page
    Given the user enter on the page

    Scenario: Create a rich text note with boldface font
        When the user clicks on the rich text note
        And the user clicks on bold
        And the user writes the name Dylan
        Then the user validates the written word
