package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zqc {
    public final int a;
    public final SolarTerm b;

    public zqc(int i, SolarTerm solarTerm) {
        solarTerm.getClass();
        this.a = i;
        this.b = solarTerm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqc)) {
            return false;
        }
        zqc zqcVar = (zqc) obj;
        return this.a == zqcVar.a && this.b == zqcVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CampaignKey(year=" + this.a + ", solarTerm=" + this.b + ")";
    }
}
