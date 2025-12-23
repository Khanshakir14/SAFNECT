# SAFNECT - Healthcare Management Platform

A real-time hospital management platform connecting healthcare providers with patients.

## Project Structure

```
SAF_Connect/
├── backend/    # Spring Boot API (Java)
├── frontend/   # React + Vite (JavaScript)
```

## Quick Start

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

## Deployment

| Component | Platform | Instructions |
|-----------|----------|--------------|
| Backend | Railway | See `backend/README.md` |
| Frontend | Vercel | See `frontend/README.md` |

## Tech Stack

- **Frontend**: React 19, Vite, Tailwind CSS, Axios
- **Backend**: Spring Boot 3, Spring Data JPA, H2 Database
- **Deployment**: Railway (backend), Vercel (frontend)

---
© 2024 SAFNECT TECHNOLOGIES PRIVATE LIMITED
