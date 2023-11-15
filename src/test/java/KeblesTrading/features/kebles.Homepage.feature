#Author : Apurva Devkar

@Test

Feature: To Test kebles Trading Web Application

Scenario: To verify Home Page of kebles Trading App
Given Launch Browser and open URL
When User should navigate to home page of Kebles Trading

Scenario: To verify wire rope product option
Given All Product options should be visible on Home Page
When  User click on wire rope product option

Scenario: To verify Rigging product option
When User click on Rigging product option
Then Verify user should able to see all Rigging relevant product or Details


Scenario: To verify Material Handling option
When User click on Material Handling option
Then Verify user should able to see all Material Handling relevant product or Details


Scenario: To verify Handrails option
When User click on Handrails option
Then Verify user should able to see all Handrails relevant product or Details

Scenario: To verify Home Page Search Functionality
Then Verify if user enter any text in search box field, appropriate search result should display

Scenario: To verify Product View more button Functionality
Given User should be on home page of Kebles Trading
When All View more button should be visible and clickable on Home page
When User click on Wire Rope View more button
Then User should navigate to Wire Rope details page
When User click on Rigging View more button
Then User should navigate to Rigging details page
When User click on Material Handling View more button
Then User should navigate to Material Handling details page
When User click on Handrails View more button
Then User should navigate to Handrails details page






#Scenario: To verify Legal information
#Given User should be on home page of Kebles Trading
#When User navigating to legal information section
#Then Verify Privacy Policy should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Terms of Use  should be visible and clickable and Once click it should navigate to appropraite page                       
#Then Verify Disclaimers should be visible and clickable and Once click it should navigate to appropraite page
#
#Scenario: To verify INFORMATION RESOURCES
#Given User should be on home page of Kebles Trading
#When User navigationg to  INFORMATION RESOURCES section
#Then Verify FAQs link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Videos link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Testimonials link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Guides & How-to’s link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Positions Vacant link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Careers link should be visible and clickable and Once click it should navigate to appropraite page
#
#Scenario: To verify BUYING INFORMATION
#Given User should be on home page of Kebles Trading
#When User navigationg to BUYING INFORMATION section
#Then Verify Credit Terms link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Payment Information  link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Shipping & Returns link should be visible and clickable and Once click it should navigate to appropraite page
#
#Scenario: To verify Quick links
#Given User should be on home page of Kebles Trading
#When User navigate to Quick links section
#Then Verify Home link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify About us  link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Promotions link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Contact Us link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Blog link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Industrial Partners link should be visible and clickable and Once click it should navigate to appropraite page
#Then Verify Brochures link should be visible and clickable and Once click it should navigate to appropraite page
#
#Scenario: To verify product enquiry functionality
#Given User should be on homepage 
#When User select any product & add for enquiry 
#Then Verify User navigate to product enquiry form
#Then Verify once user enter all details form should be submitted 
#Then Verify add to cart number should be increase and should display
#
#Scenario: To verify enquiry functionality
#Given User should be on homepage 
#When User click on enquiry button
#Then Verify user should navigate to enquiry page
#
#Scenario: To verify show more functionality of images
#Given User should be on homepage 
#When User click on know more button
#Then Verify user should navigate to PDF or information page
#
#
#Scenario: To verify contact request form functionality 
#Given User should be on homepage 
#When User navigate to contact request form
#Then Verify mandatory fields for the form
#Then Verify user should able to enter details
#Then Verify user should able to submit details
#
#Scenario: To verify Demo background sample video play functionality 
#Given User should be on homepage 
#When User navigate to WELCOME TO KEBLE’S TRADING section
#Then Verify user should able to play video
#
#Scenario: To verify Latest Post functionality 
#Given User should be on homepage 
#When User navigate to latest Post section
#Then Verify all images with Read more button should visible and clickable
#Then Verify once click on read more button user should navigate to detail page
#Then verify validation for leave reply form
#Then verify user should able to fill leave reply form and submit it
#Then verify Search field functionality and there search results
#Then verify category functionality and there search results
#Then verify tag functionality and there search results
#
#Scenario: To verify instagram feed functionality 
#Given User should be on homepage 
#When User navigate to instagram feed section
#Then verify all images should be  display 
#Then verify if click on any image the user should navigate to insta feed page
#
#Scenario: To verify store location functionality 
#Given User should be on homepage 
#When User navigate to store location section
#Then verify all address should be display 
#Then verify if click on any address according to that search resuly should display
#
#Scenario: To verify SIGNUP TO OUR NEWSLETTER functionality 
#Given User should be on homepage 
#When User navigate to SIGNUP TO OUR NEWSLETTER section
#Then verify validation for SIGNUP TO OUR NEWSLETTER
#Then verify user should able toenter mail id and submit it
#
