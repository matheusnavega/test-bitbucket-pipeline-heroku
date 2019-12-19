#makefile

build:
	mvn package
	docker build --build-arg SPRING_PROFILES_ACTIVE=dev -f Dockerfile -t test-bitbucket-pipeline-heroku:latest .

run:	build
	sudo docker run -p 8081:8081 -t test-bitbucket-pipeline-heroku:latest
