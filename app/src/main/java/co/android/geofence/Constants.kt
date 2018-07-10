package co.android.geofence

import java.util.*

object Constants {

  val GEOFENCE_EXPIRATION_IN_MILLISECONDS = (12 * 60 * 60 * 1000).toLong()
  val GEOFENCE_RADIUS_IN_METERS = 40f

  val LANDMARKS = HashMap<String, LatLng>()

  init {
    // My Office
    LANDMARKS.put("My Office", LatLng(16.816815, 96.131895))
    // Junction Square
    LANDMARKS.put("Junction Square", LatLng(16.8175568, 96.1312373))
  }


}

data class LatLng (val latitude: Double, val longitude: Double)
