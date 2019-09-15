# ThreadWaitAndNotify

Assignment

- Create a new maven project in IntelliJ
- Create the Producer, Consomer and Main classes and run Main
- Change the Consumer for loop to a while loop (easier to understand if you ask me)
- Import the apache commons lang3 (commons-lang3) library and use RandomStringUtils to generate a random string instead of using the array of predfined strings.
- Run Main again
- Can you get it to run with 3 producers and 2 consumers?

*Lesson:* 
Running with a different number of producers and consumers is problematic. We want to know when all the producers are done and then stop the consumers. We will see how to do this better when we learn about high level concurrency.