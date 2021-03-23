# RocketSound

RocketSound is a student experiment for estimating sounding-rocket state based on sound measurements. 

## Installation

RocketSound can be installed from source or with a docker image.

### Published Release

1. Login to docker with a github personal acces token for reading packages: `docker login docker.pkg.github.com -u USER_NAME -p "ACCESS_TOKEN"`
4. Run image with: `docker run -p 9870:9870 -p 9871:9871 docker.pkg.github.com/jvpichowski/rocketsound-groundstation/rocketsound-groundstation:latest`

### From Source

1. Clone the repository
2. Build project with: `./gradlew assembleDist`
3. Build docker image with: `docker build -t rocketsound-groundstation .`
4. Run docker image with: `docker run -p 9870:9870 -p 9871:9871 rocketsound-groundstation`

## Running the User Interface

To run the user interface follow the instructions in the dedicated [client repository](https://github.com/TelestionTeam/telestion-rocketsound-psc).
