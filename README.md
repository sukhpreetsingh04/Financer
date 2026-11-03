# 💰 Financer – Personal Finance Tracker

**Financer** is a personal finance tracking Android application designed to help users manage their daily finances, monitor expenses and income, organize transactions, and keep track of their budgets.

The goal of Financer is to provide a simple and intuitive way to understand personal spending habits and maintain better control over financial activities. Users will be able to record financial transactions, categorize their expenses, manage budgets, and view financial summaries to gain insights into their spending patterns.

The application is being developed using modern Android development practices, with a focus on clean code, maintainable architecture, and efficient local data management.

✨ Current Focus
Financer is currently being built around the core functionality of a personal finance tracker. The project currently focuses on:
- Recording personal financial data locally using Room Database.
- Building the interface with Jetpack Compose.
- Structuring the application using the MVVM architecture.
- Laying the foundation for expense and income management.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Kotlin | Primary programming language |
| Jetpack Compose | Modern declarative UI development |
| Room Database | Local database management |
| MVVM | Application architecture |
| Kotlin Coroutines | Asynchronous programming |
| KSP | Kotlin Symbol Processing for annotation processing |

## 🏗️ Architecture

Financer follows the **Model-View-ViewModel (MVVM)** architectural pattern to maintain a clear separation of concerns between the user interface, application logic, and data management.

The intended architecture focuses on:

- **Model:** Represents application data and database entities.
- **View:** Built using Jetpack Compose to display the user interface.
- **ViewModel:** Manages UI-related state and handles communication between the UI and data layers.
- **Room:** Provides structured local data persistence using SQLite.

This approach helps keep the application organized, maintainable, and easier to extend as new features are introduced.

## 🗄️ Data Management

Room Database serves as the primary local data persistence solution.

The application is designed around the following core data models:

- **User** – Stores user-related information and preferences.
- **Expense** – Stores expense records, including amount, category, date, and description.
- **Income** – Stores income records and their associated details.
- **Budget** – Stores budget allocations and spending limits.
- **Reports** – Supports financial summaries and insights derived from transaction records.

## 🚀 Getting Started

### Prerequisites

- Android Studio
- Kotlin-compatible Android development environment
- Android SDK
- JDK compatible with the project's Gradle configuration

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/sukhpreetsingh04/Financer.git
   ```

2. Open the project in Android Studio.

3. Allow Gradle to synchronize the project dependencies.

4. Run the application on an Android emulator or a physical Android device.

## 📂 Project Structure

The application source code is located in:

```text
app/src/main/java/com/sukhpreet/financer/
```

The project is organized around Android application development components, with the intention of maintaining a clean separation between presentation, database, and application logic.

## 🎯 Project Objectives

Financer is being developed as a practical Android development project to explore and implement:

- Modern Android UI development using Jetpack Compose.
- Local database design and persistence using Room.
- MVVM architecture and separation of concerns.
- Managing application state in a declarative UI.
- Working with Kotlin Coroutines and asynchronous operations.
- Building a structured and maintainable Android application.

## 👨‍💻 Author

**Sukhpreet Singh**

- GitHub: [@sukhpreetsingh04](https://github.com/sukhpreetsingh04)

---

*Built with ❤️ using Kotlin and Jetpack Compose.*
