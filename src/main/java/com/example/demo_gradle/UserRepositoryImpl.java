package com.example.demo_gradle;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public List<User> findByName(String name) {
        return queryFactory.selectFrom(QUser.user)
                .where(QUser.user.name.eq(name))
                .fetch();
    }
}
