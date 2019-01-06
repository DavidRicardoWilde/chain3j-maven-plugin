# chain3j-maven-plugin
chain3j maven plugin is used to create java classes based on the solidity contract files.

## Usage
The base configuration for the plugin will take the solidity files from ***src/main/resources*** and generates the java classes into the folder ***src/main/java***.

```xml
<build>
    <plugins>
        <plugin>
            <groupId>io.moac</groupId>
            <artifactId>dev</artifactId>
            <version>0.1.0-SNAPSHOT</version>
            <configuration>
                <soliditySourceFiles/>
            </configuration>
        </plugin>
    </plugins>
</build>
```

to run the plugin execute the goal generate-sources.
```powershell
mvn dev:generate-sources
```

