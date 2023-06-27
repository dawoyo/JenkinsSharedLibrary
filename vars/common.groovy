def call(string stageName){
  
  if ("${stageName}" == "Build")
  {
    sh "mvn clean package"
  } 
  else if ("${stageName}" == "SonarQube Report")
  {
    sh "echo 'Testing'"
  }
  else if ("${stageName}" == "Upload Into Nexus")
  {
    sh "echo Deploying"
  }
}
