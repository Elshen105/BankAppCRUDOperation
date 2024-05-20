public class Bank {
    public User[] users;
    public int size = 0;

    public Bank(int capacity) {
        users = new User[capacity];
        size = 0;
    }

    public void addUser(User user) {
        users[size++] = user;
    }

    public User[] getAllUsers() {
        User[] allUser = new User[size];
        for (int i = 0; i < size; i++) {
            allUser[i] = users[i];
        }
        return allUser;
    }

    public void updateUserById(int id, User user) {
        for (int i = 0; i < size; i++) {
            if (users[i].id == id) {
                users[i] = user;
                break;
            }
        }
    }


    public User getUserById(int id) {
        for (int i = 0; i < size; i++) {
            if (users[i].id == id) {
                return users[i];
            }
        }
        return null;
    }

    public void removeUserById(int id) {
        for (int i = 0; i < size; i++) {
            if (users[i].id == id) {
                for (int j = i; j < size - 1; j++) {
                    users[j] = users[j + 1];
                }
                size--;
                break;
            }
        }
    }
}