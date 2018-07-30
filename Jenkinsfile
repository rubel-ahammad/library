pipeline {
    agent any
    tools {
        gradle "GRADLE_LATEST"
    }
    stages {
        stage('build') {
            steps {
                sh 'gradle --version'
                //sh './gradlew clean build'
                echo "The build stage passed..."
            }
        }
    }
}