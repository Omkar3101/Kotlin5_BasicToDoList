//TO DO LIST

/*
Objective: Create  a simple To-Do-List App where users can:
Add a task
Remove a task
Mark a task  as completed
View all tasks (pending & completed separately)

Concepts Covered:
Mutable Lists and Maps
Loops & Conditionals
Functions
User Input Handling
 */


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