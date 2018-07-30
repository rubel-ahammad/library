pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh '.gradlew clean build'
                echo "The build stage passed..."
            }
        }
    }
}