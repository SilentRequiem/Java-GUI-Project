# Java GUI Project 

This repository contains a simple Java GUI project created to practice and demonstrate fundamental concepts of building graphical user interfaces.

---

## Key Learnings

Throughout this project, I gained hands-on experience with several key components and concepts in Java's Swing library for creating desktop applications.

### Window Management

* **`JFrame`**: The main window or frame that acts as the container for all other components.
* **`setDefaultCloseOperation()`**: Defines the program's behavior when the window is closed, such as exiting the application.
* **`setSize()` and `setVisible()`**: Used to set the dimensions of the window and make it appear on the screen, respectively.
* **`setIconImage()` and `ImageIcon`**: These are used to customize the window's icon, giving the application a distinct visual identity.

### Layout and Positioning

* **`setLayout(null)`**: This setting disables the default layout manager, providing **absolute positioning** of components using manual coordinates.
* **`setBounds()`**: A crucial method for absolute positioning, it sets the exact position (x, y coordinates) and size (width, height) of a component within the frame.

### UI Components

* **`JButton`**: A standard clickable button for triggering actions.
* **`JCheckbox`**: A component that allows a user to select or deselect an option.
* **`JRadioButton`**: Used for creating a group of mutually exclusive options, where only one can be selected at a time.
* **`JTextField`**: An input field where users can type and enter text.
* **`JLabel`**: A simple text label used to display non-editable information or instructions to the user.

### Event Handling and Logic

* **`ActionListener`**: An interface that allows components, like buttons, to respond to user actions. It defines the behavior that occurs when a specific event happens.
* **`add()`**: Used to add UI components to the `JFrame` so they become part of the visible application.
* **`getText()` and `setText()`**: Methods for retrieving text from input fields (`JTextField`) and updating the text of components like `JLabel`.
* **`isEmpty()`**: A useful string method for validating user input, ensuring a field isn't left blank.

### Resource Management

* **`getResource()`**: This method is used to load resources, such as images, from the classpath, ensuring they can be accessed regardless of the application's deployment location.
