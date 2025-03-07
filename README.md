
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

fun main() {
    val toDoList = mutableListOf<String>()

    while (true) {
        println("\n=== To-Do List Menu ===")
        println("1. Add Task")
        println("2. Remove Task")
        println("3. View Tasks")
        println("4. Exit")

        print("Enter your choice: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Enter task: ")
                val task = readLine()
                if (!task.isNullOrBlank()) {
                    toDoList.add(task)
                    println("Task added successfully!")
                } else {
                    println("Task cannot be empty.")
                }
            }

            2 -> {
                println("Enter task number to remove:")
                toDoList.forEachIndexed { index, task -> println("${index + 1}. $task") }
                val taskNumber = readLine()?.toIntOrNull()
                if (taskNumber != null && taskNumber in 1..toDoList.size) {
                    toDoList.removeAt(taskNumber - 1)
                    println("Task removed successfully!")
                } else {
                    println("Invalid task number.")
                }
            }

            3 -> {
                println("\nYour To-Do List:")
                if (toDoList.isEmpty()) println("No tasks added yet.")
                else toDoList.forEachIndexed { index, task -> println("${index + 1}. $task") }
            }

            4 -> {
                println("Exiting To-Do List. Have a productive day!")
                break
            }

            else -> println("Invalid choice. Please enter a valid option.")
        }
    }
}

## Future Improvements
✨ Save tasks to a file for persistence
✨ Add a due date for tasks
✨ Create a Graphical UI version

## License
This project is licensed under the MIT License – see the LICENSE file for details.

## Let's Connect
🔹 LinkedIn
🔹 GitHub
