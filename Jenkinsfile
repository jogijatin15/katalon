pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
		slackSend "Build Started - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
		slackSend "Docker Container Created"
        sh '''
			echo "hello-world"
       			katalon -runMode=console -projectPath="LEAP POC.prj" -reportFolder="Reports" -reportFileName="report" -retry=0 -testSuitePath="Test Suites/Google Search Suite" -browserType="Chrome"
     		'''
		junit 'tests/*.xml'		
		sh 'echo "bye-world"'
		slackSend "Docker Container Destroyed"
		slackSend "Build Completed - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
	  }
    }
  }
}
