plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"


dependencies {

    implementation(libs.androidx.room.common)
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}