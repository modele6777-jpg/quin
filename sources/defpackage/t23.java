package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t23 {
    public Context a;

    public u23 a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        u23 u23Var = new u23();
        u23Var.a = ri4.a(b35.a);
        kb6 kb6Var = new kb6(18, context);
        u23Var.b = kb6Var;
        u23Var.c = ri4.a(new w84(20, kb6Var, new m6c(11, kb6Var)));
        kb6 kb6Var2 = u23Var.b;
        u23Var.d = new n05(kb6Var2, 1);
        h1b h1bVarA = ri4.a(new vea(5, u23Var.d, ri4.a(new n05(kb6Var2, 0))));
        u23Var.e = h1bVarA;
        y25 y25Var = new y25(25);
        kb6 kb6Var3 = u23Var.b;
        gg7 gg7Var = new gg7(kb6Var3, h1bVarA, y25Var, 24);
        h1b h1bVar = u23Var.a;
        h1b h1bVar2 = u23Var.c;
        u23Var.f = ri4.a(new psd(new a82(h1bVar, h1bVar2, gg7Var, h1bVarA, h1bVarA, 9), new hc2(kb6Var3, h1bVar2, h1bVarA, gg7Var, h1bVar, h1bVarA, h1bVarA, 8), new kxa(h1bVar, h1bVarA, gg7Var, h1bVarA), 9));
        return u23Var;
    }
}
