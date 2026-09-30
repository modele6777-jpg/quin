package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tj0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final xi0 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public tj0(sj0 sj0Var) {
        this.a = sj0Var.a;
        this.b = sj0Var.b;
        this.c = sj0Var.c;
        this.d = sj0Var.d;
        this.e = sj0Var.e;
        this.f = sj0Var.f;
        this.g = sj0Var.g;
        this.h = sj0Var.h;
        this.i = sj0Var.i;
        this.j = sj0Var.j;
        this.k = sj0Var.k;
    }

    public final sj0 a() {
        sj0 sj0Var = new sj0();
        sj0Var.a = this.a;
        sj0Var.b = this.b;
        sj0Var.c = this.c;
        sj0Var.d = this.d;
        sj0Var.e = this.e;
        sj0Var.f = this.f;
        sj0Var.g = this.g;
        sj0Var.h = this.h;
        sj0Var.i = this.i;
        sj0Var.j = this.j;
        sj0Var.k = this.k;
        return sj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tj0.class != obj.getClass()) {
            return false;
        }
        tj0 tj0Var = (tj0) obj;
        return this.a == tj0Var.a && this.b == tj0Var.b && this.c == tj0Var.c && this.d == tj0Var.d && this.e == tj0Var.e && this.f == tj0Var.f && this.h == tj0Var.h && this.i == tj0Var.i && this.j == tj0Var.j && this.k == tj0Var.k && this.g.equals(tj0Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
