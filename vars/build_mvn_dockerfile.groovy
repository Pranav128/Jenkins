def call(){
  echo '🔨 Building all microservices using Maven and JIB...'
  bat 'mvn clean install -DskipTests'
  bat 'docker build -t pranav128/spring-mvc-crud:latest .'
  echo "✅ Build successfull"
}
