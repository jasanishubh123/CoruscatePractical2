# CoruscatePractical2

 I solved both of two Question in Java.


Q-1
There are n coins in a line. Two players take turns to take a coin from one of the ends
(Either from start or end - pick max) of the line until there are no more coins left. The
player with the larger amount of money wins. Assume that you go first;
Describe an algorithm to compute the maximum amount of money you can win.

in this Question First  i take input from the user 
Number of Player ,
Coin count ,
and All Coins value

--validation 1--
after that i also done validation.Suppose user enter 5 number of Player and number of coins are 2
so that is not valid. it will return from the function and throw error to the user please anter sufficient 
Coins.

--validation 2--
as per the number of player and numbe rof coins now we have to check whether coins are equally divided between all players
or not.if not then it return error

--assign coins value to particular player---
Now after all validation we assigned all the coins to particular function with only one loop 

--after assigned last step is to check who have maximum coins and what is their player number that return to user---

Q-2

In Second Question we have to take input of Seat Number from the user  and find the exact opposite Seat and Their type
whether it is MS, WS or AS

---take input from user--
first of all, take input from the user how many seat number they want to enter

--validation--
as per constraints total number of testcases are 105. and total number of seat is 108.
if user enter wrong number then it will throw error.

--loop--
after that i create loop for  find the particular seat's opposite seat number and their type.
total seat in one lane are 12 so i find the module of seatnumber and 12.
after that switch case will find the perfact number of opposite seat and their type [MS or WS or AS]










