package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e7f implements Iterable, zm7 {
    public static final lqb b = new lqb(14);
    public static final e7f c = new e7f(pu4.a);
    public final jd0 a;

    public e7f(List list) {
        this.a = ku4.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k10 k10Var = (k10) it.next();
            k10Var.getClass();
            String strG = job.a.b(k10.class).g();
            strG.getClass();
            int iJ = b.j(strG);
            int iC = this.a.c();
            if (iC != 0) {
                if (iC == 1) {
                    jd0 jd0Var = this.a;
                    try {
                        jd0Var.getClass();
                        yp9 yp9Var = (yp9) jd0Var;
                        int i = yp9Var.b;
                        if (i == iJ) {
                            this.a = new yp9(iJ, k10Var);
                        } else {
                            md0 md0Var = new md0();
                            md0Var.a = new Object[20];
                            md0Var.b = 0;
                            md0Var.d(i, yp9Var.a);
                            this.a = md0Var;
                        }
                    } catch (ClassCastException e) {
                        ho7.r(c(jd0Var, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.a.d(iJ, k10Var);
            } else {
                jd0 jd0Var2 = this.a;
                if (!(jd0Var2 instanceof ku4)) {
                    qc0.p(c(jd0Var2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.a = new yp9(iJ, k10Var);
            }
        }
    }

    public static String c(jd0 jd0Var, int i, String str) {
        StringBuilder sb = new StringBuilder("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(jd0Var.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b.b;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(t72.u(jd0Var, 10));
        int i2 = 0;
        for (Object obj : jd0Var) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                t72.Z();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i2) {
                    obj2 = obj3;
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.a.c() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
