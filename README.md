# Kafka Transactions

A Java/Spring Boot example of Kafka-based money transfers using five Maven projects:

- `core` — shared event classes and exceptions
- `TransferService` — accepts transfers and publishes transactional Kafka events
- `WithdrawalService` — consumes withdrawal events
- `DepositService` — consumes deposit events
- `mockservice` — mock service used by the example

Each directory is a separate Maven project. Build the shared `core` library first, then build or run the services from their own directories. The services expect Kafka at `localhost:9092`; the mock service listens on port `8082`.

```powershell
cd core
./mvnw.cmd clean install

cd ..\TransferService
./mvnw.cmd clean package
```

Run `WithdrawalService`, `DepositService`, `TransferService`, and `mockservice` from their respective directories with `./mvnw.cmd spring-boot:run` after Kafka and the shared `core` dependency are available.
