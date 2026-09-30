package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustThirdPartySharingResult {
    private final String thirdPartySharingSettingsJson;

    public AdjustThirdPartySharingResult(String str) {
        this.thirdPartySharingSettingsJson = str;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdjustThirdPartySharingResult) {
            return Util.equalString(this.thirdPartySharingSettingsJson, ((AdjustThirdPartySharingResult) obj).thirdPartySharingSettingsJson);
        }
        return false;
    }

    public String getThirdPartySharingSettingsJson() {
        return this.thirdPartySharingSettingsJson;
    }

    public int hashCode() {
        String str = this.thirdPartySharingSettingsJson;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
