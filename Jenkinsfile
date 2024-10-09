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

        stage('package') {
            steps {
                sh './mvnw package -Dmaven.test.skip'
            }
        }

        stage('deploy') {
            steps {
                deploy adapters: [tomcat9(url: 'http://localhost:8080/', 
                              credentialsId: 'tomcat')], 
                     war: 'target/*.war',
                     contextPath: 'app'

            }
        }
    }
}