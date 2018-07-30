pipeline {
  	agent any
	tools {
		gradle 'GRADLE_LATEST'
	}
	stages {
	    stage('build') {
	        steps {
	            sh './gradlew clean build'
	            echo "The build stage passed..."
	        }
	    }
	}
	post {
	    failure {
	        mail to: 'rubel@metatude.com',
	        subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
	        body: "Something is wrong with ${env.BUILD_URL}"
	    }
	}
}