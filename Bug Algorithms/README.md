# Bug Algorithms family

Two-dimensional robot guidance environment consists of astarting point and a target point.The  robot tries to find an obstacle-free path, while moving from the startpointto the target point.Figure  2.1  shows  an  example of two-dimensional environments, in which the robot should start from the box-shaped starting point and reach the circle-shaped target point without confusion and entanglement.
***
The  early  works about  path  design  was  done  by Lumelsky. Prior to him, robot guidance in unknown environments was a winding path that was carried out by algorithms such as Pledge. Unfortunately, the Pledge algorithmlacked theability to deliver a robot to aspecific point.Besides, the route traveled by the robot by using these two algorithms becomes very long.Of course, there exist some innovative ways requiring information from their surrounding environment.
***
Bug algorithms are the first path planning algorithms that ensure the situation for the robot to reach  the  target.  These  algorithms  are  very  appropriate  for  the  robots  which  have  an instantaneous and immediate, so-called real-time performance.The objective of bug algorithms is to guide the robot from a starting point S towards a target point T, in some environment with limited information. If no path was found to attain the target point, the algorithm reports the result, which is "unattainability of the target point".

Bug  algorithms  can  be implemented in any robots equipped with tactile sensors or range-estimation sensors, which are equipped with a method of determining the local position(such as a length-calculator or a GPSsystem). By utilizing this algorithm, the robot can automatically find its path to the target point.

***
The  main  similarities and  differences  between  the Bug algorithms is in the methods used to ensure they complete their missions.SenseBug is a new algorithm for use with sensors.In this algorithm, three performance criteria are considered: frequency of data collection, amount of efforts  to search and path  lengths.Reduction  infrequency  of  collecting the accessible information in environment and search effort amounts in any time to collect information are the tricks of this algorithm. Using these tricks will not prevent completing and accomplishing the mission.

## Symbols Used in Bug Algorithms
* S:Startingpoint
* T: Target point, also called end point.
* x:Current position of the robot.
* iH:The thicollision point(from all the time collision points) which infactrepresentsthethitime from all the times that the robot encounters an obstacle boundary.
* iL: The thiseparationpoint, which in factdetermines thethitime that therobot separates from obstacle boundaryandmoves to the target.
* d(a b):Geometricdistance between arbitrary points of band a. 
dpath(a b): The length ofthepathtraveledby the robot between twoarbitrary points of band a.
* r:Maximal range of position sensors. 
* r(Theta) : Free space along distance between the robot and the first observable obstacle in that direction. 
* F:Freespace along the target.If is along the target, then Fand rwill be the same

## What will we use?
Inicialmente poderemos tentar o TantBug.