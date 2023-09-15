# Gestor de Clientes

El **Gestor de Clientes** es una aplicación simple en Kotlin que permite administrar una lista de clientes. Cada cliente tiene un nombre, un apellido y una dirección. La aplicación permite agregar clientes y buscar clientes por nombre.

## Clases y Métodos

### `Cliente`

La clase `Cliente` representa un cliente con atributos de nombre, apellido y dirección. 

- Método `toString()`: Devuelve una representación en cadena del cliente en el formato "Apellido, Nombre - Dirección".

### `GestorClientes`

La clase `GestorClientes` gestiona una lista de clientes y ofrece las siguientes funcionalidades:

- Método `agregar(cliente)`: Permite agregar un cliente a la lista de clientes.

- Método `clientesConNombre(nombre)`: Busca y devuelve una lista de clientes con un nombre específico.

## Ejemplo de Uso

En el programa principal (`main`), se realizan las siguientes acciones:

1. Se crean tres clientes (`cliente1`, `cliente2`, `cliente3`).

2. Se instancia un `GestorClientes` llamado `gestorClientes`.

3. Se agregan los clientes a la lista de clientes del gestor.

4. Se muestra un listado de todos los clientes registrados.

5. Se busca y muestra un listado de clientes con un nombre específico ("Nom2").
