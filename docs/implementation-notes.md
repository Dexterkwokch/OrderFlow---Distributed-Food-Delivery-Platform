# OrderFlow Implementation Notes

## 2026-09-30

- Initialized the repository as a Maven monorepo for the Java 21 / Spring Boot version of the plan.
- Added a shared `event-contracts` module for event names, routing keys, statuses, and a generic event envelope.
- Added initial Spring Boot service shells for:
  - Order Service
  - Restaurant Service
  - Delivery Service
- Each service currently has basic REST info endpoints, Spring Security permitting local development requests, Flyway enabled, PostgreSQL/RabbitMQ configuration placeholders, and a simple initial migration.
- The next step should be Docker Compose for PostgreSQL and RabbitMQ, followed by real domain models and create/order flows.
