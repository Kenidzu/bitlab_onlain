public class ERPSystem {
    private User []memory = new User[1000];
    private int sizeOfUsers = 0;

    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    };

    public void printAllUsers(){
        for (int i = 0; i < memory.length; i++) {
            System.out.println(memory[i].getUserData());
        }
    };
    public void printUser(int index){
        if (index < memory.length) {
            System.out.println(memory[index].getUserData());
        }
        else {
            System.out.println("No user in this index");
        }
    }
}
