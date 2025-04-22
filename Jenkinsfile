pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'javac Demo.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java Demo'
            }
        }
    }
    post {
        success {
            echo 'Build and execution completed successfully'
        }
        failure {
            echo 'Pipeline failed - check logs for details'
        }
    }
}
