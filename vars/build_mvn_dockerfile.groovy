def call(String repo, String tag){
  echo '🔨 Building all microservices using Maven and JIB...'
  bat 'mvn clean install -DskipTests'
  bat 'docker build -t pranav128/"${repo}":"${tag}" .'
  echo "✅ Build successfull"
}
