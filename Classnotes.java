chap 1(30/11/2021)
 what is java 
java is a high level,class based,object oriented programming language,

java designed by james gosling in the year may23,1995,

latest release java SE 16

compilor

jdk-------java development kit(PROGRAM)jdk provides environment to develop and run java app(jdk=jre+dev tools)

jre-------(java runtime environment)(PLATFORM)jre  provides environment just to run java app(jre=jvm+liberary classes)

jvm-------java virtual machine)(PROCESSOR) jvm responsible to run java prgm line by line

jdk
1.dev tool-------compilor-------java application
2.jre--------------jvm

Source code is the program (human readable)
jre is the platform where to execute
jvm is the processor
source code into byte code converted into (compilor) this is human read able
SOURCE CODE IS THE .JAVA (HUMAN READABLE)
BYTE CODE IS THE .CLASS (SYSTEM READABLE)
byte code into source code is (jvm)

we understood above in one line \\

in java terminologies are the some applications like 
jdk jre and jvm 

in jdk consist of two parts compilor and jre
in that compilor we see the .class file(is in byte code)

in jre we consist a jvm 







compilor do check the syntex error



CHAP-2 (1/12/2021)

application are uses for to store the data

Specific type of data IS Called------(datatype)

2-types of Data Type
1-primitive(8 TYPES)THEY ARE
*IT IS A PRE DEFINED JAVA SYNTEX
*8 KEYWORDS and +2 are the true /false


1.BYTE-VALUES ARE 1BYTE=8BITS(WE ANY ONE CAN STORE the data EXAMPLE AGE)
2.SHORT VALUS ARE 2BYTE.
3.INT4 BYTE(IT CONTAINS 9 NUMBERS)
4.LONG8 BYTE(IT CONTAINS ABOVE 10 NUMBERS LIIKE PHONE NUMBER)
5.FLOAT4BYTE(IT CONTAIN INFINITY EXAMPLE PI VALUE)
6.DOUBLE8BYTE.
7.BOOLEAN1BIT.
8.CHAR)2BYTE

NON DECIMAL NUMBERS/REALNUMBERS ARE THE byte,short,int and long
DECIMAL VALUE ARE THE float and double
TRUE/FALSE ARE boolean it is a 1 bit of value
LAST ONE IS CHAR ANY ALPHABET CHARACTER ANYTHING

 variables
dc

variables are the container to use to store the specific type of data according to the data type.and also 2 types of variables
syntex = data type  and refrence variable name eqal to value
for ex; 1.declarartion (data type ,refrence value name rvn)
            2.initialization (refrence value name = value)
char arun ='A'
int arun ='9'

types of variables are 4
1.static variable = are declared the to define the keyword static
2.local variable = are declared the inside the method is called local variable,
3.instance variable=are declared the inside the class and out side the variable is calle instance variable
  (when out put comes only to give the object) the object is in below program 6 th line we mentioned.
for one program example

prgm 1

class Bag{              // (class)
static int a = 10;      // Static variable
int b = 20;               //instance variable
public static void main (String args[ ]){      //(method)
int c = 30;                //local variable
Bag ref = new Bag ( );   // this is the object in the instance variable
System.out.println(Bag.a);
System.out.println(ref.b);
System.out.println(c);
}
}

prgm 2(to use array in static variable)

class Thumb{
static String [ ]name ={ "arun","akshay","akarsh"};
static String names = "anu";
public static void main(String args[ ]){
System.out.println(name[0]);
System.out.println(names);
}
}


Array; is nothing but a container which store the homogeneous type (or) same type of multiple values

types of arrays are numerical array (int,float,double) and character array(lower case,upper case and special characters)
another types one dimensional array
two dimensional array
three dimensional array

   *declaration                                                *innitialisation\assignments
for example; 

int [6]marks = {0,1,2,3,4,5};                                   int[6];
Datatype [ ]rvn;                                                  1) literals(directly to initialise the value)
Datatype[ ] rvn;                                                  2)new keword
Datatype rvn[ ];

example for program;

class Studentactivities{
public static void main (String [ ]a){

boolean [ ] statement = {true,false,true,true,false,false,true,true};
byte [ ] ids = { 29,5,21,4,1,22,26};
char [ ]name = {'!','@'};
int [ ]digit = {123456789,1568975,};
long [ ]above = {1234567891,1111112111};
System.out.println(above [1]);
System.out.println(digit [1]);
System.out.println(name[1]);
System.out.println(ids [ 0 ]);
System.out.println(statement [ 0 ]);
}
}


chapter ;  control flow statement -- it s control normal flow of education

3 types\

1.conditional

2.looping---for loop,while loop,do while loop

in for loop executing the 4 steps

1st we initialising statement
2nd is condition
3rd is executable statement
4th increment or  decrement

3.branching/jumping


                                    

