/**
 * This file was modified by Amazon:
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.amazon.android.tv.tenfoot.ui.activities;

import android.os.Bundle;

import com.amazon.android.tv.tenfoot.R;
import com.amazon.android.tv.tenfoot.base.BaseActivity;
import com.amazon.android.tv.tenfoot.utils.BrowseHelper;

/**
 * An activity class that loads FullContentBrowseFragment to browse the content with a navigation
 * bar to the left side of the rows of content.
 */
public class FullContentBrowseActivity extends BaseActivity {

    private final String TAG = FullContentBrowseActivity.class.getSimpleName();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_content_browse_activity_layout);
    }

    @Override
    public void setRestoreActivityValues() {

        BrowseHelper.saveBrowseActivityState(this);
    }
}
