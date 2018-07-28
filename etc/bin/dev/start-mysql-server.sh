#!/bin/bash -eux

docker run --name mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:8.0.11
