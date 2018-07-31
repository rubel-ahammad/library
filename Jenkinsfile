pipeline {
  	agent any
	tools {
		gradle 'GRADLE_LATEST'
	}
	stages {
	    stage('Build') {
	        steps {
	            sh './gradlew clean build'
	        }
	    }
	    stage('Test') {
	        steps {
	            sh './gradlew test'
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