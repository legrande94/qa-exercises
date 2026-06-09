pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn -version'

                sh '''
                   mkdir -p /tmp/.m2

                   mvn clean test \
                   -Dmaven.repo.local=/tmp/.m2
                '''
            }
        }
    }
}