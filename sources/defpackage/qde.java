package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qde {
    public static final mue a = new mue(0, 0, ar5.z, null, null, 0, 0, 0, 0, 0, null, null, 16777211);
    public static final long b = w6c.l(8);
    public static final long c = y72.k;

    public static final void a(c4c c4cVar, j09 j09Var, a26 a26Var, a26 a26Var2, l46 l46Var, int i) {
        int i2;
        j09 j09Var2;
        Object next;
        c4c c4cVar2 = c4cVar;
        l46 l46Var2 = l46Var;
        a26Var2.getClass();
        l46Var2.h0(-750323390);
        if ((i & 6) == 0) {
            i2 = (l46Var2.g(c4cVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var2.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            ude udeVar = q4c.c(q4c.b(c4cVar2, l46Var2)).f;
            udeVar.getClass();
            long jC = b4c.c(c4cVar2, l46Var2);
            boolean z = (i3 & 896) == 256;
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                if (a26Var != null) {
                    n7c n7cVar = new n7c();
                    a26Var.d(n7cVar);
                    objR = n7cVar.a;
                } else {
                    objR = null;
                }
                l46Var2.p0(objR);
            }
            tde tdeVar = (tde) objR;
            boolean z2 = (i3 & 7168) == 2048;
            Object objR2 = l46Var2.R();
            Object obj = objR2;
            if (z2 || objR2 == i8cVar) {
                hde hdeVar = new hde();
                a26Var2.d(hdeVar);
                ArrayList arrayList = hdeVar.a;
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((n7c) it.next()).a);
                }
                l46Var2.p0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            boolean zG = l46Var2.g(tdeVar) | l46Var2.g(list);
            Object objR3 = l46Var2.R();
            l46 l46Var3 = l46Var2;
            if (zG || objR3 == i8cVar) {
                int size = tdeVar != null ? tdeVar.a.size() : 0;
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int size2 = ((tde) next).a.size();
                        l46Var2 = l46Var2;
                        while (true) {
                            Object next2 = it2.next();
                            int size3 = ((tde) next2).a.size();
                            if (size2 < size3) {
                                size2 = size3;
                                next = next2;
                            }
                            if (!it2.hasNext()) {
                                break;
                            }
                            c4cVar2 = c4cVar;
                            l46Var2 = l46Var;
                        }
                    }
                } else {
                    next = null;
                }
                tde tdeVar2 = (tde) next;
                objR3 = Integer.valueOf(Math.max(size, tdeVar2 != null ? tdeVar2.a.size() : 0));
                l46Var2.p0(objR3);
                l46Var3 = l46Var2;
            }
            int iIntValue = ((Number) objR3).intValue();
            mue mueVarE = b4c.d(c4cVar2, l46Var3).e(udeVar.a);
            sw3 sw3Var = (sw3) l46Var3.k(zg2.h);
            wue wueVar = udeVar.b;
            wueVar.getClass();
            int i4 = i3;
            float F = sw3Var.F(wueVar.a);
            g09 g09Var = g09.a;
            j09 j09VarZ = ynb.Z(oa7.F(g09Var), F);
            boolean zG2 = l46Var3.g(tdeVar) | l46Var3.g(list) | l46Var3.g(j09VarZ);
            Object objR4 = l46Var3.R();
            if (zG2 || objR4 == i8cVar) {
                c78 c78VarW = t72.w();
                if (tdeVar != null) {
                    List list2 = tdeVar.a;
                    ArrayList arrayList3 = new ArrayList(t72.u(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new dd2(new o7b(c4cVar2, mueVarE, j09VarZ, (n26) it3.next()), true, -1928061582));
                        c4cVar2 = c4cVar;
                        mueVarE = mueVarE;
                    }
                    c78VarW.add(arrayList3);
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    List list3 = ((tde) it4.next()).a;
                    ArrayList arrayList4 = new ArrayList(t72.u(list3, 10));
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(new dd2(new ode(j09VarZ, (n26) it5.next(), 0), true, -978043317));
                    }
                    c78VarW.add(arrayList4);
                }
                objR4 = c78VarW.n();
                l46Var3.p0(objR4);
            }
            List list4 = (List) objR4;
            Float f = udeVar.d;
            f.getClass();
            float fFloatValue = f.floatValue();
            boolean zG3 = l46Var3.g(udeVar) | l46Var3.f(jC);
            Object objR5 = l46Var3.R();
            if (zG3 || objR5 == i8cVar) {
                objR5 = new jf4(udeVar, jC, 2);
                l46Var3.p0(objR5);
            }
            jcc.a(iIntValue, list4, (a26) objR5, fFloatValue, g09Var, l46Var3, (i4 << 9) & 57344);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(i, 22, c4cVar, j09Var2, a26Var, a26Var2);
        }
    }
}
