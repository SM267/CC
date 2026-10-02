# Architecture Notes

## Redirect flow
1. Request arrives at the redirect endpoint.
2. Redis is checked first.
3. On cache miss, MySQL is queried and Redis is repopulated.
4. URL validity and expiration are checked.
5. A click event is published to Kafka without blocking the redirect path.
6. An analytics consumer persists the event asynchronously.

## Scaling path
Multiple stateless Spring Boot instances can run behind a load balancer. Redis can be shared across instances, Kafka can partition events, and MySQL can add read replicas for analytics-heavy workloads.
