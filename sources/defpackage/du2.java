package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class du2 {
    public String a;
    public String b;
    public String d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long c = 253402300799999L;
    public String e = "/";

    public final eu2 a() {
        String str = this.a;
        if (str == null) {
            r82.g("builder.name == null");
            return null;
        }
        String str2 = this.b;
        if (str2 == null) {
            r82.g("builder.value == null");
            return null;
        }
        long j = this.c;
        String str3 = this.d;
        if (str3 != null) {
            return new eu2(str, str2, j, str3, this.e, this.f, this.g, this.h, this.i, null);
        }
        r82.g("builder.domain == null");
        return null;
    }

    public final void b(String str, boolean z) {
        String strB = geg.b(str);
        if (strB == null) {
            qc0.j("unexpected domain: ".concat(str));
        } else {
            this.d = strB;
            this.i = z;
        }
    }

    public final void c(long j) {
        if (j <= 0) {
            j = Long.MIN_VALUE;
        }
        if (j > 253402300799999L) {
            j = 253402300799999L;
        }
        this.c = j;
        this.h = true;
    }

    public final void d(String str) {
        str.getClass();
        if (pa7.t(v4e.o0(str).toString(), str)) {
            this.a = str;
        } else {
            qc0.j("name is not trimmed");
        }
    }

    public final void e(String str) {
        str.getClass();
        if (c5e.C(str, "/", false)) {
            this.e = str;
        } else {
            qc0.j("path must start with '/'");
        }
    }

    public final void f(String str) {
        str.getClass();
        if (pa7.t(v4e.o0(str).toString(), str)) {
            this.b = str;
        } else {
            qc0.j("value is not trimmed");
        }
    }
}
