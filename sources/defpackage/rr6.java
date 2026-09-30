package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rr6 implements wkd {
    public final ns5 a;
    public boolean b;
    public final /* synthetic */ vr6 c;

    public rr6(vr6 vr6Var) {
        this.c = vr6Var;
        this.a = new ns5(((xhb) vr6Var.c.b).a.j());
    }

    @Override // defpackage.wkd
    public final void M0(f41 f41Var, long j) {
        if (this.b) {
            qc0.p("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        xhb xhbVar = (xhb) this.c.c.b;
        if (xhbVar.c) {
            qc0.p("closed");
            return;
        }
        xhbVar.b.k1(j);
        xhbVar.b();
        xhbVar.i0("\r\n");
        xhbVar.M0(f41Var, j);
        xhbVar.i0("\r\n");
    }

    @Override // defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((xhb) this.c.c.b).i0("0\r\n\r\n");
        ns5 ns5Var = this.a;
        jye jyeVar = ns5Var.e;
        ns5Var.e = jye.d;
        jyeVar.a();
        jyeVar.b();
        this.c.d = 3;
    }

    @Override // defpackage.wkd, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((xhb) this.c.c.b).flush();
    }

    @Override // defpackage.wkd
    public final jye j() {
        return this.a;
    }
}
