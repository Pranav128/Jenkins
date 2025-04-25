def call(){
  echo '🔨 Building all microservices using Maven and JIB...'
  bat 'mvn clean install -DskipTests jib:dockerBuild'
  echo "✅ Build successfull"
}
