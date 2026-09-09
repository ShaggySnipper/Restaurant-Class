# Restaurant-Class
Restaurant Class Assignment

##Restaurant.java

Sets up the variables that can be defined in Main.java.
  
  String name - String variable because it's a non-numeric value
  
  int waitTime - chose int because most of the time, wait times are listed in minutes, and are whole numbers rather than including fractions.
  
  double rating - chose this because most places (on google) are using a 5 star rating system, but the ratings are averaged, often leading to 4.X ratings or similar.
  
  int avgMinPrice and int avgMaxPrice - chose int due to the price range being easier to understand in full dollar ammounts, and set up min and max independent variables to better represent the price ranges.
  
  String hoursOpen/ClosedAM/PM - Chose string arguments for this because if a restaurant is a morning or evening restaurant it could conflict with "am" and "pm". If AM and PM are the default, a breakfast place might be open from 5am to 10am, but with default settings it would show "5am to 10pm" - a string argument allows for custom input for am and pm.

  
##Main.java

Sets up myRestaurant, and has the variables defined for myRestaurant - then prints the information given.
