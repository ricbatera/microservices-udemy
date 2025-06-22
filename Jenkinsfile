pipeline {
    agent any

    environment {
        REGISTRY = "ricardo1782"
        COMPOSE_FILE = "docker-compose.yml"
    }

    stages {
        stage('Clonar código') {
            steps {
                git branch: 'main', url: 'https://github.com/ricbatera/microservices-udemy.git'
            }
        }

        stage('Compilar serviços') {
            steps {
                dir('cambio-service') {
                    sh 'mvn clean package -DskipTests'
                }
                dir('book-service') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Docker Images') {
            steps {
                sh 'docker-compose build'
            }
        }

        stage('Subir Stack') {
            steps {
                sh 'docker-compose down'
                sh 'docker-compose up -d'
            }
        }
    }

    post {
        success {
            echo '✅ Stack atualizada com sucesso!'
        }
        failure {
            echo '❌ Ocorreu um erro na pipeline. Verifique os logs!'
        }
    }
}
