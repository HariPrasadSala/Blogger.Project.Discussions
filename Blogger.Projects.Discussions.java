--------------------------------------
Blogger Project
--------------------------------------
	_______________________________________________________
	Content
	_______________________________________________________

		1. Architecture
			* Progressive Web Apps
			* Play Framework Java
			* Spring
		2. Code Conventions (Code Standards)
			* Introduction
			* File Names
			* File Organization
			* Indentation
			* Naming Conventions
			* Programming Practices
			* Code Example
	_______________________________________________________
	2. Code Conventions (Code Standards) - Introduction
	_______________________________________________________

		*************************
		Why Have Code Conventions
		*************************
			* 80% of the lifetime cost of a piece of software goes to maintenance.
			* Hardly any software is maintained for its whole life by the original author.
			* Code conventions improve the readability of the software, allowing engineers tounderstand new code more quickly and thoroughly.

		**********
		File Names
		**********
			* Every file which is included in the project should be logged in the document with name and usage.
				_________________________________________________________________
					File 			Usage 					
				_________________________________________________________________
					SMSModule		Module which is used to send SMS.
								
					* Methods		sendSMS(Long mobile_number, String message);

		*****************
		File Organization
		*****************
			Links:
			https://github.com/HariPrasadSala/Blogger.Project.Discussions/blob/master/AccBlogger/src/com/accenture/blogger/JavaSourceFile.java

			* A file consists of sections that should be separated by blank lines and an optional commentidentifying each section.
			* Files longer than 2000 lines are cumbersome and should be avoided.

			#################
			Java Source Files
			#################
			
				Each Java source file contains a single public class or interface. When private classes andinterfaces are associated
				with a public class, you can put them in the same source file as thepublic class. The public class should be the first
				class or interface in the file.

				Java source files have the following ordering:
				* Beginning comments
				* Package and Import statements
				* Class and Interface declarations

				Beginning comments: All source files should begin with a c-style comment that lists the programmer(s), the date, acopyright notice,
				and also a brief description of the purpose of the program.

				Class and Interface declaration order:
				* Class/interface documentationcomment (/**...*/)
				* class or interface statement
				* Class/interface implementationcomment (/*...*/), if necessary
				* Class (static) variables
				* Instance variables
				* Constructors
				* Methods

		***********		
		Indentation
		***********
			Four spaces should be used as the unit of indentation. The exact construction of the indentation(spaces vs. tabs) is unspecified. Tabs
			must be set exactly every 8 spaces (not 4).

		******************
		Naming Conventions
		******************
			Naming conventions make programs more understandable by making them easier to read.They can also give information about the function of
			the identifier—for example, whether it’s aconstant, package, or class—which can be helpful in understanding the code.

		*********************
		Programming Practices
		*********************
			* Don’t make any instance or class variable public without good reason. Often, instancevariables don’t need to be explicitly set or
			gotten—often that happens as a side effect ofmethod calls.
			* Avoid using an object to access a class (static) variable or method. Use a class name instead.
			* Numerical constants (literals) should not be coded directly, except for -1, 0, and 1, which canappear in afor loop as counter values.
			* Avoid assigning several variables to the same value in a single statement.
			* Do not use embedded assignments in an attempt to improve run-time performance. This is thejob of the compiler, and besides, it rarely
			actually helps.
			* It is generally a good idea to use parentheses liberally in expressions involving mixed operatorsto avoid operator precedence problems.
			Even if the operator precedence seems clear to you, itmight not be to others—you shouldn’t assume that other programmers know precedence
			aswell as you do.

			
