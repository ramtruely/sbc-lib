// vars/utils.groovy - Main utility functions
def call() {
    return [
        git: gitHelper(),
        deploy: deploy(),
        validate: validate()
    ]
}

def gitHelper() {
    return load "src/com/sbc/utils/GitHelper.groovy"
}

def deploy() {
    return load "src/com/sbc/pipeline/Deployer.groovy"
}

def validate() {
    return load "src/com/sbc/pipeline/Validator.groovy"
}
