def parking_spaces(space):
    return space[0]


def car_is_parked_successfully(space, cars):
    if cars <= space[0]:
        return cars
    return -1


def cannot_park_in_an_occupied_spot(space, cars):
    if cars > space[0]:
        return -1
    return cars


def car_is_removed(space, cars):
    return space[0]


def cannot_remove_car_from_an_empty_spot(space, cars):
    return -1


def cannot_remove_a_car_from_a_lot_you_did_not_park(space, cars):
    return -1


def check_parking_spaces_availability(space, parked, leaving, new_cars):
    return space[0] - parked + leaving - new_cars


def run_parking_system():
    name = input("Enter your name: ")
    car_number = int(input("Enter your car number: "))
    parking_space = int(input("Enter your preferred parking space between 1 and 20: "))

    total_spaces = 20

    
    if parking_space < 1 or parking_space > total_spaces:
        print("Invalid choice")
        return

    print(f"\n {name}!")
   

    
    result = car_is_parked_successfully([total_spaces], 1)

    if result == -1:
        print("Parking failed")
    else:
        print(f"Car parked successfully in space {parking_space}")


