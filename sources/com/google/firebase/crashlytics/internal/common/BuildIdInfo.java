package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class BuildIdInfo {
    private final String arch;
    private final String buildId;
    private final String libraryName;

    public BuildIdInfo(String str, String str2, String str3) {
        this.libraryName = str;
        this.arch = str2;
        this.buildId = str3;
    }

    public String getArch() {
        return this.arch;
    }

    public String getBuildId() {
        return this.buildId;
    }

    public String getLibraryName() {
        return this.libraryName;
    }
}
