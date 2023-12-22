pipeline{
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

        stage("Clean"){
            steps{
                dir("simple-java-maven-app"){
                    echo "Cleaning The Files"
                    sh "ls"
                    sh "mvn clean"
                    echo "All Cleaned"
                }
            }
        }
    }
}