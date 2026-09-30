package com.google.firebase.crashlytics.internal.model;

import defpackage.r82;
import defpackage.ub3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {
    private final boolean isRooted;
    private final String osCodeName;
    private final String osRelease;

    public AutoValue_StaticSessionData_OsData(String str, String str2, boolean z) {
        if (str == null) {
            r82.g("Null osRelease");
            throw null;
        }
        this.osRelease = str;
        if (str2 == null) {
            r82.g("Null osCodeName");
            throw null;
        }
        this.osCodeName = str2;
        this.isRooted = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.OsData) {
            StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
            if (this.osRelease.equals(osData.osRelease()) && this.osCodeName.equals(osData.osCodeName()) && this.isRooted == osData.isRooted()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.isRooted ? 1231 : 1237) ^ ((((this.osRelease.hashCode() ^ 1000003) * 1000003) ^ this.osCodeName.hashCode()) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.isRooted;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.osCodeName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.osRelease;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.osRelease);
        sb.append(", osCodeName=");
        sb.append(this.osCodeName);
        sb.append(", isRooted=");
        return ub3.m(sb, this.isRooted, "}");
    }
}
