package modernia;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.Arrays;
import java.util.List;

@Path("/temperatura")
public class TemperatureResource {
  @GET
  public Temperature getTemperature() {
    return new Temperature("Madrid", 30.0, 20.0);
  }

  @GET
  @Path("/todos")
  public List<Temperature> getAll() {
    return List.of(
        new Temperature("Madrid", 30.0, 20.0),
      new Temperature("Barcelona", 28.0, 18.0),
        new Temperature("Sevilla", 35.0, 25.0),
        new Temperature("Valencia", 32.0, 22.0),
        new Temperature("Bilbao", 25.0, 15.0)
    );

  }

}
