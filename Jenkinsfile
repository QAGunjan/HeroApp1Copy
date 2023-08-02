pipeline {
    agent any

    stages {
        stage('Geting Code from Github') {
            steps {
                git 'https://github.com/QAGunjan/HeroApp1Copy.git'
            }
	}	
    stage('Build Clean') {
            steps {
                bat 'mvn clean'          
            }
    }
    stage('Build Code') {
            steps {
                bat 'mvn compile'
            }
    }
    stage('TestRunning') {
            steps {
                bat 'mvn clean test -DxmlSuiteFileName=Smoke.xml'          
            }
    }
    }
            post {
               
                success {
                   publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'C:/Users/Lenovo/.jenkins/workspace/TestAutomationHeroAppPipeline/Reports', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
                   emailext attachLog: true, attachmentsPattern: '**/Reports/index.html', body: '$DEFAULT_CONTENT', subject: '$DEFAULT_SUBJECT', to: 'gunjanrawat033@gmail.com'				
		   cleanWs()
		}
            }
        }
