package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c08 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e08 c;

    public c08(e08 e08Var, int i) {
        this.c = e08Var;
        this.a = i;
    }

    public final void a(int i) {
        e08 e08Var = this.c;
        zi0 zi0Var = e08Var.c;
        if (zi0Var == null) {
            return;
        }
        this.b.add(new vsa(zi0Var, i, e08Var.b, null));
    }
}
