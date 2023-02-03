# Books exercises
Some problems that I have found in some books, courses or while surfing online, here I present  my  own solutions before studying the given solutions. 

This is a work in  progress, so for typical solutions please refer to books or official sources.

## Folder Structure
The workspace contains three folders by default, where:

- `src/main/java/com`: the folder to maintain sources 
- `target/clases/com/example`: the folder to maintain binary files


## Tower of Hanoi using stacks
After looking at the famous problem while surfing online, I decided to dowload an [Android game](https://play.google.com/store/apps/details?id=johan.moller.towerofhanoi&hl=en&gl=US&pli=1) and take a look on to the problem. 
After trying found an idea to solve the problems using stacks and a recursive method.

<p align="center"> 
	<img alt="Game playstore" src="https://user-images.githubusercontent.com/22565959/216694618-9a8310dd-5805-4174-baf8-bacd1b537cfb.png">
</p>

The code was wtitten to show [push() and pop()](https://www.andrew.cmu.edu/course/15-121/lectures/Stacks%20and%20Queues/Stacks%20and%20Queues.html) (in _top element_) in the three stacks using game rules. It always find the optimal solution wich is 2<sup>n</sup>-1, where _n_ is the **number of disks**.

<p align="center"> 
	<img alt="Game execution" src="https://user-images.githubusercontent.com/22565959/216702583-a562fe14-3843-409b-9ef9-8973243f070a.png"> 
	<img alt="Game execution" src="https://user-images.githubusercontent.com/22565959/216702369-34bc3696-dadc-4dcb-8f74-d3da37b4c8fc.png">
</p>

## Factorial 
Just another code to solve this classical problem while dealing with recursive methods.
