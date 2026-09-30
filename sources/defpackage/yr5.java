package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yr5 implements xn8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public yr5(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.xn8
    public final yn8 b(final zn8 zn8Var, List list, long j) {
        Object next;
        list.getClass();
        int size = list.size();
        int i = this.a;
        Object next2 = null;
        if (size != i * 2) {
            qc0.p("Check failed.");
            return null;
        }
        cyc cycVarZ = fyc.z(new td0(1, list), i);
        cyc cycVarQ = fyc.q(new td0(1, list), i);
        long j2 = j;
        final List listA = fyc.A(fyc.x(cycVarZ, new ac(j2, 7)));
        Iterator it = listA.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i2 = ((cea) next).a;
                while (true) {
                    Object next3 = it.next();
                    int i3 = ((cea) next3).a;
                    if (i2 < i3) {
                        next = next3;
                        i2 = i3;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    j2 = j;
                }
            }
        } else {
            next = null;
        }
        next.getClass();
        final cea ceaVar = (cea) next;
        int iH = kl2.h(j2) - ceaVar.a;
        int i4 = 0;
        final List listA2 = fyc.A(fyc.x(cycVarQ, new ac(kl2.a(j2, 0, iH < 0 ? 0 : iH, 0, 0, 13), 8)));
        Iterator it2 = listA2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i5 = ((cea) next2).a;
                do {
                    Object next4 = it2.next();
                    int i6 = ((cea) next4).a;
                    if (i5 < i6) {
                        next2 = next4;
                        i5 = i6;
                    }
                } while (it2.hasNext());
            }
        }
        next2.getClass();
        int i7 = ceaVar.a + ((cea) next2).a;
        Iterator it3 = listA2.iterator();
        int i8 = 0;
        while (it3.hasNext()) {
            i8 += ((cea) it3.next()).b;
        }
        int size2 = listA2.size() - 1;
        float f = this.b;
        int iD0 = (zn8Var.D0(f) * size2) + i8;
        Iterator it4 = listA.iterator();
        while (it4.hasNext()) {
            i4 += ((cea) it4.next()).b;
        }
        int iMax = Math.max(iD0, (zn8Var.D0(f) * (listA.size() - 1)) + i4);
        final int i9 = this.a;
        final float f2 = this.b;
        return zn8Var.n0(i7, iMax, qu4.a, new a26() { // from class: xr5
            @Override // defpackage.a26
            public final Object d(Object obj) {
                bea beaVar = (bea) obj;
                beaVar.getClass();
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    cea ceaVar2 = (cea) listA.get(i11);
                    cea ceaVar3 = (cea) listA2.get(i11);
                    int iD1 = beaVar.D0(f2) + Math.max(ceaVar2.b, ceaVar3.b);
                    long jRound = (((long) Math.round((1.0f + (zn8Var.getLayoutDirection() == cv7.a ? 1.0f : -1.0f)) * 0.0f)) << 32) | (((long) Math.round(0.0f)) & 4294967295L);
                    beaVar.k(ceaVar2, (int) (jRound >> 32), ((int) (jRound & 4294967295L)) + i10, 0.0f);
                    beaVar.k(ceaVar3, ceaVar.a, i10, 0.0f);
                    i10 += iD1;
                }
                return wef.a;
            }
        });
    }
}
