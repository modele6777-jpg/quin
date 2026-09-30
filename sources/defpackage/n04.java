package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n04 {
    public static final /* synthetic */ wn7[] j = {new aya(n04.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new aya(n04.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final be8 d;
    public final be8 e;
    public final mz0 f;
    public final ee8 g;
    public final ee8 h;
    public final /* synthetic */ o04 i;

    public n04(o04 o04Var, List list, List list2, List list3) {
        this.i = o04Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            t99 t99VarV = i7h.v((u99) o04Var.b.c, ((dza) ((ut8) obj)).g0());
            Object arrayList = linkedHashMap.get(t99VarV);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(t99VarV, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = a(linkedHashMap);
        o04 o04Var2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            t99 t99VarV2 = i7h.v((u99) o04Var2.b.c, ((kza) ((ut8) obj2)).t0());
            Object arrayList2 = linkedHashMap2.get(t99VarV2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(t99VarV2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = a(linkedHashMap2);
        ((tz3) this.i.b.b).c.getClass();
        o04 o04Var3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            t99 t99VarV3 = i7h.v((u99) o04Var3.b.c, ((xza) ((ut8) obj3)).P());
            Object arrayList3 = linkedHashMap3.get(t99VarV3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(t99VarV3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = a(linkedHashMap3);
        int i = 0;
        this.d = ((tz3) this.i.b.b).a.b(new k04(this, i));
        int i2 = 1;
        this.e = ((tz3) this.i.b.b).a.b(new k04(this, i2));
        this.f = ((tz3) this.i.b.b).a.c(new k04(this, 2));
        o04 o04Var4 = this.i;
        ge8 ge8Var = ((tz3) o04Var4.b.b).a;
        l04 l04Var = new l04(this, o04Var4, i);
        ge8Var.getClass();
        this.g = new ee8(ge8Var, l04Var);
        o04 o04Var5 = this.i;
        ge8 ge8Var2 = ((tz3) o04Var5.b.b).a;
        l04 l04Var2 = new l04(this, o04Var5, i2);
        ge8Var2.getClass();
        this.h = new ee8(ge8Var2, l04Var2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<i3> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(t72.u(iterable, 10));
            for (i3 i3Var : iterable) {
                int iE = i3Var.e();
                int iS = p90.s(iE) + iE;
                if (iS > 4096) {
                    iS = 4096;
                }
                p90 p90VarK = p90.K(byteArrayOutputStream, iS);
                p90VarK.q0(iE);
                i3Var.d(p90VarK);
                p90VarK.b0();
                arrayList.add(wef.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
