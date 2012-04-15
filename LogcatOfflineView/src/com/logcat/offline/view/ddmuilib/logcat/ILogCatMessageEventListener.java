/*
 * Copyright (C) 2011 The Android Open Source Project
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

package com.logcat.offline.view.ddmuilib.logcat;

import java.io.File;
import java.util.List;

import com.android.ddmuilib.logcat.LogCatMessage;

/**
 * Listeners interested in log cat messages should implement this interface.
 */
public interface ILogCatMessageEventListener {
    /** Called on reception of logcat messages.
     * @param receivedMessages list of messages received
     */
    void messageReceived(List<LogCatMessage> receivedMessages, int panelID, File Path);
    
    void synSelected(String synTime);
}