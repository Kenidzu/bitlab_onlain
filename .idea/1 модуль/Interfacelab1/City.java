public class City {
    private Restaurant[] allRestaurants = new Restaurant[50];

    private int restaurantSize = 0;

    private String cityName;

    public City() {

    }

    public City(String cityName){
        this.cityName = cityName;
    }

    public void addRestaurant(Restaurant restaurant){
        allRestaurants[restaurantSize] = restaurant;
        restaurantSize++;
    }

    public double getTotalTax(){
        double rezult = 0;
        for (int i = 0; i < allRestaurants.length; i++) {
            rezult = ((allRestaurants[i].getTotalIncome() - allRestaurants[i].getTotalOutcome())*0.15);
        }
        return rezult;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
