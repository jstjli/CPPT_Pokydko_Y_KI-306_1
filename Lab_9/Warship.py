# Warship.py

# Define the Warship class

class Warship:
    def __init__(self, shoot):
        self.shoot = shoot

        # Method to simulate the ship cannon shoot
    def shooting_sound(self):
            print("Shoot!")

    def print_info(self):
        print(f" Set cannon: {self.shooting_sound()} *BOOM*")

    # Test the Ship class
    if __name__ == "__main__":
        my_warship = Warship("")
        my_warship.print_info()
        my_warship.shooting_sound()
