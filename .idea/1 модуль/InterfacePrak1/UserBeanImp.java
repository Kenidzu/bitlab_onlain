import User;

public class UserBeanImp implements UserBean{
    private Users[]users;

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    @Override
    public void getAllUser() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname().equals(surname)){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }
}
