pipeline {
  agent any
  triggers{
      git(
      triggerOnPush: true,
      secretToken:"qweqweqweqweqweqweqweqweqw")
    }
  tools {
          maven "MAVEN_HOME"
          jdk "JAVA_HOME"
      }
  stages {
      stage('checkout') {
                  git branch: "master",
                          credentialsId: '679402cb-0c95-4ffc-8172-d2bdb23370a3',
                          url: 'https://github.com/feileniao/root.git'
              }
    stage('source') {
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