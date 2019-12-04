package isLongitudeLatitudeValidated

fun main(args: Array<String>) {
    val service = Service()
    service.consume()

}


class EquipmentLocation(val id: String,
                        var latitude: Double?,
                        var longitude: Double?,
                        val timestamp: Long,
                        val site: String?) {

    constructor(name: String, timestamp: Long, site: String?) : this(name, null, null, timestamp, site)

    override fun toString(): String {
        return "EquipmentLocation(id='$id', latitude=$latitude, longitude=$longitude, timestamp=$timestamp, site=$site)"
    }
}

class Service{
    private val maxLongitude = 180
    private val minLongitude = -180
    private val maxLatitude = 90
    private val minLatitude = -90

    fun consume() {
        val locations = mutableMapOf<String, EquipmentLocation>()
        val equipmentLocation1 = EquipmentLocation("DR3045", -30.00, 120.00, 1575404051, "MAC")
        val equipmentLocation2= EquipmentLocation("DR3013", 11598.78, 85926.96, 1575409944, "ER")
        val equipmentLocation3= EquipmentLocation("DR3088", null, 85926.96, 1575409944, "ER")
        val equipmentLocation4= EquipmentLocation("DR3066", 11598.78, null, 1575409944, "ER")
        val equipmentLocation5= EquipmentLocation("DR3022", -90.00, 120.00, 1575409944, "ER")
        locations.put("DR3045", equipmentLocation1)
        locations.put("DR3013", equipmentLocation2)
        locations.put("DR3088", equipmentLocation3)
        locations.put("DR3066", equipmentLocation4)
        locations.put("DR3022", equipmentLocation5)

        locations.values.filter { isLongitudeLatitudeValidated(it.longitude, it.latitude) }.forEach {
            println("${it.id}, ${it.longitude!!}, ${it.latitude!!}, ${it.timestamp}")
        }
    }

    private fun isLongitudeLatitudeValidated(longitude: Double?, latitude: Double?): Boolean {
        if (longitude == null) {
            return false
        }

        if (latitude == null) {
            return false
        }

        return ((longitude > minLongitude && longitude < maxLongitude) && (latitude > minLatitude && latitude < maxLatitude))
    }
}
