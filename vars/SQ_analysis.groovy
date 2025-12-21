def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
  withSonarQubeEnv("${SonarQubeAPI}"){
    sh"$SONAR_HOME/bin/sonar-scanner -Dsoanr.projectName=${ProjectName} -Dsonar.rojectKey=${ProjectKey} -X"
  }
}
