pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Maven build or any build commands
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run Selenium tests
                    sh 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Build and deploy Docker container
                    sh 'docker build -t calculator-app .'
                    sh 'docker run -d -p 8080:8080 --name calculator-container calculator-app'
                }
            }
        }
    }
}
