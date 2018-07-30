pipeline {
    agent any
    tools {
        gradle "GRADLE_LATEST"
    }
    stages {
        stage('build') {
            steps {
                sh 'gradle --version'
<<<<<<< HEAD
                //sh './gradlew clean build'
=======
                sh './gradlew clean build'
>>>>>>> branch 'master' of https://github.com/rubel-ahammad/library.git
                echo "The build stage passed..."
            }
        }
    }
}