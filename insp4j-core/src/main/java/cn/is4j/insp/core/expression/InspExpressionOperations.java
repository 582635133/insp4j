/*
 * Copyright 2020 zengzhihong All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.is4j.insp.core.expression;

import cn.is4j.insp.core.service.InspAuthentication;

/**
 * @author zengzhihong
 */
public interface InspExpressionOperations {

    void setAuthentication(InspAuthentication authentication);

    /**
     * single function、data authority composable
     *
     * @param funcAuthorities
     * @param dataAuthorities
     * @return
     */
    boolean hasFuncData(String[] funcAuthorities, String[] dataAuthorities);

    /**
     * multiple function authorities
     *
     * @param funcAuthorities
     * @return
     */
    boolean hasFunc(String[] funcAuthorities);

    /**
     * matched any one function authority
     *
     * @param funcAuthorities
     * @return
     */
    boolean hasAnyFunc(String[] funcAuthorities);

    /**
     * multiple data authorities
     *
     * @param dataAuthorities
     * @return
     */
    boolean hasData(String[] dataAuthorities);

    /**
     * matched any one data authority
     *
     * @param dataAuthorities
     * @return
     */
    boolean hasAnyData(String[] dataAuthorities);
}
