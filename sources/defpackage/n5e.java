package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n5e extends IllegalStateException {
    public final int stuckType;
    public final int timeoutMs;

    /* JADX WARN: Illegal instructions before constructor call */
    public n5e(int i, int i2) {
        String strF;
        if (i == 0) {
            strF = tec.f(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strF = tec.f(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strF = tec.f(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strF = tec.f(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                r3.l();
                throw null;
            }
            strF = tec.f(i2, "Player stuck suppressed for ", " ms");
        }
        super(strF);
        this.stuckType = i;
        this.timeoutMs = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n5e.class == obj.getClass()) {
            n5e n5eVar = (n5e) obj;
            if (this.stuckType == n5eVar.stuckType && this.timeoutMs == n5eVar.timeoutMs) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((527 + this.stuckType) * 31) + this.timeoutMs;
    }
}
