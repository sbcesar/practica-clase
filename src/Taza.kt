class Taza(capacidad: Double,cantidad: Double) {
    private var color: Color = Color.BLANCO
    var capacidad: Double = 50.0
    var cantidad: Double = 0.0

    init {
        this.capacidad = capacidad
        ajustarCantidad(cantidad)
    }

    fun ajustarCantidad(cantidad: Double) {
        if (cantidad > this.capacidad) {
            this.cantidad = this.capacidad
        }
    }

    fun llenar() {
        this.cantidad = this.capacidad
    }
    fun llenar(cantidad: Double) {
        this.cantidad = cantidad
    }

    override fun toString(): String {
        return "Taza(color = ${this.color}, capacidad = ${this.capacidad} c.c., cantidad = ${this.cantidad} c.c.)"
    }
}

enum class Color {
    BLANCO,
    NEGRO,
    GRIS,
    AZUL,
    VERDE
}