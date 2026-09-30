package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class igc {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;

    public igc(String str, String str2, String str3, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igc)) {
            return false;
        }
        igc igcVar = (igc) obj;
        return pa7.t(this.a, igcVar.a) && pa7.t(this.b, igcVar.b) && pa7.t(this.c, igcVar.c) && pa7.t(this.d, igcVar.d) && pa7.t(this.e, igcVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("ScreenshotMediaMetadata(displayName=", this.a, ", relativePath=", this.b, ", absolutePath=");
        sbO.append(this.c);
        sbO.append(", dateAddedEpochSeconds=");
        sbO.append(this.d);
        sbO.append(", dateTakenEpochMillis=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
