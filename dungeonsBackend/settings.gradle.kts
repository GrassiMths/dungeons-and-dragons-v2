rootProject.name = "dungeonsBackend"

repositories {
    mavenCentral()
    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
}