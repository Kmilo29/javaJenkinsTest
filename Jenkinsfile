pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn -DskipTest clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
