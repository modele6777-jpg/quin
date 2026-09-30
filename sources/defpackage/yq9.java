package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yq9 extends ni5 {
    public static final yq9 d = new yq9(1, 0, 2);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        int[] iArr;
        f46 f46Var;
        int iC;
        int iB = k01Var.b(0);
        if (opdVar.n != 0) {
            wf2.a("Cannot move a group while inserting");
        }
        if (iB < 0) {
            wf2.a("Parameter offset is out of bounds");
        }
        if (iB == 0) {
            return;
        }
        int i = opdVar.t;
        int i2 = opdVar.v;
        int i3 = opdVar.u;
        int i4 = i;
        while (true) {
            iArr = opdVar.b;
            if (iB <= 0) {
                break;
            }
            i4 += iArr[(opdVar.q(i4) * 5) + 3];
            if (i4 > i3) {
                wf2.a("Parameter offset is out of bounds");
            }
            iB--;
        }
        int i5 = iArr[(opdVar.q(i4) * 5) + 3];
        int iF = opdVar.f(opdVar.b, opdVar.q(opdVar.t));
        int iF2 = opdVar.f(opdVar.b, opdVar.q(i4));
        int i6 = i4 + i5;
        int iF3 = opdVar.f(opdVar.b, opdVar.q(i6));
        int i7 = iF3 - iF2;
        opdVar.w(i7, Math.max(opdVar.t - 1, 0));
        opdVar.v(i5);
        int[] iArr2 = opdVar.b;
        int iQ = opdVar.q(i6) * 5;
        qd0.Y(opdVar.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = opdVar.c;
            int iG = opdVar.g(iF2 + i7);
            System.arraycopy(objArr, iG, objArr, iF, opdVar.g(iF3 + i7) - iG);
        }
        int i8 = iF2 + i7;
        int i9 = i8 - iF;
        int i10 = opdVar.k;
        int i11 = opdVar.l;
        int length = opdVar.c.length;
        int i12 = opdVar.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = opdVar.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = opd.h(opd.h(opdVar.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), opdVar.k, opdVar.l, opdVar.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = opdVar.o();
        int iB2 = npd.b(opdVar.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iB2 >= 0) {
            while (iB2 < opdVar.d.size() && (iC = opdVar.c((f46Var = (f46) opdVar.d.get(iB2)))) >= i6 && iC < i16) {
                arrayList.add(f46Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            f46 f46Var2 = (f46) arrayList.get(i18);
            int iC2 = opdVar.c(f46Var2) + i17;
            if (iC2 >= opdVar.g) {
                f46Var2.a = -(iO - iC2);
            } else {
                f46Var2.a = iC2;
            }
            opdVar.d.add(npd.b(opdVar.d, iC2, iO), f46Var2);
        }
        if (opdVar.J(i6, i5)) {
            wf2.a("Unexpectedly removed anchors");
        }
        opdVar.l(i2, opdVar.u, i);
        if (i7 > 0) {
            opdVar.K(i8, i7, i6 - 1);
        }
    }
}
