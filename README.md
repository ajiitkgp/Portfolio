# Anal Jyoti - Portfolio Website

A modern, professional portfolio website built with **Spring Boot** and **Thymeleaf**, showcasing my experience as a Software Development Engineer with expertise in backend development and competitive programming.

![Java](https://img.shields.io/badge/Java-17-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen) ![License](https://img.shields.io/badge/License-MIT-blue)

---

## 📖 Table of Contents

- [Features](#-features)
- [Tech Stack](#️-tech-stack)
- [Prerequisites](#-prerequisites)
- [Quick Start](#-quick-start)
- [Project Structure](#-project-structure)
- [Configuration](#-configuration)
- [Pages Overview](#-pages-overview)
- [Contact Form Setup](#-contact-form-setup)
- [Customization Guide](#-customization-guide)
- [Deployment](#-deployment)
- [Links](#-links)
- [License](#-license)

---

## ✨ Features

### Core Features
- ✅ **Responsive Design** - Seamless experience across desktop, tablet, and mobile
- ✅ **Modern UI/UX** - Clean design with smooth animations and transitions
- ✅ **Server-Side Rendering** - Dynamic content with Thymeleaf templates
- ✅ **Reusable Components** - Shared navigation and footer fragments
- ✅ **SEO Optimized** - Proper meta tags and semantic HTML

### Pages
- 🏠 **Home** - Hero section with skills showcase and achievements
- 👨‍💻 **About** - Professional background and journey
- 💼 **Experience** - Timeline of work experience and education
- 🚀 **Projects** - Portfolio of projects with tech stacks
- 📧 **Contact** - Functional email contact form with backend integration

### Special Features
- 📱 **Mobile Navigation** - Responsive hamburger menu
- 🏆 **Competitive Programming** - Integration with Codeforces, CodeChef profiles
- 📬 **Working Contact Form** - Real email sending via Spring Mail
- 🎨 **Smooth Animations** - Scroll-triggered and hover effects
- 🔒 **Form Validation** - Client and server-side validation

---

## �️ Tech Stack

### Backend
| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 17 | Core programming language |
| **Spring Boot** | 3.2.0 | Application framework |
| **Spring Web** | 3.2.0 | Web MVC and REST APIs |
| **Spring Mail** | 3.2.0 | Email functionality |
| **Thymeleaf** | 3.2.0 | Template engine |
| **Maven** | 3.9.5 | Build and dependency management |

### Frontend
| Technology | Purpose |
|------------|---------|
| **HTML5** | Semantic markup |
| **CSS3** | Styling with variables, flexbox, grid |
| **JavaScript (ES6+)** | Interactivity and API calls |
| **Font Awesome 6.4** | Icons |

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- ☕ **Java 17 or higher** - [Download JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- 📦 **Maven 3.6+** - [Download Maven](https://maven.apache.org/download.cgi)
- 📧 **Gmail Account** - For contact form functionality (with 2FA enabled)

### Verify Installation

```bash
java -version    # Should show Java 17+
mvn -version     # Should show Maven 3.6+
```

---

## 🚀 Quick Start

### 1. Clone the Repository

```bash
git clone https://github.com/ajiitkgp/portfolio.git
cd portfolio
```

### 2. Configure Email (For Contact Form)

Edit `src/main/resources/application.properties`:

```properties
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
contact.recipient.email=your-email@gmail.com
```

> **Note:** Generate a Gmail App Password at [Google Account Security](https://myaccount.google.com/apppasswords)

### 3. Run the Application

**Option A: Using the provided script**
```bash
chmod +x run.sh
./run.sh
```

**Option B: Using Maven**
```bash
mvn spring-boot:run
```

**Option C: Build and run JAR**
```bash
mvn clean package
java -jar target/portfolio-1.0.0.jar
```

### 4. Access the Portfolio

Open your browser and navigate to:
```
http://localhost:8080
```

---

## 📁 Project Structure

```
portfolio/
├── src/
│   ├── main/
│   │   ├── java/com/analjyoti/portfolio/
│   │   │   ├── PortfolioApplication.java        # Main application class
│   │   │   ├── controller/
│   │   │   │   ├── HomeController.java          # Page controllers
│   │   │   │   └── ContactController.java       # Contact form API
│   │   │   ├── service/
│   │   │   │   └── EmailService.java            # Email sending service
│   │   │   └── dto/
│   │   │       └── ContactRequest.java          # Contact form DTO
│   │   └── resources/
│   │       ├── application.properties            # Configuration
│   │       ├── static/
│   │       │   ├── css/style.css                # Styles
│   │       │   ├── js/script.js                 # JavaScript
│   │       │   └── images/                      # Images (add yours here)
│   │       └── templates/
│   │           ├── fragments/layout.html        # Reusable components
│   │           ├── index.html                   # Home page
│   │           ├── about.html                   # About page
│   │           ├── experience.html              # Experience page
│   │           ├── projects.html                # Projects page
│   │           └── contact.html                 # Contact page
├── pom.xml                                      # Maven dependencies
├── run.sh                                       # Quick start script
└── README.md                                    # This file
```

---

## ⚙️ Configuration

### Application Settings

**File:** `src/main/resources/application.properties`

```properties
# Server Configuration
server.port=8080

# Thymeleaf Configuration
spring.thymeleaf.cache=false
spring.thymeleaf.enabled=true

# Mail Configuration (Gmail SMTP)
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# Contact Form
contact.recipient.email=your-email@gmail.com
```

### Personal Information

Update your details in `HomeController.java`:

```java
model.addAttribute("name", "Your Name");
model.addAttribute("title", "Your Title");
model.addAttribute("email", "your.email@gmail.com");
model.addAttribute("github", "https://github.com/yourusername");
model.addAttribute("linkedin", "https://linkedin.com/in/yourprofile");
```

---

## 📄 Pages Overview

### 🏠 Home (`/`)
- Hero section with introduction
- Technical skills grid (6 categories)
- Achievements and competitive programming highlights
- Social media links

### 👨‍💻 About (`/about`)
- Professional background
- Journey and motivation
- Statistics cards
- Personal interests

### 💼 Experience (`/experience`)
- Professional experience timeline
- Education section
- Competitive programming achievements
- Technical skills summary (categorized)

### 🚀 Projects (`/projects`)
- Project showcase cards
- Tech stack tags
- GitHub links
- Project descriptions

### 📧 Contact (`/contact`)
- Working email contact form
- Social media links
- Form validation (client + server)
- Success/error feedback

---

## 📬 Contact Form Setup

The contact form requires Gmail SMTP configuration to send actual emails.

### Step-by-Step Guide

#### 1. Enable 2-Factor Authentication
1. Visit: [Google Account Security](https://myaccount.google.com/security)
2. Enable 2-Step Verification

#### 2. Generate App Password
1. Visit: [App Passwords](https://myaccount.google.com/apppasswords)
2. Select: **Mail** → **Other (Custom name)** → "Portfolio"
3. Copy the 16-character password

#### 3. Update Configuration
Edit `application.properties`:
```properties
spring.mail.username=analjyoti176@gmail.com
spring.mail.password=your-16-char-app-password
contact.recipient.email=analjyoti176@gmail.com
```

#### 4. Test the Form
1. Run the application
2. Navigate to `http://localhost:8080/contact`
3. Fill and submit the form
4. Check your Gmail inbox

### API Endpoint

**POST** `/api/contact`

**Request Body:**
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "subject": "Inquiry",
  "message": "Your message here"
}
```

**Response (Success):**
```json
{
  "status": "success",
  "message": "Thank you for your message! I will get back to you soon."
}
```

---

## 🎨 Customization Guide

### Change Color Scheme

Edit `src/main/resources/static/css/style.css`:

```css
:root {
    --primary-color: #3b82f6;      /* Blue */
    --secondary-color: #8b5cf6;    /* Purple */
    --text-dark: #1f2937;
    --text-light: #6b7280;
}
```

### Add Profile Picture

1. Place image in: `src/main/resources/static/images/profile.jpg`
2. Update HTML templates to reference the image

### Modify Projects

Edit `src/main/resources/templates/projects.html`:

```html
<div class="project-card">
    <div class="project-header">
        <h3>Your Project Name</h3>
        <div class="project-links">
            <a href="https://github.com/you/project">
                <i class="fab fa-github"></i>
            </a>
        </div>
    </div>
    <p class="project-description">
        Project description here...
    </p>
    <div class="project-tech">
        <span class="tech-tag">Java</span>
        <span class="tech-tag">Spring Boot</span>
    </div>
</div>
```

### Update Experience

Edit `src/main/resources/templates/experience.html` to add your work experience, internships, and education details.

---

## 🌐 Deployment

### Deploy to Heroku

```bash
# Create Procfile
echo "web: java -jar target/portfolio-1.0.0.jar" > Procfile

# Set environment variables
heroku config:set MAIL_USERNAME=your-email@gmail.com
heroku config:set MAIL_PASSWORD=your-app-password

# Deploy
heroku create your-portfolio-name
git push heroku main
```

### Deploy to Render

1. Connect GitHub repository
2. Set environment variables:
   - `MAIL_USERNAME`
   - `MAIL_PASSWORD`
   - `CONTACT_RECIPIENT_EMAIL`
3. Render auto-detects Spring Boot

### Deploy to Railway

1. Import GitHub repository
2. Add environment variables
3. Railway handles the rest

### Deploy to AWS Elastic Beanstalk

```bash
mvn clean package
eb init
eb create portfolio-env
eb deploy
```

### Environment Variables for Production

Update `application.properties` for production:

```properties
spring.mail.username=${MAIL_USERNAME}
spring.mail.password=${MAIL_PASSWORD}
contact.recipient.email=${CONTACT_RECIPIENT_EMAIL}
```

---

## 🔗 Links

- 💼 **Portfolio**: [Live Site](https://your-portfolio-url.com)
- 🐙 **GitHub**: [https://github.com/ajiitkgp](https://github.com/ajiitkgp)
- 💼 **LinkedIn**: [Anal Jyoti](https://www.linkedin.com/in/anal-jyoti-2a5b211ba/)
- 💻 **Codeforces**: [less_than_green](https://codeforces.com/profile/less_than_green)
- 👨‍💻 **CodeChef**: [ajsingh176](https://www.codechef.com/users/ajsingh176)

---

## 📄 License

This project is open source and available under the **MIT License**.

```
MIT License

Copyright (c) 2025 Anal Jyoti

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software.
```

---

## 🤝 Contributing

This is a personal portfolio project, but feel free to:
- Fork the repository
- Customize it for your own portfolio
- Submit issues for bugs
- Suggest improvements

---

## 📧 Contact

For questions, collaborations, or just to say hi:

- **Email**: analjyoti176@gmail.com
- **LinkedIn**: [Connect with me](https://www.linkedin.com/in/anal-jyoti-2a5b211ba/)
- **GitHub**: [@ajiitkgp](https://github.com/ajiitkgp)

---

## 🙏 Acknowledgments

- Spring Boot Team for the excellent framework
- Font Awesome for icons
- Thymeleaf for templating
- The open-source community

---

## 📊 Project Stats

- **Lines of Code**: ~3,000+
- **Pages**: 5 (Home, About, Experience, Projects, Contact)
- **Components**: Reusable fragments (navbar, footer)
- **API Endpoints**: 1 (Contact form)
- **Dependencies**: 6 (Spring Boot, Thymeleaf, Mail, etc.)

---

<div align="center">

**Built with ❤️ using Spring Boot**

⭐ Star this repo if you find it helpful!

</div>
