public class Main {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();

        myRestaurant.name = "Dog Haus";
        myRestaurant.waitTime = 10;
        myRestaurant.rating = 4.5;
        myRestaurant.avgMinPrice = 10;
        myRestaurant.avgMaxPrice = 20;
        myRestaurant.hoursOpenMF = "7:30am";
        myRestaurant.hoursClosedMF = "9pm";
        myRestaurant.hoursOpenSatSun = "8am";
        myRestaurant.hoursClosedSatSun = "9pm";


        System.out.println("Name: " + myRestaurant.name); //Name
        System.out.println("Wait Time: " + myRestaurant.waitTime + " minutes"); //Wait Time
        System.out.println("Rating: " + myRestaurant.rating + " out of 5"); //Rating (out of 5)
        System.out.println("Price: $" + myRestaurant.avgMinPrice + " to $" + myRestaurant.avgMaxPrice); //Price range ($x to $y)
        System.out.println("Hours Open:"); //Hours Open line
        System.out.println("MON " + myRestaurant.hoursOpenMF + " - " + myRestaurant.hoursClosedMF); //Mon hours
        System.out.println("TUE " + myRestaurant.hoursOpenMF + " - " + myRestaurant.hoursClosedMF); //Tues hours
        System.out.println("WED " + myRestaurant.hoursOpenMF + " - " + myRestaurant.hoursClosedMF); //Wed hours
        System.out.println("THU " + myRestaurant.hoursOpenMF + " - " + myRestaurant.hoursClosedMF); //Thurs hours
        System.out.println("FRI " + myRestaurant.hoursOpenMF + " - " + myRestaurant.hoursClosedMF); //Fri hours
        System.out.println("SAT " + myRestaurant.hoursOpenSatSun + " - " + myRestaurant.hoursClosedSatSun); //Sat hours
        System.out.println("SUN " + myRestaurant.hoursOpenSatSun + " - " + myRestaurant.hoursClosedSatSun); //Sun hours
    }
}
