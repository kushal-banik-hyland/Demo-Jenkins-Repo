pipeline{
    parameters{
        String(
            name:"Build_Version",
            defaultValue:"V3.0.0",
            description:"Version associated with current build"
        )
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
                sh "git clone https://github.com/jenkins-docs/simple-java-maven-app.git"
            }
        }

        stage("Build"){
            steps{
                dir("simple-java-maven-app"){
                    sh "mvn clean install"
                }
            }
        }

        stage("Test"){
            steps{
                 dir("simple-java-maven-app"){
                    sh "mvn test"
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