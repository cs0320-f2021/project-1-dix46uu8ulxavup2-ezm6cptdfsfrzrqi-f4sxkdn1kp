Project 1
aclark21, yhayash2, wlee41
total time: (ariana: ~40 hours, Yuki: , Wonyoung: ~35 hours)

API Quetions:
- On average it should take about 2 seconds to get the right answer
- I am going to verify my answer 3 times
- The upper limit on the number of API calls is going to be 10

Design Choices:
Chose API and KD Tree implementation. 

Used INode for KD Tree where INode is an interface and Node is a class
for Rent the Runway that implements INode. 

Errors/bugs:
Code does not run because KD Tree implementation is imcomplete and insufficient.
However REPL and API are ready.

Tests:
- (KD-tree): Created system tests for each command, similar and classify. Also made test suite for possible errors for
    both of the commands

How to:
- Run the tests:
    - KD-tree: run ./cs32-test src/test/system/KD-tree/*.test
    - KD-tree-error: run ./cs32-test src/test/system/KD-tree-error/*.test

-Build and run your program:
    - Build: mvn package

https://guides.github.com/features/mastering-markdown/
