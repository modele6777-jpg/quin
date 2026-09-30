package net.xmind.donut.gp;

import defpackage.bm8;
import defpackage.c78;
import defpackage.et5;
import defpackage.it3;
import defpackage.iy9;
import defpackage.jc6;
import defpackage.jt3;
import defpackage.o14;
import defpackage.oz5;
import defpackage.ql6;
import defpackage.s72;
import defpackage.t72;
import defpackage.ynb;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Quin:gp_release"}, k = 2, mv = {2, 4, 0}, xi = z7c.f)
public final class ProductDetailsBatchQueryKt {
    public static final void a(jt3 jt3Var, ArrayList arrayList, AtomicBoolean atomicBoolean, c78 c78Var, it3 it3Var, ArrayList arrayList2, o14 o14Var, jc6 jc6Var, oz5 oz5Var, final oz5 oz5Var2, jc6 jc6Var2, int i) {
        if (!((Boolean) jt3Var.invoke()).booleanValue()) {
            return;
        }
        int i2 = 0;
        if (i != arrayList.size()) {
            try {
                o14Var.z(arrayList.get(i), new et5(jt3Var, atomicBoolean, new AtomicBoolean(false), jc6Var2, arrayList2, i, arrayList, c78Var, it3Var, o14Var, jc6Var, oz5Var, oz5Var2));
                return;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                ynb.h0(e2);
                if (atomicBoolean.compareAndSet(false, true) && ((Boolean) jt3Var.invoke()).booleanValue()) {
                    jc6Var.d(e2);
                    return;
                }
                return;
            }
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(t72.u(c78Var, 10));
        ListIterator listIterator = c78Var.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                final Map mapW = bm8.W(arrayList3);
                if (((Boolean) jt3Var.invoke()).booleanValue()) {
                    it3Var.d(s72.b1(arrayList2, new Comparator() { // from class: net.xmind.donut.gp.ProductDetailsBatchQueryKt$queryProductDetailsInBatches$queryAt$$inlined$sortedBy$1
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            oz5 oz5Var3 = oz5Var2;
                            Object objD = oz5Var3.d(obj);
                            Map map = mapW;
                            Integer num = (Integer) map.get(objD);
                            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                            Integer num2 = (Integer) map.get(oz5Var3.d(obj2));
                            return numValueOf.compareTo(Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
                        }
                    }));
                    return;
                }
                return;
            }
            Object next = ql6Var.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                t72.Z();
                throw null;
            }
            arrayList3.add(new iy9(oz5Var.d(next), Integer.valueOf(i2)));
            i2 = i3;
        }
    }
}
