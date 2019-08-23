	package model.logic;

public class Nodo<r> 
{
	private r elemento;
	private Nodo<r> siguiente;
	private Nodo<r> anterior;

	public Nodo (r elemento)
	{
		siguiente = null;
		anterior = null;
		this.elemento = elemento;
	}
	public r buscarElemento()
	{
		return elemento;
	}
	public void seleccionarElemento(r Elemento)
	{
		this.elemento =elemento;
	}
	public Nodo<r> siguienteNodo(r elemento)
	{
		return siguiente;
	}
	public void fijarSiguiente(Nodo<r> elemento)
	{
		this.siguiente=siguiente;
	}
	public Nodo<r> darAnterior()
	{
		return anterior;
	}
	public void fijarAnterior(Nodo<r> elemento)
	{
		this.anterior=anterior;
	}
	public Nodo<r> eliminar()
	{
		Nodo<r>t = siguiente;
		siguiente=null;
		if(t !=null)
		{
			t.anterior=null;
		}
		return t;
	}
}
