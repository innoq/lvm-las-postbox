FROM jimador/docker-jdk-8-maven-node

ENV HOME=/home/app

WORKDIR $HOME

COPY package.json $HOME

# install node dependencies
RUN npm install

COPY . $HOME

# compile assets
RUN npm run compile

# install maven dependencies
RUN mvn clean install

# start app
CMD ["mvn", "spring-boot:run"]
