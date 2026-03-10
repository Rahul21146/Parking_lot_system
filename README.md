# 🚗 Parking Lot System (Low Level Design - Java)

A **Parking Lot Management System** implemented in **Java using Object-Oriented Programming and Low-Level Design principles**.

This project simulates how a real parking system works, including **vehicle entry, ticket generation, parking spot allocation, fee calculation, payment processing, and vehicle exit validation**.

The project demonstrates important **software design concepts** like:

* Object-Oriented Programming (OOP)
* Abstraction
* Inheritance
* Polymorphism
* Enums
* Singleton Design Pattern

---

# 📌 Features

* Vehicle entry and ticket generation
* Parking spot management
* Parking fee calculation
* Vehicle exit validation
* Payment processing (Cash / Card)
* Display board showing available parking spots
* Admin account for system management
* Agent account for ticket processing
* Singleton parking lot system

---

# 🏗️ System Architecture

The system is divided into multiple components.

ParkingLotSystem
│
├── Entrance
├── Exit
├── ParkingSpot
│   ├── Compact
│   ├── Large
│   ├── Handicapped
│   └── Motorcycle
│
├── Vehicle
│   ├── Car
│   ├── Truck
│   ├── Van
│   └── MotorcycleVehicle
│
├── Payment
│   ├── CashPayment
│   └── CardPayment
│
├── ParkingTicket
├── ParkingRate
├── DisplayBoard
│
└── Account
├── AdminAccount
└── AgentAccount

---

# ⚙️ Technologies Used

* Java
* Object-Oriented Programming
* Low Level Design (LLD)
* Singleton Design Pattern
* Java Enums

---

# 🧠 Design Patterns Used

Singleton Pattern
Used in `ParkingLotSystem` so that only **one parking system instance exists**.

Abstraction
Used in classes like:

* ParkingSpot
* Vehicle
* Payment

Inheritance
Vehicle types extend the Vehicle class.

Polymorphism
Different payment types implement the same payment behavior.

Enums
Used for handling system states.

Examples:

* AccountStatus
* PaymentStatus
* TicketStatus

---

# 🚦 System Flow

### 1️⃣ Vehicle Entry

A vehicle arrives at the parking entrance.

Vehicle → Entrance → Ticket Generated

The entrance creates a **ParkingTicket** that contains:

* Ticket number
* Entry time
* Vehicle information

---

### 2️⃣ Parking Spot Assignment

The system checks for an available parking spot.

If a spot is free:

spot.assignVehicle(vehicle)

The parking spot status changes to:

isFree = false

Meaning the spot is now occupied.

---

### 3️⃣ Display Board Update

The display board shows available parking spots.

Example display:

Compact : 12
Large : 5
Motorcycle : 8

The board checks all parking spots and displays how many are free.

---

### 4️⃣ Vehicle Exit

When the vehicle leaves the parking lot:

Vehicle → Exit Gate → Ticket Validation

The exit system performs:

1. Record exit time
2. Calculate parking duration
3. Calculate parking fee

---

### 5️⃣ Parking Fee Calculation

Parking fee is calculated using the `ParkingRate` class.

Example:

Rate = ₹20/hour
Parking Time = 2 hours

Total = ₹40

Formula:

Amount = hours × rate

---

### 6️⃣ Payment Processing

The user pays the parking fee using:

* Cash
* Card

If payment succeeds:

PaymentStatus = COMPLETED

---

### 7️⃣ Parking Spot Becomes Free

After the vehicle exits:

spot.removeVehicle()

Now:

* vehicle = null
* isFree = true

The parking spot becomes available again.

---

# ▶️ Example Main Program

```java
import models.*;
import models.VehicleModels.Car;

public class Main {

    public static void main(String[] args) {

        PArkingLotSystem system = PArkingLotSystem.getInstance();

        Entrance entrance = new Entrance(1);
        Exit exit = new Exit(1);

        system.addEntrance(entrance);
        system.addExit(exit);

        Car car = new Car("UP32AB1234");

        ParkingTicket ticket = entrance.getTicket(car);

        try {
            Thread.sleep(3000);
        } catch (Exception e){}

        exit.validateTicket(ticket);

        System.out.println("Parking completed");

    }
}
```

---

# 🖥️ Example Output

Ticket Generated: 5234
Parking fee: ₹20
Parking completed

---

# 📂 Project Structure

src

Constants
• AccountStatus
• PaymentStatus
• TicketStatus

Interface
• Account
• ParkingSpot
• Payment
• Vehicle

models
• AccountModels
• ParkingSpotModels
• PaymentModels
• VehicleModels
• ParkingTicket
• ParkingRate
• DisplayBoard
• Entrance
• Exit

Main.java

---

# 👨‍💻 Author

Rahul Singh

Java Developer | MERN Stack Developer

Interested in **System Design, Backend Development, and Scalable Applications**.

---

⭐ If you like this project, please **star the repository on GitHub**.
