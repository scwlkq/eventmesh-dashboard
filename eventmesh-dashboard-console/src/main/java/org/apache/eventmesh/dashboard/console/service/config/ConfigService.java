/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.dashboard.console.service.config;


import org.apache.eventmesh.dashboard.console.entity.config.ConfigEntity;

import java.util.List;
import java.util.Map;


/**
 * config data service
 */
public interface ConfigService {

    List<ConfigEntity> selectAll();

    void batchInsert(List<ConfigEntity> configEntityList);

    String mapToYaml(Map<String, String> stringMap);

    Integer addConfig(ConfigEntity configEntity);

    Integer deleteConfig(ConfigEntity configEntity);

    String mapToProperties(Map<String, String> stringMap);


    List<ConfigEntity> selectByInstanceId(ConfigEntity configEntity);

    List<ConfigEntity> selectDefaultConfig(ConfigEntity configEntity);

    void updateConfig(ConfigEntity configEntity);

}
