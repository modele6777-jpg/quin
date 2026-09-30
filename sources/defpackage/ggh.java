package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ggh {
    public final String a;
    public final boolean b;
    public final e4h c;
    public final BitSet d;
    public final BitSet e;
    public final kd0 f;
    public final kd0 g;
    public final /* synthetic */ fmg h;

    public ggh(fmg fmgVar, String str, e4h e4hVar, BitSet bitSet, BitSet bitSet2, kd0 kd0Var, kd0 kd0Var2) {
        this.h = fmgVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = kd0Var;
        this.g = new kd0(0);
        for (Integer num : (gd0) kd0Var2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) kd0Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = e4hVar;
    }

    public final void a(va9 va9Var) {
        int iC = va9Var.c();
        if (((Boolean) va9Var.c) != null) {
            this.e.set(iC, true);
        }
        Boolean bool = (Boolean) va9Var.d;
        if (bool != null) {
            this.d.set(iC, bool.booleanValue());
        }
        if (((Long) va9Var.e) != null) {
            Integer numValueOf = Integer.valueOf(iC);
            kd0 kd0Var = this.f;
            Long l = (Long) kd0Var.get(numValueOf);
            long jLongValue = ((Long) va9Var.e).longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                kd0Var.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (((Long) va9Var.f) != null) {
            Integer numValueOf2 = Integer.valueOf(iC);
            kd0 kd0Var2 = this.g;
            List arrayList = (List) kd0Var2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                kd0Var2.put(numValueOf2, arrayList);
            }
            if (va9Var.d()) {
                arrayList.clear();
            }
            hpg.a();
            w3h w3hVar = (w3h) this.h.b;
            qqg qqgVar = w3hVar.d;
            azg azgVar = bzg.F0;
            String str = this.a;
            if (qqgVar.L0(str, azgVar) && va9Var.e()) {
                arrayList.clear();
            }
            hpg.a();
            boolean zL0 = w3hVar.d.L0(str, azgVar);
            Long l2 = (Long) va9Var.f;
            if (!zL0) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final z1h b(int i) {
        List list;
        x1h x1hVarY = z1h.y();
        x1hVarY.c();
        ((z1h) x1hVarY.b).z(i);
        x1hVarY.c();
        ((z1h) x1hVarY.b).C(this.b);
        e4h e4hVar = this.c;
        if (e4hVar != null) {
            x1hVarY.c();
            ((z1h) x1hVarY.b).B(e4hVar);
        }
        d4h d4hVarZ = e4h.z();
        ArrayList arrayListG1 = lch.g1(this.d);
        d4hVarZ.c();
        ((e4h) d4hVarZ.b).D(arrayListG1);
        ArrayList arrayListG2 = lch.g1(this.e);
        d4hVarZ.c();
        ((e4h) d4hVarZ.b).B(arrayListG2);
        kd0 kd0Var = this.f;
        ArrayList arrayList = new ArrayList(kd0Var.c);
        for (Integer num : (gd0) kd0Var.keySet()) {
            int iIntValue = num.intValue();
            Long l = (Long) kd0Var.get(num);
            if (l != null) {
                p2h p2hVarV = s2h.v();
                p2hVarV.c();
                ((s2h) p2hVarV.b).w(iIntValue);
                long jLongValue = l.longValue();
                p2hVarV.c();
                ((s2h) p2hVarV.b).x(jLongValue);
                arrayList.add((s2h) p2hVarV.e());
            }
        }
        d4hVarZ.c();
        ((e4h) d4hVarZ.b).F(arrayList);
        kd0 kd0Var2 = this.g;
        if (kd0Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(kd0Var2.c);
            for (Integer num2 : (gd0) kd0Var2.keySet()) {
                g4h g4hVarW = h4h.w();
                int iIntValue2 = num2.intValue();
                g4hVarW.c();
                ((h4h) g4hVarW.b).x(iIntValue2);
                List list2 = (List) kd0Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    g4hVarW.c();
                    ((h4h) g4hVarW.b).y(list2);
                }
                arrayList2.add((h4h) g4hVarW.e());
            }
            list = arrayList2;
        }
        d4hVarZ.c();
        ((e4h) d4hVarZ.b).H(list);
        x1hVarY.c();
        ((z1h) x1hVarY.b).A((e4h) d4hVarZ.e());
        return (z1h) x1hVarY.e();
    }

    public ggh(fmg fmgVar, String str) {
        this.h = fmgVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new kd0(0);
        this.g = new kd0(0);
    }
}
