def call(String Config)
{
  echo "Checking config.txt"
  def config = readYaml file:'config.yml'
  environment{
  Java_Version=config.tools.Java
  Maven_Version=config.tools.Maven
  Build_target=config.Builds
  }
  sh " echo $Build_target"
}
