create schema ResumeDB;
Create table Person(PersonID int auto_increment primary key, FirstName varchar(50), LastName varchar(50),EmailAddress varchar(255));
create table Education(PersonID int,Degree varchar(50), Major varchar(500), Un_Graduated varchar(500), YearGraduated varchar(50));
						
create table Experience(PersonID int,Title varchar(500), CompanyName varchar(255), StartDate varchar(50), EndDate varchar(50),Duty text);
								 
create table Skills(SFields varchar(255), Rating varchar(255)); 