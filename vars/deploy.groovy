def call(){
  echo '🚢 Deploying application using Docker Compose...'
  bat 'docker-compose down || true'
  bat 'docker-compose up -d'
}
