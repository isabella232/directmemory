package org.apache.directmemory.memory;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Extends {@link MemoryManagerServiceWithAllocationPolicyImpl} 
 * to force {@link AllocationPolicy} in constructor and set 
 * the behavior to thrown an exception when the buffers are full.
 *
 */
public class MemoryManagerServiceWithAllocationPolicyEhcacheImpl<V>
    extends MemoryManagerServiceWithAllocationPolicyImpl<V>
{

    public MemoryManagerServiceWithAllocationPolicyEhcacheImpl( AllocationPolicy<V> allocationPolicy )
    {
        super();
        this.setAllocationPolicy( allocationPolicy );
        this.returnNullWhenFull = false;
    }
    
}