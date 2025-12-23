// src/com/sbc/utils/GitHelper.groovy
package com.sbc.utils

class GitHelper {
    static def getLatestTag() {
        return sh(script: 'git describe --tags --abbrev=0', returnStdout: true).trim()
    }
    
    static def getCommitHash() {
        return sh(script: 'git rev-parse HEAD', returnStdout: true).trim()
    }
}
