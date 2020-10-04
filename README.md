# Task-Managemet
This application helps you to manage your tasks.
You can check which task is pending and which task has higher priority than other tasks.

# Task-Management Databse and table instructions

Create a databse with name 'TaskManagement'

>>create database TaskManagement;

Create a new table names 'task_info'.

Structure of task_info table is :-

|Field       |Type     |Length |Key |
|------------|---------|-------|----|    
|id          |int      |11     |pri |
|task_name   |varchar  |255    |    |
|priority    |varchar  |2      |    |
|status      |int      |1      |    |
|is_deleted  |int      |1      |    |


