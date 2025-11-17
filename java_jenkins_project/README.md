# Simple Java + Jenkins Pipeline Example

This is a beginner-friendly Java project with a Jenkins pipeline.

## Files included

- `src/Main.java` — Simple Java program.
- `Jenkinsfile` — Jenkins pipeline that:
  - Checks out the code
  - Compiles Java files in `src/`
  - Runs the Main class

## How to use

1. Upload this project to GitHub.
2. Configure Jenkins to use a *Pipeline from SCM*.
3. Jenkins will automatically detect the Jenkinsfile and run:

```
javac src/*.java
java -cp src Main
```

Enjoy learning CI/CD!
