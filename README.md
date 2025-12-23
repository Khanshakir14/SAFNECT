# SAFNECT - Healthcare Management Platform

A real-time hospital management platform connecting healthcare providers with patients.

## Project Structure

```
SAFNECT/
├── backend/    # Spring Boot API (Java 21)
├── frontend/   # React + Vite (JavaScript)
├── render.yaml # Render deployment blueprint
```

## Quick Start (Local Development)

### Backend
```bash
cd backend
mvn spring-boot:run
# Runs on http://localhost:8080
```

### Frontend
```bash
cd frontend
npm install
npm run dev
# Runs on http://localhost:5173
```

## Deployment on Render

### Option 1: Using Render Blueprint (Recommended)
1. Push your code to GitHub
2. Go to [Render Dashboard](https://dashboard.render.com)
3. Click **New** → **Blueprint**
4. Connect your GitHub repo
5. Render will automatically detect `render.yaml` and create all services

### Option 2: Manual Deployment
| Component | Type | Build Command | Start Command |
|-----------|------|---------------|---------------|
| Backend | Web Service | `cd backend && ./mvnw clean package -DskipTests` | `java -jar target/*.jar` |
| Frontend | Static Site | `cd frontend && npm install && npm run build` | N/A (serve `dist/`) |
| Database | PostgreSQL | N/A | N/A |

**Environment Variables for Backend:**
- `DATABASE_URL` - PostgreSQL connection URL
- `DATABASE_USERNAME` - Database username
- `DATABASE_PASSWORD` - Database password

## Tech Stack

- **Frontend**: React 19, Vite, Tailwind CSS, Axios
- **Backend**: Spring Boot 3.2, Java 21, Spring Data JPA, PostgreSQL
- **Deployment**: Render (backend, frontend, database)

---
© 2024 SAFNECT TECHNOLOGIES PRIVATE LIMITED
