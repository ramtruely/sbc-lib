// vars/testUtils.groovy - Testing helpers
def runUnitTests() {
    sh 'mvn test || ./gradlew test'
    publishTestResults()
}

def publishTestResults() {
    junit '**/target/surefire-reports/*.xml'
}
