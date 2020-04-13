pipeline {
  agent any
  stages {
    stage('source') {
      input{
          message "Should we continue?"
          ok "YES"
      }
      steps {
        git(changelog: true, poll: true, url: 'https://github.com/feileniao/root.git', branch: 'master')
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install -U -Dmaven.test.skip=true'
      }
    }

  }
}