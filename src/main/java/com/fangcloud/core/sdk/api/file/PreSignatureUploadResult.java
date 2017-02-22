package com.fangcloud.core.sdk.api.file;

import com.fangcloud.core.sdk.api.YfyBaseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PreSignatureUploadResult extends YfyBaseDTO {
    @JsonProperty("presign_url")
    private String uploadUrl;

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }
}
