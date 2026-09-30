package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k3e extends oif {
    public iae A;
    public vzc B;
    public vzc C;
    public wzc D;
    public final l3e r;
    public final zxf s;
    public final k47 t;
    public final k47 u;
    public psd v;
    public a82 w;
    public iae x;
    public iae y;
    public iae z;

    public k3e(pg1 pg1Var, pg1 pg1Var2, k47 k47Var, k47 k47Var2, HashSet hashSet, akf akfVar) {
        super(I(hashSet));
        this.r = I(hashSet);
        this.t = k47Var;
        this.u = k47Var2;
        this.s = new zxf(pg1Var, pg1Var2, hashSet, akfVar, new r45(22, this));
        HashSet hashSet2 = ((oif) hashSet.iterator().next()).h;
        this.h = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static l3e I(HashSet hashSet) {
        k79 k79VarJ = k79.j();
        new sk1(k79VarJ, 3);
        k79VarJ.p(wv6.C, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            oif oifVar = (oif) it.next();
            if (oifVar.i.h(xjf.p0)) {
                arrayList.add(oifVar.i.s());
            } else {
                b1.d("StreamSharing", "A child does not have capture type.");
            }
        }
        k79VarJ.p(l3e.b, arrayList);
        k79VarJ.p(ew6.I, 2);
        k79VarJ.p(xjf.u0, n3e.PREVIEW_VIDEO_STILL);
        return new l3e(bs9.d(k79VarJ));
    }

    public final void E() {
        wzc wzcVar = this.D;
        if (wzcVar != null) {
            wzcVar.b();
            this.D = null;
        }
        iae iaeVar = this.x;
        if (iaeVar != null) {
            iaeVar.b();
            this.x = null;
        }
        iae iaeVar2 = this.y;
        if (iaeVar2 != null) {
            iaeVar2.b();
            this.y = null;
        }
        iae iaeVar3 = this.z;
        if (iaeVar3 != null) {
            iaeVar3.b();
            this.z = null;
        }
        iae iaeVar4 = this.A;
        if (iaeVar4 != null) {
            iaeVar4.b();
            this.A = null;
        }
        psd psdVar = this.v;
        if (psdVar != null) {
            ((ft3) psdVar.b).a();
            p8c.v(new m45(24, psdVar));
            this.v = null;
        }
        a82 a82Var = this.w;
        if (a82Var != null) {
            ((pae) a82Var.c).a();
            p8c.v(new j1(29, a82Var));
            this.w = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List F(String str, String str2, xjf xjfVar, hq0 hq0Var, hq0 hq0Var2) {
        boolean z;
        qr4 qr4Var = hq0Var.c;
        p8c.m();
        zxf zxfVar = this.s;
        if (hq0Var2 == null) {
            iae iaeVarG = G(str, str2, xjfVar, hq0Var, null);
            pg1 pg1VarD = d();
            Objects.requireNonNull(pg1VarD);
            psd psdVar = new psd(pg1VarD, new ft3(qr4Var));
            this.v = psdVar;
            boolean z2 = this.l != null;
            int iA = ((ew6) this.i).A(0);
            zxfVar.getClass();
            HashMap map = new HashMap();
            for (oif oifVar : zxfVar.a) {
                oxb oxbVar = zxfVar.y;
                pg1 pg1Var = zxfVar.f;
                zxf zxfVar2 = zxfVar;
                boolean z3 = z2;
                qp0 qp0VarS = zxfVar2.s(oifVar, oxbVar, pg1Var, iaeVarG, iA, z3);
                int iP = zxfVar2.f.b().p(((ew6) oifVar.i).A(0));
                xxf xxfVar = (xxf) zxfVar2.c.get(oifVar);
                Objects.requireNonNull(xxfVar);
                xxfVar.b.c = iP;
                map.put(oifVar, qp0VarS);
                zxfVar = zxfVar2;
                z2 = z3;
            }
            zxf zxfVar3 = zxfVar;
            boolean z4 = z2;
            ArrayList arrayList = new ArrayList(map.values());
            if (iaeVarG == null) {
                r82.g("Null surfaceEdge");
                return null;
            }
            ft3 ft3Var = (ft3) psdVar.b;
            p8c.m();
            b21.q("SurfaceProcessorNode", "[StreamSharing] SurfaceProcessorNode Transform (Processor=" + ft3Var + "\n   inputEdge = " + iaeVarG);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b21.q("SurfaceProcessorNode", "   outputConfig = " + ((qp0) it.next()));
            }
            psdVar.d = new xi2();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                qp0 qp0Var = (qp0) it2.next();
                xi2 xi2Var = (xi2) psdVar.d;
                Rect rect = qp0Var.d;
                int i = qp0Var.f;
                boolean z5 = qp0Var.g;
                Matrix matrix = new Matrix(iaeVarG.b);
                RectF rectF = new RectF(rect);
                Size size = qp0Var.e;
                Iterator it3 = it2;
                matrix.postConcat(s2f.a(rectF, s2f.h(size), i, z5));
                ok8.l(s2f.d(s2f.g(i, s2f.f(rect)), size));
                HashMap map2 = map;
                Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                hc2 hc2VarB = iaeVarG.g.b();
                hc2VarB.b = size;
                xi2Var.put(qp0Var, new iae(qp0Var.b, qp0Var.c, hc2VarB.c(), matrix, false, rect2, iaeVarG.i - i, -1, iaeVarG.e != z5));
                it2 = it3;
                map = map2;
            }
            HashMap map3 = map;
            ft3Var.b(iaeVarG.c((pg1) psdVar.c, true));
            for (Map.Entry entry : ((xi2) psdVar.d).entrySet()) {
                psdVar.h(iaeVarG, entry);
                iae iaeVar = (iae) entry.getValue();
                qae qaeVar = new qae(psdVar, iaeVarG, entry, 0);
                iaeVar.getClass();
                p8c.m();
                iaeVar.a();
                iaeVar.m.add(qaeVar);
            }
            iaeVarG.o.add(new b80(3, (xi2) psdVar.d));
            xi2 xi2Var2 = (xi2) psdVar.d;
            HashMap map4 = new HashMap();
            for (Map.Entry entry2 : map3.entrySet()) {
                map4.put((oif) entry2.getKey(), (iae) xi2Var2.get(entry2.getValue()));
            }
            zxfVar3.y(map4, zxfVar3.v(iaeVarG, z4));
            Object[] objArr = {this.B.c()};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
            return Collections.unmodifiableList(arrayList2);
        }
        iae iaeVarG2 = G(str, str2, xjfVar, hq0Var, hq0Var2);
        Matrix matrix2 = this.m;
        pg1 pg1VarJ = j();
        Objects.requireNonNull(pg1VarJ);
        boolean zO = pg1VarJ.o();
        Size size2 = hq0Var2.a;
        Rect rect3 = this.l;
        if (rect3 != null) {
            z = false;
        } else {
            z = false;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        pg1 pg1VarJ2 = j();
        Objects.requireNonNull(pg1VarJ2);
        int i2 = i(pg1VarJ2, z);
        pg1 pg1VarJ3 = j();
        Objects.requireNonNull(pg1VarJ3);
        zxf zxfVar4 = zxfVar;
        iae iaeVar2 = new iae(3, 34, hq0Var2, matrix2, zO, rect3, i2, -1, n(pg1VarJ3));
        this.y = iaeVar2;
        Objects.requireNonNull(j());
        this.A = iaeVar2;
        vzc vzcVarH = H(this.y, xjfVar, hq0Var2);
        this.C = vzcVarH;
        wzc wzcVar = this.D;
        if (wzcVar != null) {
            wzcVar.b();
        }
        wzc wzcVar2 = new wzc(new j3e(this, str, str2, xjfVar, hq0Var, hq0Var2));
        this.D = wzcVar2;
        vzcVarH.f = wzcVar2;
        iae iaeVar3 = this.A;
        this.w = new a82(d(), j(), new vq4(qr4Var, this.t, this.u));
        boolean z6 = this.l != null;
        int iA2 = ((ew6) this.i).A(0);
        zxfVar4.getClass();
        HashMap map5 = new HashMap();
        for (oif oifVar2 : zxfVar4.a) {
            zxf zxfVar5 = zxfVar4;
            qp0 qp0VarS2 = zxfVar5.s(oifVar2, zxfVar4.y, zxfVar4.f, iaeVarG2, iA2, z6);
            oxb oxbVar2 = zxfVar5.z;
            Objects.requireNonNull(oxbVar2);
            pg1 pg1Var2 = zxfVar5.g;
            Objects.requireNonNull(pg1Var2);
            iae iaeVar4 = iaeVar3;
            qp0 qp0VarS3 = zxfVar5.s(oifVar2, oxbVar2, pg1Var2, iaeVar4, iA2, z6);
            int iP2 = zxfVar5.f.b().p(((ew6) oifVar2.i).A(0));
            xxf xxfVar2 = (xxf) zxfVar5.c.get(oifVar2);
            Objects.requireNonNull(xxfVar2);
            xxfVar2.b.c = iP2;
            map5.put(oifVar2, new qo0(qp0VarS2, qp0VarS3));
            zxfVar4 = zxfVar5;
            iaeVar3 = iaeVar4;
        }
        iae iaeVar5 = iaeVar3;
        zxf zxfVar6 = zxfVar4;
        a82 a82Var = this.w;
        ArrayList arrayList3 = new ArrayList(map5.values());
        ro0 ro0Var = new ro0(iaeVarG2, iaeVar5, arrayList3);
        a82Var.getClass();
        p8c.m();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        pae paeVar = (pae) a82Var.c;
        sb.append(paeVar);
        sb.append("\n   primary input = ");
        sb.append(iaeVarG2);
        sb.append("\n   secondary input = ");
        sb.append(iaeVar5);
        b21.q("DualSurfaceProcessorNode", sb.toString());
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            b21.q("SurfaceProcessorNode", "   outputConfig = " + ((qo0) it4.next()));
        }
        a82Var.f = ro0Var;
        a82Var.e = new xi2();
        ro0 ro0Var2 = (ro0) a82Var.f;
        iae iaeVar6 = ro0Var2.a;
        iae iaeVar7 = ro0Var2.b;
        Iterator it5 = ro0Var2.c.iterator();
        while (it5.hasNext()) {
            qo0 qo0Var = (qo0) it5.next();
            xi2 xi2Var3 = (xi2) a82Var.e;
            qp0 qp0Var2 = qo0Var.a;
            Rect rect4 = qp0Var2.d;
            int i3 = qp0Var2.f;
            boolean z7 = qp0Var2.g;
            Iterator it6 = it5;
            HashMap map6 = map5;
            Matrix matrix3 = new Matrix(iaeVar6.b);
            RectF rectF2 = new RectF(rect4);
            Size size3 = qp0Var2.e;
            matrix3.postConcat(s2f.a(rectF2, s2f.h(size3), i3, z7));
            ok8.l(s2f.d(s2f.g(i3, s2f.f(rect4)), size3));
            Rect rect5 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            hc2 hc2VarB2 = iaeVar6.g.b();
            hc2VarB2.b = size3;
            xi2Var3.put(qo0Var, new iae(qp0Var2.b, qp0Var2.c, hc2VarB2.c(), matrix3, false, rect5, iaeVar6.i - i3, -1, iaeVar6.e != z7));
            it5 = it6;
            map5 = map6;
        }
        HashMap map7 = map5;
        paeVar.b(iaeVar6.c((pg1) a82Var.d, true));
        paeVar.b(iaeVar7.c((pg1) a82Var.b, false));
        pg1 pg1Var3 = (pg1) a82Var.d;
        pg1 pg1Var4 = (pg1) a82Var.b;
        for (final Map.Entry entry3 : ((xi2) a82Var.e).entrySet()) {
            final a82 a82Var2 = a82Var;
            final iae iaeVar8 = iaeVar6;
            final iae iaeVar9 = iaeVar7;
            a82Var2.x(pg1Var3, pg1Var4, iaeVar8, iaeVar9, entry3);
            iae iaeVar10 = (iae) entry3.getValue();
            final pg1 pg1Var5 = pg1Var4;
            final pg1 pg1Var6 = pg1Var3;
            Runnable runnable = new Runnable() { // from class: wq4
                @Override // java.lang.Runnable
                public final void run() {
                    a82Var2.x(pg1Var6, pg1Var5, iaeVar8, iaeVar9, entry3);
                }
            };
            pg1Var3 = pg1Var6;
            pg1Var4 = pg1Var5;
            iaeVar10.getClass();
            p8c.m();
            iaeVar10.a();
            iaeVar10.m.add(runnable);
            a82Var = a82Var2;
            iaeVar6 = iaeVar8;
            iaeVar7 = iaeVar9;
        }
        xi2 xi2Var4 = (xi2) a82Var.e;
        HashMap map8 = new HashMap();
        for (Map.Entry entry4 : map7.entrySet()) {
            map8.put((oif) entry4.getKey(), (iae) xi2Var4.get(entry4.getValue()));
        }
        zxfVar6.y(map8, zxfVar6.v(iaeVarG2, z6));
        Object[] objArr2 = {this.B.c(), this.C.c()};
        ArrayList arrayList4 = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            Object obj2 = objArr2[i4];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        return Collections.unmodifiableList(arrayList4);
    }

    public final iae G(String str, String str2, xjf xjfVar, hq0 hq0Var, hq0 hq0Var2) {
        Matrix matrix = this.m;
        pg1 pg1VarD = d();
        Objects.requireNonNull(pg1VarD);
        boolean zO = pg1VarD.o();
        Size size = hq0Var.a;
        Rect rect = this.l;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        pg1 pg1VarD2 = d();
        Objects.requireNonNull(pg1VarD2);
        int i = i(pg1VarD2, false);
        pg1 pg1VarD3 = d();
        Objects.requireNonNull(pg1VarD3);
        iae iaeVar = new iae(3, 34, hq0Var, matrix, zO, rect, i, -1, n(pg1VarD3));
        this.x = iaeVar;
        Objects.requireNonNull(d());
        this.z = iaeVar;
        vzc vzcVarH = H(this.x, xjfVar, hq0Var);
        this.B = vzcVarH;
        wzc wzcVar = this.D;
        if (wzcVar != null) {
            wzcVar.b();
        }
        wzc wzcVar2 = new wzc(new j3e(this, str, str2, xjfVar, hq0Var, hq0Var2));
        this.D = wzcVar2;
        vzcVarH.f = wzcVar2;
        return this.z;
    }

    public final vzc H(iae iaeVar, xjf xjfVar, hq0 hq0Var) {
        vzc vzcVarD = vzc.d(xjfVar, hq0Var.a);
        r1f r1fVar = vzcVarD.b;
        zxf zxfVar = this.s;
        Iterator it = zxfVar.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((zzc) ((oif) it.next()).i.c(xjf.e0)).g.c;
            List list = zzc.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            r1fVar.a = i;
        }
        Size size = hq0Var.a;
        Iterator it2 = zxfVar.a.iterator();
        while (it2.hasNext()) {
            zzc zzcVarC = vzc.d(((oif) it2.next()).i, size).c();
            im1 im1Var = zzcVarC.g;
            r1fVar.a(im1Var.d);
            List<he1> list2 = zzcVarC.e;
            ArrayList arrayList = vzcVarD.e;
            for (he1 he1Var : list2) {
                r1fVar.d(he1Var);
                if (!arrayList.contains(he1Var)) {
                    arrayList.add(he1Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : zzcVarC.d) {
                ArrayList arrayList2 = vzcVarD.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : zzcVarC.c) {
                ArrayList arrayList3 = vzcVarD.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            r1fVar.e(im1Var.b);
        }
        iaeVar.getClass();
        p8c.m();
        iaeVar.a();
        ok8.o("Consumer can only be linked once.", !iaeVar.j);
        iaeVar.j = true;
        vzcVarD.b(iaeVar.l, hq0Var.c, -1);
        r1fVar.d(zxfVar.v);
        qh2 qh2Var = hq0Var.f;
        if (qh2Var != null) {
            r1fVar.e(qh2Var);
        }
        vzcVarD.h = hq0Var.d;
        a(vzcVarD, hq0Var);
        return vzcVarD;
    }

    @Override // defpackage.oif
    public final xjf g(boolean z, akf akfVar) {
        l3e l3eVar = this.r;
        qh2 qh2VarA = akfVar.a(l3eVar.s(), 1);
        if (z) {
            qh2VarA = qh2.q(qh2VarA, l3eVar.a);
        }
        if (qh2VarA == null) {
            return null;
        }
        return ((sk1) m(qh2VarA)).o();
    }

    @Override // defpackage.oif
    public final Set k(ng1 ng1Var) {
        HashSet hashSet = this.s.a;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set setK = ((oif) it.next()).k(ng1Var);
            if (setK != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setK);
                } else {
                    hashSet2.retainAll(setK);
                }
            }
        }
        return hashSet2;
    }

    @Override // defpackage.oif
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.oif
    public final wjf m(qh2 qh2Var) {
        return new sk1(k79.m(qh2Var), 3);
    }

    @Override // defpackage.oif
    public final void s() {
        zxf zxfVar = this.s;
        for (oif oifVar : zxfVar.a) {
            xxf xxfVar = (xxf) zxfVar.c.get(oifVar);
            Objects.requireNonNull(xxfVar);
            oifVar.b(xxfVar, null, null, oifVar.g(true, zxfVar.e));
        }
    }

    @Override // defpackage.oif
    public final void t() {
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((oif) it.next()).t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // defpackage.oif
    public final xjf u(ng1 ng1Var, wjf wjfVar) {
        xjf xjfVar;
        xjf xjfVar2;
        Object qr4Var;
        ?? r5;
        ?? r4;
        List arrayList;
        nxb nxbVar;
        k79 k79VarH = wjfVar.h();
        zxf zxfVar = this.s;
        HashSet hashSet = zxfVar.w;
        oxb oxbVar = zxfVar.y;
        ng1 ng1Var2 = oxbVar.f;
        List listT = ng1Var2.t(34);
        HashSet hashSet2 = oxbVar.d;
        Iterator it = hashSet2.iterator();
        while (true) {
            xjfVar = null;
            if (!it.hasNext()) {
                break;
            }
            xjf xjfVar3 = (xjf) it.next();
            if (!((Boolean) xjfVar3.a(xjf.o0, Boolean.FALSE)).booleanValue() && (xjfVar3 instanceof ew6) && (nxbVar = (nxb) ((ew6) xjfVar3).a(ew6.N, null)) != null && nxbVar.c == 1) {
                ArrayList arrayList2 = new ArrayList(listT);
                arrayList2.addAll(ng1Var2.o(34));
                listT = arrayList2;
                break;
            }
        }
        List list = (List) k79VarH.a(ew6.M, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    arrayList = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
            listT = arrayList;
        }
        Rational rational = oxbVar.c;
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            hashSet3.addAll(oxbVar.c((xjf) it3.next()));
        }
        Iterator it4 = hashSet3.iterator();
        while (it4.hasNext()) {
            if (!ae0.a(rational, (Size) it4.next())) {
                arrayList3.addAll(oxbVar.g(oxbVar.b, listT, false));
                break;
            }
        }
        int size = arrayList3.size();
        if (!hashSet2.isEmpty()) {
            Iterator it5 = hashSet2.iterator();
            loop9: while (true) {
                if (!it5.hasNext()) {
                    xjfVar2 = xjfVar;
                    size = 0;
                    break;
                }
                Iterator it6 = oxbVar.c((xjf) it5.next()).iterator();
                boolean z = false;
                boolean z2 = false;
                while (it6.hasNext()) {
                    xjfVar2 = xjfVar;
                    boolean zA = ae0.a(rational, (Size) it6.next());
                    if (zA) {
                        z = true;
                    }
                    if (z2 && zA) {
                        break loop9;
                    }
                    if (!zA) {
                        z2 = true;
                    }
                    xjfVar = xjfVar2;
                }
                xjfVar2 = xjfVar;
                if (!z) {
                    break;
                }
                xjfVar = xjfVar2;
            }
        } else {
            xjfVar2 = null;
        }
        arrayList3.addAll(size, oxbVar.g(rational, listT, false));
        arrayList3.addAll(oxbVar.f(listT, false));
        if (arrayList3.isEmpty()) {
            b21.W("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList3.addAll(oxbVar.f(listT, true));
        }
        b21.q("ResolutionsMerger", "Parent resolutions: " + arrayList3);
        k79VarH.p(ew6.O, arrayList3);
        no0 no0Var = xjf.i0;
        Iterator it7 = hashSet.iterator();
        int iMax = 0;
        while (it7.hasNext()) {
            iMax = Math.max(iMax, ((Integer) ((xjf) it7.next()).a(xjf.i0, 0)).intValue());
        }
        k79VarH.p(no0Var, Integer.valueOf(iMax));
        ArrayList arrayList4 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            qr4 qr4Var2 = (qr4) ((xjf) it8.next()).a(wv6.E, qr4.c);
            qr4Var2.getClass();
            arrayList4.add(qr4Var2);
        }
        if (!arrayList4.isEmpty()) {
            qr4 qr4Var3 = (qr4) arrayList4.get(0);
            Integer numValueOf = Integer.valueOf(qr4Var3.a);
            int i = 1;
            ?? ValueOf = Integer.valueOf(qr4Var3.b);
            ?? r6 = numValueOf;
            while (true) {
                if (i >= arrayList4.size()) {
                    qr4Var = new qr4(r6.intValue(), ValueOf.intValue());
                    break;
                }
                qr4 qr4Var4 = (qr4) arrayList4.get(i);
                Integer numValueOf2 = Integer.valueOf(qr4Var4.a);
                if (r6.equals(0)) {
                    r5 = r6;
                    r5 = numValueOf2;
                } else if (!numValueOf2.equals(0)) {
                    if (!r6.equals(2) || numValueOf2.equals(1)) {
                        r5 = r6;
                        r5 = r6;
                        if (!numValueOf2.equals(2) || r6.equals(1)) {
                            r5 = r6;
                            boolean zEquals = r6.equals(numValueOf2);
                            r5 = r6;
                            if (!zEquals) {
                                r5 = xjfVar2;
                            }
                        }
                    } else {
                        r5 = r6;
                        r5 = numValueOf2;
                    }
                }
                r5 = r6;
                r5 = r6;
                Integer numValueOf3 = Integer.valueOf(qr4Var4.b);
                if (ValueOf.equals(0)) {
                    r4 = numValueOf3;
                } else if (!numValueOf3.equals(0) && !ValueOf.equals(numValueOf3)) {
                    r4 = ValueOf;
                    r4 = ValueOf;
                    r4 = xjfVar2;
                }
                if (r5 == 0 || r4 == 0) {
                    qr4Var = xjfVar2;
                    break;
                }
                i++;
                ValueOf = r4;
                r6 = r5;
            }
        } else {
            qr4Var = xjfVar2;
            break;
        }
        if (qr4Var == null) {
            qc0.j("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return xjfVar2;
        }
        k79VarH.p(wv6.E, qr4Var);
        no0 no0Var2 = xjf.k0;
        Range rangeExtend = hq0.h;
        Iterator it9 = hashSet.iterator();
        while (it9.hasNext()) {
            Range range = (Range) ((xjf) it9.next()).a(xjf.k0, rangeExtend);
            Objects.requireNonNull(range);
            if (hq0.h.equals(rangeExtend)) {
                rangeExtend = range;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(range);
                } catch (IllegalArgumentException unused) {
                    b21.q("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeExtend + " <<>> " + range);
                    rangeExtend = rangeExtend.extend(range);
                }
            }
        }
        k79VarH.p(no0Var2, rangeExtend);
        Iterator it10 = zxfVar.a.iterator();
        while (it10.hasNext()) {
            xjf xjfVar4 = (xjf) zxfVar.x.get((oif) it10.next());
            Objects.requireNonNull(xjfVar4);
            if (xjfVar4.t() != 0) {
                k79VarH.p(xjf.r0, Integer.valueOf(xjfVar4.t()));
            }
            if (xjfVar4.y() != 0) {
                k79VarH.p(xjf.q0, Integer.valueOf(xjfVar4.y()));
            }
        }
        return wjfVar.o();
    }

    @Override // defpackage.oif
    public final void v() {
        this.a = true;
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((oif) it.next()).v();
        }
    }

    @Override // defpackage.oif
    public final void w() {
        this.a = false;
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((oif) it.next()).w();
        }
    }

    @Override // defpackage.oif
    public final hq0 x(qh2 qh2Var) {
        this.B.a(qh2Var);
        Object[] objArr = {this.B.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        hc2 hc2VarB = this.j.b();
        hc2VarB.g = qh2Var;
        return hc2VarB.c();
    }

    @Override // defpackage.oif
    public final hq0 y(hq0 hq0Var, hq0 hq0Var2) {
        b21.q("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + hq0Var + ", secondaryStreamSpec " + hq0Var2);
        C(F(f(), j() == null ? null : j().q().d(), this.i, hq0Var, hq0Var2));
        p();
        return hq0Var;
    }

    @Override // defpackage.oif
    public final void z() {
        E();
        zxf zxfVar = this.s;
        for (oif oifVar : zxfVar.a) {
            xxf xxfVar = (xxf) zxfVar.c.get(oifVar);
            Objects.requireNonNull(xxfVar);
            oifVar.B(xxfVar);
        }
    }
}
