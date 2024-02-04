package cuentas;

/**
 * esta clase almacena los datos de cuentas corrientes.
 * 
 * @author Ministerio de Educacion
 * @version 1.0
 * @since 1.0
 */

public class CCuenta {
	
	
	/**
	 * declaracion de los atributos privados de la clase
	 */
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;


    /**
     * Listado de métodos privados de clase, de tipo Getter y Setter
     * que encapsulan los datos almacenados y limitan el acceso a los mismos a la llamada de
     * dichos metodos
     * Los metodos get* leen los valores de los atributos correspondientes al metodo
     * Los metodos set* devuelven el valor contenido en dichos atributos, usando parametros del 
     * mismo tipo de dato
     * @return valor del atributo solicitado
     */
    private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * constructor vacio de la clase CCuenta
	 */
    public CCuenta()
    {
    }
    /**
     * Constructor parametrado de la clase CCuenta
     * @param nom string que recoge el nombre del cliente
     * @param cue string que almacena el numero de cuenta
     * @param sal double que almacena el saldo actualizado 
     * @param tipo double que indica el tipo de interes asociado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Metodo de consulta del estado de la cuenta
     * @return valor de saldo almacenado en el momento de llamada del metodo
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Metodo que permite ingresar dinero en cuenta
     * @param cantidad dinero que se pretende ingresar en cuenta
     * @throws Exception arroja excepcion si la cantidad introducida es negativa
     * EN caso de introducir una cantidad positiva, actualiza el saldo  
     * sumando al saldo almacenado previamente la cantidad ingresada
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Metodo que permite retirar dinero de una cuenta
     * @param cantidad donde recoge la cantidad que se pretende retirar de la cuenta
     * @throws Exception impide la retirada de cuenta y lanza mensaje informativo 
     * en el caso de que la cantidad a retirar sea menor o igual a 0 , o en el 
     * caso de que se quiera retirar una cantidad mayor al saldo almacenado (usando el metodo de
     * clase estado()
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
