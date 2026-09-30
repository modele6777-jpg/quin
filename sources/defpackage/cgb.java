package defpackage;

import ai.askquin.data.QuotaBlockReason;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cgb {
    public final String a;
    public final String b;
    public final QuotaBlockReason c;
    public final String d;

    public cgb(String str, String str2, QuotaBlockReason quotaBlockReason, String str3) {
        str.getClass();
        quotaBlockReason.getClass();
        this.a = str;
        this.b = str2;
        this.c = quotaBlockReason;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgb)) {
            return false;
        }
        cgb cgbVar = (cgb) obj;
        return pa7.t(this.a, cgbVar.a) && this.b.equals(cgbVar.b) && this.c == cgbVar.c && pa7.t(this.d, cgbVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ub3.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("ReadingLockedExposure(chatId=", this.a, ", source=", this.b, ", blockedReason=");
        sbO.append(this.c);
        sbO.append(", entrySource=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
