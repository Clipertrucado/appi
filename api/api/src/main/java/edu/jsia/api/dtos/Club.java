package edu.jsia.api.dtos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "clubs", schema = "dlk_api") // Nombre de la tabla en la base de datos
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_club") // Nombre de la columna en la base de datos
    private Long id;

    @NotBlank(message = "El nombre del club no puede estar vacío")
    @Column(name = "nombre_club", length = 255, nullable = false)
    private String nombreClub;

    @NotBlank(message = "El email del club no puede estar vacío")
    @Column(name = "mail_club", length = 255, nullable = false)
    private String mailClub;

    @NotBlank(message = "La contraseña del club no puede estar vacía")
    @Column(name = "contrasenya_club", length = 255, nullable = false)
    private String contrasenyaClub;

    @Column(name = "colores_club", length = 255)
    private String coloresClub;

    @Column(name = "descripcion_club", length = 255)
    private String descripcionClub;

    @Column(name = "localizador_club", length = 255)
    private String localizadorClub;

    @Column(name = "fechaAlta_club")
    private java.sql.Date fechaAltaClub;


    // Constructor vacío requerido por JPA
    public Club() {
    }

    // Constructor con parámetros
    public Club(String nombreClub, String mailClub, String contrasenyaClub, String coloresClub, 
                String descripcionClub, String localizadorClub, java.sql.Date fechaAltaClub) {
        this.nombreClub = nombreClub;
        this.mailClub = mailClub;
        this.contrasenyaClub = contrasenyaClub;
        this.coloresClub = coloresClub;
        this.descripcionClub = descripcionClub;
        this.localizadorClub = localizadorClub;
        this.fechaAltaClub = fechaAltaClub;
       
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getMailClub() {
        return mailClub;
    }

    public void setMailClub(String mailClub) {
        this.mailClub = mailClub;
    }

    public String getContrasenyaClub() {
        return contrasenyaClub;
    }

    public void setContrasenyaClub(String contrasenyaClub) {
        this.contrasenyaClub = contrasenyaClub;
    }

    public String getColoresClub() {
        return coloresClub;
    }

    public void setColoresClub(String coloresClub) {
        this.coloresClub = coloresClub;
    }

    public String getDescripcionClub() {
        return descripcionClub;
    }

    public void setDescripcionClub(String descripcionClub) {
        this.descripcionClub = descripcionClub;
    }

    public String getLocalizadorClub() {
        return localizadorClub;
    }

    public void setLocalizadorClub(String localizadorClub) {
        this.localizadorClub = localizadorClub;
    }

    public java.sql.Date getFechaAltaClub() {
        return fechaAltaClub;
    }

    public void setFechaAltaClub(java.sql.Date fechaAltaClub) {
        this.fechaAltaClub = fechaAltaClub;
    }


    // Método toString (opcional)
    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", nombreClub='" + nombreClub + '\'' +
                ", mailClub='" + mailClub + '\'' +
                ", contrasenyaClub='" + contrasenyaClub + '\'' +
                ", coloresClub='" + coloresClub + '\'' +
                ", descripcionClub='" + descripcionClub + '\'' +
                ", localizadorClub='" + localizadorClub + '\'' +
                ", fechaAltaClub=" + fechaAltaClub +'}';
    }
}
