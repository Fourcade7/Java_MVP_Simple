# Java_MVP_Simple

MVP (Model — View — Presenter) comes into the picture as an alternative to the traditional MVC (Model — View — Controller) architecture pattern. Using MVC as the software architecture, developers end up with the following difficulties:

Most of the core business logic resides in Controller. During the lifetime of an application, this file grows bigger and it becomes difficult to maintain the code.
Because of tightly-coupled UI and data access mechanisms, both Controller and View layer falls in the same activity or fragment. This cause problem in making changes in the features of the application.
It becomes hard to carry out Unit testing of the different layer as most of the part which are under testing needs Android SDK components.
MVP pattern overcomes these challenges of MVC and provides an easy way to structure the project codes. The reason why MVP is widely accepted is that it provides modularity, testability, and a more clean and maintainable codebase. It is composed of the following three components:

Model: Layer for storing data. It is responsible for handling the domain logic(real-world business rules) and communication with the database and network layers.

View: UI(User Interface) layer. It provides the visualization of the data and keep a track of the user’s action in order to notify the Presenter.

Presenter: Fetch the data from the model and applies the UI logic to decide what to display. It manages the state of the View and takes actions according to the user’s input notification from the View.



![image](https://user-images.githubusercontent.com/60017090/183104169-385e2030-1898-4a47-a467-0a0df802633d.png)


![x010 png pagespeed ic ZJe0-QnS0n](https://user-images.githubusercontent.com/60017090/183104084-9b8c4b6b-70ab-4989-85c2-b73f33e69e6d.png)

