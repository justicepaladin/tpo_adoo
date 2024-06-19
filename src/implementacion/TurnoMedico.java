package implementacion;

import java.util.Date;

public class TurnoMedico {
Paciente cliente;

	int id;
	
	Medico medicoAsignado;
	
	double costoTotal;
	
	int complejidad;
	
	Date fechaHora;
	
	String estado;
	
	String motivoConsulta;

	public TurnoMedico(int id, Paciente cliente, Medico medicoAsignado, double costoTotal, int complejidad,
			Date fechaHora, String estado, String motivoConsulta) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.medicoAsignado = medicoAsignado;
		this.costoTotal = costoTotal;
		this.complejidad = complejidad;
		this.fechaHora = fechaHora;
		this.estado = estado;
		this.motivoConsulta = motivoConsulta;
	}

	public Paciente getCliente() {
		return cliente;
	}

	public void setCliente(Paciente cliente) {
		this.cliente = cliente;
	}

	public Medico getMedicoAsignado() {
		return medicoAsignado;
	}

	public void setMedicoAsignado(Medico medicoAsignado) {
		this.medicoAsignado = medicoAsignado;
	}

	public double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public int getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
