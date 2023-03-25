open class Car (                        // авто-конструктор, open - делает класс/поле доступным для наследования
    open val color: String = "white",    // атрибуты по умолчанию
    open val price: Float = 0f,          // если нужно приватное - пишем private перед val
    open val maxSpeed: Float = 100f
) {

    var occupiedSeats = 0
    open fun load() {
        occupiedSeats = 4
    }

    // override в котлине как модификатор перегрузки, а не как аннотация как в Java
    override fun toString(): String {
        return "Car(color='$color', price=$price, maxSpeed=$maxSpeed, occupiedSeats=$occupiedSeats)"
    }
}

