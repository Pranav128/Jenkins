def call(String url){
  echo "clonning git"
  git url:"${url}"
  echo "clonning successfull"
}
