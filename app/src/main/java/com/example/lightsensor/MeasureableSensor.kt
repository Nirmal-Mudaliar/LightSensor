package com.example.lightsensor

abstract class MeasureableSensor(
    protected val sensorType: Int
) {

    protected var onSensorValuesChanged: ((List<Float>) -> Unit)? = null

    abstract val doesSensorExist: Boolean

    abstract fun startListening()
    abstract fun stopListening()

    fun setOnSensorValueChangeListener(listener: (List<Float>) -> Unit) {
        onSensorValuesChanged = listener
    }
}