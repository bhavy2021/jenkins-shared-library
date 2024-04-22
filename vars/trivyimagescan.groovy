def call() {
    sh 'trivy image bhavy2021/youtube:latest > trivyimage.txt'
}