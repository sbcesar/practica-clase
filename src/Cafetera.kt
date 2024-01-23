class Cafetera(ubicacion: String) {
    var ubicacion: String = ubicacion
     var capacidad: Double = 1000.0
    private var cantidad: Double = 0.0


    constructor(ubicacion: String,capacidad: Double): this(ubicacion) {
        this.cantidad = this.capacidad
    }

    constructor(ubicacion: String,cantidad: Double,capacidad: Double): this(ubicacion) {
        this.capacidad = capacidad

        if (this.cantidad > capacidad) { this.cantidad = capacidad } else { this.cantidad = cantidad }
    }

    open fun llenar() {
        this.cantidad = this.capacidad
    }

    fun servirTaza(taza: Taza) {
        println("Sirviendo la taza...")
        readln()

        //Si la cafetera tiene café
        if (this.cantidad >= 0) {
            taza.cantidad = taza.capacidad
            this.cantidad -= taza.cantidad
        }

        //Si la cantidad de la cafetera no alcanza a llenar la taza
        if (this.cantidad < taza.capacidad) {
            taza.cantidad = this.cantidad
        }
    }

    fun vaciar() {
        this.cantidad = 0.0
        println("Vaciando la cafetera...")
        readln()
    }

    fun agregarCafe(cantidad: Double) {
        if (cantidad > this.capacidad) {
            llenar()
        } else {
            capacidad = cantidad
        }
        println("Agregando cafe...")
        readln()
    }

    override fun toString(): String {
        return "Cafetera(ubicacion='$ubicacion', capacidad=$capacidad, cantidad=$cantidad c.c.)"
    }
}