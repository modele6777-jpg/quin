package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uu3 implements o05, whd {
    public final am a;
    public volatile o05 b;

    public uu3(am amVar) {
        this.a = amVar;
    }

    @Override // defpackage.o05
    public final synchronized void a() {
        o05 o05Var = this.b;
        if (o05Var != null) {
            o05Var.a();
        }
    }

    @Override // defpackage.o05
    public final synchronized void b(String str) {
        o05 o05Var = this.b;
        if (o05Var != null) {
            o05Var.b(str);
        }
    }

    @Override // defpackage.o05
    public final synchronized void c(String str, trd trdVar) {
        str.getClass();
        o05 o05Var = this.b;
        if (o05Var != null) {
            o05Var.c(str, trdVar);
        }
    }

    @Override // defpackage.whd
    public final synchronized boolean d(s7a s7aVar) {
        whd whdVar;
        try {
            o05 o05Var = this.b;
            whdVar = o05Var instanceof whd ? (whd) o05Var : null;
        } catch (Throwable th) {
            throw th;
        }
        return whdVar != null ? whdVar.d(s7aVar) : false;
    }

    @Override // defpackage.o05
    public final synchronized void e(a26 a26Var) {
        o05 o05Var = this.b;
        if (o05Var != null) {
            o05Var.e(a26Var);
        }
    }

    @Override // defpackage.o05
    public final synchronized void f(String str) {
        o05 o05Var = this.b;
        if (o05Var != null) {
            o05Var.f(str);
        }
    }

    @Override // defpackage.o05
    public final synchronized void reset() {
        o05 o05Var = this.b;
        if (o05Var != null) {
            o05Var.reset();
        }
    }
}
