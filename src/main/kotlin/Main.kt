fun main() {

    val cliente1 = Cliente("Facu","Pepino","Mitre")
    val cliente2 = Cliente("Santi","Villa","Roca")
    val cliente3 = Cliente("Joa","Alarca","Garay")
    // Crear tres objetos Cliente con nombre, apellido y dirección.

    val gestorclientes = GestorClientes()
    // Crear una instancia de GestorClientes.

    // Agregar los objetos Cliente a la lista de clientes gestionada por GestorClientes.
    gestorclientes.agregar(cliente1)
    gestorclientes.agregar(cliente2)
    gestorclientes.agregar(cliente3)

    println("Listado de clientes")
    for (clienteTemp in gestorclientes.clientes){
        println(clienteTemp)
    }
    // Iterar a través de la lista de clientes en gestorclientes y mostrar cada cliente.

    // Buscar clientes con el nombre "Facu" utilizando el método clientesConNombre.
    val clientesEncontrados : List<Cliente> = gestorclientes.clientesConNombre("Facu")

    println("Listado de clientes encontrados")

    // Buscar clientes con el nombre "Facu" utilizando el método clientesConNombre.
    for (clienteTemp in clientesEncontrados){
        println(clienteTemp)
    }
}

