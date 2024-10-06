# Blackjack Game – Java Project

## Overview
This project is a fully-functional **Blackjack** game implemented in **Java**, where users can play against a dealer following the classic rules of Blackjack. The game simulates the interactions between players, the dealer, and the deck of cards, providing a smooth and engaging experience. This project demonstrates object-oriented programming (OOP) principles, game logic, and strategic decision-making in Java.

## Features
- **Multiple Player Support**: Players can either be human or computer-based, each with their own strategies.
- **Dealer AI**: The dealer follows the conventional rules of Blackjack and deals cards automatically.
- **Strategic Decision Making**: The program includes a `BlackjackStrategy` interface, allowing players (especially computer-controlled) to make decisions based on predefined or custom strategies.
- **Card Deck Simulation**: Uses the `PlayingCard` class to represent a full deck of cards, shuffled and dealt to both the dealer and players.
- **Game Logic**: Implements all the standard rules of Blackjack, including busts, card values (face cards, Aces), and betting mechanisms.
- **OOP Design**: The game is structured with clear OOP principles, including inheritance, interfaces, and encapsulation.

## Classes and Structure
The project includes several key classes, each handling different aspects of the game:

- **`BlackjackDealer.java`**: Represents the dealer in the game, handling card dealing and following the dealer's rules for hitting or standing.
- **`BlackjackHand.java`**: Manages the cards in a player's hand, calculating the hand value, handling Aces, and determining if the hand is a bust.
- **`BlackjackPlayer.java`**: Abstract base class for all players in the game, defining common behaviors such as drawing cards and deciding whether to hit or stand.
- **`ComputerBlackjackPlayer.java`**: Extends `BlackjackPlayer`, representing a computer-controlled player that uses a specific strategy to play the game.
- **`HumanBlackjackPlayer.java`**: Extends `BlackjackPlayer`, representing a human player who manually makes decisions during the game.
- **`PlayingCard.java`**: Represents a single playing card in the deck, with suit and rank properties.
- **`BlackjackStrategy.java`**: Interface defining a strategy that a player can follow when deciding whether to hit or stand.
- **`MySimpleStrategy.java`**: Implements `BlackjackStrategy`, providing a simple strategy that computer players can follow.
- **`Driver.java`**: The main class that initializes the game, handles user inputs, and starts the game loop.
- **`Hand.java`**: A generic class for handling any type of card hand, which is extended by `BlackjackHand` for Blackjack-specific functionality.

## How It Works
1. **Dealer and Player Setup**: The game starts by initializing a dealer and one or more players (human or computer). Players are assigned hands, and a deck of cards is shuffled.
2. **Gameplay Loop**: Players take turns drawing cards, deciding whether to hit or stand based on their strategy or user input. The dealer plays according to standard Blackjack rules (hits below 17, stands on 17 or higher).
3. **Hand Evaluation**: After all players and the dealer have taken their turns, the hands are evaluated. The highest hand under 21 wins, and players who go over 21 bust and lose automatically.
4. **Strategy Execution**: Computer players follow their assigned strategy (e.g., `MySimpleStrategy`) to decide whether to hit or stand during their turn.
5. **Endgame**: The game continues until players decide to stop, after which results are displayed, including the outcomes of all hands.

## Installation

### Prerequisites
- **Java Development Kit (JDK)**: Ensure that JDK 8 or higher is installed on your machine.
- A command-line interface or an IDE like **Eclipse** or **IntelliJ IDEA** to run the project.

### Steps to Install and Run
1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Jiming-C/Blackjack.git
   ```
2. Open the project in your preferred IDE or compile the `.java` files using the command line:
   ```bash
   javac *.java
   ```
3. Run the `Driver` class to start the Blackjack game:
   ```bash
   java Driver
   ```

## Usage

1. **Starting the Game**: After running the `Driver.java` class, the game will initialize and prompt human players for input.
2. **Playing as a Human**: Players can decide whether to hit, stand, or perform other Blackjack actions (e.g., split, double down, etc., depending on the version you implemented).
3. **Computer Players**: Computer-controlled players follow the strategy defined in `MySimpleStrategy.java` or any other strategy class that implements the `BlackjackStrategy` interface.
4. **Dealer Logic**: The dealer automatically plays by hitting until their hand totals at least 17 points.
5. **Game Results**: Once all players and the dealer have completed their turns, the results are displayed, indicating which player won or lost.

## Key Concepts
- **Object-Oriented Programming**: This project uses OOP principles such as inheritance, interfaces, and polymorphism. The `BlackjackPlayer` class is extended by `HumanBlackjackPlayer` and `ComputerBlackjackPlayer`, promoting code reusability.
- **Game AI**: The `ComputerBlackjackPlayer` makes decisions based on strategies, showcasing basic AI concepts.
- **Deck of Cards**: The `PlayingCard` class and the management of hands demonstrate how to simulate a real-life deck of cards and gameplay mechanics in code.

## Future Improvements
- **Advanced AI Strategies**: Implement more sophisticated strategies for computer players to enhance their decision-making during gameplay.
- **Graphical User Interface (GUI)**: Add a graphical interface to replace the command-line input/output, making the game more interactive and user-friendly.
- **Multiplayer Support**: Expand the game to allow multiple human players to join and play simultaneously.
- **Betting System**: Introduce a betting system where players can place bets before each round and track winnings or losses.

## Contact Information
For any questions, issues, or contributions, feel free to reach out:

- **Email**: [jimingchen2015@gmail.com](mailto:jimingchen2015@gmail.com)
- **GitHub**: [Jiming-C](https://github.com/Jiming-C)

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

Thank you for checking out this project! If you're interested in contributing or have any suggestions for improvement, feel free to open a pull request or contact me directly.
```
