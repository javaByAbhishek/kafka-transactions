# Kafka Transactions

A Java/Spring Boot example of Kafka-based money transfers organized as a Maven multi-module project.

## Modules

- `core` — shared event classes and exceptions
- `TransferService` — accepts transfers and publishes transactional Kafka events
- `WithdrawalService` — consumes withdrawal events
- `DepositService` — consumes deposit events
- `mockservice` — mock service used by the example

The services use the `com.javabyabhishek.payments` Java package namespace. The service modules are independently runnable Spring Boot applications; `core` is a shared library.

## Build

Build and verify all modules from the repository root:

```powershell
./mvnw.cmd clean verify
```

Build one application and its required modules, for example the transfer service:

```powershell
./mvnw.cmd -pl TransferService -am package
java -jar TransferService/target/transfer-service-1.0.0-SNAPSHOT.jar
```

The services expect Kafka at `localhost:9092`; the mock service listens on port `8082`.
