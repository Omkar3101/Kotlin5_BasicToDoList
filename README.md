
# Basic To-Do List

A simple To-Do List application built using Kotlin, allowing users to add, remove, and display tasks. This project is part of my Kotlin learning journey and focuses on working with collections (Lists, Sets, Maps).

## Features
✅ Add tasks to the list
✅ Remove tasks from the list
✅ View all tasks in the list
✅ Beginner-friendly Kotlin project

## Technologies Used
1. Kotlin
2. IntelliJ IDEA



## How to Run the Project?

* Clone the Repository
git clone https://github.com/Omkar3101/Kotlin_BasicToDoList.git

* Open in IntelliJ IDEA
1. Open IntelliJ IDEA
2. Select Open Project and navigate to the cloned repository



* Run the Project
3. Open Main.kt file
4. Click on Run or use Shift + F10

* Interact with the To-Do List

* Enter a task to add it to the list.

* Choose an option to remove a task.

* View all added tasks.


* Code Overview

``` kotlin

//Step 1: Design the To-Do List Structure
//We'll use a Map(mutableMapof) to store Task ID -> Task Description.
//We'll also maintain a Set(mutableSetOf) to store completed task IDs.


//Step 2: Implement the Code
fun main() {
    val tasks = mutableMapOf<Int, String>() //Store Task ID -> Task Description
    val completedTasks = mutableSetOf<Int>() //Store Completed Task IDs
    var taskId = 1 //Unique ID for each task

    while (true) {
        println("To-Do List Menu")
        println("1 Add Task")
        println("2 Remove Task")
        println("3 Mark Task as Completed")
        println("4 View Tasks")
        println("5 Exit")
        print("Enter your choice: ")

        when(readln().toInt()) {
            1 -> addTask(tasks, taskId++) //Add a new task
            2 -> removeTask(tasks, completedTasks) //Remove a task
            3 -> markTaskCompleted(tasks, completedTasks) //Mark as completed
            4 -> viewTasks(tasks, completedTasks) //View tasks
            5 -> break //Exit program
            else -> println("Invalid  choice! Please try again.")
        }
    }
}

// Function to Add a Task
fun addTask(tasks: MutableMap<Int,String>, id:Int) {
    print("Enter Task Description: ")
    val task = readln()
    tasks[id] = task
    println("Task Added! [ID: $id]")
}

// Function to Remove a Task
fun removeTask(tasks: MutableMap<Int, String>, completedTasks: MutableSet<Int>) {
    print("Enter Task ID to Remove: ")
    val id = readln().toInt()
    if (tasks.remove(id) != null || completedTasks.remove(id)){
        println("Task Removed!")
    } else {
        println("Task ID not found.")
    }
}

// Function to Mark a Task as Completed
fun markTaskCompleted(tasks: MutableMap<Int,String>, completedTasks: MutableSet<Int>) {
    print("Enter Task ID to Mark as Completed: ")
    val id = readln().toInt()
    if (tasks.containsKey(id)) {
        completedTasks.add(id)
        println("Task Marked as Completed!")
    } else {
        println("Task ID not found.")
    }
}

// Function to View ALl Tasks
fun viewTasks(tasks: MutableMap<Int, String>, completedTasks: MutableSet<Int>){
    println("Pending  Tasks:")
    tasks.forEach { (id, task) ->
        if (!completedTasks.contains(id)) println("[$id]$task")
    }
    println("Completed Tasks: ")
    completedTasks.forEach{ id-> println("[$id] ${tasks[id]}")}
}

```

## Future Improvements
✨ Save tasks to a file for persistence
✨ Add a due date for tasks
✨ Create a Graphical UI version

## License
This project is licensed under the MIT License – see the [LICENSE](https://github.com/Omkar3101/Kotlin5_BasicToDoList/blob/main/LICENSE) file for details.

## Let's Connect
🔹 [LinkedIn](https://www.linkedin.com/in/omkar3101/)
🔹 [GitHub](https://github.com/Omkar3101)
