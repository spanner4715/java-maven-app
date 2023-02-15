def gv

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo "building jar"
                    //gv.buildJar()
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                    buildImage 'spanner/demo-app:jma-3.0'
                    dockerLogin()
                    dockerPush 'spanner/demo-app:jma-3.0'
                }
            }
        }

        stage("deploy") {
            steps {
                script {
                    echo "deploying"
                    //gv.deployApp()
                }
            }
        }
    }   
}
