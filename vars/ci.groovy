def call() {
    pipeline {

        agent {
            label 'workstation'

            stages {
                stage('compile/build') {
                    steps {
                        echo 'compile/build'
                    }
                }

                stage('unit test') {
                    step {
                        echo 'unit test done'
                    }
                }

                stage('quality control') {
                    steps {
                        echo 'quality control done'
                    }
                }

                stage('upload code to centralized place') {
                    steps {
                        echo 'upload code to centralized place'
                    }
                }
            }
        }
    }
}