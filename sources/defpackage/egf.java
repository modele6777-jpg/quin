package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class egf {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        dgf[] dgfVarArrValues = dgf.values();
        ArrayList arrayList = new ArrayList(dgfVarArrValues.length);
        for (dgf dgfVar : dgfVarArrValues) {
            arrayList.add(dgfVar.c());
        }
        a = s72.o1(arrayList);
        zff[] zffVarArrValues = zff.values();
        ArrayList arrayList2 = new ArrayList(zffVarArrValues.length);
        for (zff zffVar : zffVarArrValues) {
            arrayList2.add(zffVar.a());
        }
        s72.o1(arrayList2);
        b = new HashMap();
        c = new HashMap();
        bm8.O(new HashMap(bm8.F(4)), new iy9[]{new iy9(zff.UBYTEARRAY, t99.e("ubyteArrayOf")), new iy9(zff.USHORTARRAY, t99.e("ushortArrayOf")), new iy9(zff.UINTARRAY, t99.e("uintArrayOf")), new iy9(zff.ULONGARRAY, t99.e("ulongArrayOf"))});
        dgf[] dgfVarArrValues2 = dgf.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dgf dgfVar2 : dgfVarArrValues2) {
            linkedHashSet.add(dgfVar2.a().f());
        }
        d = linkedHashSet;
        for (dgf dgfVar3 : dgf.values()) {
            b.put(dgfVar3.a(), dgfVar3.b());
            c.put(dgfVar3.b(), dgfVar3.a());
        }
    }

    public static final boolean a(tt7 tt7Var) {
        y22 y22VarM;
        if (w8f.m(tt7Var) || (y22VarM = tt7Var.c0().m()) == null) {
            return false;
        }
        bm3 bm3VarK = y22VarM.k();
        return (bm3VarK instanceof kw9) && pa7.t(((lw9) ((kw9) bm3VarK)).f, tyd.k) && a.contains(y22VarM.getName());
    }
}
