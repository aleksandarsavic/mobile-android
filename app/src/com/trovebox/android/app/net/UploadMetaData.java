
package com.trovebox.android.app.net;

import java.util.Map;

import com.trovebox.android.app.model.Photo;

public class UploadMetaData {
    private String mTitle;
    private String mDescription;
    private String mTags;
    private int mPermission;
    private Map<String, String> mAlbums;

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setTags(String tags) {
        mTags = tags;
    }

    public String getTags() {
        return mTags;
    }

    public int getPermission() {
        return mPermission;
    }

    public void setPermission(int permission) {
        mPermission = permission;
    }

    public void setPrivate(boolean setPrivate) {
        setPermission(setPrivate ? Photo.PERMISSION_PRIVATE : Photo.PERMISSION_PUBLIC);
    }

    public boolean isPrivate() {
        return getPermission() == Photo.PERMISSION_PRIVATE;
    }

    public Map<String, String> getAlbums() {
        return mAlbums;
    }

    public void setAlbums(Map<String, String> albums) {
        this.mAlbums = albums;
    }
}
