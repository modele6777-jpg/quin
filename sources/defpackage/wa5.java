package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wa5 implements wkd {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public wa5(vr6 vr6Var) {
        this.d = vr6Var;
        this.c = new ns5(((xhb) vr6Var.c.b).a.j());
    }

    @Override // defpackage.wkd
    public final void M0(f41 f41Var, long j) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (this.b) {
                    f41Var.c1(j);
                } else {
                    try {
                        ((wkd) this.c).M0(f41Var, j);
                    } catch (IOException e) {
                        this.b = true;
                        ((ot1) obj).d(e);
                        return;
                    }
                }
                break;
            default:
                if (!this.b) {
                    ieg.a(f41Var.b, 0L, j);
                    ((xhb) ((vr6) obj).c.b).M0(f41Var, j);
                } else {
                    qc0.p("closed");
                }
                break;
        }
    }

    @Override // defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                try {
                    ((wkd) obj).close();
                } catch (IOException e) {
                    this.b = true;
                    ((ot1) obj2).d(e);
                    return;
                }
                break;
            default:
                vr6 vr6Var = (vr6) obj2;
                if (!this.b) {
                    this.b = true;
                    ns5 ns5Var = (ns5) obj;
                    jye jyeVar = ns5Var.e;
                    ns5Var.e = jye.d;
                    jyeVar.a();
                    jyeVar.b();
                    vr6Var.d = 3;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wkd, java.io.Flushable
    public final void flush() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                try {
                    ((wkd) this.c).flush();
                } catch (IOException e) {
                    this.b = true;
                    ((ot1) obj).d(e);
                    return;
                }
                break;
            default:
                if (!this.b) {
                    ((xhb) ((vr6) obj).c.b).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wkd
    public final jye j() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((wkd) obj).j();
            default:
                return (ns5) obj;
        }
    }

    public wa5(wkd wkdVar, ot1 ot1Var) {
        this.c = wkdVar;
        this.d = ot1Var;
    }
}
