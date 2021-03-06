/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */


package com.tencent.angel.psagent.matrix.transport.adapter;

import com.tencent.angel.PartitionKey;
import com.tencent.angel.ps.server.data.request.ValueType;
import io.netty.buffer.ByteBuf;

public class IndexPartGetRowIntResult extends IndexPartGetRowResult {
  private volatile int[] values;

  public IndexPartGetRowIntResult(PartitionKey partKey, IndicesView indicesViews, int[] values) {
    super(partKey, indicesViews);
    this.values = values;
  }

  public IndexPartGetRowIntResult() {
    this(null, null, null);
  }

  public int[] getValues() {
    return values;
  }

  @Override public void serializeData(ByteBuf buf) {
    buf.writeInt(values.length);
    for (int i = 0; i < values.length; i++) {
      buf.writeInt(values[i]);
    }
  }

  @Override public void deserializeData(ByteBuf buf) {
    int len = buf.readInt();
    values = new int[len];
    for (int i = 0; i < len; i++) {
      values[i] = buf.readInt();
    }
  }

  @Override public int getDataSize() {
    return 4 + 4 * values.length;
  }

  @Override public ValueType getValueType() {
    return ValueType.INT;
  }
}
