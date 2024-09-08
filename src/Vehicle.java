public class Vehicle {
  private String registrationNumber;
  private String brand;
  private String model;

  public Vehicle(String registrationNumber, String brand, String model) {

    // Checks out input for registration number to ensure we give it XXXYYY, X being a-z or A-Z and Y being 0-9
    // Validate registration number using regex
    if (!registrationNumber.matches("^[a-zA-Z]{3}[0-9]{3}$")) {
      throw new IllegalArgumentException("Invalid registration number format. Expected format is XXXYYY, where X is a-z or A-Z and Y is 0-9.");
    }

    this.registrationNumber = registrationNumber;
    this.brand = brand;
    this.model = model;
    
  }

  // GETTERS
    public String getRegistrationNumber() {
      return registrationNumber;
    }

    public String getBrand() {
      return brand;
    }

    public String getModel() {
      return model;
    }

    // SETTERS
    public void setRegistrationNumber(String registrationNumber) {

      // Another regex if we want to change the registration number on a certain vehicle.
      String regex = "^[a-zA-Z]{3}[0-9]{3}$";
      if (registrationNumber.matches(regex)) {
        this.registrationNumber = registrationNumber;
      } else {
        throw new IllegalArgumentException("Invalid registration number format");
      }
    }

    // Manipulate this string if you want a different output
    @Override
    public String toString() {
      return registrationNumber + " - " + brand + ", " + model;
    }
}
