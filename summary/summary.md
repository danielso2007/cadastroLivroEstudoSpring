<a id="top"></a>

<p style="font-size: 24px;"><img src="./qct-icons/transform-logo.svg" style="margin-right: 15px; vertical-align: middle;"></img><b>Code Transformation Summary by Amazon Q </b></p>
<p><img src="./qct-icons/transform-variables-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Lines of code in your application: 82 <p>
<p><img src="./qct-icons/transform-clock-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Transformation duration: 5 min(s) <p>
<p><img src="./qct-icons/transform-dependencies-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned dependencies replaced: 5 of 7 <p>
<p><img src="./qct-icons/transform-dependencyAnalyzer-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Additional dependencies added: 7 <p>
<p><img src="./qct-icons/transform-smartStepInto-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned deprecated code instances replaced: 0 of 0 <p>
<p><img src="./qct-icons/transform-listFiles-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Files changed: 8 <p>
<p><img src="./qct-icons/transform-build-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Build status in Java 17: <span style="color: #00CC00">SUCCEEDED</span> <p>

### Table of Contents

1. <a href="#build-log-summary">Build log summary</a> 
1. <a href="#planned-dependencies-replaced">Planned dependencies replaced</a> 
1. <a href="#additional-dependencies-added">Additional dependencies added</a> 
1. <a href="#deprecated-code-replaced">Deprecated code replaced</a> 
1. <a href="#all-files-changed">All files changed</a> 
1. <a href="#next-steps">Next steps</a> 


### Build log summary <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="build-log-summary"></a>

Amazon Q successfully built the upgraded code in Java 17. Here is a relevant snippet from the build log. To view the full build log, open [`buildCommandOutput.log`](./buildCommandOutput.log)

```
This Maven build compiled Java source code and packaged 6 modules for a book registration application. No tests were executed. All modules were built successfully with no errors.
```


### Planned dependencies replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="planned-dependencies-replaced"></a>

Amazon Q updated the following dependencies that it identified in the transformation plan

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `jakarta.servlet:jakarta.servlet-api` | Added | - | 6.1.0 |
| `javax.servlet:javax.servlet-api` | Removed | 3.1.0 | - |
| `org.apache.maven.plugins:maven-compiler-plugin` | Updated | 3.5.1 | 3.6.2 |
| `org.hibernate.orm:hibernate-core` | Added | - | 6.3.2.Final |
| `org.hibernate:hibernate-core` | Removed | 5.2.2.Final | - |

### Additional dependencies added <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="additional-dependencies-added"></a>

Amazon Q updated the following additional dependencies during the upgrade

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `org.eclipse.jetty:jetty-servlets` | Updated | - | 9.3.11.v20160721 |
| `org.springframework:spring-core` | Updated | 4.3.2.RELEASE | 6.1.16 |
| `org.springframework:spring-jdbc` | Updated | 4.3.2.RELEASE | 6.1.16 |
| `org.springframework:spring-orm` | Updated | 4.3.2.RELEASE | 6.1.16 |
| `org.springframework:spring-tx` | Updated | 4.3.2.RELEASE | 6.1.16 |
| `org.springframework:spring-web` | Updated | 4.3.2.RELEASE | 6.1.16 |
| `org.springframework:spring-webmvc` | Updated | 4.3.2.RELEASE | - |

### Deprecated code replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="deprecated-code-replaced"></a>

Amazon Q replaced the following instances of deprecated code. An instance with 0 files
changed indicates Amazon Q wasn't able to replace the deprecated code.

| Deprecated code | Files changed |
|----------------|----------------|


### All files changed <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="all-files-changed"></a>

| File | Action |
|----------------|--------|
| [domain/pom.xml](../domain/pom.xml) | Updated |
| [pom.xml](../pom.xml) | Updated |
| [rest/pom.xml](../rest/pom.xml) | Updated |
| [rest/src/main/webapp/WEB-INF/web.xml](../rest/src/main/webapp/WEB-INF/web.xml) | Updated |
| [service.client/pom.xml](../service.client/pom.xml) | Updated |
| [service/pom.xml](../service/pom.xml) | Updated |
| [web/pom.xml](../web/pom.xml) | Updated |
| [web/src/main/webapp/WEB-INF/web.xml](../web/src/main/webapp/WEB-INF/web.xml) | Updated |

### Next steps <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="next-steps"></a>

1. Please review and accept the code changes using the diff viewer.If you are using a Private Repository, please ensure that updated dependencies are available.

1. In order to successfully verify these changes on your machine, you will need to change your project to Java 17. We verified the changes using [Amazon Corretto Java 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/what-is-corretto-17.html
) build environment.
1. If this project uses Maven CheckStyle, Enforcer, FindBugs or SpotBugs plugins, Q Code Transformation will disable those plugins when we build the project to verify proposed upgrades.