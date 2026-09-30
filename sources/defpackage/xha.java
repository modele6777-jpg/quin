package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xha {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public xha(boolean z, boolean z2, long j, long j2, long j3, String str) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
    }

    public static xha a(xha xhaVar, boolean z, boolean z2, long j, long j2, long j3, String str, int i) {
        if ((i & 1) != 0) {
            z = xhaVar.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = xhaVar.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            j = xhaVar.c;
        }
        long j4 = j;
        long j5 = (i & 8) != 0 ? xhaVar.d : j2;
        long j6 = (i & 16) != 0 ? xhaVar.e : j3;
        String str2 = (i & 32) != 0 ? xhaVar.f : str;
        xhaVar.getClass();
        return new xha(z3, z4, j4, j5, j6, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xha)) {
            return false;
        }
        xha xhaVar = (xha) obj;
        return this.a == xhaVar.a && this.b == xhaVar.b && this.c == xhaVar.c && this.d == xhaVar.d && this.e == xhaVar.e && pa7.t(this.f, xhaVar.f);
    }

    public final int hashCode() {
        int iB = ib8.b(ib8.b(ib8.b(ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("PlayerState(isPlaying=", ", isReady=", ", currentPosition=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", bufferedPosition=");
        sbP.append(this.d);
        sbP.append(", duration=");
        sbP.append(this.e);
        sbP.append(", error=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ xha() {
        this(false, false, 0L, 0L, 0L, null);
    }
}
