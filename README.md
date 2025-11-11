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

### 2. Set Up Environment Variables

You need to create a `.env.local` file with your email credentials.

**Option A: Copy from template**

```bash
cd portfolio

# Copy the example file
cp .env.example .env.local

# Edit with your actual credentials
nano .env.local
```

**Option B: Create manually**

Create a file named `.env.local` in the project root:

```env
MAIL_USERNAME=your-email@gmail.com
MAIL_PASSWORD=your-gmail-app-password
CONTACT_RECIPIENT_EMAIL=your-email@gmail.com
```

**Option C: Use command line**

```bash
cd portfolio

cat > .env.local << 'EOF'
MAIL_USERNAME=your-email@gmail.com
MAIL_PASSWORD=your-gmail-app-password
CONTACT_RECIPIENT_EMAIL=your-email@gmail.com
EOF
```

> **⚠️ Important:** 
> - Replace `your-email@gmail.com` with your actual Gmail address
> - Replace `your-gmail-app-password` with a Gmail App Password (see below)
> - The `.env.local` file is in `.gitignore` and won't be committed to Git
> - **Never commit credentials to Git!**

#### 📧 Generate Gmail App Password

1. Go to [Google Account Security](https://myaccount.google.com/security)
2. Enable **2-Step Verification** (if not already enabled)
3. Go to [App Passwords](https://myaccount.google.com/apppasswords)
4. Select **Mail** → **Other (Custom name)** → Type "Portfolio"
5. Click **Generate**
6. Copy the 16-character password
7. Use this password in your `.env.local` file

### 3. Run the Application

**Option A: Using the run script (Recommended)**

```bash
chmod +x run.sh
./run.sh
```

The script automatically loads environment variables from `.env.local` and starts the app.

**Option B: Using Maven with manual env vars**

```bash
# Load environment variables
export MAIL_USERNAME=your-email@gmail.com
export MAIL_PASSWORD=your-app-password
export CONTACT_RECIPIENT_EMAIL=your-email@gmail.com

# Run the app
mvn spring-boot:run
```

**Option C: Build and run JAR**

```bash
# Build
mvn clean package

# Run with environment variables
export MAIL_USERNAME=your-email@gmail.com
export MAIL_PASSWORD=your-app-password
export CONTACT_RECIPIENT_EMAIL=your-email@gmail.com

java -jar target/portfolio-1.0.0.jar
```

### 4. Access the Portfolio

Open your browser and navigate to:
```
http://localhost:8080
```

---

## 🔧 Local Development Setup (Step-by-Step)

### Complete Setup Guide

1. **Install Prerequisites**
   ```bash
   # Check Java version
   java -version  # Should be 17+
   
   # Check Maven version
   mvn -version   # Should be 3.6+
   ```

2. **Clone and Navigate**
   ```bash
   git clone https://github.com/ajiitkgp/portfolio.git
   cd portfolio
   ```

3. **Create Environment File**
   ```bash
   # Option 1: Using echo commands
   echo "MAIL_USERNAME=your-email@gmail.com" > .env.local
   echo "MAIL_PASSWORD=your-app-password" >> .env.local
   echo "CONTACT_RECIPIENT_EMAIL=your-email@gmail.com" >> .env.local
   
   # Option 2: Using a text editor
   nano .env.local
   # Paste the variables, save and exit (Ctrl+X, Y, Enter)
   ```

4. **Get Gmail App Password**
   - Visit: https://myaccount.google.com/apppasswords
   - Create new app password for "Mail"
   - Copy the 16-character code
   - Update `.env.local` with this password

5. **Run the Application**
   ```bash
   ./run.sh
   ```

6. **Test the Portfolio**
   - Open: http://localhost:8080
   - Navigate through all pages
   - Test the contact form
   - Check your Gmail for test emails

### 🐛 Troubleshooting Local Setup

#### Issue: "Could not resolve placeholder 'MAIL_USERNAME'"

**Solution:** Environment variables not loaded.

```bash
# Make sure .env.local exists
ls -la .env.local

# If missing, create it
cat > .env.local << 'EOF'
MAIL_USERNAME=your-email@gmail.com
MAIL_PASSWORD=your-app-password
CONTACT_RECIPIENT_EMAIL=your-email@gmail.com
EOF

# Use ./run.sh instead of mvn spring-boot:run
./run.sh
```

#### Issue: "Authentication failed" for email

**Solution:** Wrong password or not using App Password.

```bash
# 1. Go to https://myaccount.google.com/apppasswords
# 2. Generate NEW app password
# 3. Update .env.local with NEW password (remove any spaces)
# 4. Restart the app
./run.sh
```

#### Issue: Port 8080 already in use

**Solution:** Another app is using port 8080.

```bash
# Option 1: Kill the process
lsof -ti:8080 | xargs kill -9

# Option 2: Use a different port
export PORT=8081
./run.sh
# Access at http://localhost:8081
```

#### Issue: Maven build fails

**Solution:** Clean and rebuild.

```bash
mvn clean install
./run.sh
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

### Deploy to Render

1. Connect GitHub repository
2. Set environment variables:
   - `MAIL_USERNAME`
   - `MAIL_PASSWORD`
   - `CONTACT_RECIPIENT_EMAIL`
3. Render auto-detects Spring Boot

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

- **LinkedIn**: [Connect with me](https://www.linkedin.com/in/anal-jyoti-2a5b211ba/)
- **GitHub**: [@ajiitkgp](https://github.com/ajiitkgp)
