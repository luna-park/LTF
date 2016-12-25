# Lunar Testing Framework (LTF)
This library helps you to create a testing utility.

##Usage:<br>
### 1. Add to root build.gradle:
```gradle
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

### 2. Add to app/build.gradle:
```gradle
dependencies {
    compile fileTree(include: ['*.jar'], dir: 'libs')
    compile 'com.github.luna-park:ltf:1.0'
}
```
### 3. Add interface to MainActivity.java
```java
public class MainActivity extends Activity implements LTFInterface
```
### 4. Add data in strings.xml
```xml
    <string-array name="questions1">
        <item>Название категории</item>
        <item>Вопрос1;;Правильный ответ;;Ответ;;Ответ</item>
        <item>Вопрос2;;Правильный ответ;;Ответ</item>
    </string-array>
```
