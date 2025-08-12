# 🏭 ManuFlow – Manufacturing Operations Management System

ManuFlow is a full-stack web application designed to streamline core operations in a manufacturing company, including production order management, inventory tracking, machine maintenance, shift scheduling, supplier management, and quality control.

Built with **Spring Boot (Java)** for the backend and **React.js** for the frontend, this project demonstrates modern enterprise software practices like RESTful APIs, JWT authentication, role-based access control, and responsive UI.

---

## 📌 Features

### 👨‍💼 User Roles
- Admin
- Manager
- Worker

### 🚀 Core Modules
- ✅ **Production Order Management** – Create, track, and assign manufacturing orders.
- 📦 **Inventory Management** – Track raw materials and finished goods.
- ⚙️ **Machine Management** – View and manage manufacturing equipment.
- 🛠️ **Maintenance Scheduler** – Schedule and log maintenance tasks for machines.
- 👥 **Employee Shift Management** – Assign and view worker shifts.
- 🧪 **Quality Control Module** – Perform inspections and defect tracking.
- 🧾 **Supplier & Purchase Orders** – Manage vendors and incoming materials.
- 📊 **KPI Dashboards & Reports** – Track production performance with visual analytics.

---

## 🛠 Tech Stack

### Backend (Java Spring Boot)
- Spring Boot
- Spring Data JPA (Hibernate)
- Spring Security (JWT Auth)
- MySQL / PostgreSQL
- Lombok
- Maven

### Frontend (React.js)
- React Router
- Axios
- Context API / Redux (optional)
- Bootstrap / Material UI / Tailwind (your choice)
- Chart.js / Recharts (for dashboards)

### Dev Tools
- Git & GitHub
- Postman (API testing)
- Docker (optional)
- Swagger (API docs)
- VS Code + IntelliJ IDEA

---

## 🧾 Database Schema

- Users
- Production Orders
- Inventory Items
- Machines
- Maintenance Tasks
- Shifts
- Quality Checks
- Suppliers
- Purchase Orders

> SQL schema available in `/backend/sql/schema.sql`

---

## 📁 Folder Structure

manuflow/
├── backend/ # Spring Boot (Java)
└── frontend/ # React.js app

---

## 🚀 How to Run the Project

### 🔧 Backend Setup

1. Navigate to the `backend/` folder:
   ```bash
   cd backend
mvn spring-boot:run
cd frontend
npm install
npm start


🔐 Authentication
Login with email and password

JWT-based token authentication

Role-based access control for admin/manager/worker

📦 API Documentation
Swagger available at:

bash
Copy
Edit
http://localhost:8080/swagger-ui/
📸 Screenshots
Add screenshots here of key features: dashboard, forms, inventory tables, etc.

✍️ Future Enhancements
Role management UI

Export reports (PDF, Excel)

Mobile responsiveness

Integration with barcode/RFID scanners

Docker deployment

🤝 Contributing
Fork the repository

Create a new branch (git checkout -b feature-name)

Commit your changes (git commit -m 'Add feature')

Push to the branch (git push origin feature-name)

Open a Pull Request

📫 Contact
Developer: Your Name
📧 Email: your.email@example.com
🔗 LinkedIn: linkedin.com/in/yourprofile



