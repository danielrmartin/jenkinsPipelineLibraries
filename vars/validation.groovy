def call(Config String){
echo "Checking config.txt"
def config = readYaml file:Name
Java_Version=config.tools.Java
Maven_Version=config.tools.Maven
Build_target=config.Builds
}
