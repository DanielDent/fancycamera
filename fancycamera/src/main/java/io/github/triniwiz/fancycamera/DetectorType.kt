package io.github.triniwiz.fancycamera

enum class DetectorType(private val type: String) {
    Barcode("barcode"), DigitalInk("digitalInk"), Face("face"), Image("image"), Object("object"), Pose(
        "pose"
    ),
    Text("text"), All("all"), Selfie("selfie"), None("none");


    companion object {
        fun fromInt(value: Int): DetectorType? {
            return when (value) {
                0 -> Barcode
                1 -> DigitalInk
                2 -> Face
                3 -> Image
                4 -> Object
                5 -> Pose
                6 -> Text
                7 -> All
                8 -> Selfie
                9 -> None
                else -> null
            }
        }
    }

    override fun toString(): String {
        return type
    }
}