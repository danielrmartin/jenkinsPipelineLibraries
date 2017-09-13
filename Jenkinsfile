pipeline {
  agent {
    node {
      label 'maven-jdk-8'
    }
    
  }
  stages {
    stage('build') {
      steps {
        sh 'mvn -version'
      }
    }
    stage('test') {
      steps {
        sh 'echo hello'
      }
    }
  }
}