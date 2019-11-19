properties([
    pipelineTriggers([
        GenericTrigger(
            causeString: 'Push to master', 
            genericVariables: [[
                defaultValue: '',
                key: 'ref', 
                regexpFilter: '', 
                value: '$.ref'
            ]], 
            printContributedVariables: true, 
            printPostContent: true, 
            regexpFilterExpression: 'master$', 
            regexpFilterText: '$ref', 
            silentResponse: true, 
            token: '71B6B68DFC8C34235B642BE2gft98'
        )
    ])
])
node() {
    ansiColor('xterm') {
        printlnGreen "ttexttt"
    }    
    
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

        ////sh "pwd && ls -al && mvn clean install -f $workDir/spring-boot/spring-boot-samples/spring-boot-sample-web-ui/pom.xml -X"
    }
    
    stage("save artefact"){
        archiveArtifacts artifacts: "**/target/*.jar", fingerprint: true
    }
}
//def printlnGreen(text) {
//    println "\033[1;4;37;42m$text\033[0m"
//}
