package jp.nagano.northfield.sensormonitor.sensor.position

import android.hardware.Sensor
import jp.nagano.northfield.sensormonitor.sensor.SensorInterface

class GeomagneticRotationVectorSensor : SensorInterface {
    override val name = Sensor.STRING_TYPE_GEOMAGNETIC_ROTATION_VECTOR
    override val type = Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR

    override fun getString(data: FloatArray): String {
        return """
        x*sin(θ/2): ${data[0]}
        y*sin(θ/2): ${data[1]}
        z*sin(θ/2): ${data[2]}
        """.trimIndent()
    }
}