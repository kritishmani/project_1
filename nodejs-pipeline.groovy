pipeline {
  agent { label 'worker_node1' }
  stages {
    stage('Source') { // Get code
      steps {
        // get code from our Git repository
        git 'https://github.com/kritishmani/node-unit-tests'
      }
    }
    stage('compile') { // Compile and do unit testing
      steps {
        // run Gradle to execute compile and unit testing
        sh 'npm install'
      }
    }
  }
}
