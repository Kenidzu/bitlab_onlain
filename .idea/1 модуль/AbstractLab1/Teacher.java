public class Teacher extends User{
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    int sizeOfSubjects = 0;

    public Teacher() {

    }

    public Teacher( String nickName, String status) {
        this.nickName = nickName;
        this.status = status;
    }

    public void addsubjects(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    public String getUserData(){
        return getNickName() + " " + getStatus() + " " +getId() + " " + getLogin() + " " + getPassword();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }
}
