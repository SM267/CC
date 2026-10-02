# ShortLinkX — Distributed URL Shortener & Analytics

A production-style URL shortening platform demonstrating backend engineering, caching, asynchronous analytics, rate limiting, and system design.

## Stack
Java 25, Spring Boot, MySQL, Redis, Apache Kafka, React, Docker Compose.

## Architecture

```text
React Client -> Spring Boot REST API -> MySQL
                         |             
                         +-> Redis     
                         +-> Kafka -> Analytics Consumer -> MySQL
```

## Features
- Collision-safe Base62 short codes
- Custom aliases and URL expiration
- Redis cache-aside redirect path
- Kafka-based asynchronous click analytics
- Device/browser/OS tracking
- API rate limiting
- React frontend
- Docker Compose infrastructure
- Layered Spring Boot structure

## Run

```bash
cd infra
docker compose up -d
cd ../backend
./mvnw spring-boot:run
cd ../frontend
npm install
npm run dev
```

Backend: `http://localhost:8080`

## API
`POST /api/v1/urls` creates a short link.

`GET /{shortCode}` redirects and emits an analytics event.

`GET /api/v1/urls/{shortCode}/analytics` returns recent analytics.

## Resume-ready description
Designed a distributed URL shortening and analytics platform using Spring Boot, Redis, MySQL and Kafka, implementing cache-aside reads, asynchronous event processing, rate limiting and click analytics.
