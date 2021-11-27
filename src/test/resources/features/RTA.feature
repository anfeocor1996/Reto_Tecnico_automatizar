
@stories
Feature: Utest page
  A person wants to create a new user on the Utest page by filling in a form
  @scenario1
  Scenario: Create a new user
    Given The user enter the Utest page and click on join today

    When Complete the form
    |strfirstName|strlastname|stremail|strmonth|strday|stryear|strcountry|strcity|strpostal|strbrand|strmodel|strpassword|
    |Andres |Ocaña        |andres.1555@hotmail.com|May|14|1996 |Colombia|Pasto|52001|apple|iphone12mini|15.01|

    Then It generated a message of "Welcome to the world's largest community of freelance software testers"
    |strwelcomemessage|
    |        Welcome to the world's largest community of freelance software testers           |




