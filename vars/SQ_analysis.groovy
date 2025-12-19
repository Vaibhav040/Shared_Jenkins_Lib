def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
  withSonarQubeENV("${SonarQubeAPI}"){
    sh"$SONAR_HOME/bin/sonar-scanner -Dsoanr.projectName=${ProjectName} -Dsonar.rojectKey=${ProjectKey} -X"
  }
}
