// vars/deploy.groovy - Deployment pipeline steps
def toEnvironment(env, appName, version) {
    echo "Deploying ${appName}:${version} to ${env}"
    sh """
        docker build -t ${appName}:${version} .
        docker tag ${appName}:${version} ${appName}:${env}
        docker push ${appName}:${env}
    """
}
