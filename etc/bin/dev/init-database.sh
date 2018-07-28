#!/bin/bash -eux

ROOT_DIR=$(cd "$(dirname $0)/../../../"; pwd)

docker exec -i mysql mysql -uroot -ppassword -e 'DROP DATABASE IF EXISTS `test-tracker`'
docker exec -i mysql mysql -uroot -ppassword -e 'CREATE DATABASE `test-tracker`'
docker exec -i mysql mysql -uroot -ppassword test-tracker < ${ROOT_DIR}/etc/db/schema.sql
