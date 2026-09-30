package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lk1 implements ud1 {
    public final k47 E0;
    public final k47 F0;
    public final vea H0;
    public oif Y;
    public k3e Z;
    public final wf a;
    public final wf b;
    public final akf c;
    public final jg1 d;
    public final if1 g;
    public final te1 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public List v = Collections.EMPTY_LIST;
    public Range w = hq0.h;
    public final Object y = new Object();
    public boolean z = true;
    public qh2 X = null;
    public final lqb G0 = new lqb(9);

    public lk1(pg1 pg1Var, pg1 pg1Var2, vf vfVar, vf vfVar2, k47 k47Var, k47 k47Var2, if1 if1Var, vea veaVar, akf akfVar) {
        this.x = vfVar.c;
        this.a = new wf(pg1Var, vfVar);
        if (pg1Var2 == null || vfVar2 == null) {
            this.b = null;
        } else {
            this.b = new wf(pg1Var2, vfVar2);
        }
        this.E0 = k47Var;
        this.F0 = k47Var2;
        this.g = if1Var;
        this.c = akfVar;
        this.d = m93.D(vfVar, vfVar2);
        this.H0 = veaVar;
    }

    public static void B(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            oif oifVar = (oif) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                oifVar.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            oifVar.h = hashSet;
        }
    }

    public static ArrayList C(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((oif) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw kv2.g(it2);
            }
        }
        return arrayList2;
    }

    public static HashMap h(LinkedHashSet linkedHashSet, vd9 vd9Var) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            oif oifVar = (oif) it.next();
            map.put(oifVar, oifVar.h);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = vd9Var != null ? (LinkedHashSet) vd9Var.b : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            oifVar.h = hashSet;
        }
        return map;
    }

    public static Matrix t(Rect rect, Size size) {
        ok8.k("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap w(ArrayList arrayList, akf akfVar, akf akfVar2, Range range) {
        xjf xjfVarG;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oif oifVar = (oif) it.next();
            if (oifVar instanceof k3e) {
                k3e k3eVar = (k3e) oifVar;
                yta ytaVar = new yta(bs9.d(new sk1(2).b));
                ew6.z(ytaVar);
                wta wtaVar = new wta(ytaVar);
                wtaVar.s = wta.z;
                xjf xjfVarG2 = wtaVar.g(false, akfVar);
                if (xjfVarG2 == null) {
                    xjfVarG = null;
                } else {
                    k79 k79VarM = k79.m(xjfVarG2);
                    k79VarM.w(kfe.b0);
                    xjfVarG = ((sk1) k3eVar.m(k79VarM)).o();
                }
            } else {
                xjfVarG = oifVar.g(false, akfVar);
            }
            xjf xjfVarG3 = oifVar.g(true, akfVar2);
            k79 k79VarM2 = xjfVarG3 != null ? k79.m(xjfVarG3) : k79.j();
            k79VarM2.p(xjf.j0, 0);
            if (!hq0.h.equals(range)) {
                k79VarM2.n(xjf.k0, ph2.b, range);
                k79VarM2.p(xjf.l0, Boolean.TRUE);
            }
            xjf xjfVarO = oifVar.m(k79VarM2).o();
            hk1 hk1Var = new hk1();
            hk1Var.a = xjfVarG;
            hk1Var.b = xjfVarO;
            map.put(oifVar, hk1Var);
        }
        return map;
    }

    public final void A(ArrayList arrayList) {
        synchronized (this.y) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((oif) it.next()).h = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
            linkedHashSet.removeAll(arrayList);
            e(s(linkedHashSet, this.b != null));
        }
    }

    @Override // defpackage.ud1
    public final kg1 b() {
        return this.a.b;
    }

    public final void c(Collection collection, vd9 vd9Var) {
        b21.q("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + vd9Var);
        synchronized (this.y) {
            try {
                wf wfVar = this.a;
                te1 te1Var = this.x;
                wfVar.i(te1Var);
                wf wfVar2 = this.b;
                if (wfVar2 != null) {
                    wfVar2.i(te1Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
                linkedHashSet.addAll(collection);
                HashMap mapH = h(linkedHashSet, vd9Var);
                try {
                    e(s(linkedHashSet, this.b != null));
                } catch (IllegalArgumentException e) {
                    B(mapH);
                    throw new fk1(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(b91 b91Var) {
        Map map = b91Var.i.a;
        ArrayList<oif> arrayList = b91Var.b;
        synchronized (this.y) {
            try {
                for (oif oifVar : arrayList) {
                    Rect rectG = this.a.b.a.g();
                    hq0 hq0Var = (hq0) map.get(oifVar);
                    hq0Var.getClass();
                    Matrix matrixT = t(rectG, hq0Var.a);
                    oifVar.getClass();
                    oifVar.m = new Matrix(matrixT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.v;
        ArrayList arrayList2 = b91Var.b;
        LinkedHashSet linkedHashSet = b91Var.a;
        ArrayList arrayListC = C(list, arrayList2);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListC2 = C(arrayListC, arrayList3);
        if (!arrayListC2.isEmpty()) {
            b21.W("CameraUseCaseAdapter", "Unused effects: " + arrayListC2);
        }
        Iterator it = b91Var.e.iterator();
        while (it.hasNext()) {
            ((oif) it.next()).B(this.a);
        }
        this.a.l(b91Var.e);
        if (this.b != null) {
            for (oif oifVar2 : b91Var.e) {
                wf wfVar = this.b;
                Objects.requireNonNull(wfVar);
                oifVar2.B(wfVar);
            }
            wf wfVar2 = this.b;
            Objects.requireNonNull(wfVar2);
            wfVar2.l(b91Var.e);
        }
        if (b91Var.e.isEmpty()) {
            for (oif oifVar3 : b91Var.d) {
                Map map2 = b91Var.i.a;
                if (map2.containsKey(oifVar3)) {
                    hq0 hq0Var2 = (hq0) map2.get(oifVar3);
                    Objects.requireNonNull(hq0Var2);
                    qh2 qh2Var = hq0Var2.f;
                    if (qh2Var != null) {
                        zzc zzcVar = oifVar3.p;
                        bs9 bs9Var = zzcVar.g.b;
                        Objects.requireNonNull(qh2Var);
                        if (qh2Var.b().size() == zzcVar.g.b.b().size()) {
                            Iterator it2 = qh2Var.b().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    no0 no0Var = (no0) it2.next();
                                    if (!bs9Var.a.containsKey(no0Var) || !Objects.equals(bs9Var.c(no0Var), qh2Var.c(no0Var))) {
                                    }
                                }
                            }
                        }
                        oifVar3.j = oifVar3.x(qh2Var);
                        if (this.z) {
                            this.a.h(oifVar3);
                            wf wfVar3 = this.b;
                            if (wfVar3 != null) {
                                wfVar3.h(oifVar3);
                            }
                        }
                    }
                }
            }
        }
        for (oif oifVar4 : b91Var.c) {
            hk1 hk1Var = (hk1) b91Var.h.get(oifVar4);
            Objects.requireNonNull(hk1Var);
            wf wfVar4 = this.b;
            wf wfVar5 = this.a;
            xjf xjfVar = hk1Var.a;
            if (wfVar4 != null) {
                oifVar4.b(wfVar5, wfVar4, xjfVar, hk1Var.b);
                hq0 hq0Var3 = (hq0) b91Var.i.a.get(oifVar4);
                hq0Var3.getClass();
                m3e m3eVar = b91Var.j;
                m3eVar.getClass();
                oifVar4.D(hq0Var3, (hq0) m3eVar.a.get(oifVar4));
            } else {
                oifVar4.b(wfVar5, null, xjfVar, hk1Var.b);
                hq0 hq0Var4 = (hq0) b91Var.i.a.get(oifVar4);
                hq0Var4.getClass();
                oifVar4.D(hq0Var4, null);
            }
        }
        if (this.z) {
            this.a.m(b91Var.c);
            wf wfVar6 = this.b;
            if (wfVar6 != null) {
                wfVar6.m(b91Var.c);
            }
        }
        Iterator it3 = b91Var.c.iterator();
        while (it3.hasNext()) {
            ((oif) it3.next()).r();
        }
        this.e.clear();
        this.e.addAll(b91Var.a);
        this.f.clear();
        this.f.addAll(b91Var.b);
        this.Y = b91Var.g;
        this.Z = b91Var.f;
    }

    public final void r() {
        synchronized (this.y) {
            try {
                if (!this.z) {
                    if (!this.f.isEmpty()) {
                        this.a.i(this.x);
                        wf wfVar = this.b;
                        if (wfVar != null) {
                            wfVar.i(this.x);
                        }
                    }
                    this.a.m(this.f);
                    wf wfVar2 = this.b;
                    if (wfVar2 != null) {
                        wfVar2.m(this.f);
                    }
                    synchronized (this.y) {
                        try {
                            qh2 qh2Var = this.X;
                            if (qh2Var != null) {
                                this.a.c.c(qh2Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((oif) it.next()).r();
                    }
                    this.z = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x02ea  */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
    
        if (r3 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        return s(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.b91 s(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk1.s(java.util.LinkedHashSet, boolean):b91");
    }

    public final void u() {
        synchronized (this.y) {
            try {
                if (this.z) {
                    this.a.l(new ArrayList(this.f));
                    wf wfVar = this.b;
                    if (wfVar != null) {
                        wfVar.l(new ArrayList(this.f));
                    }
                    synchronized (this.y) {
                        uf ufVar = this.a.c;
                        this.X = ufVar.b.h();
                        ufVar.i();
                    }
                    this.z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int v() {
        int i;
        synchronized (this.y) {
            try {
                if1 if1Var = this.g;
                synchronized (if1Var.b) {
                    i = if1Var.e;
                }
                return i == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet x(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.y) {
            Iterator it = this.v.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            oif oifVar = (oif) it2.next();
            ok8.k("Only support one level of sharing for now.", !(oifVar instanceof k3e));
            Iterator it3 = oifVar.l().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i & iIntValue) == iIntValue) {
                    hashSet.add(oifVar);
                    break;
                }
            }
        }
        return hashSet;
    }

    public final List y() {
        ArrayList arrayList;
        synchronized (this.y) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public final void z() {
        synchronized (this.y) {
            this.x.u();
        }
    }
}
