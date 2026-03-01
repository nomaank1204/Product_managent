Product Information Management (Jakarta Servlet)

A simple Java web application built using Jakarta Servlets that demonstrates form handling, input validation, and request forwarding.
The application collects product details from the user and validates the input before processing.

✨ Features

 Product detail form (Name, Price, Quantity)
 Server-side input validation
 Request forwarding using RequestDispatcher
 Handles GET and POST requests
Annotation-based servlet mapping (@WebServlet)

🛠️ Tech Stack

Java (JDK 11+)

Jakarta Servlet API

Apache Tomcat 10+

HTML (generated via servlets)

📁 Project Structure
product-info-servlet/
│
├── src/
│   └── main/
│       └── java/
│           ├── Productinfo.java
│           └── Displayinfo.java
│
└── README.md

🔗 Servlet Mappings
Servlet Class	URL Pattern	HTTP Method
Productinfo	/Productinfo	GET / POST
Displayinfo	/Displayinfo	POST
🔄 Application Flow

User accesses /Productinfo

Product input form is displayed

User submits the form

/Displayinfo servlet validates input

If validation fails:

Error message is sent back to /Productinfo

If validation passes:

Data can be processed (future enhancement)

▶️ How to Run the Application
Prerequisites

Java JDK installed

Apache Tomcat 10 or above

Jakarta Servlet API available

Steps

Create a Dynamic Web Project

Add servlet files to src/main/java

Configure Tomcat server

Deploy the project

Open browser and navigate to:

http://localhost:8080/your-project-name/Productinfo

📸 Sample Output
Product Form Page
Product Info
Product Name: [____]
Product Price: [____]
Product Quantity: [____]
[ Login ]

Validation Error
All Fields are mandatory
