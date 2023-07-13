package modernia;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

import java.util.Optional;

@Path("/saludar")
public class EcoResource {
    @GET
    public String saludar(@QueryParam("nombre") String nombre) {
        return Optional.ofNullable(nombre)
            .map((n) -> "Hola " + n)
            .orElse("Hola");
    }

    @GET
    @Path("/{nombre}")
    public String saludar2(@PathParam("nombre") String nombre) {
        return Optional.ofNullable(nombre)
            .map((n) -> "Hola " + n)
            .orElse("Hola");
    }
}
