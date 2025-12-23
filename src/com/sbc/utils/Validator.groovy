// src/com/sbc/pipeline/Validator.groovy
package com.sbc.pipeline

class Validator {
    static boolean validateBranch(branchName) {
        return branchName ==~ /(main|develop|release\/.*)/
    }
    
    static def getConfig() {
        return readJSON file: 'resources/config/default-pipeline.json'
    }
}
