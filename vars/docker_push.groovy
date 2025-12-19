def call(String Project, String Imagetag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsID: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh " docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
