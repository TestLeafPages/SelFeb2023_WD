Todays Agenda:
==============
9.45 to 10.45--Set
10.40to 11.20--Classroom + Break
11.20 to 11.40--program solving
11.40 to 12.15--Map
12.15 to 12.30--Classroom
12.30 to 12.45--Recap


Set:
====
  -Interface
  -It cannot  hold duplicate data/only Unique
  
  
Implementation class:
=====================
1. Hash set----random order
2. LinkHash set---insertion order
3. Tree set---ascii values
  
 Method of set:
=================
    1) size()-> Number of items in the set
    2) add()->  to add the data in a set
    3) remove() -> to remove the data / element
    4) get() - > this method is not available  because of the implementation class(index differs)
	5) Collections.sort()-->it will not happen(Tree set)


list{1,4,7,7,8,5,9,3,67,867,89}
get(10)

set{1,4,7,8,5,9,3,67,867,89}

get(9)

set() convert into list 
then i can use get()






classroom 1:
Remove Duplicates:
int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8}
i.declear a set
ii. hint (i need random order)
iii.Iterate through a loop and add data
iv.print values
output will be.{3,5,7,2,9,1,54,8,4,6}

Classroom 2:
Print only unique characters in the given string
String companyName = "google" --> "gole"
Hints: 
convert to chararray
Use Set with add method.









Map
====


 * List, Set --> Collection (Interface)
	 * Single Dimensional data collection 
	 * 
	 * When you like to store the data in 2 dimensional (key -> value pair) => Map !!
	 * Examples: Get character count or find the highest/lowest priced car name 
	 * 
	 * Map --> Interface 
	 2 things(key,value)
	 * Can I create an object for the interface? No
	 * Then how can i use Map? through Implementation Classes
	 * Implementation: HashMap, TreeMap, LinkedHashMap
	 * HashMap --> faster (uses Hashing Algorithm) 
	 * TreeMap --> Key ASCII Order 
	 * LinkedHashMap --> Insertion Order of Key !!
	 * 
	 * (Key, Value) --> Pair  --> Entry !
	 * Key --> No Duplicates allowed (Set)
	 * Value --> Yes, Duplicates allowed (list)


	 syntax
	 Map<Integer,String> name= new HashMap<Integer,String>();

	 methods:
	 size()-number of entries inside the map
	 put(class key,class value)-Element<>will get add based impl class
	 remove()-
	 clear()-
	 get(class key)-return the value by key


	 String "amazon development Center