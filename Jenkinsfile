pipeline{
    parameters{
        string(
            name:"SERVER_NAME",
            defaultValue:"localhost",
            description:"Version associated with current build"
        )

        string(
            name:"SERVER_PORT",
            defaultValue:"8080",
            description:"Version associated with current build"
        )
    }

    environment{
        SERVER_NAME = "${params.SERVER_NAME}"
        SERVER_PORT = "${params.SERVER_PORT}"
    }

    agent any

    stages{
        stage("Clean Up"){
            steps{
                deleteDir()
            }
        }
        
        stage("Clone Repo"){
            steps{
                sh "git clone https://github.com/kushal-banik-hyland/Demo-Jenkins-Repo.git"
            }
        }

        stage("Build"){
            steps{
                dir("JenkinsDemoProject"){
                    sh "gradle clean build"
                }
            }
        }

        stage("Test"){
            steps{
                 dir("JenkinsDemoProject"){
                    sh "gradle test"
                }
            }
        }

        stage("Run the App"){
            steps{
                echo "Running JAVA APP"
                dir("JenkinsDemoProject/build/libs"){
                    sh "java -jar JenkinsDemoProject-0.0.1-SNAPSHOT.jar"
                }
            }
        }

        stage("Release"){
            steps{
                echo "Releasing The App to Market"
            }
        }
    }
}