package com.fangcloud.sdk;

import com.fangcloud.sdk.api.PagingResult;
import com.fangcloud.sdk.api.YfyItem;
import com.fangcloud.sdk.api.YfyMiniUser;
import com.fangcloud.sdk.api.YfyPathFolder;
import com.fangcloud.sdk.api.file.YfyFile;
import com.fangcloud.sdk.api.folder.YfyFolder;
import com.fangcloud.sdk.api.user.YfyUser;

import java.io.File;

import static org.junit.Assert.assertNotNull;

public class SdkTestUtil {
    public static void assertFileNotNull(YfyFile file) {
        assertNotNull(file);
        assertItemNotNull(file);
        assertNotNull(file.getSha1());
        assertNotNull(file.getCommentsCount());
    }

    public static void assertFolderNotNull(YfyFolder folder) {
        assertNotNull(folder);
        assertItemNotNull(folder);
        assertNotNull(folder.getItemCount());
        assertNotNull(folder.getFolderType());
    }

    public static void assertItemNotNull(YfyItem item) {
        assertNotNull(item);
        assertNotNull(item.getId());
        assertNotNull(item.getType());
        assertNotNull(item.getName());
        assertNotNull(item.getSize());
        assertNotNull(item.getCreatedAt());
        assertNotNull(item.getModifiedAt());
        assertNotNull(item.getDescription());
        assertNotNull(item.getPath());
        for (YfyPathFolder pathFolder : item.getPath()) {
            assertPathFolderNotNull(pathFolder);
        }
        assertMiniUserNotNull(item.getOwnedBy());
        assertNotNull(item.getShared());
        assertPathFolderNotNull(item.getParent());
        assertNotNull(item.getSequenceId());
    }

    public static void assertPathFolderNotNull(YfyPathFolder pathFolder) {
        assertNotNull(pathFolder);
        assertNotNull(pathFolder.getId());
        assertNotNull(pathFolder.getName());
        assertNotNull(pathFolder.getType());
    }

    private static void assertMiniUserNotNull(YfyMiniUser miniUser) {
        assertNotNull(miniUser);
        assertNotNull(miniUser.getId());
        assertNotNull(miniUser.getName());
        assertNotNull(miniUser.getLogin());
        assertNotNull(miniUser.getEnterpriseId());
    }

    public static void assertPagingResultNotNull(PagingResult pagingResult) {
        assertNotNull(pagingResult);
        assertNotNull(pagingResult.getTotalCount());
        assertNotNull(pagingResult.getPageCapacity());
        assertNotNull(pagingResult.getPageId());
    }

    public static void assertUserNoyNull(YfyUser user) {
        assertNotNull(user);
        assertNotNull(user.getId());
        assertNotNull(user.getEnterpriseId());
        assertNotNull(user.getName());
        assertNotNull(user.getPhone());
        assertNotNull(user.getEmail());
        assertNotNull(user.getProfilePicKey());
        assertNotNull(user.getActive());
        assertNotNull(user.getFullNamePinyin());
        assertNotNull(user.getPinyinFirstLetters());
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.isFile() && file.exists()) {
            file.delete();
        } else {
            throw new RuntimeException(fileName + "is not exist");
        }
    }


}