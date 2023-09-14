#create a dictionary and check username nad password found or not
users = {'user1': 'password1', 'user2': 'password2', 'user3': 'password3', 'user4': 'password4', 'user5': 'password5'}

username = input("Enter username: ")
password = input("Enter password: ")

if username in users.keys():
    print("Username and password found.")
else:
    print("Username or password not found.")
