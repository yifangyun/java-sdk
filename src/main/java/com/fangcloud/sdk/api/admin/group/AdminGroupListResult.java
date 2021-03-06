package com.fangcloud.sdk.api.admin.group;

import com.fangcloud.sdk.api.PagingResult;

import java.util.List;

public class AdminGroupListResult extends PagingResult {
    private List<YfyDetailedGroup> groups;

    public List<YfyDetailedGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<YfyDetailedGroup> groups) {
        this.groups = groups;
    }
}
