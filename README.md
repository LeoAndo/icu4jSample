# 和暦表示

# 結論
和暦表示するには、ICU4Jライブラリを直接利用する<br>

## やり方１： ICU4Jライブラリを直接利用する
OS:7 API Level 24未満をサポートしている場合で和暦表示する場合は、Android FWが提供するAPIは使用せずに、ICU4Jライブラリを直接利用する必要がある.<br>

app/build.gradle
```groovy
dependencies {
    implementation 'com.ibm.icu:icu4j:64.2'
}
```

| OS 5 (Api Level 21) | OS 8 (Api Level 26) | OS 11 (Api Level 30)
| --- | --- | --- |
| <img src="https://user-images.githubusercontent.com/16476224/105489638-e47c6580-5cf6-11eb-90c3-41e28b1f1ef7.png" width=320> | <img src="https://user-images.githubusercontent.com/16476224/105489752-17265e00-5cf7-11eb-97c0-3337ef97796c.png" width=320> | <img src="https://user-images.githubusercontent.com/16476224/105489976-72585080-5cf7-11eb-9ac0-dd0a837773b7.png" width=320> |


## やり方２： Android SDKのAPI `android.icu`を使って和暦対応する

Androidでは、OS:7(API Level 24)から`android.icu` で、ICU4J APIの一部(サブセット)が提供された。<br>
この`android.icu`パッケージのAPIを使用して和暦対応することが可能。<br>
OS11(API Level 30)から和暦の令和表記に対応した [ICUライブラリver64.2](http://site.icu-project.org/download/64) をサポートしている。<br>
なので、OS11より古いOSでは、`平成32年`みたいな表記になる。<br>
各OSで使っているICUのバージョンは[ここ](https://developer.android.com/guide/topics/resources/internationalization?hl=ja#versioning-nougat)を参照する<br>

| OS 8 (Api Level 26) | OS 11 (Api Level 30) |
| --- | --- |
| <img src="https://user-images.githubusercontent.com/16476224/105490210-c9f6bc00-5cf7-11eb-9c67-554d0727cfa0.png" width=320> | <img src="https://user-images.githubusercontent.com/16476224/105490117-a7fd3980-5cf7-11eb-862c-ed54f5a04fb4.png" width=320> |
