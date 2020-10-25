public class BankApplications {
    private String name;
    private String country;
    private Worker[]workers = new Worker[100];
    private int sizeofWorkers = 0;

    public BankApplications(){

    }
    public BankApplications(String name,String country){
        this.name = name;
        this.country = country;
    }
    public void addWorker(Worker worker){
        workers[sizeofWorkers] = worker;
        sizeofWorkers++;
    }
    public void listWorkers(){
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getName() + " " + workers[i].getSurname());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
