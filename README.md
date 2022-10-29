# ECE 382V Project: CLEVER-JAVA
### Introduction

This is the repository of the graduate course ECE 382V at University of Texas at Austin. In this project, we are going to transfer the algorithm mentioned in the paper [Client-Specific Equivalence Checking](https://people.ece.ubc.ca/mjulia/publications/Client_Specific_Equivalence_Checking_2018.pdf) from Python implementation to Java. 

### Solution

The original paper is based on two weight-lifting libraries, [PyExZ3](https://github.com/thomasjball/PyExZ3) (for dynamic symbolic execution in Python) and [PySMT](https://github.com/pysmt/pysmt) (for solving symbolic modulo theory). Corresponding to these two Python libraries, we will implement the framework based on Java libraries. For example, [jpf-shadow](https://github.com/hub-se/jpf-shadow). 

### Updated in Oct 28, 2022

- Create a new repository to store all the experiment results and implementation. 
- Translate some examples from CLEVER by combining the original file and upgraded file into one change file. 
- Upload several examples in jpf-shadow module. 

### Maintainers

- [Sizhan Xu](https://github.com/never0lie): CS @ UT-Austin
- [Erjian Gao](https://github.com/ErjianGao): ECE @ UT-Austin