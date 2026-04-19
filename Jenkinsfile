pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo 'Code Pulled'
            }
        }

        stage('Build Java') {
            steps {
                bat 'javac App.java'
            }
        }

        stage('Run Java') {
            steps {
                bat 'java App'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t myapp-java .'
            }
        }
    }
}