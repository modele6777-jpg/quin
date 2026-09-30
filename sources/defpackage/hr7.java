package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hr7 {
    public rs0 a = new bt(1);
    public final k47 b = new k47(this);
    public final szc c = new szc(this);
    public final ta0 d = new ta0(this);
    public final vd9 e;

    public hr7() {
        new ConcurrentHashMap();
        new HashMap();
        this.e = new vd9(29);
    }

    public final void a() {
        rs0 rs0Var = this.a;
        rs0Var.getClass();
        a48 a48Var = a48.a;
        rs0Var.H(a48Var, "Create eager instances ...");
        long jA = a19.a();
        ta0 ta0Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ta0Var.b;
        ckd[] ckdVarArr = (ckd[]) concurrentHashMap.values().toArray(new ckd[0]);
        ArrayList arrayListQ = t72.q(Arrays.copyOf(ckdVarArr, ckdVarArr.length));
        concurrentHashMap.clear();
        hr7 hr7Var = (hr7) ta0Var.c;
        hbc hbcVar = new hbc(hr7Var.a, (nfc) hr7Var.c.e, job.a.b(if9.class));
        Iterator it = arrayListQ.iterator();
        while (it.hasNext()) {
            ((ckd) it.next()).b(hbcVar);
        }
        long jA2 = zxe.a(jA);
        rs0 rs0Var2 = this.a;
        StringBuilder sb = new StringBuilder("Created eager instances in ");
        qfc qfcVar = ar4.b;
        sb.append(ar4.h(jA2, gr4.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        String string = sb.toString();
        rs0Var2.getClass();
        rs0Var2.H(a48Var, string);
    }

    public final void b(List list) {
        Object next;
        LinkedHashSet<t09> linkedHashSet = new LinkedHashSet();
        ad0 ad0Var = new ad0(new sm8(list));
        while (!ad0Var.isEmpty()) {
            t09 t09Var = (t09) ad0Var.removeLast();
            if (linkedHashSet.add(t09Var)) {
                Iterator it = new n0c(t09Var.e).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((m0c) it).b;
                    if (listIterator.hasPrevious()) {
                        t09 t09Var2 = (t09) listIterator.previous();
                        if (!linkedHashSet.contains(t09Var2)) {
                            ad0Var.addLast(t09Var2);
                        }
                    }
                }
            }
        }
        ta0 ta0Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ta0Var.b;
        for (t09 t09Var3 : linkedHashSet) {
            for (Map.Entry entry : t09Var3.c.entrySet()) {
                String str = (String) entry.getKey();
                u57 u57Var = (u57) entry.getValue();
                yw0 yw0Var = u57Var.a;
                hr7 hr7Var = (hr7) ta0Var.c;
                str.getClass();
                yw0 yw0Var2 = u57Var.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ta0Var.d;
                if (((u57) concurrentHashMap2.get(str)) != null) {
                    rs0 rs0Var = hr7Var.a;
                    rs0Var.getClass();
                    rs0Var.H(a48.c, "(+) override index '" + str + "' -> '" + yw0Var2 + '\'');
                    Iterator it2 = concurrentHashMap.values().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!((ckd) next).a.equals(yw0Var2));
                    if (((ckd) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(yw0Var2.hashCode()));
                    }
                }
                rs0 rs0Var2 = hr7Var.a;
                rs0Var2.getClass();
                rs0Var2.H(a48.a, "(+) index '" + str + "' -> '" + yw0Var2 + '\'');
                concurrentHashMap2.put(str, u57Var);
            }
            for (ckd ckdVar : t09Var3.b) {
                concurrentHashMap.put(Integer.valueOf(ckdVar.a.hashCode()), ckdVar);
            }
        }
        szc szcVar = this.c;
        szcVar.getClass();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            ((Set) szcVar.c).addAll(((t09) it3.next()).d);
        }
    }
}
