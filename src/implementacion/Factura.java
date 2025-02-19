package implementacion;

public class Factura {

	private Paciente paciente;
    private TurnoMedico turnoMedico;
    private int total;
    private int descuento;
    private int id;
    private static int incremental = 0;

    public Factura(Paciente paciente, TurnoMedico turnoMedico, int total, int descuento) {
        this.paciente = paciente;
        this.turnoMedico = turnoMedico;
        this.total = total;
        this.descuento = descuento;
        incremental++;
        this.id = incremental;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public TurnoMedico getTurnoMedico() {
        return turnoMedico;
    }

    public void setTurnoMedico(TurnoMedico turnoMedico) {
        this.turnoMedico = turnoMedico;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

	@Override
	public String toString() {
		return "Factura [paciente=" + paciente + ", turnoMedico=" + turnoMedico + ", total=" + total + ", descuento="
				+ descuento + "]";
	}

    public int getTotalConDescuento()
    {
        return (int) total - (total * (descuento/100));
    }

    public int getId() {
        return id;
    }
    
}
