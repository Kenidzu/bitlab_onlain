public class Main {
    public static void main(String[] args) {
        Users [] all = new Users[]{
                new Users("Kuanysh","Zhumayev"),
                new Users("Jonh","Neo"),
                new Users("Smith","Jonh"),
                new Users("Seka","Faizulin"),
                new Users("Seka","Smith"),
                new Users("Leksi","Smith"),
                new Users("Lutor","Jonh"),
                new Users("Aisulu","Smith"),
                new Users("Azamat","Smith"),
                new Users("Jonh","Lutor"),
        };
        UserBeanImp bean = new UserBeanImp(all);
        bean.getAllUser();
        bean.getUsersByName("Jonh");
        bean.getUsersBySurname("Smith");
    }
}
