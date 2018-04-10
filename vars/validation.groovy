def call(String Config)
{
  def config = readYaml file:'config.yml'
  Java_Version=config.tools.Java
  Maven_Version=config.tools.Maven
  Build_target=config.Builds
  sh " echo $Build_target"
  return config
}
