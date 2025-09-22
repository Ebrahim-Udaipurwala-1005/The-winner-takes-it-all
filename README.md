# The winner takes it all

This project is a solution to the "The winner takes it all" exercise for the **INHN0002 Fundamentals of Programming** course, taught by Prof. Dr. Stefan Wagner. This assignment was a comprehensive exercise in **Object-Oriented Programming (OOP)**, with the goal of implementing a game engine model based on a detailed class hierarchy.

---

## Solution Overview

The solution models a game engine system with a clear separation of concerns between player characters, their abilities, and items. The implementation follows the provided UML class diagram to define abstract classes, interfaces, and concrete classes that work together to simulate combat. 

---

## Implemented Functionalities

The solution addresses each part of the assignment by implementing the classes and their methods as specified.

### 1. `Ability` Class

The `Ability` class describes a player's fight capabilities. The implementation includes:
* **Private Attributes**: All class attributes (`name`, `specification`, `damage`, `heal`, `armor`) are private with corresponding getters.
* **Constructor**: A constructor handles the initialization of an ability based on the character's specification (e.g., "Mage," "Tank," "Healer," or "Warrior").
* **Attribute Logic**: The constructor sets the `damage`, `heal`, and `armor` attributes based on a provided table. For attributes not used by a specific character type (e.g., `heal` for a Mage), the value is set to `-1`.

### 2. `Items` (`Item`, `Armor`, `Weapon`)

The item system is implemented using an abstract base class with protected members and concrete subclasses.
* **`Item` Class**: This is an abstract class with protected attributes and a constructor. By default, an item is not equipped (`equipped` is `false`).
* **`Armor` and `Weapon`**: These concrete subclasses inherit from `Item` and have public constructors for proper initialization.

### 3. Player Characters (`Player`, `Mage`, `Tank`, `Healer`, `Warrior`)

The player character hierarchy consists of an abstract `Player` class and four concrete subclasses.
* **`Player` Class**: An abstract base class with protected attributes (`name`, `health`, etc.) and methods like `isDead()`. The `isDead()` method checks if a player's health is less than or equal to `0`. The `equipItems()` method correctly equips all `Armor` items and a single `Weapon`.
* **Subclasses**: Each subclass implements the `attack()` and `useAbility()` methods from the `Interactions` interface, with logic specific to their role:
    * **`Mage`**: `attack()` uses intelligence and weapon damage. `useAbility()` uses the `spirit` attribute to determine its effect.
    * **`Tank`**: `attack()` uses strength and weapon damage. `useAbility()` applies a shield to mitigate damage.
    * **`Healer`**: `attack()` uses intelligence and weapon damage. `useAbility()` heals a target based on the player's `spirit` and the ability's `heal` value.
    * **`Warrior`**: `attack()` uses strength and weapon damage. `useAbility()` temporarily increases the warrior's damage.
* **`setDamage()`**: The `Warrior` subclass implements this method, which calculates damage based on weapon damage and strength.

### 4. Fighting and Damage

The core combat simulation is handled by the `fight()` method in the `Player` class. This method simulates a battle between two players, calling the `attack()` method on each player and reducing the target's health until one of them is `isDead()`. The process includes logging the combat actions to the console.
