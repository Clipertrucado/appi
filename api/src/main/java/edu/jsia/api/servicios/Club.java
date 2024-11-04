package edu.jsia.api.servicios;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clubs")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClub;

    @Column(nullable = false)
    private String nombreClub;

    @Column(nullable = false, unique = true)
    private String mailClub;

    @Column(nullable = false)
    private String contrasenyaClub;

    private String coloresClub;
    private String descripcionClub;
    private String localizadorClub;

    private LocalDate fechaAltaClub;

    
	public Long getIdClub() {
		return idClub;
	}

	public void setIdClub(Long idClub) {
		this.idClub = idClub;
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

	public LocalDate getFechaAltaClub() {
		return fechaAltaClub;
	}

	public void setFechaAltaClub(LocalDate fechaAltaClub) {
		this.fechaAltaClub = fechaAltaClub;
	}

    
    // Getters y setters...
}
