call mvn clean
call mvn install
docker build . -t temzor/cats:1.0.0
