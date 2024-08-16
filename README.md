# 2024-08-15
## 오류 (java.lang.IllegalArgumentException: Mapped Statements collection does not contain value for com.test.board.boardMapper.save)
### com.test.board.boardMapper.save를 못찾았다는 오류였다.
### application.properties에서 내가 spring.datasource.mapper-locations=classpath:/mapper/**/*.xml라고 설정해서 지금까지 mapper를 못찾은거였다.
## spring.datasource.mapper-locations=classpath:/mapper/**/*.xml 의 의미
### 예를 들어 mapper/board/boardMapper.xml에 있는 친구를 가져와라라는 뜻이였다. 하지만 나는 mapper/boardMapper.xml으로 설정해서 저 경로랑 안맞아 계속 오류가 뜬거였다.
## 해결법
### 나는 경로가 mapper/boardMapper.xml이기 때문에 나는 spring.datasource대신 mybatis.mapper-locations를 사용했다.
### spring.datasource.mapper-locations=classpath:/mapper/**/*.xml 대신 mybatis.mapper-locations=classPath:mapper/*.xml을 application.properties에 써서 돌려보니 경로를 제대로 찾아내서 해결하였다.
