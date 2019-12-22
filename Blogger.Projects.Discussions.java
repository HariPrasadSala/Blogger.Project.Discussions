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
			* Comments
			* Declarations
			* Statements
			* White Space
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

