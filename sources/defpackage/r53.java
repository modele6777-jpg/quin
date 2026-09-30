package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r53 implements xn8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r53(float f, int i, boolean z) {
        this.a = i;
        this.b = f;
        this.c = z;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        int iD0;
        int iD1;
        int i = this.a;
        qu4 qu4Var = qu4.a;
        float f = this.b;
        list.getClass();
        switch (i) {
            case 0:
                if (list.size() != 5) {
                    qc0.p("Check failed.");
                    return null;
                }
                final int iH = kl2.h(j);
                long jA = kl2.a(j, 0, 0, 0, Integer.MAX_VALUE, 2);
                final cea ceaVarV = ((tn8) list.get(0)).v(jA);
                final cea ceaVarV2 = ((tn8) list.get(1)).v(jA);
                final cea ceaVarV3 = ((tn8) list.get(2)).v(jA);
                final cea ceaVarV4 = ((tn8) list.get(3)).v(jA);
                final cea ceaVarV5 = ((tn8) list.get(4)).v(jA);
                final int iD2 = zn8Var.D0(12.0f);
                int iD3 = zn8Var.D0(220.0f);
                int iD4 = zn8Var.D0(12.0f);
                int iD5 = zn8Var.D0(32.0f);
                int iD6 = zn8Var.D0(32.0f);
                int i2 = ceaVarV.b + iD2 + iD3;
                int i3 = ceaVarV2.b;
                final int i4 = i2 - (i3 / 2);
                int i5 = i3 + i4 + iD4 + ceaVarV3.b + ceaVarV4.b + ceaVarV5.b;
                int iD7 = ((i5 + iD5) + iD6) - zn8Var.D0(f);
                if (iD7 < 0) {
                    iD7 = 0;
                }
                boolean z = this.c;
                if (z) {
                    iD0 = iD5 - zn8Var.D0(12.0f);
                    if (iD7 <= iD0) {
                        iD0 = iD7;
                    }
                } else {
                    iD0 = 0;
                }
                int i6 = iD7 - iD0;
                if (z) {
                    iD1 = iD6 - zn8Var.D0(16.0f);
                    if (i6 <= iD1) {
                        iD1 = i6;
                    }
                } else {
                    iD1 = 0;
                }
                int i7 = iD5 - iD0;
                int i8 = iD6 - iD1;
                int iMax = Math.max(zn8Var.D0(f), i5 + i7 + i8);
                final int i9 = iMax - ceaVarV5.b;
                final int i10 = (i9 - i8) - ceaVarV4.b;
                final int i11 = (i10 - i7) - ceaVarV3.b;
                return zn8Var.n0(iH, iMax, qu4Var, new a26() { // from class: q53
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        bea beaVar = (bea) obj;
                        beaVar.getClass();
                        cea ceaVar = ceaVarV;
                        int i12 = ceaVar.a;
                        int i13 = iH;
                        beaVar.k(ceaVar, (i13 - i12) / 2, iD2, 0.0f);
                        cea ceaVar2 = ceaVarV2;
                        beaVar.k(ceaVar2, (i13 - ceaVar2.a) / 2, i4, 0.0f);
                        cea ceaVar3 = ceaVarV3;
                        beaVar.k(ceaVar3, (i13 - ceaVar3.a) / 2, i11, 0.0f);
                        cea ceaVar4 = ceaVarV4;
                        beaVar.k(ceaVar4, (i13 - ceaVar4.a) / 2, i10, 0.0f);
                        cea ceaVar5 = ceaVarV5;
                        beaVar.k(ceaVar5, (i13 - ceaVar5.a) / 2, i9, 0.0f);
                        return wef.a;
                    }
                });
            default:
                int iH2 = kl2.h(j);
                tn8 tn8Var = (tn8) s72.x0(list);
                cea ceaVarV6 = tn8Var != null ? tn8Var.v(ll2.a(0, iH2, 0, Integer.MAX_VALUE)) : null;
                qad qadVarG = fdc.g(iH2, ceaVarV6 != null ? ceaVarV6.a : iH2, ceaVarV6 != null ? ceaVarV6.b : 0, zn8Var.D0(f), zn8Var.D0(144.0f), zn8Var.D0(12.0f), this.c);
                return zn8Var.n0(iH2, qadVarG.e, qu4Var, new i2e(23, qadVarG, ceaVarV6));
        }
    }
}
