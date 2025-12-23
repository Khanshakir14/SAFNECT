# SAFNECT Backend

Spring Boot backend for the SAFNECT healthcare platform.

## Local Development

```bash
mvn spring-boot:run
```

## Deploy to Railway

1. Push this folder to a GitHub repository
2. Go to [railway.app](https://railway.app)
3. Create new project → Deploy from GitHub repo
4. Select the `backend` folder as the root directory
5. Railway will auto-detect the Dockerfile and deploy

## Environment Variables

Set these in Railway dashboard if needed:
- `PORT` - Auto-set by Railway
- `SPRING_PROFILES_ACTIVE` - Set to `prod` for production
