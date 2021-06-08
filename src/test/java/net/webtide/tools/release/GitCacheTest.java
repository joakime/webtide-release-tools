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

import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;

import org.eclipse.jgit.api.Git;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GitCacheTest
{
    @Test
    public void testGitCache() throws IOException
    {
        Path cloneDir = GitUtil.findGitRoot();
        Git git = Git.open(cloneDir.toFile());
        GitCache cache = new GitCache(git);
        Set<String> diffPaths = cache.getPaths("2bde336b89bb79952b05fb629da7e57c453e0b5f");
        assertEquals(3, diffPaths.stream().filter((filename) -> filename.startsWith("src/")).count());
        Set<String> branchesContaining =
            cache.getBranchesContaining("2bde336b89bb79952b05fb629da7e57c453e0b5f");
        assertNotNull(branchesContaining);
    }
}