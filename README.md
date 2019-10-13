# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

### Requirements

1. Handle large write volume: Billions of write events per day.
2. Handle large read/query volume: Millions of merchants wish to gain insight into their business. Read/Query patterns are time-series related metrics.
3. Provide metrics to customers with at most one hour delay.
4. Run with minimum downtime.
5. Have the ability to reprocess historical data in case of bugs in the processing logic.



## Coding solution

I have provided 2 solutions for coding as below:

### Solution 1
Class MovingAverageList.java will hold a data structure to store added elements. 
Internally it uses an ArrayList so as to make accessing elements easier by it's index.
It has a method to calculate and return simple moving average of last added N elements. In this case N is passed as a parameter to the method.


### Solution 2
I have also added a class MovingAverageList1.java which accepts the number of elements to be considered to calculate the moving average of N elements at the time of creation of object. In this case, N will be fixed and determined at the creation time.



## Design Question Solution
Events will be pushed to the load balancer and through the queue to the event service. 
Response will be sent back to the caller, and event service will continue the processing in the background. 
It will push the data to the database. 

There would be some process to push data to Data Warehouse. As there is no need of real-time reporting, Event Service will analyze the data every hour and create reports and store it back in the data warehouse. 

Whenever user requests a report, it will pickup reports from data warehouse and present it to the requester.
