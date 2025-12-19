def call(){
  timeout(time: 1, unit: "MINUTES"){
    waitForQualituGate abortPipeline: false
  }
}
