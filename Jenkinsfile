pipeline {

    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-22'
        }
    }

    stages {

        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
                sh 'mvn clean test'
            }
        }
    }
}