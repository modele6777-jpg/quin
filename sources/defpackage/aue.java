package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aue {
    public final xp5 a;
    public final sw3 b;
    public final cv7 c;
    public final psd d;

    public aue(xp5 xp5Var, sw3 sw3Var, cv7 cv7Var, int i) {
        this.a = xp5Var;
        this.b = sw3Var;
        this.c = cv7Var;
        this.d = i > 0 ? new psd(i) : null;
    }

    public static ste a(aue aueVar, String str, mue mueVar, long j, int i) {
        int i2 = (i & 16) != 0 ? Integer.MAX_VALUE : 1;
        long jB = (i & 32) != 0 ? ll2.b(0, 0, 0, 0, 15) : j;
        cv7 cv7Var = aueVar.c;
        sw3 sw3Var = aueVar.b;
        xp5 xp5Var = aueVar.a;
        aueVar.getClass();
        return b(aueVar, new k00(str), mueVar, 1, true, i2, jB, cv7Var, sw3Var, xp5Var, 32);
    }

    public static ste b(aue aueVar, k00 k00Var, mue mueVar, int i, boolean z, int i2, long j, cv7 cv7Var, sw3 sw3Var, xp5 xp5Var, int i3) {
        ste steVar;
        int i4 = 1;
        int i5 = (i3 & 4) != 0 ? 1 : i;
        boolean z2 = (i3 & 8) != 0 ? true : z;
        int iH = Integer.MAX_VALUE;
        int i6 = (i3 & 16) != 0 ? Integer.MAX_VALUE : i2;
        cv7 cv7Var2 = (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? aueVar.c : cv7Var;
        sw3 sw3Var2 = (i3 & 256) != 0 ? aueVar.b : sw3Var;
        xp5 xp5Var2 = (i3 & 512) != 0 ? aueVar.a : xp5Var;
        psd psdVar = aueVar.d;
        pu4 pu4Var = pu4.a;
        rte rteVar = new rte(k00Var, mueVar, pu4Var, i6, z2, i5, sw3Var2, cv7Var2, xp5Var2, j);
        ste steVar2 = null;
        if (psdVar != null) {
            q81 q81Var = new q81(rteVar);
            ej8 ej8Var = (ej8) psdVar.b;
            if (ej8Var != null) {
                steVar = (ste) ej8Var.c(q81Var);
            } else if (pa7.t((q81) psdVar.c, q81Var)) {
                steVar = (ste) psdVar.d;
            }
            if (steVar != null && !steVar.b.a.e()) {
                steVar2 = steVar;
            }
        }
        if (steVar2 != null) {
            b59 b59Var = steVar2.b;
            return new ste(rteVar, b59Var, ll2.d(j, (((long) ((int) Math.ceil(b59Var.d))) << 32) | (((long) ((int) Math.ceil(b59Var.e))) & 4294967295L)));
        }
        a82 a82Var = new a82(k00Var, sw3Var2, xp5Var2, a6c.k(mueVar, cv7Var2), pu4Var, z2);
        int iJ = kl2.j(j);
        if ((z2 || i5 == 2 || i5 == 4 || i5 == 5) && kl2.d(j)) {
            iH = kl2.h(j);
        }
        int iO = iH;
        if (z2 || (i5 != 2 && i5 != 4 && i5 != 5)) {
            i4 = i6;
        }
        if (iJ != iO) {
            iO = mh3.o((int) Math.ceil(a82Var.i()), iJ, iO);
        }
        b59 b59Var2 = new b59(a82Var, pa7.S(0, iO, 0, kl2.g(j)), i4, i5);
        ste steVar3 = new ste(rteVar, b59Var2, ll2.d(j, (((long) ((int) Math.ceil(b59Var2.e))) & 4294967295L) | (((long) ((int) Math.ceil(b59Var2.d))) << 32)));
        if (psdVar != null) {
            ej8 ej8Var2 = (ej8) psdVar.b;
            if (ej8Var2 != null) {
                ej8Var2.d(new q81(rteVar), steVar3);
                return steVar3;
            }
            psdVar.c = new q81(rteVar);
            psdVar.d = steVar3;
        }
        return steVar3;
    }
}
