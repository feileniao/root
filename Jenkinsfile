pipeline {
  agent any
  tools {
          maven "MAVEN_HOME"
          jdk "JAVA_HOME"
      }
  stages {
    stage('source') {
      steps {
        git(changelog: true, poll: true, url: 'https://github.com/feileniao/root.git', branch: 'master')
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install -Dmaven.test.skip=true'
      }
    }

  }
}