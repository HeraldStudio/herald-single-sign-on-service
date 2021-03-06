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
package cn.edu.seu.herald.sso.web.view.auth;

import cn.edu.seu.herald.sso.web.view.View;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface AuthenticationView extends View {

    public static final String INVOKE_TYPE_PARAM_NAME = "type";

    public static final String USERNAME_PARAM_NAME = "username";

    public static final String PASSWORD_PARAM_NAME = "password";

}
