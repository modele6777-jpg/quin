package defpackage;

import java.util.EnumSet;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xq0 implements h0a {
    @Override // defpackage.h0a
    public final void a(g0a g0aVar) {
        ar0 ar0Var = new ar0();
        EnumSet.allOf(s68.class);
        s68 s68Var = s68.a;
        s68 s68Var2 = s68.b;
        EnumSet enumSetOf = EnumSet.of(s68Var, s68Var2);
        if (enumSetOf == null) {
            r82.g("linkTypes must not be null");
            return;
        }
        HashSet hashSet = new HashSet(enumSetOf);
        ar0Var.a = new gg7(hashSet.contains(s68Var) ? new pzd(8) : null, hashSet.contains(s68.c) ? new w1e(12) : null, hashSet.contains(s68Var2) ? new i8c(29) : null, 4);
        g0aVar.e.add(ar0Var);
    }
}
