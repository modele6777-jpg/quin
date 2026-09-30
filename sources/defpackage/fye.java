package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fye {
    public static final Object o = new Object();
    public static final op8 p;
    public Object a = o;
    public op8 b = p;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public kp8 h;
    public boolean i;
    public long j;
    public long k;
    public int l;
    public int m;
    public long n;

    static {
        d82 d82Var = new d82();
        new eu4();
        List list = Collections.EMPTY_LIST;
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        jp8 jp8Var = new jp8();
        mp8 mp8Var = mp8.a;
        Uri uri = Uri.EMPTY;
        p = new op8("androidx.media3.common.Timeline", new ip8(d82Var), uri != null ? new lp8(uri, null, null, list, yobVar, -9223372036854775807L) : null, new kp8(jp8Var), rp8.C, mp8Var);
        kv2.v(1, 2, 3, 4, 5);
        kv2.v(6, 7, 8, 9, 10);
        pqf.D(11);
        pqf.D(12);
        pqf.D(13);
        pqf.D(14);
    }

    public final boolean a() {
        return this.h != null;
    }

    public final void b(op8 op8Var, boolean z, boolean z2, kp8 kp8Var, long j, long j2) {
        this.a = o;
        this.b = op8Var != null ? op8Var : p;
        if (op8Var != null) {
            lp8 lp8Var = op8Var.b;
        }
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = z;
        this.g = z2;
        this.h = kp8Var;
        this.j = j;
        this.k = j2;
        this.l = 0;
        this.m = 0;
        this.n = 0L;
        this.i = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fye.class.equals(obj.getClass())) {
            return false;
        }
        fye fyeVar = (fye) obj;
        return Objects.equals(this.a, fyeVar.a) && Objects.equals(this.b, fyeVar.b) && Objects.equals(this.h, fyeVar.h) && this.c == fyeVar.c && this.d == fyeVar.d && this.e == fyeVar.e && this.f == fyeVar.f && this.g == fyeVar.g && this.i == fyeVar.i && this.j == fyeVar.j && this.k == fyeVar.k && this.l == fyeVar.l && this.m == fyeVar.m && this.n == fyeVar.n;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 961;
        kp8 kp8Var = this.h;
        int iHashCode2 = kp8Var == null ? 0 : kp8Var.hashCode();
        long j = this.c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31;
        long j4 = this.j;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.k;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.l) * 31) + this.m) * 31;
        long j6 = this.n;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
