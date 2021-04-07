# 和暦表示

## Use icu4j library

| OS 5 (Api Level 21) | OS 8 (Api Level 26) | OS 11 (Api Level 30)
| --- | --- | --- |
| <img src="https://user-images.githubusercontent.com/16476224/105489638-e47c6580-5cf6-11eb-90c3-41e28b1f1ef7.png" width=320> | <img src="https://user-images.githubusercontent.com/16476224/105489752-17265e00-5cf7-11eb-97c0-3337ef97796c.png" width=320> | <img src="https://user-images.githubusercontent.com/16476224/105489976-72585080-5cf7-11eb-9ac0-dd0a837773b7.png" width=320> |

## Use android.icu API

- OSに入ってるicuライブラリのバージョンが違うので挙動が変わる
- OS: 11で使用しているICUライブラリは64.2以降のものなので令和表示される. http://site.icu-project.org/download/64

| OS 8 (Api Level 26) | OS 11 (Api Level 30) |
| --- | --- |
| <img src="https://user-images.githubusercontent.com/16476224/105490210-c9f6bc00-5cf7-11eb-9c67-554d0727cfa0.png" width=320> | <img src="https://user-images.githubusercontent.com/16476224/105490117-a7fd3980-5cf7-11eb-862c-ed54f5a04fb4.png" width=320> |
