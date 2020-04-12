# EcommerceProject
![Project Example](https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/mbp16touch-space-select-201911?wid=904&hei=843&fmt=jpeg&qlt=95&.v=1572825197207)

To run:
Option 1: 
1) Start as Java application in IDE

Option 2:
1) Run Docker container in IDE terminal (Right click project name, Show in Local Terminal - Git Bash) - 
2) Using image already created by docker build), run: docker run -p 8080:8080 docker-shop.
3) Go to localhost:8080 provided Docker Desktop is installed as your host. Otherwise, you would have to use the IP address is using Docker Tools. 

To view containers:
docker container ls

To view images:
docker images

To stop container:
docker stop id-of-container

To build image:
1) Make sure your .jar is build, to do so, do a mvn clean install
docker build -t docker-shop . (the period means current directory so make sure you are in the right directory)

