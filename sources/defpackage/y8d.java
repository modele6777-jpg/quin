package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y8d {
    public final long a;
    public final sw3 b;
    public final p4c c;
    public final float d;
    public final float e;
    public final long f = y72.b(y72.d, 0.5f);

    public y8d(mue mueVar, long j, sw3 sw3Var, p4c p4cVar) {
        this.a = j;
        this.b = sw3Var;
        this.c = p4cVar;
        this.d = sw3Var.F(w6c.l(18));
        this.e = sw3Var.F(w6c.l(4));
    }

    public static final void d(mmb mmbVar, ArrayList arrayList, mue mueVar) {
        if (((i00) mmbVar.element).a.length() > 0) {
            arrayList.add(new v7d(((i00) mmbVar.element).l(), mueVar, false));
            mmbVar.element = new i00();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:22:0x0104  */
    /* JADX WARN: Code duplicated, block: B:23:0x0109  */
    /* JADX WARN: Code duplicated, block: B:25:0x010d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0112  */
    /* JADX WARN: Code duplicated, block: B:28:0x011a  */
    /* JADX WARN: Code duplicated, block: B:29:0x011d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0125  */
    /* JADX WARN: Code duplicated, block: B:32:0x0128  */
    /* JADX WARN: Code duplicated, block: B:34:0x012c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0130  */
    /* JADX WARN: Code duplicated, block: B:39:0x014b A[LOOP:0: B:37:0x0145->B:39:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0169 A[LOOP:1: B:41:0x0163->B:43:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Code duplicated, block: B:47:0x018f A[LOOP:2: B:45:0x0189->B:47:0x018f, LOOP_END] */
    public static final void e(ArrayList arrayList, y8d y8dVar, mmb mmbVar, mue mueVar, rf0 rf0Var, List list, List list2) {
        y8d y8dVar2;
        String str;
        List<k68> listR0;
        dyc dycVarI;
        int length;
        ArrayList arrayList2 = arrayList;
        mmb mmbVar2 = mmbVar;
        List<xtd> listR1 = list;
        z5c z5cVar = rf0Var.a;
        if (z5cVar instanceof lf0) {
            d(mmbVar2, arrayList2, mueVar);
            arrayList2.add(new u7d(new dd2(new wf8(29, z5cVar), true, 1151308602)));
            return;
        }
        if (z5cVar instanceof ag0) {
            listR1 = s72.R0(listR1, new xtd(0L, 0L, new ar5(674), null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
        } else {
            if (!(z5cVar instanceof ff0)) {
                if (z5cVar instanceof cf0) {
                    y8dVar2 = y8dVar;
                    listR1 = s72.R0(listR1, new xtd(0L, 0L, ar5.x, null, null, yp5.d, null, 0L, null, null, null, y8dVar2.f, null, null, 63451));
                }
                str = null;
                if (z5cVar instanceof of0) {
                    listR0 = s72.R0(list2, new k68(((of0) z5cVar).l, new zte(new xtd(y72.g, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, 14)));
                } else {
                    listR0 = list2;
                }
                if (z5cVar instanceof hg0) {
                    str = ((hg0) z5cVar).l;
                } else if (z5cVar instanceof cf0) {
                    str = ((cf0) z5cVar).l;
                } else if (z5cVar.equals(yf0.l)) {
                    str = " ";
                } else if (z5cVar.equals(hf0.l)) {
                    str = "\n";
                } else if (z5cVar instanceof kf0) {
                    str = "";
                }
                if (str != null) {
                    dycVarI = dec.i((l26) o5c.h(rf0Var).b);
                    while (dycVarI.hasNext()) {
                        List list3 = listR1;
                        e(arrayList2, y8dVar2, mmbVar2, mueVar, (rf0) dycVarI.next(), list3, listR0);
                        arrayList2 = arrayList;
                        mmbVar2 = mmbVar;
                        listR1 = list3;
                        y8dVar2 = y8dVar;
                    }
                    return;
                }
                length = ((i00) mmbVar2.element).a.length();
                ((i00) mmbVar2.element).f(str);
                for (xtd xtdVar : listR1) {
                    i00 i00Var = (i00) mmbVar2.element;
                    i00Var.b(xtdVar, length, i00Var.a.length());
                }
                for (k68 k68Var : listR0) {
                    i00 i00Var2 = (i00) mmbVar2.element;
                    i00Var2.a(k68Var, length, i00Var2.a.length());
                }
            }
            listR1 = s72.R0(listR1, new xtd(0L, 0L, null, new wq5(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527));
        }
        y8dVar2 = y8dVar;
        str = null;
        if (z5cVar instanceof of0) {
            listR0 = s72.R0(list2, new k68(((of0) z5cVar).l, new zte(new xtd(y72.g, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, 14)));
        } else {
            listR0 = list2;
        }
        if (z5cVar instanceof hg0) {
            str = ((hg0) z5cVar).l;
        } else if (z5cVar instanceof cf0) {
            str = ((cf0) z5cVar).l;
        } else if (z5cVar.equals(yf0.l)) {
            str = " ";
        } else if (z5cVar.equals(hf0.l)) {
            str = "\n";
        } else if (z5cVar instanceof kf0) {
            str = "";
        }
        if (str != null) {
            dycVarI = dec.i((l26) o5c.h(rf0Var).b);
            while (dycVarI.hasNext()) {
                List list4 = listR1;
                e(arrayList2, y8dVar2, mmbVar2, mueVar, (rf0) dycVarI.next(), list4, listR0);
                arrayList2 = arrayList;
                mmbVar2 = mmbVar;
                listR1 = list4;
                y8dVar2 = y8dVar;
            }
            return;
        }
        length = ((i00) mmbVar2.element).a.length();
        ((i00) mmbVar2.element).f(str);
        while (r1.hasNext()) {
            i00 i00Var3 = (i00) mmbVar2.element;
            i00Var3.b(xtdVar, length, i00Var3.a.length());
        }
        while (r1.hasNext()) {
            i00 i00Var4 = (i00) mmbVar2.element;
            i00Var4.a(k68Var, length, i00Var4.a.length());
        }
    }

    public final r7d a(rf0 rf0Var, mue mueVar, float f, int i) {
        Integer numValueOf;
        int i2;
        float f2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List listH;
        mue mueVarA;
        y8d y8dVar = this;
        z5c z5cVar = rf0Var.a;
        int i3 = 0;
        if (z5cVar.equals(ef0.l) || z5cVar.equals(qf0.l)) {
            return new p7d(fyc.A(fyc.x(new ve5(o5c.h(rf0Var), false, new e2d(16)), new w8d(this, mueVar, f, i, 0))), null, f, null, 0.0f, null, null, 250);
        }
        if (z5cVar.equals(xf0.l) || (z5cVar instanceof cg0)) {
            return c(rf0Var, mueVar);
        }
        if (z5cVar instanceof if0) {
            return y8dVar.c(rf0Var, mue.a(mueVar, 0L, 0L, new ar5(674), null, 0L, null, 0, 0L, null, null, 16777211));
        }
        if (z5cVar instanceof gf0) {
            return y8dVar.b(((gf0) z5cVar).p, mueVar);
        }
        if (z5cVar instanceof mf0) {
            return y8dVar.b(((mf0) z5cVar).l, mueVar);
        }
        if (z5cVar instanceof jf0) {
            vea veaVar = k00.e;
            return new v7d(feg.H(((jf0) z5cVar).l), mueVar, false);
        }
        if (z5cVar instanceof wf0) {
            return y8dVar.f(rf0Var, mueVar, i, Integer.valueOf(((wf0) z5cVar).l));
        }
        Object obj = null;
        if (z5cVar instanceof jg0) {
            return y8dVar.f(rf0Var, mueVar, i, null);
        }
        boolean zEquals = z5cVar.equals(bf0.l);
        char c = 6;
        float f3 = 0.0f;
        sw3 sw3Var = y8dVar.b;
        if (zEquals) {
            float F = sw3Var.F(w6c.l(6));
            float F2 = sw3Var.F(w6c.l(3));
            float f4 = f / 2.0f;
            return new p7d(fyc.A(fyc.x(new ve5(o5c.h(rf0Var), false, new e2d(16)), new w8d(y8dVar, mueVar, f, i, 1))), ynb.r((F * 2.0f) + F2, f4, 0.0f, f4, 4), f, null, 0.0f, null, new ui3(F, F2, 1, y8dVar), 120);
        }
        boolean zEquals2 = z5cVar.equals(fg0.l);
        pu4 pu4Var = pu4.a;
        if (!zEquals2) {
            if (z5cVar.equals(ig0.l)) {
                return new p7d(pu4Var, ynb.r(0.0f, f, 0.0f, f + 1.0f, 5), 0.0f, null, 0.0f, null, new tc2(y8dVar, f, 4), 124);
            }
            if (z5cVar instanceof hg0) {
                return new v7d(new k00(((hg0) z5cVar).l), mueVar, false);
            }
            return z5cVar instanceof pf0 ? new p7d(pu4Var, null, 0.0f, null, 0.0f, null, null, 254) : c(rf0Var, mueVar);
        }
        List listA = fyc.A(new zi5(o5c.h(rf0Var), new e2d(15), jyc.a));
        Iterator it = listA.iterator();
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((List) ((iy9) it.next()).d()).size());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((List) ((iy9) it.next()).d()).size());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return new p7d(pu4Var, null, 0.0f, null, 0.0f, null, null, 254);
        }
        int iIntValue = numValueOf.intValue();
        if (iIntValue == 0) {
            return new p7d(pu4Var, null, 0.0f, null, 0.0f, null, null, 254);
        }
        float fC0 = sw3Var.c0(1.0f);
        int i4 = 8;
        float F3 = sw3Var.F(w6c.l(8));
        ArrayList arrayList3 = new ArrayList(t72.u(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            iy9 iy9Var = (iy9) it2.next();
            List list = (List) iy9Var.a();
            boolean zBooleanValue = ((Boolean) iy9Var.b()).booleanValue();
            ArrayList arrayList4 = new ArrayList(iIntValue);
            int i5 = i3;
            while (i5 < iIntValue) {
                rf0 rf0Var2 = (rf0) s72.y0(i5, list);
                if (rf0Var2 != null) {
                    if (zBooleanValue) {
                        i2 = iIntValue;
                        f2 = F3;
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        mueVarA = mue.a(mueVar, 0L, 0L, ar5.z, null, 0L, null, 0, 0L, null, null, 16777211);
                        rf0Var2 = rf0Var2;
                    } else {
                        i2 = iIntValue;
                        f2 = F3;
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        mueVarA = mueVar;
                    }
                    listH = t72.H(y8dVar.c(rf0Var2, mueVarA));
                } else {
                    it2 = it2;
                    y8dVar = y8dVar;
                    i2 = iIntValue;
                    f2 = F3;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    list = list;
                    i5 = i5;
                    fC0 = fC0;
                    listH = null;
                }
                float f5 = f2;
                ArrayList arrayList5 = arrayList2;
                arrayList5.add(new o7d(new p7d(listH == null ? pu4Var : listH, new bx9(f5, f5, f5, f5), 0.0f, null, 0.0f, null, null, 252), null, 6));
                i5++;
                y8dVar = y8dVar;
                arrayList4 = arrayList5;
                F3 = f5;
                c = 6;
                obj = null;
                list = list;
                iIntValue = i2;
                fC0 = fC0;
                arrayList3 = arrayList;
                i4 = 8;
                i3 = 0;
                f3 = 0.0f;
                it2 = it2;
            }
            Iterator it3 = it2;
            y8d y8dVar2 = y8dVar;
            ArrayList arrayList6 = arrayList3;
            float f6 = fC0;
            fC0 = f6;
            arrayList6.add(new t7d(arrayList4, ynb.r(0.0f, 0.0f, 0.0f, f6, 7), fC0, new x8d(y8dVar2, 0), 8));
            y8dVar = y8dVar2;
            F3 = F3;
            f3 = 0.0f;
            i4 = 8;
            it2 = it3;
            arrayList3 = arrayList6;
            obj = obj;
            i3 = 0;
            iIntValue = iIntValue;
        }
        int i6 = i4;
        float f7 = fC0;
        return new p7d(arrayList3, ynb.r(f7, f7, f7, f3, i6), 0.0f, null, 0.0f, null, new vj(y8dVar, iIntValue, i6), 124);
    }

    public final p7d b(String str, mue mueVar) {
        List listH = t72.H(new v7d(new k00(v4e.o0(str).toString()), mue.a(mueVar, 0L, 0L, null, yp5.d, 0L, null, 0, 0L, null, null, 16777183), false));
        float F = this.b.F(w6c.l(16));
        return new p7d(listH, new bx9(F, F, F, F), 0.0f, null, 0.0f, new x8d(this, 1), null, 172);
    }

    public final r7d c(rf0 rf0Var, mue mueVar) {
        ArrayList arrayList = new ArrayList();
        mmb mmbVar = new mmb();
        mmbVar.element = new i00();
        pu4 pu4Var = pu4.a;
        e(arrayList, this, mmbVar, mueVar, rf0Var, pu4Var, pu4Var);
        d(mmbVar, arrayList, mueVar);
        r7d r7dVar = (r7d) s72.Z0(arrayList);
        return r7dVar == null ? new p7d(arrayList, null, 0.0f, null, 0.0f, null, null, 254) : r7dVar;
    }

    public final p7d f(rf0 rf0Var, mue mueVar, int i, Integer num) throws Throwable {
        yi4 yi4Var;
        String strG;
        y8d y8dVar = this;
        boolean z = true;
        List listA = fyc.A(new ve5(o5c.h(rf0Var), true, new e2d(14)));
        z67 z67VarB = t72.B(listA);
        ArrayList arrayList = new ArrayList(t72.u(z67VarB, 10));
        Iterator it = z67VarB.iterator();
        while (((y67) it).c) {
            int iNextInt = ((q67) it).nextInt();
            if (num == null) {
                strG = (String) t72.I("•", "◦", "▸", "▹").get(i % 4);
            } else {
                int iIntValue = num.intValue() + iNextInt;
                int i2 = i % 4;
                if (i2 == 1) {
                    strG = ((char) (((iIntValue - 1) % 26) + 97)) + ".";
                } else if (i2 == 2) {
                    strG = ub3.g(iIntValue, ")");
                } else if (i2 != 3) {
                    strG = ub3.g(iIntValue, ".");
                } else {
                    strG = ((char) (((iIntValue - 1) % 26) + 97)) + ")";
                }
            }
            arrayList.add(strG);
        }
        mue mueVarA = num == null ? mueVar : mue.a(mueVar, 0L, 0L, new ar5(674), null, 0L, null, 0, 0L, null, null, 16777211);
        long jL = w6c.l(8);
        sw3 sw3Var = y8dVar.b;
        float F = sw3Var.F(jL);
        float F2 = sw3Var.F(w6c.l(4));
        Iterator it2 = arrayList.iterator();
        Throwable th = null;
        if (it2.hasNext()) {
            String str = (String) it2.next();
            p4c p4cVar = y8dVar.c;
            yi4Var = (yi4) p4cVar.z(str, mueVarA);
            while (it2.hasNext()) {
                yi4 yi4Var2 = (yi4) p4cVar.z((String) it2.next(), mueVarA);
                if (yi4Var.compareTo(yi4Var2) < 0) {
                    yi4Var = yi4Var2;
                }
            }
        } else {
            yi4Var = null;
        }
        float f = 0.0f;
        float f2 = (yi4Var != null ? yi4Var.a : 0.0f) + F + F2;
        ArrayList arrayList2 = new ArrayList(t72.u(listA, 10));
        boolean z2 = false;
        int i3 = 0;
        for (Iterator it3 = listA.iterator(); it3.hasNext(); it3 = it3) {
            Object next = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                Throwable th2 = th;
                t72.Z();
                throw th2;
            }
            k00 k00Var = new k00((String) arrayList.get(i3));
            float f3 = f;
            float f4 = f2;
            ArrayList arrayList3 = arrayList2;
            boolean z3 = z2;
            arrayList3.add(new t7d(t72.I(new o7d(new p7d(t72.H(new v7d(k00Var, mue.a(mueVarA, 0L, 0L, null, null, 0L, null, 6, 0L, null, null, 16744447), z3)), ynb.r(F, f3, F2, f3, 10), 0.0f, ndb.E0, 0.0f, null, null, 244), new yi4(f4), 2), new o7d(a((rf0) next, mueVar, this.e, i + 1), null, 6)), null, 0.0f, null, 30));
            f = f3;
            y8dVar = this;
            z2 = z3;
            arrayList2 = arrayList3;
            th = null;
            i3 = i4;
            arrayList = arrayList;
            z = z;
            f2 = f4;
        }
        return new p7d(arrayList2, null, y8dVar.e, null, 0.0f, null, null, 250);
    }
}
