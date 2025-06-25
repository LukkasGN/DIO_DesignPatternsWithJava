# Design Patterns in Pure Java

This repo showcases three common design patterns implemented in plain Java:

## ✅ Patterns Covered

### 🔁 Singleton
Ensures only one instance of a class exists. Used for logging, configuration, etc.

Files:
- `Logger.java`
- `App.java`

### ⚔️ Strategy
Encapsulates interchangeable behaviors using interfaces.

Files:
- `PaymentStrategy.java`
- `CreditCardPayment.java`
- `PayPalPayment.java`
- `PaymentContext.java`
- `App.java`

### 🧰 Facade
Simplifies interaction with complex subsystems.

Files:
- `DVDPlayer.java`
- `Projector.java`
- `SoundSystem.java`
- `HomeTheaterFacade.java`
- `App.java`

## 📦 How to Run
Each pattern has its own `App.java` entry point. Just compile and run:

```bash
javac *.java
java App
