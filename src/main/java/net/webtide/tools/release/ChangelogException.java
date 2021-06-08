//
// ========================================================================
// Copyright (c) Webtide LLC and others.
//
// This program and the accompanying materials are made available under the
// terms of the Apache License, Version 2.0 which is available at
// https://www.apache.org/licenses/LICENSE-2.0.
//
// SPDX-License-Identifier: Apache-2.0
// ========================================================================
//

package net.webtide.tools.release;

public class ChangelogException extends RuntimeException
{
    public ChangelogException(String message)
    {
        super(message);
    }

    public ChangelogException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
