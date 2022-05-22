mvn clean install package
docker rm fmba
##docker build --build-arg JAR_FILE=target/*.jar -t br.com.fiap/fmba .
docker build -t br.com.fiap/fmba .
docker run --name fmba -p 8080:5000 br.com.fiap/fmba