Feature: homePage functionalities

Scenario: 1. welcome Home page
  Given i want to go ebay
  When  enter URL "http://www.ebay.com/"
  Then ebay HomePage should show 
  
Scenario: 2. Verify Ebay logo
  Given As a product owner i want to see ebay logo 
  When i nevagite to ebayhome page "www.ebay.com"
  Then ebay logo should display
  
Scenario: 3. Search functionality 
  Given As a user i want to seach for tv
  When  i nevagite to ebayhome page "www.ebay.com"
  And I Enter "Tv" in search text box 
  And Click on Search button 
  Then Text "results for tv" Should be display
