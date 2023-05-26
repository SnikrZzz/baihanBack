package baihan.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	private Long cedula;
	
	private String nombre;
	private String correo;
	private String password;
	private Long telefono;
	private String direccion;
	private String descripcion;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long cedula, String nombre, String correo, String password, Long telefono, String direccion,
			String descripcion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.telefono = telefono;
		this.direccion = direccion;
		this.descripcion = descripcion;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "Customer [cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", password=" + password
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", descripcion=" + descripcion + "]";
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
