package com.potatosoft.life.core.ports.user;

import com.potatosoft.life.core.domain.User;

public interface GetUserOutputPort {
    User getUser(Long id);
}
