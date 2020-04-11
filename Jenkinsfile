pipeline {
  agent any
  stages {
    stage('source') {
      steps {
        git(changelog: true, poll: true, url: 'https://github.com/feileniao/root.git', branch: 'master', credentialsId: 'feileniao')
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install -Dmaven.test.skip=true'
      }
    }

  }
}