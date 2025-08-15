# Java Notes App

## Overview
This is a simple **text-based Notes Manager** built in Java as part of the Internship **Task 4**.  
It allows users to:
- Add notes
- View all saved notes  
The notes are stored in a `notes.txt` file using **Java File I/O** (`FileReader` and `FileWriter`).

---

## Features
- Add new notes (appends to existing file)
- View all saved notes
- Handles missing or empty file gracefully
- Stores notes persistently in `notes.txt`

---

## Technologies Used
- Java
- FileReader / FileWriter
- BufferedReader / BufferedWriter

---

## How to Run
1. Open terminal in the folder containing NotesApp.java (or Main.java + NotesManager.java if using two classes).
2. Compile the Java files:
   `javac *.java`  
3. Run the program:
   `java Main`

## Author
Panshetty Krishna
