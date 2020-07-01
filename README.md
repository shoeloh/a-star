# ABOUT
In this program I implement and test the A* search algorithm.  

## A* search using AIMA  
For this project I use the Java implementation of algorithms from Russell and Norvig's Artificial Intelligence - A Modern Approach 3rd Edition.  
Please see: https://code.google.com/p/aima-java/.  

## Objectives:  
1. Run the A* search algorithm on the Romanian Map route-finding problem to find
the shortest path between Oradea and Bucharest. I use as the heuristic function straight line distance.  
What route was discovered? How many nodes were expanded? What is the cost of this solution?  
The goal is to see high-quality implementation of the algorithm and good architecture.  
2. Same problem as 1. but implement a new evaluation function f’=(1-w)g + wh, where
w=0.25 and w=075  
3. Implement a new under-estimating heuristic function h’ which is the square root of the straight line distance function and use it for problem 1.  

# COMPILING, INSTALLATION AND RUNNING  
Program was written in Java  
This assumes aima-java is installed.  
There are 6 files that are modified/new for this problem.  

1:  
RouteFindingAgentApp.java  
is modified and should be placed in:  
aima.gui.applications.search.map  

2:  
SearchFactory.java  
is modified and should be placed in:  
aima.gui.applications.search.map  

3-6:  
NewEvaluationFunction.java  
NewSearch.java  
NewEvaluationFunction2.java  
NewSearch2.java  
are new and should be placed in:  
aima.core.search.informed  

## Compiling:  
Follow the direction on the AIMA code respository for compiling instructions after the 6 new/modified files are added.  

The entry point is:  
aima.gui.applications.search.map.RouteFindingAgentApp.java  

I have also provided a pre-compiled jar file.  

## How to run the code and a genric run command statement along with an example:  
There is a jar file containing all the classes.  
a-star.jar  
This can be run with the linux command:  
java -jar a-star.jar  
or with the script a-star.bash  
./a-star.bash  

You can run the jar file and play with the updates.  

For problem 1. just select “Romania, from Oradea” in the first pull-down box  
For problem 2. just select “HW2:1.2 = a* with x=0.25” in the third pull-down box  
For problem 2. just select “HW2:1.2 = a* with x=0.75” in the third pull-down box  
For problem 3. just select “HW2:1.3 = SQRT(SLD)” in the fifth pull-down box  

## RESULTS  

Results are shown in the Results.txt file  

## LICENSE  
[MIT License](https://github.com/shoeloh/a-star/blob/master/LICENSE)  

