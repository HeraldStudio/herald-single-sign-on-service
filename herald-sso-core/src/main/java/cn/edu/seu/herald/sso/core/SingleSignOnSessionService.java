/*
 * Copyright 2012 Herald, Southeast University.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.edu.seu.herald.sso.core;

import cn.edu.seu.herald.session.Session;
import cn.edu.seu.herald.session.exception.SessionAccessException;
import cn.edu.seu.herald.sso.domain.SingleSignOnContext;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface SingleSignOnSessionService {

    public void shareSingleSignOnContextInSession(
            SingleSignOnContext ssoContext, Session session)
            throws SessionAccessException;

    public void removeSingleSignOnContextInSession(Session session)
            throws SessionAccessException;

}
