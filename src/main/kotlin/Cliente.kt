class Cliente(
    var nombre: String,
    var apellido: String,
    var direccion: String
)
//Constructor de la clase Cliente que toma tres parámetros: nombre, apellido y dirección.

{
    override fun toString(): String {
        return ("$apellido - $nombre - $direccion")
    }
    /*
    Esta es una función de representación de cadena (override de toString()).
    Devuelve una cadena que representa al objeto Cliente en un formato específico.
    En este caso, la cadena contiene el apellido, nombre y dirección del cliente separados por guiones.
     */
}
