# SAFNECT Frontend

React frontend for the SAFNECT healthcare platform.

## Local Development

```bash
npm install
npm run dev
```

## Deploy to Vercel

### Option 1: CLI
```bash
npm install -g vercel
vercel
```

### Option 2: GitHub Integration
1. Push this folder to a GitHub repository
2. Go to [vercel.com](https://vercel.com)
3. Import your GitHub repo
4. Set the **Root Directory** to `frontend`
5. Add environment variable:
   - `VITE_API_URL` = `https://your-railway-backend.up.railway.app/api`

## Environment Variables

| Variable | Description |
|----------|-------------|
| `VITE_API_URL` | Backend API URL (set in Vercel dashboard) |
