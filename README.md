# sonar-japicmp-plugin

This plugin creates new issues in [Sonar Qube](https://www.sonarqube.org/) based on available XML reports of the maven
plugin of [japicmp](https://siom79.github.io/japicmp/).

## Usage

The plugin requires the [sonar-java-plugin](https://docs.sonarqube.org/display/PLUG/SonarJava) in version >= 4.x and
Sonar Qube in version >= 5.6.x (LTS). Tested also with 6.2.

How to install the plugin manually (as it is currently not available through the Update Center) is described
[here](https://docs.sonarqube.org/display/SONAR/Installing+a+Plugin).

The default location of the report is `target/japicmp/japicmp.xml`. You can specify a different location (if you have
configured that in japicmp) through `Administration -> General Settings -> Java -> JApiCmp`.

Per default the plugin assumes that you are using [semantic versioning](http://semver.org/) and only reports an issue
if your sources are modified in a way that violates the semantic versioning specification. You can turn off this behavior
under `Administration -> General Settings -> Java -> JApiCmp`.

A complete documentation of all features of japicmp can be found [here](http://siom79.github.io/japicmp/).

To actually see some issues in your code quality report, please enable the rules that the plugin creates.

## Compatibility

The plugin embeds japicmp in order to parse and evaluate the XML report. The following table gives an overview which version
of the plugin is distributed with which version of japicmp.

sonar-japicmp-plugin version|Embedded japicmp version
---|---
[0.1.0-RC1](https://github.com/siom79/sonar-japicmp-plugin/releases/tag/sonar-japicmp-plugin-0.1.0-RC1)|0.11.0
