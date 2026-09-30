package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb9 {
    public m93 a;
    public boolean b;
    public szc c;

    public abstract void a();

    public abstract void b();

    public abstract void c(vb9 vb9Var);

    public abstract void d(vb9 vb9Var);

    public final void e() {
        szc szcVar = this.c;
        if (szcVar == null || !((LinkedHashSet) szcVar.d).remove(this)) {
            return;
        }
        ac9 ac9Var = (ac9) szcVar.c;
        if (equals(ac9Var.f)) {
            if (ac9Var.g == -1) {
                a();
            }
            ac9Var.f = null;
            ac9Var.g = 0;
            ac9Var.h = null;
        }
        ac9Var.d.remove(this);
        ac9Var.e.remove(this);
        this.c = null;
        ac9Var.b();
    }

    public final void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        szc szcVar = this.c;
        if (szcVar != null) {
            ((ac9) szcVar.c).b();
        }
    }
}
