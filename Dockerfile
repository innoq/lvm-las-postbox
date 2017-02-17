FROM hypriot/rpi-node

RUN apt update && apt install -y maven \
  && rm -rf /var/lib/apt/lists/* \
  && apt-get clean

ENV HOME=/home/app

WORKDIR $HOME

COPY package.json $HOME

# install node dependencies
RUN npm install

COPY . $HOME

# compile assets
RUN npm run compile

RUN apt update \
  && apt install -y openjdk-8-jdk \
  && apt install -y maven \
  && rm -rf /var/lib/apt/lists/* \
  && apt-get clean

# install maven dependencies
RUN mvn clean install

# start app
CMD ["mvn", "spring-boot:run"]
