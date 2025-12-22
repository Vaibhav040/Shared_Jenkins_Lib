def call(String scriptName, String workDir) {

    withCredentials([[
        $class: 'AmazonWebServicesCredentialsBinding',
        credentialsId: 'aws-creds'
    ]]) {

        dir(workDir) {
            sh """
              aws sts get-caller-identity
              bash ${scriptName}
            """
        }
    }
}
