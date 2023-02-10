def buildApp() {
  echo 'building application'
}
def testApp() {
  echo 'testing the application'
}

def deployApp() {
  echo 'deploying the applicaton'
  echo "deploying the version ${params.VERSION}"
}
return this
