package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pl {
    public final long a;
    public final gye b;
    public final int c;
    public final zp8 d;
    public final long e;
    public final gye f;
    public final int g;
    public final zp8 h;
    public final long i;
    public final long j;

    public pl(long j, gye gyeVar, int i, zp8 zp8Var, long j2, gye gyeVar2, int i2, zp8 zp8Var2, long j3, long j4) {
        this.a = j;
        this.b = gyeVar;
        this.c = i;
        this.d = zp8Var;
        this.e = j2;
        this.f = gyeVar2;
        this.g = i2;
        this.h = zp8Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pl.class != obj.getClass()) {
            return false;
        }
        pl plVar = (pl) obj;
        return this.a == plVar.a && this.c == plVar.c && this.e == plVar.e && this.g == plVar.g && this.i == plVar.i && this.j == plVar.j && this.b.equals(plVar.b) && Objects.equals(this.d, plVar.d) && Objects.equals(this.f, plVar.f) && Objects.equals(this.h, plVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
