# sonar-japicmp-plugin

This plugin creates new issues in [Sonar Qube](https://www.sonarqube.org/) based on available XML reports of the maven 
plugin of [japicmp](https://siom79.github.io/japicmp/).

## Usage

The plugin requires the [sonar-java-plugin](https://docs.sonarqube.org/display/PLUG/SonarJava) in version >= 4.x and 
Sonar Qube in version >= 5.6.x (LTS).

How to install the plugin manually (as it currently not available through the Update Center) is described 
[here](https://docs.sonarqube.org/display/SONAR/Installing+a+Plugin).

The default location of the report is `target/japicmp/japicmp.xml`. You can specify a different location (if you have 
configured that in japicmp) through Administration -> General Settings -> Java -> JApiCmp.

To actually see some issues in your code quality report please enable the rules that the plugin creates.

## Compatibility

The plugin embeds japicmp in order to parse and evaluate the XML report. The following table gives an overview which version
of the plugin is distributed with which version of japicmp.

sonar-japicmp-plugin version|Embedded japicmp version
---|---
0.0.1-SNAPSHOT|0.9.4