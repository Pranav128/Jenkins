pipeline{
    agent any

    stages{
        stage("compile"){
            steps{
                sh 'javac Demo.java'
            }
        }
        stage("run"){
            steps{
                sh 'java Demo'
            }
        }
    }
    post{
        success{
            echo "Done"
        }
        failure{
            echo "failed"
        }
    }
}
