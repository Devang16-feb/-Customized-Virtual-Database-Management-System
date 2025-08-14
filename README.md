# Generalized Data Structure Library (Java)

## 📌 Overview
The **Generalized Data Structure Library** is a **customized in-memory Database Management System (DBMS)** built entirely in Java.  
It replicates key features of SQL-based databases but operates **without any external DBMS** — all data is stored and managed in **primary memory** using Java's **LinkedList**.  

This project is designed for:
- Students learning **Data Structures & Algorithms (DSA)**
- Java developers exploring **OOP** and **collection framework**
- Anyone wanting to understand the **internal working of DBMS** in a simplified, hands-on way

---

## 🛠 Problem Statement
Many students learn database queries but don’t understand **how a DBMS actually works internally**.  
This project bridges that gap by:
- Implementing CRUD (Create, Read, Update, Delete) operations  
- Supporting aggregate and sorting queries  
- Providing a **command-line interface** that feels like interacting with a real SQL system  

---

## 🚀 Features

### **Data Operations**
- Insert a new employee record (ID auto-generated)
- Display all employee records
- Display record(s) by **Employee ID** or **Name**
- Delete record(s) by **ID** or **Name**
- Update an employee’s:
  - Address
  - Name
  - Salary

### **Aggregate Functions**
- **SUM** of salaries  
- **AVG** salary  
- **MIN** salary  
- **MAX** salary  
- **COUNT** of total employees

### **Sorting**
- Ascending order by salary  
- Descending order by salary

### **Other Utilities**
- **Help** command: Displays all available commands and their usage
- **About** command: Displays project and author details

---

## 📂 Project Structure

## 📁 Generalized-Data-Structure-Library
- program665.java # Main program with CLI
- Employee.java # Employee entity class
- MarvellousDBMS.java # Implements DBMS logic


---

## 📜 Sample Menu
- 1 : Insert new record into the table
- 2 : Display all records
- 3 : Display record by EID
- 4 : Display record by Name
- 5 : Delete record by EID
- 6 : Delete record by Name
- 7 : Display Sum of salaries
- 8 : Display Average salary
- 9 : Display Minimum salary
- 10 : Display Maximum salary
- 11 : Display Count of records
- 12 : Sort by Salary (Ascending)
- 13 : Sort by Salary (Descending)
- 14 : Update record
- 15 : Help
- 16 : About
- 17 : Exit

---

## 📈 Learning Outcomes
- Practical implementation of **Object-Oriented Programming** in Java.  
- Usage of **Java Collection Framework** (`LinkedList`) for in-memory storage.  
- Understanding of **CRUD operations** without an external DBMS.  
- Hands-on experience with **aggregate functions** and **sorting algorithms**.  
- Building a **menu-driven console application**.  
- Improved understanding of **DBMS internal working principles**.  
