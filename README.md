# 🍽️ Food Explorer

### Discover Recipes. Explore Healthy Food. Eat Better.

Food Explorer is an Android application developed using **Kotlin and XML layouts**. It provides users with a simple and attractive interface to explore recipes and discover healthy food ideas through online food websites.

The application features a home dashboard, navigation menu, recipe exploration, and an in-app WebView for displaying online content.

---

## 📱 Screenshots

### 1. Home Dashboard

The home screen welcomes users and provides quick access to recipe categories.

![Food Explorer Home Dashboard](screenshots/home-dashboard.png)

### 2. Healthy Food

The Healthy Food section opens an online healthy eating website inside the application.

![Food Explorer Healthy Food](screenshots/healthy-food.png)

### 3. Recipes Page

The Recipes section allows users to explore recipes through an online recipe website.

![Food Explorer Recipes](screenshots/recipes-page.png)

---

## ✨ Features

- **Home Dashboard:** A clean interface with a food-themed design.
- **Recipe Exploration:** Access an online recipe website.
- **Healthy Food:** Explore healthy eating ideas and recipes.
- **Navigation Menu:** Navigate between Home, Recipes, Healthy Food, About, and Exit.
- **In-App WebView:** Display online websites without leaving the application.
- **Loading Indicator:** Show loading progress while a web page loads.
- **Back Navigation:** Navigate backward through previously visited web pages.
- **Simple User Interface:** A cream-and-green color palette for a clean appearance.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Kotlin | Application programming logic |
| XML | Designing application layouts |
| Android Studio | Application development environment |
| Android WebView | Displaying online websites inside the app |
| Gradle | Project build and dependency management |
| Android SDK | Android application development |

---

## 📂 Project Structure

```text
FoodExplorer/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── foodexplorer/
│           │               ├── MainActivity.kt
│           │               └── WebViewActivity.kt
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   ├── activity_main.xml
│           │   │   └── activity_web_view.xml
│           │   │
│           │   ├── menu/
│           │   │   └── main_menu.xml
│           │   │
│           │   └── values/
│           │       └── themes.xml
│           │
│           └── AndroidManifest.xml
│
├── screenshots/
│   ├── home-dashboard.png
│   ├── healthy-food.png
│   └── recipes-page.png
│
├── README.md
└── build.gradle.kts
```

*Note: This is a simplified representation of the project structure. Your actual files and folders may differ.*

---

## ⚙️ Installation and Setup

Follow these steps to run Food Explorer on your computer.

### Prerequisites

- Android Studio installed on your computer.
- Android SDK configured.
- An Android emulator or a physical Android device.
- An active internet connection.

### Steps to Run

1. Clone or download this repository from GitHub.
2. Open Android Studio.
3. Select **Open** and choose the FoodExplorer project folder.
4. Wait for Gradle synchronization to complete.
5. Start an Android emulator or connect a physical Android device.
6. Click the **Run ▶** button.
7. Wait for the application to install and launch.

You can now explore the Food Explorer dashboard and its features.

---

## 🌐 Internet Permission

Food Explorer uses Android WebView to display online recipe and healthy food websites.

The application requires internet permission in `AndroidManifest.xml`.

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

This permission should be declared outside the `<application>` element.

An active internet connection is required to load online website content.

---

## 🧭 Application Navigation

The application provides the following navigation options:

| Menu Item | Description |
|---|---|
| Home | Returns to the main dashboard |
| Recipes | Opens the online recipe website |
| Healthy Food | Opens the healthy food website |
| About | Provides information about the application |
| Exit | Closes the current application screen |

The Recipes and Healthy Food sections use Android WebView to display online content within the application.

---

## 🎯 Project Objective

The main objective of Food Explorer is to develop a simple Android application that helps users discover recipes and explore healthy food resources through a user-friendly interface.

This project also demonstrates fundamental Android development concepts, including:

- Activity creation and navigation.
- XML-based user interface design.
- Kotlin programming.
- Options menu implementation.
- Intent-based communication between activities.
- Android WebView integration.
- Internet permission handling.
- Web page loading and back navigation.

---

## 🚀 Future Enhancements

The following improvements can be added in future versions:

- Add a functional recipe search feature.
- Display recipe cards with food images.
- Show ingredients and cooking instructions.
- Add a favorites feature to save preferred recipes.
- Integrate a recipe API for dynamic recipe information.
- Add recipe categories such as breakfast, lunch, dinner, and desserts.
- Improve loading indicators and error messages.
- Enhance the user interface with animations.
- Add offline access to saved recipes.
- Improve accessibility and responsive layouts.

---

## 📚 Learning Outcomes

Developing Food Explorer provides practical experience with:

1. Building Android applications using Kotlin.
2. Designing layouts using XML.
3. Working with Android activities and intents.
4. Creating and handling options menus.
5. Integrating WebView into an Android application.
6. Managing internet permissions.
7. Implementing basic navigation and loading indicators.
8. Organizing an Android Studio project.

---

## 👨‍💻 Author

**Rohit Kumar Singh**

MCA Student | Aspiring Software Developer

---