def add_contact(first_name,last_name,phone_number):
    return contact addded successfully

def check_length_of_phone_number(phone_number):
    return phone_number

def delete_contact_with_phone_number(phone_number):
    return contact removed successfully

def search_for_contact_using_phone_number(phone_number)
    return contact

def search_for_contact_using_first_name(first_name)
    return contact

def search_for_contact_using_last_name(last_name)
    return contact

def edit_contact(first_name,last_name,phone_number)
    return edited_contact


def main():

print ("Welcome to Phase Gate Contact App")
contact_list = [100]
choice = 0
    while choice != 7:

        print("===== contact app Menu =====")
        print("1. Add a contact")
        print("2. Delete a contact")
        print("3. Search for contact using phone number")
        print("4. Search for contact using first name")
        print("5. Search for contact using last name")
        print("6.  Edit contact")
        print("7. Exit")
        choice = int(input("Enter your choice: "))
 

if choice ==1:
    First_name =input("Enter the first name of your contact")
    last_name =input("Enter the last name of your contact")
    phone_number =int(input("Enter the phone number of your contact")
    print(" please your contacts phone number length must be 11")
    for phone_number in range (len(phone_number)):
    if (len(phone_number == 11)):
        print("Valid contact length")
    else:
        print ("invalid phone number length")
    except ValueError:
        print(" Invalid input. Please enter a number.")
    if phone_number in contact_list:
        return True

    if phone_number not in contact_list:
        contact_list.append(phone_number)
    print("Contact saved successfully")



elif choice == 2:
    phone_number =int(input("Enter the phone number to be deleted")
    if phone_number not in contact_list:
        print ("There is no contact to be deleted ")
    elif phone_number in contact_list:
        contact_list.remove(phone_number)
    print("Contact has been deleted successfully")



elif choice ==3:
    
