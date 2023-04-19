import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Equipo extends Partido{
    private String nombre;


    public Equipo(String nombre) {
        super();


        this.nombre = nombre;
    }

    public Equipo() {
    }


    public String getNombre() {
        return nombre;
    }

}