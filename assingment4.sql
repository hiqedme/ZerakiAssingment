CREATE TABLE STUDENT
   (	STUDENTID INT NOT NULL IDENTITY(1,1) , 
	NAME VARCHAR(250), 
	COURSE INT() 
		CONSTRAINT PK_STUDENT PRIMARY KEY (STUDENTID)
   )
   
   CREATE TABLE COURSE
   (	COURSEID INT NOT NULL IDENTITY(1,1) , 
	NAME VARCHAR(250), 
	INSTITUTION INT() 
		CONSTRAINT PK_COURSE PRIMARY KEY (COURSEID)
   )
   
    CREATE TABLE INSTITUTION
   (	INSTITUTIONID INT NOT NULL IDENTITY(1,1) , 
	NAME VARCHAR(250), 
	
		CONSTRAINT PK_INSTITUTION PRIMARY KEY (INSTITUTIONID)
   )
   
   Select a.name as Institution_Name, b.name as Course_Name, Count(c.studentid) as Number_of_students
from institution a, course b, student c 
where
a.institutionid = c.institution and
c.courseid = a.course 
group by a.course.   