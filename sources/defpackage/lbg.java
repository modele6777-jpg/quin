package defpackage;

import androidx.work.OverwritingInputMerger;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lbg {
    public static final String z = ff8.n("WorkSpec");
    public final String a;
    public vag b;
    public final String c;
    public final String d;
    public bb3 e;
    public final bb3 f;
    public long g;
    public final long h;
    public final long i;
    public jl2 j;
    public final int k;
    public us0 l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public rs9 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;

    public /* synthetic */ lbg(String str, vag vagVar, String str2, String str3, bb3 bb3Var, bb3 bb3Var2, long j, long j2, long j3, jl2 jl2Var, int i, us0 us0Var, long j4, long j5, long j6, long j7, boolean z2, rs9 rs9Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? vag.a : vagVar, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? bb3.b : bb3Var, (i5 & 32) != 0 ? bb3.b : bb3Var2, (i5 & 64) != 0 ? 0L : j, (i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? jl2.j : jl2Var, (i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? 0 : i, (i5 & 2048) != 0 ? us0.a : us0Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? rs9.a : rs9Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public final long a() {
        return z8c.e(this.b == vag.a && this.k > 0, this.k, this.l, this.m, this.n, this.s, b(), this.g, this.i, this.h, this.u);
    }

    public final boolean b() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbg)) {
            return false;
        }
        lbg lbgVar = (lbg) obj;
        return pa7.t(this.a, lbgVar.a) && this.b == lbgVar.b && pa7.t(this.c, lbgVar.c) && pa7.t(this.d, lbgVar.d) && pa7.t(this.e, lbgVar.e) && pa7.t(this.f, lbgVar.f) && this.g == lbgVar.g && this.h == lbgVar.h && this.i == lbgVar.i && pa7.t(this.j, lbgVar.j) && this.k == lbgVar.k && this.l == lbgVar.l && this.m == lbgVar.m && this.n == lbgVar.n && this.o == lbgVar.o && this.p == lbgVar.p && this.q == lbgVar.q && this.r == lbgVar.r && this.s == lbgVar.s && this.t == lbgVar.t && this.u == lbgVar.u && this.v == lbgVar.v && this.w == lbgVar.w && pa7.t(this.x, lbgVar.x) && pa7.t(this.y, lbgVar.y);
    }

    public final int hashCode() {
        int iB = ub3.b(this.w, ub3.b(this.v, ib8.b(ub3.b(this.t, ub3.b(this.s, (this.r.hashCode() + ub3.d(ib8.b(ib8.b(ib8.b(ib8.b((this.l.hashCode() + ub3.b(this.k, (this.j.hashCode() + ib8.b(ib8.b(ib8.b((this.f.hashCode() + ((this.e.hashCode() + ub3.c(ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return ub3.l(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public lbg(String str, vag vagVar, String str2, String str3, bb3 bb3Var, bb3 bb3Var2, long j, long j2, long j3, jl2 jl2Var, int i, us0 us0Var, long j4, long j5, long j6, long j7, boolean z2, rs9 rs9Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        vagVar.getClass();
        str2.getClass();
        str3.getClass();
        bb3Var.getClass();
        bb3Var2.getClass();
        jl2Var.getClass();
        us0Var.getClass();
        rs9Var.getClass();
        this.a = str;
        this.b = vagVar;
        this.c = str2;
        this.d = str3;
        this.e = bb3Var;
        this.f = bb3Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = jl2Var;
        this.k = i;
        this.l = us0Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = rs9Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
