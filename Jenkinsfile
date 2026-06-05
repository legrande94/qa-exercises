pipeline {

    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-22'
        }
    }

    stages {

        stage('Build') {
            steps {
                sh '''
                    export HOME=/tmp
                    mkdir -p /tmp/.m2
                    mvn clean test -Dmaven.repo.local=/tmp/.m2
                '''
            }
        }
    }
}