package proyecto.creadores;

public interface ITipoPunto {

	public abstract void setInfo(String[] datos);

	public abstract String[] getInfo();

	public abstract boolean equals(Object obj);

	public abstract int hashCode();

	public abstract String toString();
}
