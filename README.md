Spring Boot Ionic
=================

[![Build Status](https://travis-ci.org/okode/spring-boot-ionic.svg?branch=develop)](https://travis-ci.org/okode/spring-boot-ionic)

Spring Boot backend with Ionic2 frontend.

Requirements
------------

* Homebrew

```
$ brew update ; brew upgrade
```

* Java 8

```
$ brew cask install java
```

* Ionic2

```
$ brew install node yarn
$ npm update -g
$ npm install -g ionic cordova ios-sim ios-deploy
```

Building and Running
--------------------

* Frontend build

```
$ cd frontend
$ yarn install
$ ionic platform add browser
$ ionic build browser --prod --release
```

* Backend build

```
$ cd backend
$ cp -Rv ../frontend/www/* src/main/resources/static
$ ./gradlew bootRepackage
```

* Running

```
$ cd backend/build/libs
$ ./backend-{VERSION}.war
```

Open `http://localhost:8080` in your favorite browser.

For using different port run war as following:

```
$ ./backend-{VERSION}.war --server.port=[SERVER_PORT]
```

