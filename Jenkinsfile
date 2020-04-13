pipeline {
  agent any
  stages {
    stage('source') {
      steps {
        git(changelog: true, poll: true, url: 'https://github.com/feileniao/root.git', branch: 'dev')
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install -U -Dmaven.test.skip=true'
      }
    }

  }
  post{
          always{
              script{
                      publishHTML (target: [
                          allowMissing: false,
                          alwaysLinkToLastBuild: false,
                          keepAll: true,
                          reportDir: '/usr/local/jenkins/test-output',
                          reportFiles: 'index.html',
                          reportName: "HTML Report"
                      ])
              }
          }
      }
}