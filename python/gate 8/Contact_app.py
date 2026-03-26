def add_contact(first_name, last_name, phone_number, contact_list):
    contact = {
        "first_name": first_name,
        "last_name": last_name,
        "phone_number": phone_number
    }
    contact_list.append(contact)
    return "Contact added successfully"


def check_length_of_phone_number(phone_number):
    return len(phone_number) == 11


def delete_contact_with_phone_number(phone_number, contact_list):
    for contact in contact_list:
        if contact["phone_number"] == phone_number:
            contact_list.remove(contact)
            return "Contact removed successfully"
    return "Contact not found"


def search_for_contact_using_phone_number(phone_number, contact_list):
    for contact in contact_list:
        if contact["phone_number"] == phone_number:
            return contact
    return "Contact not found"



def search_for_contact_using_first_name(first_name, contact_list):
    results = []
    for contact in contact_list:
        if contact["first_name"].lower() == first_name.lower():
            results.append(contact)
    return results



def search_for_contact_using_last_name(last_name, contact_list):
    results = []
    for contact in contact_list:
        if contact["last_name"].lower() == last_name.lower():
            results.append(contact)
    return results


def edit_contact(first_name, last_name, phone_number, contact_list):
    for contact in contact_list:
        if contact["phone_number"] == phone_number:
            contact["first_name"] = first_name
            contact["last_name"] = last_name
            return "Contact edited successfully"
    return "Contact not found"


def main():
    print("Welcome to Phase Gate Contact App")
    contact_list = []   
    choice = 0

    while choice != 7:
        print("\n===== Contact App Menu =====")
        print("1. Add a contact")
        print("2. Delete a contact")
        print("3. Search for contact using phone number")
        print("4. Search for contact using first name")
        print("5. Search for contact using last name")
        print("6. Edit contact")
        print("7. Exit")

        choice = int(input("Enter your choice: "))  

        if choice == 1:
            first_name = input("Enter first name: ")
            last_name = input("Enter last name: ")

            while True:
                phone_number = input("Enter phone number: ")

                if not phone_number.isdigit():
                    print("Phone number must contain only digits.")
                    continue

                if len(phone_number) != 11:
                    print("Phone number must be exactly 11 digits.")
                    continue

                break

            print(add_contact(first_name, last_name, phone_number, contact_list))

        elif choice == 2:
            phone_number = input("Enter phone number to delete: ")
            print(delete_contact_with_phone_number(phone_number, contact_list))

        elif choice == 3:
            phone_number = input("Enter phone number: ")
            print(search_for_contact_using_phone_number(phone_number, contact_list))

        elif choice == 4:
            first_name = input("Enter first name: ")
            print(search_for_contact_using_first_name(first_name, contact_list))

        elif choice == 5:
            last_name = input("Enter last name: ")
            print(search_for_contact_using_last_name(last_name, contact_list))

        elif choice == 6:
            phone_number = input("Enter phone number of contact to edit: ")
            first_name = input("Enter new first name: ")
            last_name = input("Enter new last name: ")
            print(edit_contact(first_name, last_name, phone_number, contact_list))

        elif choice == 7:
            print("Goodbye!")

        else:
            print("Invalid choice. Try again.")
main()
