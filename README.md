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
- 📬 **Working Contact Form** - Real email sending via SendGrid API
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
| **SendGrid** | 4.9.3 | Email sending service |
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
- 📧 **SendGrid Account** - For contact form functionality (100 free emails/day)

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

You need to create a `.env.local` file with your SendGrid credentials.

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
SENDGRID_API_KEY=your_sendgrid_api_key_here
CONTACT_RECIPIENT_EMAIL=your-email@gmail.com
```

**Option C: Use command line**

```bash
cd portfolio

cat > .env.local << 'EOF'
SENDGRID_API_KEY=your_sendgrid_api_key_here
CONTACT_RECIPIENT_EMAIL=your-email@gmail.com
EOF
```

> **⚠️ Important:** 
> - Replace `your_sendgrid_api_key_here` with your actual SendGrid API key
> - Replace `your-email@gmail.com` with your email address
> - The `.env.local` file is in `.gitignore` and won't be committed to Git
> - **Never commit credentials to Git!**

#### 📧 Get SendGrid API Key

1. **Sign up for SendGrid** (FREE - 100 emails/day):
   - Visit: https://signup.sendgrid.com/
   - Complete the signup process

2. **Verify your sender email**:
   - Go to: https://app.sendgrid.com/settings/sender_auth/senders
   - Click "Create New Sender"
   - Enter your email address and verify it
   - Check your email and click the verification link

3. **Create an API Key**:
   - Go to: https://app.sendgrid.com/settings/api_keys
   - Click "Create API Key"
   - Name: "Portfolio Website"
   - Permissions: Select "Restricted Access" → Check "Mail Send" → "Full Access"
   - Click "Create & View"
   - **Copy the API key** (you won't see it again!)
   - Paste it into your `.env.local` file

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
export SENDGRID_API_KEY=your_sendgrid_api_key
export CONTACT_RECIPIENT_EMAIL=your-email@gmail.com

# Run the app
mvn spring-boot:run
```

**Option C: Build and run JAR**

```bash
# Build
mvn clean package

# Run with environment variables
export SENDGRID_API_KEY=your_sendgrid_api_key
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
   echo "SENDGRID_API_KEY=your_sendgrid_api_key" > .env.local
   echo "CONTACT_RECIPIENT_EMAIL=your-email@gmail.com" >> .env.local
   
   # Option 2: Using a text editor
   nano .env.local
   # Paste the variables, save and exit (Ctrl+X, Y, Enter)
   ```

4. **Get SendGrid API Key**
   - Sign up: https://signup.sendgrid.com/ (FREE - 100 emails/day)
   - Verify your sender email
   - Create API key: https://app.sendgrid.com/settings/api_keys
   - Copy the API key
   - Update `.env.local` with this key

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

#### Issue: "Could not resolve placeholder 'SENDGRID_API_KEY'"

**Solution:** Environment variables not loaded.

```bash
# Make sure .env.local exists
ls -la .env.local

# If missing, create it
cat > .env.local << 'EOF'
SENDGRID_API_KEY=your_sendgrid_api_key
CONTACT_RECIPIENT_EMAIL=your-email@gmail.com
EOF

# Use ./run.sh instead of mvn spring-boot:run
./run.sh
```

#### Issue: "Failed to send email" or 401/403 errors

**Solution:** Invalid SendGrid API key or unverified sender.

```bash
# 1. Verify your sender email in SendGrid:
#    https://app.sendgrid.com/settings/sender_auth/senders
# 2. Generate a NEW API key with "Mail Send" permission:
#    https://app.sendgrid.com/settings/api_keys
# 3. Update .env.local with the NEW API key
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
server.port=${PORT:8080}

# Thymeleaf Configuration
spring.thymeleaf.cache=false
spring.thymeleaf.enabled=true

# SendGrid Configuration
sendgrid.api.key=${SENDGRID_API_KEY}

# Contact Form
contact.recipient.email=${CONTACT_RECIPIENT_EMAIL}
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

The contact form uses **SendGrid** to send actual emails (100 free emails/day).

### Step-by-Step Guide

#### 1. Sign Up for SendGrid (FREE)
1. Visit: https://signup.sendgrid.com/
2. Complete the signup process
3. Verify your email address

#### 2. Verify Your Sender Email
1. Go to: https://app.sendgrid.com/settings/sender_auth/senders
2. Click "Create New Sender"
3. Enter your email (e.g., `analjyoti176@gmail.com`)
4. Fill in required details
5. Check your email and click verification link

#### 3. Create API Key
1. Go to: https://app.sendgrid.com/settings/api_keys
2. Click "Create API Key"
3. Name: "Portfolio Website"
4. Permissions: **Restricted Access** → **Mail Send** → **Full Access**
5. Click "Create & View"
6. **Copy the API key** (won't be shown again!)

#### 4. Update Local Configuration
Create/update `.env.local`:
```env
SENDGRID_API_KEY=your_actual_sendgrid_api_key
CONTACT_RECIPIENT_EMAIL=analjyoti176@gmail.com
```

#### 5. Test the Form
1. Run the application: `./run.sh`
2. Navigate to `http://localhost:8080/contact`
3. Fill and submit the form
4. Check your email inbox

> **💡 Tip:** SendGrid offers 100 free emails per day, which is perfect for portfolio contact forms!

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

## 🚀 Deployment

### Deploy to Render

1. **Push to GitHub**
   ```bash
   git add .
   git commit -m "Portfolio website with SendGrid integration"
   git push origin main
   ```

2. **Connect to Render**
   - Go to: https://dashboard.render.com/
   - Click "New" → "Web Service"
   - Connect your GitHub repository

3. **Configure Settings**
   - **Name**: `your-portfolio`
   - **Environment**: Docker
   - **Build Command**: `mvn clean package -DskipTests`
   - **Start Command**: `java -jar target/portfolio-1.0.0.jar`

4. **Set Environment Variables**
   Go to "Environment" tab and add:
   ```
   SENDGRID_API_KEY=your_sendgrid_api_key
   CONTACT_RECIPIENT_EMAIL=your-email@gmail.com
   ```

5. **Deploy**
   - Click "Create Web Service"
   - Wait for deployment (3-5 minutes)
   - Your portfolio will be live! 🎉

> **✅ Why SendGrid works on Render's free tier:**
> - Uses HTTPS API (not SMTP port 587)
> - No firewall restrictions
> - More reliable than Gmail SMTP
> - Better email deliverability

### Alternative Hosting Options

- **Railway.app** - Similar to Render, free tier available
- **Heroku** - Free dyno hours available
- **AWS Elastic Beanstalk** - Free tier for 12 months
- **DigitalOcean App Platform** - $5/month

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
