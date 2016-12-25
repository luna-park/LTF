Lunar Testing Framework (LTF)

Usage:<br>
1. Add to root build.gradle:<br>
<code>
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }<br>
}
</code>

2. Add to app/build.gradle:<br>
<code>
dependencies {
    compile fileTree(include: ['*.jar'], dir: 'libs')
    compile 'com.github.luna-park:ltf:1.0'

}
</code>
