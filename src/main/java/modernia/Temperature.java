package modernia;

public class Temperature {
  private String city;
  private double max;
  private double min;

  public Temperature(String city, double max, double min) {
    this.city = city;
    this.max = max;
    this.min = min;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getMax() {
    return max;
  }

  public void setMax(double max) {
    this.max = max;
  }

  public double getMin() {
    return min;
  }

  public void setMin(double min) {
    this.min = min;
  }
}
