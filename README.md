# APIAutomation
 
 ------
 Test cases covered :
 1)Automating JIRA api to create a ticket and get the details of the ticket
 
 2)CreateJiraTicket.java test class inside src/test/java covers two test cases
 
   i) By taking input from excel and creates a Jira ticket. If any input value is not passed by the user and the JIRA is expecting   it, the program would log the same on the console and notify user that the API does not accept empty values
   
   ii) Also, the invocationCount and threadPoolSize are mentioned as 100, so each test case will be executed parallely 100 times
   
 3)Input test data is passed through excel, user can pass any number of values. Sample 7 values are passed in test input
