#!/usr/bin/env bash
touch test
chmod 754 ~/jar/server.jar
exec java -jar ~/jar/server.jar