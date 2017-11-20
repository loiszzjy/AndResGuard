package com.tencent.gradle

/**
 * Created by simsun on 5/13/16.
 */

class BuildInfo {
    def file
    def signConfig
    def packageName
    def buildType

    BuildInfo(file, sign, packageName, buildType) {
        this.file = file
        this.signConfig = sign
        this.packageName = packageName
        this.buildType = buildType
    }

    @Override
    String toString() {
        """| file = ${file}
           | packageName = ${packageName}
           | buildType = ${buildType}
        """.stripMargin()
    }
}
