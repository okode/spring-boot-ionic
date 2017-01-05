Spring Boot Ionic
=================

Spring Boot backend with Ionic2 frontend.

Requirements
------------

* Homebrew

    $ brew update ; brew upgrade

* Java 8

    $ brew cask install java

* Ionic2

    $ brew install node yarn
    $ npm update -g
    $ npm install -g ionic cordova ios-sim ios-deploy

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
$ cd lib
$ ./backend
```

Open the frontend URL: http://localhost:8080
