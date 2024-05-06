pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withCredentials([usernameColonPassword(credentialsId: 'registry-creds')]) {
                sh """
                docker login -u $USERNAME -p $PASSWORD
                docker build . -t uudt/oracle-production:${env.BUILD_ID}
                """
              }
            }
        }
        stage('Run') {
            steps {
                sh "docker push uudt/oracle-production:${env.BUILD_ID}"
            }
        }
    }
}
