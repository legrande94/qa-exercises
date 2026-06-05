pipeline {

    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-22'
            args '-e MAVEN_CONFIG=/tmp/.m2'
        }
    }

    stages {
        stage('Build') {
            steps {
                sh '''
                    mkdir -p /tmp/.m2
                    mvn clean test
                '''
            }
        }
    }
}