pipeline {

    agent any

    environment {
        MAVEN_REPO = '/tmp/.m2'
    }

    stages {

        stage('Environment Info') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Build') {
            steps {
                sh '''
                    mkdir -p $MAVEN_REPO

                    mvn clean compile \
                      -Dmaven.repo.local=$MAVEN_REPO
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                    mvn test \
                      -Dmaven.repo.local=$MAVEN_REPO
                '''
            }
        }
    }
}