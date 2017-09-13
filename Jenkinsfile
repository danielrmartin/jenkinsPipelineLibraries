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
        libraryResource 'common'
        sh 'echo hello'
      }
    }
  }
}