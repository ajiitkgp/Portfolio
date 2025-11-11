# Anal Jyoti - Portfolio Website

A modern, responsive portfolio website built with **Spring Boot** and **Thymeleaf** to showcase my projects, skills, and professional experience.

## 🚀 Features

- **Responsive Design**: Works seamlessly on desktop, tablet, and mobile devices
- **Modern UI/UX**: Clean and professional design with smooth animations
- **Dynamic Content**: Server-side rendering with Thymeleaf templates
- **Multiple Pages**: Home, About, Projects, and Contact pages
- **Social Integration**: Links to GitHub, LinkedIn, Codeforces, and CodeChef profiles
- **Interactive Elements**: Mobile navigation, smooth scrolling, and form validation

## 🛠️ Technologies Used

### Backend
- Java 17
- Spring Boot 3.2.0
- Spring Web
- Thymeleaf Template Engine
- Maven

### Frontend
- HTML5
- CSS3 (with CSS Variables and Flexbox/Grid)
- JavaScript (ES6+)
- Font Awesome Icons

## 📋 Prerequisites

Before running this application, make sure you have the following installed:

- **Java 17** or higher ([Download](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html))
- **Maven 3.6+** ([Download](https://maven.apache.org/download.cgi))

## 🔧 Installation & Setup

### 1. Clone the repository

```bash
git clone https://github.com/ajiitkgp/portfolio.git
cd portfolio
```

### 2. Configure the application (Optional)

Edit `src/main/resources/application.properties` if you want to change the default port or other settings:

```properties
server.port=8080
```

### 3. Update your personal information

Edit `src/main/java/com/analjyoti/portfolio/controller/HomeController.java` to update your personal details:

```java
model.addAttribute("email", "your.email@example.com");
```

Also update the email in `src/main/resources/templates/contact.html`.

## 🚀 Running the Application

### Option 1: Using Maven

```bash
mvn spring-boot:run
```

### Option 2: Using Maven Wrapper (recommended)

```bash
./mvnw spring-boot:run
```

### Option 3: Build and run JAR

```bash
mvn clean package
java -jar target/portfolio-1.0.0.jar
```

The application will start on `http://localhost:8080`

## 📁 Project Structure

```
portfolio/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/analjyoti/portfolio/
│   │   │       ├── PortfolioApplication.java
│   │   │       └── controller/
│   │   │           └── HomeController.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── style.css
│   │       │   ├── js/
│   │       │   │   └── script.js
│   │       │   └── images/
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   ├── about.html
│   │       │   ├── projects.html
│   │       │   └── contact.html
│   │       └── application.properties
├── pom.xml
└── README.md
```

## 🎨 Customization

### Changing Colors

Edit CSS variables in `src/main/resources/static/css/style.css`:

```css
:root {
    --primary-color: #3b82f6;
    --secondary-color: #8b5cf6;
    /* Add your custom colors */
}
```

### Adding Projects

Edit `src/main/resources/templates/projects.html` to add your own projects.

### Adding Profile Picture

1. Place your image in `src/main/resources/static/images/`
2. Update the HTML templates to reference your image

## 📝 Pages

- **Home** (`/`): Landing page with hero section, skills, and achievements
- **About** (`/about`): Detailed information about background and experience
- **Projects** (`/projects`): Showcase of personal and professional projects
- **Contact** (`/contact`): Contact information and form

## 🌐 Deployment

### Deploy to Heroku

1. Create a `Procfile`:
```
web: java -jar target/portfolio-1.0.0.jar
```

2. Deploy:
```bash
heroku create your-portfolio-name
git push heroku main
```

### Deploy to AWS

1. Build the JAR:
```bash
mvn clean package
```

2. Upload to AWS Elastic Beanstalk or EC2 and run:
```bash
java -jar portfolio-1.0.0.jar
```

### Deploy to Render/Railway

Both platforms support Spring Boot applications. Simply connect your GitHub repository and they will auto-detect the configuration.

## 🔗 Links

- **GitHub**: [https://github.com/ajiitkgp](https://github.com/ajiitkgp)
- **LinkedIn**: [https://www.linkedin.com/in/anal-jyoti-2a5b211ba/](https://www.linkedin.com/in/anal-jyoti-2a5b211ba/)
- **Codeforces**: [https://codeforces.com/profile/less_than_green](https://codeforces.com/profile/less_than_green)
- **CodeChef**: [https://www.codechef.com/users/ajsingh176](https://www.codechef.com/users/ajsingh176)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 🤝 Contributing

Feel free to fork this project and customize it for your own portfolio!

## 📧 Contact

For any questions or suggestions, feel free to reach out through the contact page on the website or via email.

---

**Built with ❤️ using Spring Boot**

