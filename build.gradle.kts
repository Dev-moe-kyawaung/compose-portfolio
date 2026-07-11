plugins {
    kotlin("multiplatform") version "1.9.22"
    id("org.jetbrains.compose") version "1.5.12"
}

group = "dev.moekyawaung"
version = "1.0.0"

kotlin {
    wasmJs {
        moduleName = "portfolio"
        browser {
            commonWebpackConfig {
                outputFileName = "portfolio.js"
            }
        }
        binaries.executable()
    }
    
    sourceSets {
        val wasmJsMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                implementation(compose.components.resources)
            }
        }
    }
}

compose.experimental {
    web.application {}
}

