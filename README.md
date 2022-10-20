## Micronaut 3.7.2 Documentation

- [User Guide](https://docs.micronaut.io/3.7.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.7.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.7.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## To enable visualvm via JMX

`-Dcom.sun.management.jmxremote.port=3333 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false`

## Bypass cloud provider detection

`-Dmicronaut.cloud.platform=BARE_METAL`

### Reflection

This project uses reflection to parse `Book` to `JSON`. Graal cannot handle this. you need to first record dynamic
features of the project

```shell
java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -jar <<application>>.jar
```

Once JVM exit, reflection usage is recorded at `META-INF/....`

Provide this to `native-image` during build process
` -H:ReflectionConfigurationFiles=${project.basedir}/META-INF/....../<your file>.json`

