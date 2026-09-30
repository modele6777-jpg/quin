package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i52 extends scg {
    public final ArrayList l;
    public final fye m;
    public final hp8 n;
    public g52 o;
    public h52 p;
    public long q;
    public long r;

    public i52(egh eghVar) {
        super((fu0) eghVar.c);
        this.n = new hp8((d82) eghVar.d);
        this.l = new ArrayList();
        this.m = new fye();
    }

    public final void B(gye gyeVar) {
        long j;
        long j2;
        fye fyeVar = this.m;
        gyeVar.n(0, fyeVar);
        long j3 = fyeVar.n;
        ArrayList arrayList = this.l;
        boolean zIsEmpty = arrayList.isEmpty();
        hp8 hp8Var = this.n;
        if (zIsEmpty || this.o == null) {
            hp8Var.getClass();
            long j4 = hp8Var.a;
            this.q = j3;
            this.r = j4 != Long.MIN_VALUE ? j3 + j4 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f52 f52Var = (f52) arrayList.get(i);
                long j5 = this.q;
                long j6 = this.r;
                f52Var.v = j5;
                f52Var.w = j6;
            }
            j = 0;
            j2 = j4;
        } else {
            hp8Var.getClass();
            long j7 = this.q - j3;
            long j8 = this.r;
            j2 = j8 != Long.MIN_VALUE ? j8 - j3 : Long.MIN_VALUE;
            j = j7;
        }
        try {
            hp8Var.getClass();
            g52 g52Var = new g52(gyeVar, j, j2);
            this.o = g52Var;
            l(g52Var);
        } catch (h52 e) {
            this.p = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((f52) arrayList.get(i2)).x = this.p;
            }
        }
    }

    @Override // defpackage.fu0
    public final up8 a(zp8 zp8Var, ta0 ta0Var, long j) {
        up8 up8VarA = this.k.a(zp8Var, ta0Var, j);
        this.n.getClass();
        f52 f52Var = new f52(up8VarA, true, this.q, this.r, 0);
        this.l.add(f52Var);
        return f52Var;
    }

    @Override // defpackage.eg2, defpackage.fu0
    public final void i() throws h52 {
        h52 h52Var = this.p;
        if (h52Var != null) {
            throw h52Var;
        }
        super.i();
    }

    @Override // defpackage.fu0
    public final void m(up8 up8Var) {
        ArrayList arrayList = this.l;
        pa7.J(arrayList.remove(up8Var));
        this.k.m(((f52) up8Var).a);
        if (arrayList.isEmpty()) {
            this.n.getClass();
            g52 g52Var = this.o;
            g52Var.getClass();
            B(g52Var.b);
        }
    }

    @Override // defpackage.eg2, defpackage.fu0
    public final void o() {
        super.o();
        this.p = null;
        this.o = null;
    }

    @Override // defpackage.fu0
    public final void r(op8 op8Var) {
        this.k.r(op8Var);
    }

    @Override // defpackage.scg
    public final void y(gye gyeVar) {
        if (this.p != null) {
            return;
        }
        B(gyeVar);
    }
}
