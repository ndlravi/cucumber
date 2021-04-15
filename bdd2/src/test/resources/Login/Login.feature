Feature: Login features
This feature includes scenario that would validate the following feature
1)Login as Admin
2)Login as linda.andeson
3)Login with Nagative data

Scenario: Login as Admin
Given Iam able to navigates to logi page
When I enter the usernmae as "Admin"
And I enter the Password as "admin123"
And I click on the button
Then I should see the username as "Welcome test1"

Scenario: Login as linda.anderson
Given Iam able to navigates to logi page
When I enter the usernmae as "Admin"
And I enter the Password as "admin123"
And I click on the button
Then I should see the username as "Welcome test1"

Scenario: Login with Negative data
Given Iam able to navigates to logi page
When I enter hte user name as "Sunil"
And i enter the password as "Sunil"
And I click on the buton
Then I shlould be see error mesage "invalid credentilas"