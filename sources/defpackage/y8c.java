package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y8c {
    public static gx6 a;
    public static w1e b;

    public static final void a(sdd sddVar, j09 j09Var, xw9 xw9Var, float f, fy9 fy9Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        xw9 xw9Var2;
        float f2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(351942052);
        int i2 = i | (l46Var.g(sddVar) ? 4 : 2) | 3456 | (l46Var.i(fy9Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | 12582912;
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            j09 j09VarD = j09Var.D(b.c);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new h6b(24, x16Var2, e89Var);
                l46Var.p0(objR2);
            }
            kn2.h(sddVar, j09VarD, bx9VarQ, 160.0f, null, null, false, true, true, fy9Var, x16Var, v02.b, 0.5f, null, (a26) objR2, null, l46Var, (i2 & 14) | 1187188096 | ((i2 << 15) & 1879048192), 197046, 4136);
            xw9Var2 = bx9VarQ;
            f2 = 160.0f;
        } else {
            l46Var.Z();
            xw9Var2 = xw9Var;
            f2 = f;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r52(sddVar, j09Var, xw9Var2, f2, fy9Var, x16Var, x16Var2, i);
        }
    }

    public static final void b(boolean z, j09 j09Var, float f, x16 x16Var, dd2 dd2Var, l46 l46Var, int i) {
        float f2;
        x16Var.getClass();
        l46Var.h0(-282184294);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | 384 | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            j09 j09VarE = oa7.E(j09Var, a7c.b(20.0f));
            j09 j09VarW = g09.a;
            if (z) {
                l46Var.f0(-596157928);
                j09VarW = db6.w(j09VarW, 2.0f, ((e8b) l46Var.k(l8b.a)).u, a7c.b(20.0f));
                l46Var.r(false);
            } else {
                l46Var.f0(-596153822);
                l46Var.r(false);
            }
            nae.c(x16Var, j09VarE.D(j09VarW), false, null, 0L, 0L, 0.0f, 0.0f, null, null, af1.b0(666401509, new qx1(dd2Var, 25), l46Var), l46Var, (i2 >> 9) & 14, 1020);
            f2 = 20.0f;
        } else {
            l46Var.Z();
            f2 = f;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new goc(z, j09Var, f2, x16Var, dd2Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void c(w6d w6dVar, x16 x16Var, x16 x16Var2, l46 l46Var, int i, int i2) {
        int i3;
        x16 x16Var3;
        boolean z;
        x16 x16Var4;
        ojb ojbVarV;
        x16 x16Var5;
        int i4;
        x16Var2.getClass();
        l46Var.h0(866738995);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(w6dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                x16Var3 = x16Var;
                i3 |= l46Var.i(x16Var3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (l46Var.i(x16Var2)) {
                    i4 = 256;
                } else {
                    i4 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                if (i5 != 0) {
                    x16Var5 = null;
                } else {
                    x16Var5 = x16Var3;
                }
                a09 a09Var = new a09(true, true);
                y11 y11Var = y11.a;
                zz8.a(x16Var2, null, null, 0.0f, false, null, ((e8b) l46Var.k(l8b.a)).e, 0L, y11.b(l46Var), null, null, a09Var, af1.b0(1826725905, new j41(w6dVar, x16Var5, x16Var2, 24), l46Var), l46Var, (i3 >> 6) & 14, 3456, 3518);
                x16Var4 = x16Var5;
            } else {
                l46Var.Z();
                x16Var4 = x16Var3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kr((Object) w6dVar, x16Var4, (Object) x16Var2, i, i2, 12);
            }
        }
        i3 |= 48;
        x16Var3 = x16Var;
        if ((i & 384) == 0) {
            if (l46Var.i(x16Var2)) {
                i4 = 256;
            } else {
                i4 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i3 & 1, z)) {
            if (i5 != 0) {
                x16Var5 = null;
            } else {
                x16Var5 = x16Var3;
            }
            a09 a09Var2 = new a09(true, true);
            y11 y11Var2 = y11.a;
            zz8.a(x16Var2, null, null, 0.0f, false, null, ((e8b) l46Var.k(l8b.a)).e, 0L, y11.b(l46Var), null, null, a09Var2, af1.b0(1826725905, new j41(w6dVar, x16Var5, x16Var2, 24), l46Var), l46Var, (i3 >> 6) & 14, 3456, 3518);
            x16Var4 = x16Var5;
        } else {
            l46Var.Z();
            x16Var4 = x16Var3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr((Object) w6dVar, x16Var4, (Object) x16Var2, i, i2, 12);
        }
    }

    public static final void d(final sdd sddVar, final j09 j09Var, final xw9 xw9Var, float f, List list, final l26 l26Var, final l26 l26Var2, final l26 l26Var3, l46 l46Var, final int i, final int i2) {
        int i3;
        final float f2;
        List list2 = list;
        l26Var.getClass();
        l26Var2.getClass();
        l46Var.h0(1879517757);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(sddVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.g(xw9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i3 | 3072;
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i4 |= (i & 262144) == 0 ? l46Var.g(l26Var) : l46Var.i(l26Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= l46Var.i(l26Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= l46Var.i(l26Var3) ? 8388608 : 4194304;
        }
        if (l46Var.W(i4 & 1, (4793491 & i4) != 4793490)) {
            if (i5 != 0) {
                list2 = pu4.a;
            }
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new ead(19);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 48);
            j09 j09VarD = j09Var.D(b.c);
            Integer num = (Integer) e89Var.getValue();
            boolean zG = ((458752 & i4) == 131072 || ((i4 & 262144) != 0 && l46Var.i(l26Var))) | l46Var.g(e89Var);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new cjd(l26Var, e89Var, null);
                l46Var.p0(objR2);
            }
            a26 a26Var = (a26) objR2;
            boolean zG2 = l46Var.g(e89Var) | ((3670016 & i4) == 1048576);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                objR3 = new p4c(7, l26Var2, e89Var);
                l46Var.p0(objR3);
            }
            l26 l26Var4 = (l26) objR3;
            boolean zG3 = l46Var.g(e89Var);
            Object objR4 = l46Var.R();
            if (zG3 || objR4 == obj) {
                objR4 = new xfc(e89Var, 9);
                l46Var.p0(objR4);
            }
            ajd ajdVar = new ajd(sddVar, xw9Var, 160.0f, list2, e89Var, l26Var3, 0);
            f2 = 160.0f;
            b21.e(sddVar, j09VarD, xw9Var, num, true, a26Var, l26Var4, (x16) objR4, af1.b0(1441158253, ajdVar, l46Var), l46Var, (i4 & 896) | (i4 & 14) | 100687872, 0);
        } else {
            l46Var.Z();
            f2 = f;
        }
        final List list3 = list2;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: bjd
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    y8c.d(sddVar, j09Var, xw9Var, f2, list3, l26Var, l26Var2, l26Var3, (l46) obj2, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final void e(boolean z, kg4 kg4Var, mue mueVar, mue mueVar2, j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(991128352);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.e(kg4Var.ordinal()) ? 32 : 16) | (l46Var.g(mueVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(mueVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.d(8.0f) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(j09Var) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            y6c y6cVarB = a7c.b(8.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            pr4 pr4Var = l8b.a;
            nae.a(rrb.h(db6.w(j09Var, 0.5f, ((e8b) l46Var.k(pr4Var)).u, y6cVarB), y6cVarB, new n4d(8.0f, y72.b(((e8b) l46Var.k(pr4Var)).u, 0.88f), 0.0f, 0L, 60)), y6cVarB, ((e8b) l46Var.k(pr4Var)).b, 0L, 0.0f, 0.0f, null, af1.b0(-1507536703, new o50(kg4Var, mueVar, z, mueVar2, 24), l46Var), l46Var, 12582912, 120);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(z, kg4Var, mueVar, mueVar2, j09Var, i);
        }
    }

    public static final void f(List list, boolean z, mue mueVar, mue mueVar2, j09 j09Var, j09 j09Var2, l46 l46Var, int i) {
        j09 j09Var3;
        l46 l46Var2;
        list.getClass();
        j09Var2.getClass();
        l46Var.h0(611967572);
        int i2 = i | (l46Var.g(list) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.g(mueVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(mueVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            j09Var3 = j09Var;
            j09 j09VarW = dj6.w(j09Var3, 1.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarW);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            feg.j(od4.A(R.drawable.card_spread_pentacle, 0, l46Var), null, d31.a.b(g09.a), null, an2.g, 0.7f, null, l46Var, 221240, 72);
            l46Var2 = l46Var;
            g(b.c, af1.b0(-141848587, new l30(list, z, mueVar, mueVar2, j09Var2, 15), l46Var2), l46Var2, 54);
            l46Var2.r(true);
        } else {
            j09Var3 = j09Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt(list, z, mueVar, mueVar2, j09Var3, j09Var2, i);
        }
    }

    public static final void g(j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(368993927);
        if (l46Var.W(i & 1, (i & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = mr.l;
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            tec.q(6, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eu8(j09Var, dd2Var, i, 4);
        }
    }

    public static final j22 h(String str) {
        dx5 dx5Var = pyd.a;
        return new j22(pyd.h, t99.e(str));
    }

    public static final j22 i(String str) {
        dx5 dx5Var = pyd.a;
        return new j22(pyd.a, t99.e(str));
    }

    public static final j22 j(String str) {
        dx5 dx5Var = pyd.a;
        return new j22(pyd.c, t99.e(str));
    }

    public static final int k(x8c x8cVar, String str) {
        x8cVar.getClass();
        int iG = z8c.g(x8cVar, str);
        if (iG >= 0) {
            return iG;
        }
        int columnCount = x8cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(x8cVar.getColumnName(i));
        }
        pd4.j("Column '", str, "' does not exist. Available columns: [", s72.D0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final void l(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iF = bm8.F(t72.u(setEntrySet, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF);
        for (Map.Entry entry : setEntrySet) {
            iy9 iy9Var = new iy9(entry.getValue(), entry.getKey());
            linkedHashMap2.put(iy9Var.d(), iy9Var.e());
        }
    }

    public static final void m(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            ff8.h().e(mag.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = mag.b;
            int iF = bm8.F(strArr.length);
            if (iF < 16) {
                iF = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
            for (String str : strArr) {
                iy9 iy9Var = new iy9(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
                linkedHashMap.put(iy9Var.d(), iy9Var.e());
            }
            for (Map.Entry entry : bm8.M(linkedHashMap, new iy9(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        ff8.h().o(mag.a, "Over-writing contents of " + file2);
                    }
                    ff8.h().e(mag.a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static final j22 n(t99 t99Var) {
        dx5 dx5Var = pyd.a;
        j22 j22Var = pyd.l;
        return new j22(j22Var.a, t99.e(t99Var.c().concat(j22Var.f().c())));
    }

    public static final j22 o(String str) {
        dx5 dx5Var = pyd.a;
        return new j22(pyd.b, t99.e(str));
    }

    public static final a26 p(w6d w6dVar, x16 x16Var, l46 l46Var, int i) {
        x16 x16Var2 = (i & 2) != 0 ? null : x16Var;
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (objR == obj) {
            objR = af1.E(l46Var);
            l46Var.p0(objR);
        }
        aw2 aw2Var = (aw2) objR;
        nfc nfcVarB = kr7.b(l46Var);
        boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj) {
            objR2 = nfcVarB.b(job.a.b(wt6.class), null, null);
            l46Var.p0(objR2);
        }
        wt6 wt6Var = (wt6) objR2;
        Context context = (Context) l46Var.k(uq.b);
        boolean zG2 = l46Var.g(w6dVar);
        Object objR3 = l46Var.R();
        if (zG2 || objR3 == obj) {
            Object kfVar = new kf(aw2Var, wt6Var, context, w6dVar, x16Var2, 26);
            l46Var.p0(kfVar);
            objR3 = kfVar;
        }
        return (a26) objR3;
    }

    public static String q(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        return i == 3 ? "Decal" : "Unknown";
    }

    public static final j22 r(j22 j22Var) {
        dx5 dx5Var = pyd.a;
        return new j22(pyd.a, t99.e("U".concat(j22Var.f().c())));
    }
}
