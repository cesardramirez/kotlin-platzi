package main.kotlin.model

class Camera {

    private var isOn: Boolean = false
    private var resolution: Int = 640

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun getCameraStatus(): String {
        return if (isOn) "Camera is Turned" else "Camara is not Turned"
    }

    fun setCameraStatus(isOn: Boolean) {
        this.isOn = isOn
    }

    fun getResolution(): Int {
        return resolution
    }

    fun setResolution(resolution: Int) {
        this.resolution = resolution
    }
}
