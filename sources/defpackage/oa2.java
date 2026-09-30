package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oa2 {
    public static final LinkedHashSet a;

    static {
        Set<jua> set = jua.a;
        t99 t99Var = tyd.a;
        ArrayList arrayList = new ArrayList(t72.u(set, 10));
        for (jua juaVar : set) {
            juaVar.getClass();
            arrayList.add(tyd.k.a(juaVar.e()));
        }
        ArrayList<dx5> arrayListR0 = s72.R0(s72.R0(s72.R0(arrayList, syd.f.i()), syd.h.i()), syd.j.i());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dx5 dx5Var : arrayListR0) {
            dx5Var.getClass();
            linkedHashSet.add(new j22(dx5Var.b(), dx5Var.a.g()));
        }
        a = linkedHashSet;
    }
}
