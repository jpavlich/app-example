pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './mvnw clean compile'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
            }
        }

        stage('deploy') {
            steps {
                sh './mvnw package -Dmaven.test.skip'
                sh 'cp ./target/app.war /deploy'
            }
        }
    }
}