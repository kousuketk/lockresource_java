# lockresource_java

### semaphore
- thredごとに非同期にlockをかけて、リソースを獲得できなかったら、リソースが開放されるまで待機する
```
name1:acquiring lock...
name3:acquiring lock...
name5:acquiring lock...
name2:acquiring lock...
name4:acquiring lock...
name6:acquiring lock...
name1:available Semaphore permits now:4
name6:available Semaphore permits now:4
name4:available Semaphore permits now:4
name2:available Semaphore permits now:4
name3:available Semaphore permits now:4
name5:available Semaphore permits now:4
name4:got the permit!
name2:got the permit!
name6:got the permit!
name5:got the permit!
name6:is performing operation0, available Semaphore permits:0
name2:is performing operation0, available Semaphore permits:0
name4:is performing operation0, available Semaphore permits:0
name5:is performing operation0, available Semaphore permits:0
name6:is performing operation1, available Semaphore permits:0
name5:is performing operation1, available Semaphore permits:0
name2:is performing operation1, available Semaphore permits:0
name4:is performing operation1, available Semaphore permits:0
name6:is performing operation2, available Semaphore permits:0
name4:is performing operation2, available Semaphore permits:0
name2:is performing operation2, available Semaphore permits:0
name5:is performing operation2, available Semaphore permits:0
name6:is performing operation3, available Semaphore permits:0
name2:is performing operation3, available Semaphore permits:0
name4:is performing operation3, available Semaphore permits:0
name5:is performing operation3, available Semaphore permits:0
name6:releasing lock...
name4:releasing lock...
name2:releasing lock...
name4:available Semaphore permits now:2
name6:available Semaphore permits now:1
name3:got the permit!
name2:available Semaphore permits now:2
name1:got the permit!
name3:is performing operation0, available Semaphore permits:1
name1:is performing operation0, available Semaphore permits:1
name5:releasing lock...
name5:available Semaphore permits now:2
name1:is performing operation1, available Semaphore permits:2
name3:is performing operation1, available Semaphore permits:2
name1:is performing operation2, available Semaphore permits:2
name3:is performing operation2, available Semaphore permits:2
name1:is performing operation3, available Semaphore permits:2
name3:is performing operation3, available Semaphore permits:2
name1:releasing lock...
name1:available Semaphore permits now:3
name3:releasing lock...
name3:available Semaphore permits now:4
```
