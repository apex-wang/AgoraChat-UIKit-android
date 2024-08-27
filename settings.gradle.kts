pluginManagement {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        google()
        mavenCentral()
    }
}

include(":app")
include(":ease-im-kit")

//include(":hyphenatechatsdk")
//project(":hyphenatechatsdk").projectDir = File("../emclient-android/hyphenatechatsdk")

//include(":ease-linux")
//project(":ease-linux").projectDir = File("../emclient-linux")
