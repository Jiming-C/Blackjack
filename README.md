# Blackjack Game – Java Project

## Overview
This project is a fully-functional **Blackjack** game implemented in **Java**, where users can play against both human players and **AI-controlled computer players**. The game features advanced AI behavior that allows the computer players to make strategic decisions based on predefined logic. With support for multiple strategies and standard Blackjack rules, this project showcases object-oriented programming (OOP), game logic, and AI-driven decision-making.

## Features
- **AI-Powered Computer Players**: Implements various strategies using the `BlackjackStrategy` interface to allow computer players to make optimal decisions during the game.
- **Dealer AI**: The dealer follows traditional Blackjack rules, automatically handling card dealing and deciding when to hit or stand.
- **Dynamic Strategies**: Allows for different strategies to be used by computer players, such as the predefined `MySimpleStrategy`, enabling more sophisticated decision-making during gameplay.
- **Card Deck Simulation**: The deck of cards is simulated using the `PlayingCard` class, which deals cards to both players and the dealer.
- **Multiple Player Support**: Supports human players and computer-controlled opponents.
- **OOP Design**: Uses inheritance, encapsulation, and interfaces to structure the game logically, ensuring reusability and modularity.

## AI and Strategy
The project includes an AI system for computer-controlled players, leveraging the `BlackjackStrategy` interface to drive decision-making. This provides flexibility in defining different strategies that a computer player can follow, creating varying levels of difficulty and strategic depth.

### Key AI Features:
- **`BlackjackStrategy` Interface**: Defines a common interface that any strategy must implement, including the ability to decide when to hit or stand based on the current game state.
- **`MySimpleStrategy` Implementation**: A basic strategy that the AI uses to decide whether to hit or stand. For example, the AI may decide to stand if the hand value is above 16 and hit otherwise. This can be expanded to incorporate more complex strategies.
- **AI Decision-Making**: Computer players analyze the current hand and compare it with predefined strategy rules to make intelligent decisions on whether to draw more cards or stand. This behavior simulates real-world strategic thinking and adds a layer of difficulty to the game.
- **Extensibility**: New strategies can be added by implementing the `BlackjackStrategy` interface, allowing for future development of more advanced AI behaviors such as card counting or probabilistic decision-making.

## Classes and Structure
The project is divided into several core classes, each responsible for different parts of the game:

- **`BlackjackDealer.java`**: Represents the dealer, handling the game logic for dealing cards and following standard Blackjack rules (e.g., the dealer stands on 17 or higher).
- **`BlackjackHand.java`**: Manages a player's hand, calculates the value of the cards, and determines if the hand is a bust or if special cases (like Aces) need to be handled.
- **`BlackjackPlayer.java`**: An abstract class representing the common behavior for all players, including both human and computer-controlled players.
- **`ComputerBlackjackPlayer.java`**: Extends `BlackjackPlayer` and represents the AI-powered player. This class makes decisions based on the strategy it is assigned.
- **`HumanBlackjackPlayer.java`**: Extends `BlackjackPlayer`, representing a human player who manually interacts with the game by deciding whether to hit or stand.
- **`PlayingCard.java`**: Represents individual playing cards and defines their suit, rank, and value.
- **`BlackjackStrategy.java`**: An interface that defines the decision-making process for AI players, allowing different strategies to be plugged into the game.
- **`MySimpleStrategy.java`**: A basic implementation of the `BlackjackStrategy` interface that follows simple rules to decide whether to hit or stand.
- **`Driver.java`**: The main entry point of the game, responsible for setting up the game, initializing players, and running the gameplay loop.

## How It Works
1. **Dealer and Player Setup**: The game initializes with a dealer and one or more players, which can either be human-controlled or AI-powered.
2. **AI Decision Making**: For AI players, the `BlackjackStrategy` interface is used to make decisions on whether to hit or stand, providing intelligent decision-making during gameplay.
3. **Gameplay Loop**: Each player takes turns deciding whether to hit or stand. The dealer follows standard rules (hits until reaching at least 17). AI players use their strategy to guide their actions.
4. **End of Round**: After all players and the dealer have taken their turns, the game compares hand values to determine the winner.

## Installation

### Prerequisites
- **Java Development Kit (JDK)**: Ensure JDK 8 or higher is installed.
- Use an IDE (like Eclipse or IntelliJ IDEA) or the command line to run the project.

### Steps to Install and Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Jiming-C/Blackjack.git
   ```
2. Compile the Java files:
   ```bash
   javac *.java
   ```
3. Run the main class:
   ```bash
   java Driver
   ```

## Usage

1. **Human Players**: Interact with the game by deciding whether to hit, stand, or take other actions.
2. **Computer Players**: Automatically make decisions based on their strategy. The predefined `MySimpleStrategy` is used by default, but other strategies can be implemented.
3. **Dealer Logic**: The dealer plays according to Blackjack rules, automatically hitting until their hand reaches at least 17.
4. **Game Results**: At the end of the round, the hand values are compared, and the game announces the winner.

## Key Concepts
- **Artificial Intelligence (AI)**: Computer-controlled players use predefined strategies to simulate decision-making during the game.
- **Object-Oriented Programming (OOP)**: The project is structured using OOP principles like inheritance, polymorphism, and encapsulation, promoting code reuse and clarity.
- **Game Logic**: All Blackjack rules are implemented, including handling special cards (Aces) and player actions like hitting, standing, and busting.
- **Deck Management**: The `PlayingCard` class simulates a real-life deck of cards, shuffling and dealing cards to players.

## Future Improvements
- **Advanced AI Strategies**: Introduce more complex AI strategies such as card counting or probabilistic decision-making.
- **GUI Development**: Replace the command-line interface with a graphical user interface (GUI) for better user experience.
- **Multiplayer Capabilities**: Expand the game to support multiple human players playing against each other.
- **Betting System**: Implement a system for placing bets before each round and tracking player earnings.

## Contact Information
For questions, issues, or contributions, feel free to reach out:

- **Email**: [jimingchen2015@gmail.com](mailto:jimingchen2015@gmail.com)
- **GitHub**: [Jiming-C](https://github.com/Jiming-C)

## License
This project is licensed under the MIT License. For more details, see the [LICENSE](LICENSE) file.

---

Thank you for viewing this project! Feel free to explore, contribute, or provide feedback. I am open to suggestions and collaborations for future enhancements.
