package defpackage;

import ai.askquin.ui.settings.model.ExpireableCount;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ib implements lb {
    public final ExpireableCount a;
    public final int b;
    public final int c;
    public final String d;

    public ib(ExpireableCount expireableCount, int i, int i2, String str) {
        this.a = expireableCount;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return this.a.equals(ibVar.a) && this.b == ibVar.b && this.c == ibVar.c && pa7.t(this.d, ibVar.d);
    }

    public final int hashCode() {
        int iB = ub3.b(this.c, ub3.b(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExpiringCount(count=" + this.a + ", remainingCount=" + this.b + ", totalCount=" + this.c + ", expiresAt=" + this.d + ")";
    }
}
