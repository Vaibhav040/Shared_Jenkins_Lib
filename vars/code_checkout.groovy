def call(String Url, String GitBranch){
  git url: "${Url}", branch: "${GitBranch}"
}
