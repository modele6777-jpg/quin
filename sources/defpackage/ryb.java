package defpackage;

import java.io.Closeable;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ryb implements Closeable {
    public c81 E0;
    public final boolean F0;
    public final long X;
    public final zi0 Y;
    public final g2f Z;
    public final btb a;
    public final a1b b;
    public final String c;
    public final int d;
    public final bh6 e;
    public final si6 f;
    public final vyb g;
    public final rsd v;
    public final ryb w;
    public final ryb x;
    public final ryb y;
    public final long z;

    public ryb(btb btbVar, a1b a1bVar, String str, int i, bh6 bh6Var, si6 si6Var, vyb vybVar, rsd rsdVar, ryb rybVar, ryb rybVar2, ryb rybVar3, long j, long j2, zi0 zi0Var, g2f g2fVar) {
        btbVar.getClass();
        a1bVar.getClass();
        str.getClass();
        vybVar.getClass();
        g2fVar.getClass();
        this.a = btbVar;
        this.b = a1bVar;
        this.c = str;
        this.d = i;
        this.e = bh6Var;
        this.f = si6Var;
        this.g = vybVar;
        this.v = rsdVar;
        this.w = rybVar;
        this.x = rybVar2;
        this.y = rybVar3;
        this.z = j;
        this.X = j2;
        this.Y = zi0Var;
        this.Z = g2fVar;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.F0 = z;
    }

    public final c81 b() {
        c81 c81Var = this.E0;
        if (c81Var != null) {
            return c81Var;
        }
        int i = c81.n;
        c81 c81VarK = rxg.K(this.f);
        this.E0 = c81VarK;
        return c81VarK;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final pyb h() {
        pyb pybVar = new pyb();
        pybVar.c = -1;
        pybVar.g = vyb.b;
        pybVar.o = g2f.d0;
        pybVar.a = this.a;
        pybVar.b = this.b;
        pybVar.c = this.d;
        pybVar.d = this.c;
        pybVar.e = this.e;
        pybVar.f = xdc.j(this.f);
        pybVar.g = this.g;
        pybVar.h = this.v;
        pybVar.i = this.w;
        pybVar.j = this.x;
        pybVar.k = this.y;
        pybVar.l = this.z;
        pybVar.m = this.X;
        pybVar.n = this.Y;
        pybVar.o = this.Z;
        return pybVar;
    }

    public final tyb l() throws EOFException {
        vyb vybVar = this.g;
        yhb yhbVarPeek = vybVar.P0().peek();
        f41 f41Var = new f41();
        yhbVarPeek.request(65536L);
        long jMin = Math.min(65536L, yhbVarPeek.b.b);
        while (jMin > 0) {
            long jC0 = yhbVarPeek.c0(f41Var, jMin);
            if (jC0 == -1) {
                throw new EOFException();
            }
            jMin -= jC0;
        }
        tyb tybVar = vyb.b;
        return new tyb(vybVar.l(), f41Var.b, f41Var);
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
