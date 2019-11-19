properties([
pipelineTriggers([])
])
node() {
    stage("clean src directory") {
        deleteDir()
        }

    stage("git clone") {
        
            sh 'git clone https://github.com/djholms/spring-boot.git -b 2.1.x'
        
    }
    stage("get work directory and build"){
        def workDir = sh(returnStdout: true, script: "pwd").trim()
        sh   "cd $workDir && \
              pwd && \
              cd spring-boot/spring-boot-samples/spring-boot-sample-web-ui/ && \
              ls -la && \
              pwd && \
              whoami && \
              env && \
              mvn clean install -X"

        sh "pwd && ls -al && mvn clean install -f $workDir/spring-boot/spring-boot-samples/spring-boot-sample-web-ui/pom.xml -X"
    }
    
    stage("save artefact"){
        archiveArtifacts artifacts: "**/target/*.jar", fingerprint: true
    }
}
input ("Please approved deploy to ")
node() {
    
}    
