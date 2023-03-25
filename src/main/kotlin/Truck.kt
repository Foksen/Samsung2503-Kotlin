class Truck(
    override val color: String,
    override val price: Float,
    override val maxSpeed: Float,
) : Car(color, price, maxSpeed) {

    var currentLoad = 0
    override fun load() {
        currentLoad = 100
    }

    override fun toString(): String {
        return "Truck(color='$color', price=$price, maxSpeed=$maxSpeed, currentLoad=$currentLoad)"
    }
}