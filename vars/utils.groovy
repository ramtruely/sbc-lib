// vars/utils.groovy - REQUIRED for utils() to work
def call() {
    echo "Utils loaded successfully!"
    return [
        gitHelper: { -> load "src/com/sbc/utils/GitHelper.groovy" },
        deploy: { -> load "src/com/sbc/pipeline/Deployer.groovy" },
        validate: { -> load "src/com/sbc/pipeline/Validator.groovy" }
    ]
}
