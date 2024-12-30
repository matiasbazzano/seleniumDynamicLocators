pipeline {
    agent any
    
    environment {
        JAVA_HOME = tool name: 'JDK 17', type: 'JDK'
        MAVEN_HOME = tool 'Maven 3'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/matiasbazzano/seleniumDynamicLocators.git'
            }
        }

        stage('Setup Java') {
            steps {
                script {
                    echo "Setting up Java version"
                    sh 'java -version'
                }
            }
        }

        stage('Cache Maven Dependencies') {
            steps {
                script {
                    echo "Caching Maven dependencies"
                    sh 'mvn dependency:go-offline'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    echo "Running Selenium tests"
                    sh 'mvn clean test'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished'
        }
    }
}