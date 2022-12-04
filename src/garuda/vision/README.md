# Vision

* docker build -t flask-application --cache-from flask-application --build-arg BUILDKIT_INLINE_CACHE=1 .

* docker run -p 8080:5000 flask-application

- Use Dockerfile to test the application
- Use GithubAction to validate against tests for all scenarios - https://github.com/slabstech/action-cuda-compiler-python

* Reference
  * https://snyk.io/blog/best-practices-containerizing-python-docker/
  * https://github.com/snyk/actions
  * https://docs.snyk.io/snyk-cli/install-the-snyk-cli#snyk-cli-in-a-docker-image
  * https://snyk.io/blog/issuing-fix-prs-to-update-dockerfiles/
  * https://snyk.io/blog/getting-started-snyk-for-secure-python-development/
  * https://snyk.io/blog/docker-for-java-developers/
  * 