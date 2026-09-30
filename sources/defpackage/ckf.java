package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ckf {
    public final qif a;
    public final aj1 b;
    public final fe6 c;
    public final qif d;
    public final ace e;
    public final ace f;

    public ckf(qif qifVar, aj1 aj1Var, fe6 fe6Var, qif qifVar2) {
        this.a = qifVar;
        this.b = aj1Var;
        this.c = fe6Var;
        this.d = qifVar2;
        final int i = 0;
        this.e = new ace(new x16(this) { // from class: bkf
            public final /* synthetic */ ckf b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                ckf ckfVar = this.b;
                switch (i2) {
                    case 0:
                        return (yf1) ckfVar.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Object obj = ckfVar.d.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            wj1 wj1Var = (wj1) entry.getKey();
                            lu3 lu3Var = (lu3) entry.getValue();
                            d3e d3eVar = ((dg1) ckfVar.a()).c;
                            d3eVar.getClass();
                            wj1Var.getClass();
                            xj1 xj1Var = (xj1) d3eVar.b.get(wj1Var);
                            if (xj1Var != null) {
                                linkedHashMap.put(lu3Var, new e3e(xj1Var.a));
                            }
                        }
                        return bm8.X(linkedHashMap);
                }
            }
        });
        final int i2 = 1;
        this.f = new ace(new x16(this) { // from class: bkf
            public final /* synthetic */ ckf b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                ckf ckfVar = this.b;
                switch (i3) {
                    case 0:
                        return (yf1) ckfVar.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Object obj = ckfVar.d.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            wj1 wj1Var = (wj1) entry.getKey();
                            lu3 lu3Var = (lu3) entry.getValue();
                            d3e d3eVar = ((dg1) ckfVar.a()).c;
                            d3eVar.getClass();
                            wj1Var.getClass();
                            xj1 xj1Var = (xj1) d3eVar.b.get(wj1Var);
                            if (xj1Var != null) {
                                linkedHashMap.put(lu3Var, new e3e(xj1Var.a));
                            }
                        }
                        return bm8.X(linkedHashMap);
                }
            }
        });
    }

    public final yf1 a() {
        Object value = this.e.getValue();
        value.getClass();
        return (yf1) value;
    }

    public final LinkedHashSet b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3e e3eVar = (e3e) ((Map) this.f.getValue()).get((lu3) it.next());
            if (e3eVar != null) {
                linkedHashSet.add(e3eVar);
            }
        }
        return linkedHashSet;
    }
}
