pipeline {
    agent {
        label 'linux' // or whatever label your Linux agents have
    }

    stages {
        stage('Compile') {
            steps {
                sh 'javac Demo.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java Demo'
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
