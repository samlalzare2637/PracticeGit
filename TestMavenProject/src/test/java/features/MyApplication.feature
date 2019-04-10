Feature: login Test smoke

Scenario: login into the appliaction test

Given Open Firefox and start the App
Then user enters username "mukeshotwani@gmail.com" and "selenium@123"
Then user should be able to login
Then Application should be closed


