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
                dir("Demo-Jenkins-Repo/JenkinsDemoProject"){
                    sh "chmod +x gradlew"
                }
                dir("Demo-Jenkins-Repo/JenkinsDemoProject"){
                    sh "./gradlew clean build"
                }
            }
        }

        stage("Test"){
            steps{
                 dir("Demo-Jenkins-Repo/JenkinsDemoProject"){
                    sh "./gradlew test"
                }
            }
        }

        // stage("Run the App"){
        //     steps{
        //         echo "Running JAVA APP"
        //         dir("Demo-Jenkins-Repo/JenkinsDemoProject/build/libs"){
        //             sh "java -jar JenkinsDemoProject-0.0.1-SNAPSHOT.jar"
        //         }
        //     }
        // }

        stage("Release"){
            steps{
                echo "Releasing The App to Market"
            }
        }
    }
}