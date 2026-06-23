package nl.reggegroep.qrhunt.map

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.overlay.Marker
import java.util.Collections.emptyList

data class FoxLocation(
    val name: String = "",
    val position: GeoPoint = GeoPoint(0.0, 0.0),
    val lastUpdate: Int = 0 // in minutes
)

class MapViewModel: ViewModel() {
    private var _huntableMarkers : List<FoxLocation> = emptyList()
    var huntableMarkers: List<FoxLocation>
        get() = _huntableMarkers
        private set(value) { _huntableMarkers = value }

    init {
        huntableMarkers = foxLocations
    }
}

val foxLocations: List<FoxLocation> = listOf(
    FoxLocation (
        name = "Eekhoorns",
        GeoPoint(52.085100, 5.231700),  // Centrum Zeist
        lastUpdate = 3,
    ),
    FoxLocation(
        name = "Beren",
        position = GeoPoint(52.0923, 5.2461),  // Huis ter Heide
        lastUpdate = 4
    ),
    FoxLocation(
        name = "Vossen",
        position = GeoPoint(52.0764, 5.2198),  // Zeist-West
        lastUpdate = 1
    )
)