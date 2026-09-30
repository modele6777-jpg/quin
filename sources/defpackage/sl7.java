package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sl7 {
    public static final o85 a = vfh.c(tj7.d);

    public static sk7 a(qya qyaVar, u99 u99Var, bu3 bu3Var) {
        String strD0;
        u99Var.getClass();
        bu3Var.getClass();
        s56 s56Var = rl7.a;
        s56Var.getClass();
        jl7 jl7Var = (jl7) vpf.F(qyaVar, s56Var);
        String string = (jl7Var == null || !jl7Var.q()) ? "<init>" : u99Var.getString(jl7Var.o());
        if (jl7Var == null || !jl7Var.p()) {
            List<d0b> listI = qyaVar.I();
            listI.getClass();
            ArrayList arrayList = new ArrayList(t72.u(listI, 10));
            for (d0b d0bVar : listI) {
                d0bVar.getClass();
                String strE = e(feg.Y(d0bVar, bu3Var), u99Var);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strD0 = s72.D0(arrayList, "", "(", ")V", null, 56);
        } else {
            strD0 = u99Var.getString(jl7Var.n());
        }
        return new sk7(string, strD0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 java.lang.String, still in use, count: 2, list:
          (r3v2 java.lang.String) from 0x0053: IF  (r3v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0055 A[HIDDEN] (LINE:84)
          (r3v2 java.lang.String) from 0x0056: PHI (r3 I:??) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:22:0x0053, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static defpackage.rk7 b(defpackage.kza r3, defpackage.u99 r4, defpackage.bu3 r5, boolean r6) {
        /*
            r3.getClass()
            r4.getClass()
            r5.getClass()
            s56 r0 = defpackage.rl7.d
            r0.getClass()
            java.lang.Object r0 = defpackage.vpf.F(r3, r0)
            ll7 r0 = (defpackage.ll7) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L55
        L18:
            boolean r2 = r0.w()
            if (r2 == 0) goto L23
            il7 r0 = r0.r()
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 != 0) goto L29
            if (r6 == 0) goto L29
            goto L55
        L29:
            if (r0 == 0) goto L36
            boolean r6 = r0.q()
            if (r6 == 0) goto L36
            int r6 = r0.o()
            goto L3a
        L36:
            int r6 = r3.t0()
        L3a:
            if (r0 == 0) goto L4b
            boolean r2 = r0.p()
            if (r2 == 0) goto L4b
            int r3 = r0.n()
            java.lang.String r3 = r4.getString(r3)
            goto L56
        L4b:
            vza r3 = defpackage.feg.S(r3, r5)
            java.lang.String r3 = e(r3, r4)
            if (r3 != 0) goto L56
        L55:
            return r1
        L56:
            rk7 r5 = new rk7
            java.lang.String r4 = r4.getString(r6)
            r5.<init>(r4, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl7.b(kza, u99, bu3, boolean):rk7");
    }

    public static sk7 c(dza dzaVar, u99 u99Var, bu3 bu3Var) {
        String strConcat;
        dzaVar.getClass();
        u99Var.getClass();
        bu3Var.getClass();
        s56 s56Var = rl7.b;
        s56Var.getClass();
        jl7 jl7Var = (jl7) vpf.F(dzaVar, s56Var);
        int iG0 = (jl7Var == null || !jl7Var.q()) ? dzaVar.g0() : jl7Var.o();
        if (jl7Var == null || !jl7Var.p()) {
            List listJ = t72.J(feg.P(dzaVar, bu3Var));
            List<d0b> listO0 = dzaVar.o0();
            listO0.getClass();
            ArrayList arrayList = new ArrayList(t72.u(listO0, 10));
            for (d0b d0bVar : listO0) {
                d0bVar.getClass();
                arrayList.add(feg.Y(d0bVar, bu3Var));
            }
            ArrayList arrayListQ0 = s72.Q0(listJ, arrayList);
            ArrayList arrayList2 = new ArrayList(t72.u(arrayListQ0, 10));
            Iterator it = arrayListQ0.iterator();
            while (it.hasNext()) {
                String strE = e((vza) it.next(), u99Var);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(feg.R(dzaVar, bu3Var), u99Var);
            if (strE2 == null) {
                return null;
            }
            strConcat = s72.D0(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = u99Var.getString(jl7Var.n());
        }
        return new sk7(u99Var.getString(iG0), strConcat);
    }

    public static final boolean d(kza kzaVar) {
        li5 li5Var = kk7.a;
        Object objM = kzaVar.m(rl7.e);
        objM.getClass();
        return li5Var.e(((Number) objM).intValue()).booleanValue();
    }

    public static String e(vza vzaVar, u99 u99Var) {
        if (vzaVar.f0()) {
            return n22.b(u99Var.a(vzaVar.S()));
        }
        return null;
    }

    public static final iy9 f(String[] strArr, String[] strArr2) throws ab7 {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ry0.a(strArr));
        wk7 wk7VarH = h(byteArrayInputStream, strArr2);
        gl7 gl7Var = nya.b;
        gl7Var.getClass();
        g72 g72Var = new g72(byteArrayInputStream);
        ut8 ut8Var = (ut8) gl7Var.c(g72Var, a);
        try {
            g72Var.a(0);
            gl7.a(ut8Var);
            return new iy9(wk7VarH, (nya) ut8Var);
        } catch (ab7 e) {
            e.b(ut8Var);
            throw e;
        }
    }

    public static final iy9 g(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ry0.a(strArr));
        wk7 wk7VarH = h(byteArrayInputStream, strArr2);
        gl7 gl7Var = dza.b;
        gl7Var.getClass();
        g72 g72Var = new g72(byteArrayInputStream);
        ut8 ut8Var = (ut8) gl7Var.c(g72Var, a);
        try {
            g72Var.a(0);
            gl7.a(ut8Var);
            return new iy9(wk7VarH, (dza) ut8Var);
        } catch (ab7 e) {
            e.b(ut8Var);
            throw e;
        }
    }

    public static wk7 h(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        ql7 ql7Var = (ql7) ql7.b.b(byteArrayInputStream, a);
        ql7Var.getClass();
        return new wk7(ql7Var, strArr);
    }

    public static final iy9 i(String[] strArr, String[] strArr2) throws ab7 {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ry0.a(strArr));
        wk7 wk7VarH = h(byteArrayInputStream, strArr2);
        gl7 gl7Var = hza.b;
        gl7Var.getClass();
        g72 g72Var = new g72(byteArrayInputStream);
        ut8 ut8Var = (ut8) gl7Var.c(g72Var, a);
        try {
            g72Var.a(0);
            gl7.a(ut8Var);
            return new iy9(wk7VarH, (hza) ut8Var);
        } catch (ab7 e) {
            e.b(ut8Var);
            throw e;
        }
    }
}
