package defpackage;

import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nma {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public nma(boolean z, usc uscVar, boolean z2, int i) {
        pr4 pr4Var = pu.a;
        int i2 = !z ? 262152 : 262144;
        i2 = uscVar == usc.b ? i2 | UserMetadata.MAX_INTERNAL_KEY_SIZE : i2;
        this(z2 ? i2 : i2 | 512, uscVar == usc.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nma)) {
            return false;
        }
        nma nmaVar = (nma) obj;
        return this.a == nmaVar.a && this.b == nmaVar.b && this.c == nmaVar.c && this.d == nmaVar.d && this.e == nmaVar.e && this.f == nmaVar.f;
    }

    public final int hashCode() {
        return (ub3.d(ub3.d(ub3.d(ub3.d(ub3.d(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public nma(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
    }

    public nma(boolean z) {
        this(z, usc.a, true, 0);
    }
}
