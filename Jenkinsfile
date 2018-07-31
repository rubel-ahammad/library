pipeline {
  	agent any
	tools {
		gradle 'GRADLE_LATEST'
	}
	stages {
	    stage('Build') {
	        steps {
	            sh './gradlew build'
	        }
	    }
	    stage('Publish') {
	        steps {
	            sh './gradlew publish'
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