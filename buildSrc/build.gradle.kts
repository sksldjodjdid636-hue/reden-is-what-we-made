plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    maven {
        name = "Fabric"
        url = uri("https://maven.fabricmc.net/")
    }
}

dependencies {
    // 添加mapping-io依赖
    compileOnly("net.fabricmc:mapping-io:0.7.1") // runtime version comes from Loom
    implementation("net.fabricmc:tiny-mappings-parser:0.3.0+build.17")

    // 添加其他需要的依赖
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
}
