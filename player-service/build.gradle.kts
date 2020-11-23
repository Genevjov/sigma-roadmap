import com.google.protobuf.gradle.*

plugins {
    idea
    application
    kotlin("jvm") version "1.3.30"
    id("com.google.protobuf") version "0.8.8"

}

buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

repositories {
    google()
    mavenCentral()
    jcenter()
}

defaultTasks = listOf("run").toMutableList()

dependencies {
    implementation("io.grpc:grpc-netty-shaded:1.20.0")
    implementation("io.grpc:grpc-protobuf:1.20.0")
    implementation("io.grpc:grpc-stub:1.20.0")
    implementation("io.grpc:grpc-services:1.20.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-web:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.4.0")
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation("org.postgresql:postgresql:42.2.18")
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:2.3.2")
    implementation("org.glassfish.jaxb:jaxb-runtime:2.3.2")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.1.51")
    implementation("io.springfox:springfox-swagger-ui:2.9.2")
    implementation("io.springfox:springfox-swagger2:2.9.2")

    compileOnly("org.projectlombok:lombok:1.18.16")
    annotationProcessor("org.projectlombok:lombok:1.18.16")

    annotationProcessor("org.projectlombok:lombok:1.18.16")
    testImplementation("org.projectlombok:lombok:1.18.16")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.4.0")

    implementation(kotlin("stdlib-jdk8"))

    implementation("io.grpc:grpc-netty-shaded:1.20.0")
    implementation("io.grpc:grpc-protobuf:1.20.0")
    implementation("io.grpc:grpc-stub:1.20.0")
    implementation("io.grpc:grpc-services:1.20.0")

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    testImplementation("junit:junit:4.12")
}

// compile proto and gRPC
protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.7.1"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.20.0"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                id("grpc") {}
            }
        }
    }
}
