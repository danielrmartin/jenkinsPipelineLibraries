def call(String Config){
echo "Checking config.txt"
def config = readYaml file:Config
Java_Version=config.tools.Java
Maven_Version=config.tools.Maven
Build_target=config.Builds
}
