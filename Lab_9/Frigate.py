# Frigate.py
from Lab_9.Ship import Ship
from Lab_9.Warship import Warship

# Define the Frigate class, inheriting from Ship
class Frigate(Ship):
    # Initialize the frigate with name, length, max_speed, and firepower attributes
    def __init__(self, name, length, max_speed, firepower):
        super().__init__(name, length, max_speed)
        self.firepower = firepower

    # Method to simulate the frigate firing its cannons
    def fire_cannons(self):
        print(f"The {self.name} is firing its cannons with {self.firepower} firepower!")

    def print_info(self):
        super().print_info()
        print(f"Firepower: {self.firepower}")

class Frigate(Warship):
    def __init__(self, sound, shoot):
        super().__init__(shoot)
        self.sound = sound

    def sound_cannons(self):
        print(f" Set {self.name} and  {self.sound} *BOOM*")


  def print_info(self):
        super().print_info()
        print(f"Shooting now: {self.sound}")
# Test the Frigate class
if __name__ == "__main__":
    my_frigate = Frigate("Defender", 150, 25, "high", "loud sound")
    my_frigate.print_info()
    my_frigate.sail()
    my_frigate.anchor()
    my_frigate.fire_cannons()
    my_frigate.sound_cannons()
