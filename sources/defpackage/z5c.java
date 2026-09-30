package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z5c {
    public static final dd2 a = new dd2(new kd2(20), false, -84665425);
    public static final dd2 b = new dd2(new kd2(21), false, 544488950);
    public static final dd2 c = new dd2(new kd2(22), false, 546538537);
    public static final dd2 d = new dd2(new ce2(6), false, -1158386741);
    public static final dd2 e = new dd2(new ie2(9), false, -1963793586);
    public static final mc0 f = new mc0(3);
    public static final ky9 g = new ky9();
    public static final Object h = new Object();
    public static final ehh i = new ehh(1);
    public static gx6 j;
    public static gx6 k;

    public static final int A(jsd jsdVar) {
        y0e y0eVar = jsdVar.a;
        y0eVar.getClass();
        return ((y0e) qrd.f(y0eVar)).e;
    }

    public static String B() {
        String strD;
        String str;
        ca2.a.getClass();
        if (ca2.c) {
            strD = vd8.d();
            str = "https://quin.love/privacy-terms?lang=";
        } else {
            strD = vd8.d();
            str = "https://quin.love/terms-cn?lang=";
        }
        return ib8.j(str, strD, "&ap=android&av=5.23.0");
    }

    public static final boolean C(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!pa7.t(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(vb2 vb2Var, rvg rvgVar, a26 a26Var, zn2 zn2Var) {
        oc6 oc6Var;
        q0c q0cVar;
        gfh gfhVarA;
        if (zn2Var instanceof oc6) {
            oc6Var = (oc6) zn2Var;
            int i2 = oc6Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oc6Var.label = i2 - Integer.MIN_VALUE;
            } else {
                oc6Var = new oc6(zn2Var);
            }
        } else {
            oc6Var = new oc6(zn2Var);
        }
        Object objL = oc6Var.result;
        int i3 = oc6Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i3 == 0) {
                jzb.q(objL);
                gfh gfhVarB = rvgVar.b();
                gfhVarB.getClass();
                oc6Var.L$0 = vb2Var;
                oc6Var.L$1 = rvgVar;
                oc6Var.L$2 = a26Var;
                oc6Var.label = 1;
                objL = l(gfhVarB, oc6Var);
                if (objL == bw2Var) {
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ya0 ya0Var = (ya0) oc6Var.L$5;
                jzb.q(objL);
                return ya0Var;
            }
            a26Var = (a26) oc6Var.L$2;
            rvgVar = (rvg) oc6Var.L$1;
            vb2Var = (vb2) oc6Var.L$0;
            jzb.q(objL);
            q0cVar = (q0c) objL;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception unused) {
            q0cVar = null;
        }
        if (q0cVar == null || vb2Var.isFinishing() || vb2Var.isDestroyed() || !vb2Var.a.i.a(g48.e)) {
            return null;
        }
        try {
            gfhVarA = rvgVar.a(vb2Var, q0cVar);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception unused2) {
            gfhVarA = null;
        }
        if (gfhVarA != null) {
            ya0 ya0Var2 = new ya0();
            a26Var.d(ya0Var2);
            oc6Var.L$0 = null;
            oc6Var.L$1 = null;
            oc6Var.L$2 = null;
            oc6Var.L$3 = null;
            oc6Var.L$4 = null;
            oc6Var.L$5 = ya0Var2;
            oc6Var.label = 2;
            return k(gfhVarA, oc6Var) == bw2Var ? bw2Var : ya0Var2;
        }
        return null;
    }

    public static final boolean E(jsd jsdVar, a26 a26Var) {
        int i2;
        i4 i4Var;
        Object objD;
        ird irdVarH;
        boolean zJ;
        do {
            synchronized (h) {
                y0e y0eVar = jsdVar.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i2 = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            caa caaVarI = i4Var.i();
            objD = a26Var.d(caaVarI);
            i4 i4VarE = caaVarI.e();
            if (pa7.t(i4VarE, i4Var)) {
                break;
            }
            y0e y0eVar3 = jsdVar.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = j((y0e) qrd.w(y0eVar3, jsdVar, irdVarH), i2, i4VarE, true);
            }
            qrd.l(irdVarH, jsdVar);
        } while (!zJ);
        return ((Boolean) objD).booleanValue();
    }

    public static void F(x7e x7eVar, int i2, xl2 xl2Var) {
        long jF = x7eVar.f(i2);
        List listJ = x7eVar.j(jF);
        if (listJ.isEmpty()) {
            return;
        }
        if (i2 == x7eVar.l() - 1) {
            r3.l();
            return;
        }
        long jF2 = x7eVar.f(i2 + 1) - x7eVar.f(i2);
        if (jF2 > 0) {
            xl2Var.accept(new w03(jF, jF2, listJ));
        }
    }

    public static final ewf G(em7 em7Var, owf owfVar, String str, gy2 gy2Var, nfc nfcVar, x16 x16Var) {
        em7Var.getClass();
        owfVar.getClass();
        gy2Var.getClass();
        nfcVar.getClass();
        kxa kxaVar = new kxa(owfVar, new pr7(em7Var, nfcVar, x16Var), gy2Var);
        em7Var.g();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            return kxaVar.f(em7Var, str);
        }
        String strG = em7Var.g();
        if (strG != null) {
            return kxaVar.f(em7Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
        }
        qc0.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final ArrayList H(File file, File file2) {
        List listI = t72.I("databases", "files/datastore", "shared_prefs");
        ArrayList arrayList = new ArrayList();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            File file3 = new File(file, (String) it.next());
            if (file3.isDirectory()) {
                ue5 ue5Var = new ue5(new ve5(new ie5(file3), true, new i73(7)));
                while (ue5Var.hasNext()) {
                    File file4 = (File) ue5Var.next();
                    String path = ne5.c0(file4, file).getPath();
                    File file5 = new File(file2, path);
                    File parentFile = file5.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    ne5.Z(file4, file5);
                    path.getClass();
                    arrayList.add(path);
                }
            }
        }
        return arrayList;
    }

    public static final Object I(pv2 pv2Var, l26 l26Var) throws Throwable {
        vz4 vz4VarA;
        pv2 pv2VarV;
        long jG1;
        ov2 ov2Var = hj6.Z;
        sv2 sv2Var = (sv2) pv2Var.F0(ov2Var);
        nu4 nu4Var = nu4.a;
        if (sv2Var == null) {
            vz4VarA = gwe.a();
            pv2VarV = y7h.v(nu4Var, pv2Var.p0(vz4VarA), true);
            js3 js3Var = ga4.a;
            if (pv2VarV != js3Var && pv2VarV.F0(ov2Var) == null) {
                pv2VarV = pv2VarV.p0(js3Var);
            }
        } else {
            vz4VarA = (vz4) gwe.a.get();
            pv2VarV = y7h.v(nu4Var, pv2Var, true);
            js3 js3Var2 = ga4.a;
            if (pv2VarV != js3Var2 && pv2VarV.F0(ov2Var) == null) {
                pv2VarV = pv2VarV.p0(js3Var2);
            }
        }
        m01 m01Var = new m01(pv2VarV, Thread.currentThread(), vz4VarA);
        m01Var.k0(dw2.a, m01Var, l26Var);
        vz4 vz4Var = m01Var.f;
        if (vz4Var != null) {
            int i2 = vz4.f;
            vz4Var.f1(false);
        }
        while (true) {
            if (vz4Var != null) {
                try {
                    jG1 = vz4Var.g1();
                } catch (Throwable th) {
                    if (vz4Var != null) {
                        int i3 = vz4.f;
                        vz4Var.d1(false);
                    }
                    throw th;
                }
            } else {
                jG1 = Long.MAX_VALUE;
            }
            if (m01Var.L0()) {
                break;
            }
            LockSupport.parkNanos(m01Var, jG1);
            if (Thread.interrupted()) {
                m01Var.t(new InterruptedException());
            }
        }
        if (vz4Var != null) {
            int i4 = vz4.f;
            vz4Var.d1(false);
        }
        Object objA = sg7.a(m01Var.K());
        eb2 eb2Var = objA instanceof eb2 ? (eb2) objA : null;
        if (eb2Var == null) {
            return objA;
        }
        throw eb2Var.a;
    }

    public static final void J(t6 t6Var, ywc ywcVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        Object objG = ywcVar.k().a.g(cxc.f);
        if (objG == null) {
            objG = null;
        }
        p72 p72Var = (p72) objG;
        if (p72Var != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(p72Var.a, p72Var.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = ywcVar.k().a.g(cxc.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listI = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                ywc ywcVar2 = (ywc) listI.get(i2);
                if (ywcVar2.k().a.c(cxc.K)) {
                    arrayList.add(ywcVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zO = o(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zO ? 1 : arrayList.size(), zO ? arrayList.size() : 1, false, 0));
    }

    public static final s47 K(InputStream inputStream) {
        inputStream.getClass();
        return new s47(inputStream, new jye());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void L(x7e x7eVar, e8e e8eVar, xl2 xl2Var) {
        int iC;
        boolean z;
        long j2 = e8eVar.b;
        if (j2 == -9223372036854775807L) {
            iC = 0;
        } else {
            iC = x7eVar.c(j2);
            if (iC == -1) {
                iC = x7eVar.l();
            }
            if (iC > 0 && x7eVar.f(iC - 1) == j2) {
                iC--;
            }
        }
        if (j2 == -9223372036854775807L || iC >= x7eVar.l()) {
            z = false;
        } else {
            List listJ = x7eVar.j(j2);
            long jF = x7eVar.f(iC);
            if (listJ.isEmpty()) {
                z = false;
            } else {
                long j3 = e8eVar.b;
                if (j3 < jF) {
                    xl2Var.accept(new w03(j3, jF - j3, listJ));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i2 = iC; i2 < x7eVar.l(); i2++) {
            F(x7eVar, i2, xl2Var);
        }
        if (e8eVar.a) {
            if (z) {
                iC--;
            }
            for (int i3 = 0; i3 < iC; i3++) {
                F(x7eVar, i3, xl2Var);
            }
            if (z) {
                xl2Var.accept(new w03(x7eVar.f(iC), j2 - x7eVar.f(iC), x7eVar.j(j2)));
            }
        }
    }

    public static final void M(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            r3.i(kv2.h(i2, i3, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object N(pv2 pv2Var, Object obj, Object obj2, l26 l26Var, xn2 xn2Var) throws Throwable {
        ew1 ew1Var;
        Object objC;
        Object objZ;
        if (xn2Var instanceof ew1) {
            ew1Var = (ew1) xn2Var;
            int i2 = ew1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ew1Var.label = i2 - Integer.MIN_VALUE;
            } else {
                ew1Var = new ew1(xn2Var);
            }
        } else {
            ew1Var = new ew1(xn2Var);
        }
        Object obj3 = ew1Var.result;
        int i3 = ew1Var.label;
        if (i3 != 0) {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = ew1Var.L$6;
            pv2 pv2Var2 = (pv2) ew1Var.L$4;
            try {
                jzb.q(obj3);
                objC = obj4;
                pv2Var = pv2Var2;
                dwe.a(pv2Var, objC);
                return obj3;
            } catch (Throwable th) {
                objC = obj4;
                pv2Var = pv2Var2;
                th = th;
                dwe.a(pv2Var, objC);
                throw th;
            }
        }
        jzb.q(obj3);
        objC = dwe.c(pv2Var, obj2);
        try {
            ew1Var.L$0 = pv2Var;
            ew1Var.L$1 = obj;
            ew1Var.L$2 = null;
            ew1Var.L$3 = l26Var;
            ew1Var.L$4 = pv2Var;
            ew1Var.L$5 = null;
            ew1Var.L$6 = objC;
            ew1Var.L$7 = ew1Var;
            ew1Var.I$0 = 0;
            ew1Var.I$1 = 0;
            ew1Var.label = 1;
            uxd uxdVar = new uxd(ew1Var, pv2Var);
            if (l26Var == null) {
                objZ = k99.Q(l26Var, obj, uxdVar);
            } else {
                z7f.t(2, l26Var);
                objZ = l26Var.z(obj, uxdVar);
            }
            obj3 = objZ;
            Object obj5 = bw2.a;
            if (obj3 == obj5) {
                return obj5;
            }
            dwe.a(pv2Var, objC);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            dwe.a(pv2Var, objC);
            throw th;
        }
    }

    public static final Object O(xn2 xn2Var, a26 a26Var, w5c w5cVar) {
        y5c y5cVar = new y5c(null, a26Var);
        j2f j2fVar = (j2f) xn2Var.getContext().F0(j2f.b);
        sv2 sv2Var = j2fVar != null ? j2fVar.a : null;
        if (sv2Var != null) {
            return ynb.p0(sv2Var, y5cVar, xn2Var);
        }
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        try {
            h80 h80Var = w5cVar.d;
            if (h80Var != null) {
                h80Var.execute(new qe(pl1Var, w5cVar, y5cVar, false, 3));
                return pl1Var.t();
            }
            pa7.g0("internalTransactionExecutor");
            throw null;
        } catch (RejectedExecutionException e2) {
            pl1Var.p(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
    }

    public static fhh P(Set set) {
        fhh fhhVar = new fhh();
        fhhVar.c = i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ngh nghVar = (ngh) it.next();
            drb.n(nghVar, "key");
            boolean z = nghVar.c;
            HashMap map = fhhVar.b;
            HashMap map2 = fhhVar.a;
            if (!z) {
                map.remove(nghVar);
                map2.put(nghVar, fhh.d);
            } else {
                if (!z) {
                    qc0.j("key must be repeating");
                    return null;
                }
                map2.remove(nghVar);
                map.put(nghVar, fhh.e);
            }
        }
        return fhhVar;
    }

    public static final void a(j09 j09Var, gx6 gx6Var, long j2, boolean z, l46 l46Var, int i2) {
        l46Var.h0(-1413278713);
        int i3 = i2 | 6 | (l46Var.g(gx6Var) ? 32 : 16) | (l46Var.f(j2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            l46Var.b0();
            int i4 = i2 & 1;
            g09 g09Var = g09.a;
            if (i4 == 0 || l46Var.C()) {
                j09Var = g09Var;
            } else {
                l46Var.Z();
            }
            l46Var.s();
            xn8 xn8VarC = s21.c(ndb.b, false);
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
            gu6.a(gx6Var, null, b.l(g09Var, 24.0f), j2, l46Var, ((i3 >> 3) & 14) | 432 | ((i3 << 3) & 7168), 0);
            if (z) {
                l46Var.f0(1152231559);
                s21.a(tm7.M(d31.a.a(tm7.o(b.l(g09Var, 8.0f), y72.f, a7c.a), ndb.d), 2.0f, -2.0f), l46Var, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(1152429525);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new av(j09Var2, gx6Var, j2, z, i2);
        }
    }

    public static final void b(j09 j09Var, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        j09 j09Var2;
        a26 a26Var2 = a26Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1520511834);
        int i3 = i2 | 6 | (l46Var2.i(a26Var2) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            pr4 pr4Var = o82.a;
            long j2 = ((m82) l46Var2.k(pr4Var)).n;
            y6c y6cVar = ((s5d) l46Var2.k(u5d.a)).d;
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(tm7.o(g09Var, j2, y6cVar), 32.0f, 24.0f);
            uc0 uc0Var = new uc0(12.0f, true, new qc0(i4));
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            nte.b(afc.q(R.string.invitation_recipient_title, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(y72.b(((m82) l46Var2.k(pr4Var)).o, 0.88f), w6c.l(23), ar5.c, null, cr5.h, 0L, 0L, 3, 0, w6c.l(32), null, null, 16613336), l46Var, 0, 0, 131070);
            nte.b(afc.q(R.string.invitation_recipient_desc, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(y72.b(((m82) l46Var.k(pr4Var)).o, 0.88f), w6c.l(17), null, null, null, 0L, 0L, 3, 0, w6c.l(27), null, null, 16613372), l46Var, 0, 0, 131070);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            wb7 wb7Var = (wb7) G(job.a.b(wb7.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            vz9 vz9Var = wb7Var.g;
            use useVarO = n3d.o((String) vz9Var.getValue(), l46Var, 2);
            String str = (String) vz9Var.getValue();
            boolean zG = l46Var.g(useVarO) | l46Var.i(wb7Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = new sb7(useVarO, wb7Var, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, str);
            j09 j09VarP = b.p(g09Var, 297.0f);
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), jx0Var, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarP);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            j09 j09VarW = db6.w(ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), 0.0f, y72.b(((m82) l46Var.k(pr4Var)).q, 0.8f), a7c.b(32.0f));
            gec gecVar = gec.x;
            long j3 = y72.j;
            rfc.a(useVarO, j09VarW, false, null, null, b21.h, null, gecVar, null, null, z7f.C(j3, j3, l46Var), null, l46Var, 12582912, 29097852);
            cn1.f((String) wb7Var.w.getValue(), null, null, "Error", b21.i, l46Var, 27648, 6);
            boolean zG2 = l46Var.g(useVarO) | ((i3 & 112) == 32);
            Object objR2 = l46Var.R();
            int i5 = 3;
            if (zG2 || objR2 == i8cVar) {
                a26Var2 = a26Var;
                objR2 = new y7(a26Var2, useVarO, i5);
                l46Var.p0(objR2);
            } else {
                a26Var2 = a26Var;
            }
            ym8.h(null, false, null, false, (x16) objR2, l46Var, 0, 15);
            ym8.i(null, afc.q(R.string.button_skip, l46Var), false, x16Var, l46Var, (i3 << 3) & 7168, 5);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, j09Var2, a26Var2, x16Var, 12);
        }
    }

    public static final void c(x16 x16Var, l46 l46Var, int i2) {
        l46 l46Var2;
        Object obj;
        x16Var.getClass();
        l46Var.h0(1354589151);
        int i3 = 2;
        int i4 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            wb7 wb7Var = (wb7) G(job.a.b(wb7.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            if (((Boolean) wb7Var.v.getValue()).booleanValue()) {
                l46Var.f0(-947156588);
                boolean zI = l46Var.i(wb7Var);
                Object objR = l46Var.R();
                if (zI || objR == sf2.a) {
                    obj = objR;
                    rb7 rb7Var = new rb7(wb7Var, z2 ? 1 : 0);
                    l46Var.p0(rb7Var);
                    obj = rb7Var;
                }
                obj = objR;
                l46Var2 = l46Var;
                t72.b((x16) obj, new s84(z, z3 ? 1 : 0, 5), af1.b0(-1501706351, new rk6(i3, wb7Var, x16Var), l46Var), l46Var2, 432, 0);
                l46Var2.r(false);
            } else {
                l46Var2 = l46Var;
                l46Var2.f0(-946527133);
                l46Var2.r(false);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fi4(i2, 10, x16Var);
        }
    }

    public static final void d(c4c c4cVar, String str, ha2 ha2Var, l46 l46Var, int i2) {
        int i3;
        ha2 ha2Var2;
        str.getClass();
        l46Var.h0(-312389850);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(c4cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        int i4 = i3 | 3456;
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = (i4 & 896) == 256;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new ja2();
                l46Var.p0(objR);
            }
            ja2 ja2Var = (ja2) objR;
            boolean zI = l46Var.i(ja2Var) | ((i4 & 112) == 32);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new em8(ja2Var, str, null);
                l46Var.p0(objR2);
            }
            rf0 rf0Var = (rf0) uyb.y(null, ja2Var, str, (l26) objR2, l46Var, ((i4 << 3) & 896) | 6).getValue();
            if (rf0Var == null) {
                l46Var.f0(788622629);
                l46Var.r(false);
            } else {
                l46Var.f0(788622630);
                xu0.a(c4cVar, rf0Var, null, l46Var, ((i4 >> 3) & 896) | (i4 & 14));
                l46Var.r(false);
            }
            ha2Var2 = ha2.a;
        } else {
            l46Var.Z();
            ha2Var2 = ha2Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i2, c4cVar, str, ha2Var2, 4);
        }
    }

    public static final void e(final String str, final String str2, final String str3, final String str4, final List list, final a26 a26Var, final long j2, final a26 a26Var2, l46 l46Var, final int i2) {
        int i3;
        a26 a26Var3;
        l46 l46Var2 = l46Var;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        l46Var2.h0(-201040445);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.g(str3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.g(str4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? l46Var2.g(list) : l46Var2.i(list) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            a26Var3 = a26Var;
            i3 |= l46Var2.i(a26Var3) ? 131072 : 65536;
        } else {
            a26Var3 = a26Var;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var2.f(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= l46Var2.i(a26Var2) ? 8388608 : 4194304;
        }
        if (l46Var2.W(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.TRUE);
                l46Var2.p0(objR);
            }
            e89 e89Var = (e89) objR;
            e89 e89VarI = q1c.i(a26Var2, l46Var);
            Boolean bool = (Boolean) e89Var.getValue();
            bool.getClass();
            Long lValueOf = Long.valueOf(j2);
            boolean zG = l46Var2.g(e89VarI);
            Object objR2 = l46Var2.R();
            if (zG || objR2 == i8cVar) {
                objR2 = new ls2(e89VarI, e89Var, 1);
                l46Var2.p0(objR2);
            }
            af1.h(bool, lValueOf, (a26) objR2, l46Var2);
            Object objR3 = l46Var2.R();
            if (objR3 == i8cVar) {
                objR3 = new nd8(29);
                l46Var2.p0(objR3);
            }
            ted tedVarF = zz8.f(54, 0, (a26) objR3, l46Var2);
            if (((Boolean) e89Var.getValue()).booleanValue()) {
                l46Var2.f0(-2010684616);
                long j3 = y72.j;
                Object objR4 = l46Var2.R();
                if (objR4 == i8cVar) {
                    objR4 = new x08(e89Var, 11);
                    l46Var2.p0(objR4);
                }
                zz8.a((x16) objR4, g09.a, tedVarF, 0.0f, false, null, j3, 0L, 0L, null, null, null, af1.b0(1878659114, new n53(tedVarF, a26Var3, str, e89Var, str2, str3, str4, list), l46Var2), l46Var, 1572918, 3078, 7096);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-2007906241);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: z29
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    z5c.e(str, str2, str3, str4, list, a26Var, j2, a26Var2, (l46) obj, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final hkb f(long j2, float f2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new hkb(Float.intBitsToFloat(i2) - f2, Float.intBitsToFloat(i3) - f2, Float.intBitsToFloat(i2) + f2, Float.intBitsToFloat(i3) + f2);
    }

    public static final hkb g(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new hkb(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    public static final void h(t6 t6Var, ywc ywcVar) {
        twc twcVar = ywcVar.d;
        w79 w79Var = twcVar.a;
        Object objG = twcVar.a.g(cxc.z);
        if (objG == null) {
            objG = null;
        }
        i5c i5cVar = (i5c) objG;
        if (bzd.r(ywcVar)) {
            if (i5cVar != null && i5cVar.a == 8) {
                return;
            }
            Object objG2 = w79Var.g(swc.y);
            if (objG2 == null) {
                objG2 = null;
            }
            f6 f6Var = (f6) objG2;
            if (f6Var != null) {
                t6Var.b(new o6(null, android.R.id.accessibilityActionPageUp, f6Var.a, null));
            }
            Object objG3 = w79Var.g(swc.A);
            if (objG3 == null) {
                objG3 = null;
            }
            f6 f6Var2 = (f6) objG3;
            if (f6Var2 != null) {
                t6Var.b(new o6(null, android.R.id.accessibilityActionPageDown, f6Var2.a, null));
            }
            Object objG4 = w79Var.g(swc.z);
            if (objG4 == null) {
                objG4 = null;
            }
            f6 f6Var3 = (f6) objG4;
            if (f6Var3 != null) {
                t6Var.b(new o6(null, android.R.id.accessibilityActionPageLeft, f6Var3.a, null));
            }
            Object objG5 = w79Var.g(swc.B);
            if (objG5 == null) {
                objG5 = null;
            }
            f6 f6Var4 = (f6) objG5;
            if (f6Var4 != null) {
                t6Var.b(new o6(null, android.R.id.accessibilityActionPageRight, f6Var4.a, null));
            }
        }
    }

    public static final void i(rme rmeVar, final Context context, final boolean z, final CharSequence charSequence, final long j2) {
        if (eue.d(j2) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) rxg.v.d(context);
        if (list.isEmpty()) {
            return;
        }
        rmeVar.a();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i2);
            rmeVar.a.h(new bne(new mva(i2), resolveInfo.loadLabel(packageManager).toString(), 0, new a26() { // from class: nva
                @Override // defpackage.a26
                public final Object d(Object obj) {
                    rxg.w.C(context, resolveInfo, Boolean.valueOf(z), charSequence, new eue(j2));
                    ((hne) obj).close();
                    return wef.a;
                }
            }));
        }
        rmeVar.a();
    }

    public static final boolean j(y0e y0eVar, int i2, i4 i4Var, boolean z) {
        boolean z2;
        synchronized (h) {
            try {
                int i3 = y0eVar.d;
                if (i3 == i2) {
                    y0eVar.c = i4Var;
                    z2 = true;
                    if (z) {
                        y0eVar.e++;
                    }
                    y0eVar.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(gfh gfhVar, zn2 zn2Var) {
        mc6 mc6Var;
        if (zn2Var instanceof mc6) {
            mc6Var = (mc6) zn2Var;
            int i2 = mc6Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mc6Var.label = i2 - Integer.MIN_VALUE;
            } else {
                mc6Var = new mc6(zn2Var);
            }
        } else {
            mc6Var = new mc6(zn2Var);
        }
        Object obj = mc6Var.result;
        int i3 = mc6Var.label;
        if (i3 == 0) {
            jzb.q(obj);
            mc6Var.L$0 = gfhVar;
            mc6Var.label = 1;
            pl1 pl1Var = new pl1(1, k99.D(mc6Var));
            pl1Var.v();
            gfhVar.c(f, new nc6(pl1Var));
            Object objT = pl1Var.t();
            bw2 bw2Var = bw2.a;
            if (objT == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    public static final Object l(gfh gfhVar, oc6 oc6Var) {
        pl1 pl1Var = new pl1(1, k99.D(oc6Var));
        pl1Var.v();
        gfhVar.c(f, new hy2(pl1Var, 1));
        return pl1Var.t();
    }

    public static final k00 m(int i2, l46 l46Var, xtd xtdVar) {
        xtd xtdVar2;
        if ((i2 & 1) != 0) {
            xtdVar2 = new xtd(abg.d(4285100242L), w6c.l(17), ar5.b, null, null, null, null, 0L, null, null, null, 0L, null, null, 65528);
        } else {
            xtdVar2 = xtdVar;
        }
        String strQ = afc.q(R.string.paid_membership_agreement, l46Var);
        String strQ2 = afc.q(R.string.subscribe_agreement, l46Var);
        zte zteVar = new zte(xtdVar2, null, 14);
        l46Var.f0(1267737931);
        i00 i00Var = new i00();
        i00Var.f(afc.q(R.string.please_read_and_confirm, l46Var));
        int iK = i00Var.k(xtdVar2);
        try {
            int i3 = i00Var.i(new k68("https://quinlove.cn/terms/paid-membership", zteVar));
            try {
                i00Var.f(strQ);
                i00Var.h(i3);
                i00Var.h(iK);
                i00Var.f(" ");
                i00Var.f(afc.q(R.string.and, l46Var));
                i00Var.f(" ");
                int iK2 = i00Var.k(xtdVar2);
                try {
                    int i4 = i00Var.i(new k68("https://quinlove.cn/terms/auto-renewal", zteVar));
                    try {
                        i00Var.f(strQ2);
                        i00Var.h(i4);
                        i00Var.h(iK2);
                        k00 k00VarL = i00Var.l();
                        l46Var.r(false);
                        return k00VarL;
                    } catch (Throwable th) {
                        i00Var.h(i4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    i00Var.h(iK2);
                    throw th2;
                }
            } catch (Throwable th3) {
                i00Var.h(i3);
                throw th3;
            }
        } catch (Throwable th4) {
            i00Var.h(iK);
            throw th4;
        }
    }

    public static final k00 n(boolean z, cwa cwaVar, xtd xtdVar, l46 l46Var) {
        cwaVar.getClass();
        String strQ = afc.q(R.string.paywall_terms, l46Var);
        String strQ2 = afc.q(R.string.paywall_privacy, l46Var);
        zte zteVar = new zte(xtdVar, null, 14);
        l46Var.f0(-2051657166);
        i00 i00Var = new i00();
        if (z) {
            l46Var.f0(-1929937369);
            if (cwaVar instanceof u7e) {
                l46Var.f0(-1929929061);
                i00Var.f(afc.q(R.string.paywall_auto_renew_terms, l46Var));
                i00Var.f(" ");
                l46Var.r(false);
            } else if (cwaVar instanceof thb) {
                l46Var.f0(-1929759770);
                if (t72.I(thb.e, thb.g).contains(cwaVar)) {
                    l46Var.f0(-1929603096);
                    l46Var.r(false);
                } else {
                    thb thbVar = (thb) cwaVar;
                    if (thbVar.d() >= 60) {
                        l46Var.f0(-1929517939);
                        i00Var.f(afc.q(R.string.paywall_addon_validity, l46Var));
                        i00Var.f(afc.q(R.string.paywall_addon_365_days, l46Var));
                        i00Var.f(" ");
                        l46Var.r(false);
                    } else if (thbVar.d() >= 20) {
                        l46Var.f0(-1929314610);
                        i00Var.f(afc.q(R.string.paywall_addon_validity, l46Var));
                        i00Var.f(afc.q(R.string.paywall_addon_90_days, l46Var));
                        i00Var.f(" ");
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1929124146);
                        i00Var.f(afc.q(R.string.paywall_addon_validity, l46Var));
                        i00Var.f(afc.q(R.string.paywall_addon_30_days, l46Var));
                        i00Var.f(" ");
                        l46Var.r(false);
                    }
                }
                l46Var.r(false);
            } else {
                l46Var.f0(-1928940998);
                l46Var.r(false);
            }
            l46Var.r(false);
        } else {
            l46Var.f0(-1928935046);
            l46Var.r(false);
        }
        int iK = i00Var.k(xtdVar);
        try {
            int i2 = i00Var.i(new k68(B(), zteVar));
            try {
                i00Var.f(strQ);
                i00Var.h(i2);
                i00Var.h(iK);
                i00Var.f(" ");
                i00Var.f(afc.q(R.string.paywall_terms_privacy_connector, l46Var));
                i00Var.f(" ");
                int iK2 = i00Var.k(xtdVar);
                try {
                    int i3 = i00Var.i(new k68(y(), zteVar));
                    try {
                        i00Var.f(strQ2);
                        i00Var.h(i3);
                        i00Var.h(iK2);
                        k00 k00VarL = i00Var.l();
                        l46Var.r(false);
                        return k00VarL;
                    } catch (Throwable th) {
                        i00Var.h(i3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    i00Var.h(iK2);
                    throw th2;
                }
            } catch (Throwable th3) {
                i00Var.h(i2);
                throw th3;
            }
        } catch (Throwable th4) {
            i00Var.h(iK);
            throw th4;
        }
    }

    public static final boolean o(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = pu4.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    ywc ywcVar = (ywc) obj2;
                    ywc ywcVar2 = (ywc) obj;
                    arrayList2.add(new hl9((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (ywcVar2.g().d() >> 32)) - Float.intBitsToFloat((int) (ywcVar.g().d() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (ywcVar2.g().d() & 4294967295L)) - Float.intBitsToFloat((int) (ywcVar.g().d() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((hl9) s72.v0(list)).a;
            } else {
                if (list.isEmpty()) {
                    k88.c("Empty collection can't be reduced.");
                }
                Object objV0 = s72.v0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objV0 = new hl9(hl9.g(((hl9) objV0).a, ((hl9) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((hl9) objV0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static rp1 p(long j2, long j3, l46 l46Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            j3 = o82.b(j2, l46Var);
        }
        long j4 = j3;
        return w((m82) l46Var.k(o82.a)).a(j2, j4, y72.k, y72.b(j4, 0.38f));
    }

    public static cr1 q(int i2) {
        return new cr1((i2 & 1) != 0 ? 0.0f : 4.0f, mh3.m, mh3.l);
    }

    public static final xtd r(l46 l46Var) {
        return new xtd(y72.b(((m82) l46Var.k(o82.a)).o, 0.72f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, mne.c, null, 61438);
    }

    public static final Object s(xn2 xn2Var, a26 a26Var, w5c w5cVar) {
        if (w5cVar.k() && w5cVar.o() && w5cVar.l()) {
            return a26Var.d(xn2Var);
        }
        return xn2Var.getContext().F0(ul1.c) == null ? a26Var.d(xn2Var) : O(xn2Var, a26Var, w5cVar);
    }

    public static final wm5 t(w5c w5cVar, String[] strArr, a26 a26Var) {
        w5cVar.getClass();
        jb7 jb7VarF = w5cVar.f();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        j5f j5fVar = jb7VarF.b;
        iy9 iy9VarG = j5fVar.g(strArr2);
        String[] strArr3 = (String[]) iy9VarG.a();
        int[] iArr = (int[]) iy9VarG.b();
        strArr3.getClass();
        iArr.getClass();
        return new wm5(ym8.q(new ybc(new z4f(j5fVar, iArr, true, strArr3, null)), -1), w5cVar, a26Var, 1);
    }

    public static final String u(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? dec.n(cCharAt) : String.valueOf(cCharAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static final gx6 v() {
        gx6 gx6Var = j;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("ConvensationsSend", 28.0f, 28.0f, 28.0f, 28.0f, 0L, 0, false, 224);
        dtd dtdVar = new dtd(abg.d(4294967295L));
        s71 s71Var = new s71(1);
        s71Var.p(13.9902f, 23.2559f);
        s71Var.i(13.6322f, 23.2559f, 13.3392f, 23.1419f, 13.1113f, 22.9141f);
        s71Var.i(12.89f, 22.6862f, 12.7793f, 22.3867f, 12.7793f, 22.0156f);
        s71Var.s(10.4336f);
        s71Var.n(12.9062f, 7.0449f);
        s71Var.n(13.6191f, 7.4551f);
        s71Var.n(10.543f, 10.9414f);
        s71Var.n(8.3359f, 13.1289f);
        s71Var.i(8.2253f, 13.2396f, 8.0983f, 13.3275f, 7.9551f, 13.3926f);
        s71Var.i(7.8119f, 13.4577f, 7.6523f, 13.4902f, 7.4766f, 13.4902f);
        s71Var.i(7.1445f, 13.4902f, 6.8678f, 13.3796f, 6.6465f, 13.1582f);
        s71Var.i(6.4251f, 12.9368f, 6.3144f, 12.6569f, 6.3144f, 12.3184f);
        s71Var.i(6.3144f, 11.9928f, 6.4414f, 11.6999f, 6.6953f, 11.4395f);
        s71Var.n(13.0918f, 5.0234f);
        s71Var.i(13.209f, 4.9063f, 13.3457f, 4.8151f, 13.502f, 4.75f);
        s71Var.i(13.6647f, 4.6849f, 13.8275f, 4.6523f, 13.9902f, 4.6523f);
        s71Var.i(14.1595f, 4.6523f, 14.3223f, 4.6849f, 14.4785f, 4.75f);
        s71Var.i(14.6413f, 4.8151f, 14.7812f, 4.9063f, 14.8984f, 5.0234f);
        s71Var.n(21.2949f, 11.4395f);
        s71Var.i(21.5488f, 11.6999f, 21.6758f, 11.9928f, 21.6758f, 12.3184f);
        s71Var.i(21.6758f, 12.6569f, 21.5651f, 12.9368f, 21.3438f, 13.1582f);
        s71Var.i(21.1224f, 13.3796f, 20.8457f, 13.4902f, 20.5137f, 13.4902f);
        s71Var.i(20.3379f, 13.4902f, 20.1751f, 13.4577f, 20.0254f, 13.3926f);
        s71Var.i(19.8822f, 13.3275f, 19.7552f, 13.2396f, 19.6445f, 13.1289f);
        s71Var.n(17.4375f, 10.9414f);
        s71Var.n(14.3516f, 7.4551f);
        s71Var.n(15.0742f, 7.0449f);
        s71Var.n(15.2012f, 10.4336f);
        s71Var.s(22.0156f);
        s71Var.i(15.2012f, 22.3867f, 15.0872f, 22.6862f, 14.8594f, 22.9141f);
        s71Var.i(14.638f, 23.1419f, 14.3483f, 23.2559f, 13.9902f, 23.2559f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 0.0f, 0, 4.0f);
        gx6 gx6VarB = fx6Var.b();
        j = gx6VarB;
        return gx6VarB;
    }

    public static rp1 w(m82 m82Var) {
        rp1 rp1Var = m82Var.a0;
        if (rp1Var != null) {
            return rp1Var;
        }
        n82 n82Var = mh3.h;
        rp1 rp1Var2 = new rp1(o82.c(m82Var, n82Var), o82.a(m82Var, o82.c(m82Var, n82Var)), abg.r(y72.b(o82.c(m82Var, mh3.j), mh3.k), o82.c(m82Var, n82Var)), y72.b(o82.a(m82Var, o82.c(m82Var, n82Var)), 0.38f));
        m82Var.a0 = rp1Var2;
        return rp1Var2;
    }

    public static final gx6 x() {
        gx6 gx6Var = k;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new p1a(7.41f, 15.41f));
        arrayList.add(new o1a(12.0f, 10.83f));
        arrayList.add(new w1a(4.59f, 4.58f));
        arrayList.add(new o1a(18.0f, 14.0f));
        arrayList.add(new w1a(-6.0f, -6.0f));
        arrayList.add(new w1a(-6.0f, 6.0f));
        arrayList.add(l1a.c);
        fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        k = gx6VarB;
        return gx6VarB;
    }

    public static String y() {
        String strD;
        String str;
        ca2.a.getClass();
        if (ca2.c) {
            strD = vd8.d();
            str = "https://quin.love/privacy-terms?lang=";
        } else {
            strD = vd8.d();
            str = "https://quin.love/privacy-cn?lang=";
        }
        return ib8.j(str, strD, "&ap=android&av=5.23.0");
    }

    public static final y0e z(jsd jsdVar) {
        y0e y0eVar = jsdVar.a;
        y0eVar.getClass();
        return (y0e) qrd.s(y0eVar, jsdVar);
    }
}
