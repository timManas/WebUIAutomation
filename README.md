# WebUIAutomation

**Note**
- MAKE SURE YOU BUILD YOUR FOLDER STRUCTURE PROPERLY ...
- The Feature Files must NOT contain a starting "/"
Ex: 
GOOD: src/test/java/WebUIAutomation/resources/features
BAD:  /src/test/java/WebUIAutomation/resources/features

**Why ?**
- Take a look at the MainRunner.java
- The glue is "", i think its because we have "WebUIAutomation" folder present when ITS NOT suppose  to be
	> Compare this to the ProgrammingRecipesSeleniumCucumber Project. 

**TIPS N TRICKS:**
1. If App cannot find the Cucumber StepDefinitions via "glue", try typing in
glue = {""}
2. If App cannot find the Cucumber feature files:
a. start from 'src/test/java'
b. Removing the starting '/'
