package dev.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Integer getIdEstudiante() {
        return this.idEstudiante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setIdEstudiante(final Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(final String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Estudiante)) {
            return false;
        } else {
            Estudiante other = (Estudiante)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$idEstudiante = this.getIdEstudiante();
                    Object other$idEstudiante = other.getIdEstudiante();
                    if (this$idEstudiante == null) {
                        if (other$idEstudiante == null) {
                            break label71;
                        }
                    } else if (this$idEstudiante.equals(other$idEstudiante)) {
                        break label71;
                    }

                    return false;
                }

                Object this$nombre = this.getNombre();
                Object other$nombre = other.getNombre();
                if (this$nombre == null) {
                    if (other$nombre != null) {
                        return false;
                    }
                } else if (!this$nombre.equals(other$nombre)) {
                    return false;
                }

                label57: {
                    Object this$apellido = this.getApellido();
                    Object other$apellido = other.getApellido();
                    if (this$apellido == null) {
                        if (other$apellido == null) {
                            break label57;
                        }
                    } else if (this$apellido.equals(other$apellido)) {
                        break label57;
                    }

                    return false;
                }

                Object this$telefono = this.getTelefono();
                Object other$telefono = other.getTelefono();
                if (this$telefono == null) {
                    if (other$telefono != null) {
                        return false;
                    }
                } else if (!this$telefono.equals(other$telefono)) {
                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email == null) {
                        return true;
                    }
                } else if (this$email.equals(other$email)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Estudiante;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $idEstudiante = this.getIdEstudiante();
        result = result * 59 + ($idEstudiante == null ? 43 : $idEstudiante.hashCode());
        Object $nombre = this.getNombre();
        result = result * 59 + ($nombre == null ? 43 : $nombre.hashCode());
        Object $apellido = this.getApellido();
        result = result * 59 + ($apellido == null ? 43 : $apellido.hashCode());
        Object $telefono = this.getTelefono();
        result = result * 59 + ($telefono == null ? 43 : $telefono.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public Estudiante() {
    }

    public Estudiante(final Integer idEstudiante, final String nombre, final String apellido, final String telefono, final String email) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String toString() {
        Integer var10000 = this.getIdEstudiante();
        return "Estudiante(idEstudiante=" + var10000 + ", nombre=" + this.getNombre() + ", apellido=" + this.getApellido() + ", telefono=" + this.getTelefono() + ", email=" + this.getEmail() + ")";
    }
}
