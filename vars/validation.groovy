def call(String Config)
{
  def config = readYaml file:'config.yml'
  return config
}
