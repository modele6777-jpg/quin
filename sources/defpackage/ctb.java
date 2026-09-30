package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ctb {
    public final List a;
    public final Map b;
    public final Map c;
    public final List d;
    public final ttb e;
    public final q47 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ctb(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, ttb ttbVar, int i) {
        int i2 = i & 2;
        qu4 qu4Var = qu4.a;
        this(list, i2 != 0 ? qu4Var : linkedHashMap, (i & 4) != 0 ? qu4Var : linkedHashMap2, (i & 8) != 0 ? pu4.a : arrayList, (i & 16) != 0 ? null : ttbVar, (q47) null);
    }

    public final String toString() {
        String str;
        ttb ttbVar = this.e;
        if (ttbVar == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) ttb.b(ttbVar.a));
        }
        return "Request(streams=" + this.a + str + ")@" + Integer.toHexString(hashCode());
    }

    public ctb(List list, Map map, Map map2, List list2, ttb ttbVar, q47 q47Var) {
        map.getClass();
        map2.getClass();
        list2.getClass();
        this.a = list;
        this.b = map;
        this.c = map2;
        this.d = list2;
        this.e = ttbVar;
        this.f = q47Var;
    }
}
