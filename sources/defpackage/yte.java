package defpackage;

import androidx.compose.foundation.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yte {
    public final vz9 a = q1c.f(null);
    public k00 b;
    public final jsd c;

    public yte(k00 k00Var) {
        ule uleVar = new ule(18);
        k00Var.getClass();
        i00 i00Var = new i00(k00Var);
        ArrayList arrayList = i00Var.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) uleVar.d(((h00) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                j00 j00Var = (j00) list.get(i2);
                arrayList3.add(new h00(j00Var.a, j00Var.b, j00Var.c, j00Var.d));
            }
            x72.g0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = i00Var.l();
        this.c = new jsd();
    }

    public static j00 c(j00 j00Var, ste steVar) {
        b59 b59Var = steVar.b;
        int iC = b59Var.c(b59Var.f - 1, false);
        if (j00Var.b < iC) {
            return j00.a(j00Var, null, 0, Math.min(j00Var.c, iC), 11);
        }
        return null;
    }

    public final void a(int i, l46 l46Var) {
        boolean z;
        l46Var.h0(1154651354);
        char c = 2;
        int i2 = (l46Var.i(this) ? 4 : 2) | i;
        boolean z2 = false;
        int i3 = 10;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pw pwVar = (pw) l46Var.k(zg2.s);
            k00 k00Var = this.b;
            List listA = k00Var.a(k00Var.b.length());
            int size = listA.size();
            int i4 = 0;
            while (i4 < size) {
                j00 j00Var = (j00) listA.get(i4);
                int i5 = j00Var.b;
                Object obj = j00Var.a;
                if (i5 != j00Var.c) {
                    l46Var.f0(725478935);
                    Object objR = l46Var.R();
                    Object obj2 = sf2.a;
                    if (objR == obj2) {
                        objR = ib8.e(l46Var);
                    }
                    t69 t69Var = (t69) objR;
                    j09 j09VarX = bzd.x(g09.a, new i2e(i3, this, j00Var));
                    Object objR2 = l46Var.R();
                    if (objR2 == obj2) {
                        objR2 = new ule(19);
                        l46Var.p0(objR2);
                    }
                    j09 j09VarE = abg.E(vwc.b(j09VarX, z2, (a26) objR2).D(new fue(new bo1(25, this, j00Var))), t69Var);
                    mia.a.getClass();
                    j09 j09VarJ = qk2.J(j09VarE, urg.o);
                    boolean zI = l46Var.i(this) | l46Var.g(j00Var) | l46Var.i(pwVar);
                    Object objR3 = l46Var.R();
                    if (zI || objR3 == obj2) {
                        objR3 = new ykc(this, j00Var, pwVar);
                        l46Var.p0(objR3);
                    }
                    s21.a(b.d(j09VarJ, t69Var, (x16) objR3), l46Var, 0);
                    l68 l68Var = (l68) obj;
                    zte zteVarA = l68Var.a();
                    if (zteVarA == null || (zteVarA.a == null && zteVarA.b == null && zteVarA.c == null && zteVarA.d == null)) {
                        z = false;
                        l46Var.f0(728331710);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(726303039);
                        Object objR4 = l46Var.R();
                        if (objR4 == obj2) {
                            objR4 = new r68(t69Var);
                            l46Var.p0(objR4);
                        }
                        r68 r68Var = (r68) objR4;
                        Object objR5 = l46Var.R();
                        if (objR5 == obj2) {
                            objR5 = new wte(r68Var, null);
                            l46Var.p0(objR5);
                        }
                        af1.o((l26) objR5, l46Var, wef.a);
                        sz9 sz9Var = r68Var.b;
                        sz9 sz9Var2 = r68Var.b;
                        Boolean boolValueOf = Boolean.valueOf((sz9Var.j() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((sz9Var2.j() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((sz9Var2.j() & 4) != 0);
                        zte zteVarA2 = l68Var.a();
                        xtd xtdVar = zteVarA2 != null ? zteVarA2.a : null;
                        zte zteVarA3 = l68Var.a();
                        xtd xtdVar2 = zteVarA3 != null ? zteVarA3.b : null;
                        zte zteVarA4 = l68Var.a();
                        xtd xtdVar3 = zteVarA4 != null ? zteVarA4.c : null;
                        zte zteVarA5 = l68Var.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, xtdVar, xtdVar2, xtdVar3, zteVarA5 != null ? zteVarA5.d : null};
                        boolean zI2 = l46Var.i(this) | l46Var.g(j00Var);
                        Object objR6 = l46Var.R();
                        if (zI2 || objR6 == obj2) {
                            objR6 = new i2e(this, j00Var, r68Var, 9);
                            l46Var.p0(objR6);
                        }
                        b(objArr, (a26) objR6, l46Var, (i2 << 6) & 896);
                        z = false;
                        l46Var.r(false);
                    }
                    l46Var.r(z);
                } else {
                    z = z2;
                    l46Var.f0(728345598);
                    l46Var.r(z);
                }
                i4++;
                z2 = z;
                c = c;
                i3 = 10;
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z8d(this, i, 10);
        }
    }

    public final void b(Object[] objArr, a26 a26Var, l46 l46Var, int i) {
        l46Var.h0(-2083052099);
        int i2 = (i & 48) == 0 ? (l46Var.i(a26Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= l46Var.i(this) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        l46Var.d0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (l46Var.e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= l46Var.i(obj) ? 4 : 0;
        }
        l46Var.r(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            mx mxVar = new mx(2);
            mxVar.b(a26Var);
            mxVar.c(objArr);
            ArrayList arrayList = mxVar.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zI = l46Var.i(this) | ((i3 & 112) == 32);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new wv0(this, a26Var, i4);
                l46Var.p0(objR);
            }
            af1.j(array, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, this, objArr, a26Var, 21);
        }
    }
}
