class GestorClientes(
    val clientes : ArrayList<Cliente> = arrayListOf()
)

/*
Esto declara una nueva clase llamada GestorClientes. Esta clase se utilizará para administrar una lista de objetos Cliente.

val clientes: Esto declara una propiedad llamada clientes, que es una lista de objetos Cliente. Se inicializa con una lista vacía de Cliente.

ArrayList<Cliente>: Esto especifica el tipo de la propiedad clientes. Es una lista (ArrayList) que contiene objetos de la clase Cliente.

= arrayListOf():
Esto proporciona un valor predeterminado para la propiedad clientes. Si no se proporciona una lista al crear una instancia de GestorClientes, se utilizará una lista vacía como valor predeterminado.

 */
{
    // Método para agregar un cliente a la lista de clientes.
    fun agregar(cliente_a_añadir: Cliente):Boolean {
        return clientes.add(cliente_a_añadir)
    }

    fun clientesConNombre(nombreTemp:String) : ArrayList<Cliente> {
    // Crear una lista vacía para almacenar los clientes con el nombre dado.

        val clientesConNombre : ArrayList<Cliente> = ArrayList()
        // Crear una lista vacía para almacenar los clientes con el nombre dado.

        for (cliente_a_consultar in clientes) {
            if(cliente_a_consultar.nombre == nombreTemp) {
                clientesConNombre.add(cliente_a_consultar)
            }
            // Iterar a través de la lista de clientes y agregar aquellos con el nombre coincidente.
        }
        return clientesConNombre
        // Devolver la lista de clientes con el nombre dado.
    }
}

/*
Este código define la clase GestorClientes, que se utiliza para administrar una lista de objetos Cliente.
La clase tiene dos métodos principales: agregar para agregar clientes a la lista y clientesConNombre para
encontrar clientes con un nombre específico en la lista.
 */
