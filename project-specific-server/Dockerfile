FROM openjdk:14-alpine

ENV WORK_DIR /usr/rocketsound

EXPOSE 8080

COPY conf/config.json $WORK_DIR/config.json
COPY build/distributions/RocketSound-*.tar $WORK_DIR/

WORKDIR $WORK_DIR
ENTRYPOINT ["sh", "-c"]
CMD ["tar -xf *.tar && cd RocketSound-* && mkdir conf && cp ../config.json conf/config.json && ./bin/RocketSound"]

