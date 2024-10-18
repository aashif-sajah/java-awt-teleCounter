
# Java AWT TeleCounter

This repository contains a simple Java-based counter application using Abstract Window Toolkit (AWT). The application provides a graphical user interface (GUI) where users can interact with a counter system.

## Project Structure

The project follows a structured directory system:

```text
AWT
│
├── src
│   └── com
│       └── aashif
│           └── app
│               ├── Main.java
│               └── TeleCounter.java
│
├── bin               # Compiled class files will be stored here
├── lib               # External libraries (if needed)
└── README.md         # This file
```

- **Main.java**: The entry point of the application, which initializes the counter and displays the GUI.
- **TeleCounter.java**: The core logic of the counter, which handles user inputs and updates the display.

## Prerequisites

- Java JDK (version 8 or higher)
- Git (optional, for cloning the repository)

## Installation

### 1. Clone the Repository

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/aashif-sajah/java-awt-teleCounter.git
```

### 2. Compile the Source Code

Navigate to the root of the project and compile the Java files. Ensure that you compile with the correct classpath:

```bash
javac -d bin src/com/aashif/app/*.java
```

This command compiles all Java files and stores the `.class` files in the `bin` folder.

### 3. Run the Application

Once compiled, you can run the `Main` class to launch the application:

```bash
java -cp bin com.aashif.app.Main
```

## Usage

This application presents a simple GUI for a counter. Once you run the program, you will see a counter interface where you can increase or decrease the counter value through button clicks.

## Project Features

- **Graphical User Interface**: Built using Java AWT for creating a basic but interactive user experience.
- **Modular Code**: The code is separated into different classes for better maintainability.
- **Counter Functionality**: Users can increment and decrement the counter with ease.

## Future Enhancements

Add more GUI features such as:

- Reset button to set the counter back to 0.
- Color change options.
- Enhanced layout for a better user experience.

## Contributing

Feel free to fork this repository and contribute by submitting a pull request. Any improvements or suggestions are appreciated!

## License

This project is licensed under the MIT License. See the LICENSE file for more information.
