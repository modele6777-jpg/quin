package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oif {
    public xjf f;
    public final xjf g;
    public HashSet h;
    public xjf i;
    public hq0 j;
    public xjf k;
    public Rect l;
    public pg1 n;
    public pg1 o;
    public zzc p;
    public zzc q;
    public boolean a = false;
    public final HashSet b = new HashSet();
    public final Object c = new Object();
    public final Object d = new Object();
    public int e = 2;
    public Matrix m = new Matrix();

    public oif(xjf xjfVar) {
        new s8f(this);
        this.p = zzc.a();
        this.q = zzc.a();
        this.g = xjfVar;
        this.i = xjfVar;
    }

    public void A(Rect rect) {
        this.l = rect;
    }

    public final void B(pg1 pg1Var) {
        z();
        synchronized (this.c) {
            try {
                pg1 pg1Var2 = this.n;
                if (pg1Var == pg1Var2) {
                    this.b.remove(pg1Var2);
                    this.n = null;
                }
                pg1 pg1Var3 = this.o;
                if (pg1Var == pg1Var3) {
                    this.b.remove(pg1Var3);
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
        }
        this.j = null;
        this.l = null;
        this.i = this.g;
        this.f = null;
        this.k = null;
    }

    public final void C(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.p = (zzc) list.get(0);
        if (list.size() > 1) {
            this.q = (zzc) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (lu3 lu3Var : ((zzc) it.next()).b()) {
                if (lu3Var.j == null) {
                    lu3Var.j = getClass();
                }
            }
        }
    }

    public final void D(hq0 hq0Var, hq0 hq0Var2) {
        this.j = y(hq0Var, hq0Var2);
    }

    public final void a(vzc vzcVar, hq0 hq0Var) {
        Range range = hq0.h;
        if (!range.equals(hq0Var.e)) {
            ((k79) vzcVar.b.c).p(im1.h, hq0Var.e);
            return;
        }
        synchronized (this.c) {
            try {
                pg1 pg1Var = this.n;
                pg1Var.getClass();
                ArrayList arrayListC = pg1Var.q().s().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListC.size() > 1) {
                    z = false;
                }
                ok8.k("There should not have more than one AeFpsRangeQuirk.", z);
                if (!arrayListC.isEmpty()) {
                    Range range2 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListC.get(0))).a.getValue();
                    if (range2 != null) {
                        range = range2;
                    }
                    ((k79) vzcVar.b.c).p(im1.h, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(pg1 pg1Var, pg1 pg1Var2, xjf xjfVar, xjf xjfVar2) {
        synchronized (this.c) {
            this.n = pg1Var;
            this.o = pg1Var2;
            this.b.add(pg1Var);
            if (pg1Var2 != null) {
                this.b.add(pg1Var2);
            }
        }
        this.f = xjfVar;
        this.k = xjfVar2;
        this.i = o(pg1Var.q(), this.f, this.k);
        synchronized (this.d) {
        }
        s();
    }

    public final Size c() {
        hq0 hq0Var = this.j;
        if (hq0Var != null) {
            return hq0Var.a;
        }
        return null;
    }

    public final pg1 d() {
        pg1 pg1Var;
        synchronized (this.c) {
            pg1Var = this.n;
        }
        return pg1Var;
    }

    public final ef1 e() {
        synchronized (this.c) {
            try {
                pg1 pg1Var = this.n;
                if (pg1Var == null) {
                    return ef1.a;
                }
                return pg1Var.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String f() {
        pg1 pg1VarD = d();
        ok8.n(pg1VarD, "No camera attached to use case: " + this);
        return pg1VarD.q().d();
    }

    public abstract xjf g(boolean z, akf akfVar);

    public final String h() {
        String str = (String) this.i.a(kfe.a0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int i(pg1 pg1Var, boolean z) {
        int iP = pg1Var.q().p(((ew6) this.i).A(0));
        return (pg1Var.o() || !z) ? iP : s2f.i(-iP);
    }

    public final pg1 j() {
        pg1 pg1Var;
        synchronized (this.c) {
            pg1Var = this.o;
        }
        return pg1Var;
    }

    public Set k(ng1 ng1Var) {
        return null;
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public abstract wjf m(qh2 qh2Var);

    public final boolean n(pg1 pg1Var) {
        int iIntValue = ((Integer) ((ew6) this.i).a(ew6.I, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return pg1Var.d();
        }
        qc0.i(tec.e(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final xjf o(ng1 ng1Var, xjf xjfVar, xjf xjfVar2) {
        k79 k79VarJ;
        if (xjfVar2 != null) {
            k79VarJ = k79.m(xjfVar2);
            k79VarJ.w(kfe.a0);
        } else {
            k79VarJ = k79.j();
        }
        TreeMap treeMap = k79VarJ.a;
        no0 no0Var = ew6.F;
        xjf xjfVar3 = this.g;
        if (xjfVar3.h(no0Var) || xjfVar3.h(ew6.J)) {
            no0 no0Var2 = ew6.N;
            if (treeMap.containsKey(no0Var2)) {
                k79VarJ.w(no0Var2);
            }
        }
        no0 no0Var3 = ew6.N;
        if (xjfVar3.h(no0Var3)) {
            no0 no0Var4 = ew6.L;
            if (treeMap.containsKey(no0Var4) && ((nxb) xjfVar3.c(no0Var3)).b != null) {
                k79VarJ.w(no0Var4);
            }
        }
        Iterator it = xjfVar3.b().iterator();
        while (it.hasNext()) {
            qh2.o(k79VarJ, k79VarJ, xjfVar3, (no0) it.next());
        }
        if (xjfVar != null) {
            for (no0 no0Var5 : xjfVar.b()) {
                if (!no0Var5.a.equals(kfe.a0.a)) {
                    qh2.o(k79VarJ, k79VarJ, xjfVar, no0Var5);
                }
            }
        }
        if (treeMap.containsKey(ew6.J)) {
            no0 no0Var6 = ew6.F;
            if (treeMap.containsKey(no0Var6)) {
                k79VarJ.w(no0Var6);
            }
        }
        no0 no0Var7 = ew6.N;
        if (treeMap.containsKey(no0Var7) && ((nxb) k79VarJ.c(no0Var7)).c != 0) {
            k79VarJ.p(xjf.n0, Boolean.TRUE);
        }
        b21.q("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.h + ", this = " + this);
        HashSet<gf6> hashSet = this.h;
        if (hashSet != null) {
            int i = sr4.c;
            Range range = hq0.h;
            vuf vufVar = wuf.c;
            qr4 qr4Var = qr4.d;
            for (gf6 gf6Var : hashSet) {
                if (gf6Var instanceof sr4) {
                    qr4Var = ((sr4) gf6Var).a;
                } else if (gf6Var instanceof cx5) {
                    cx5 cx5Var = (cx5) gf6Var;
                    range = new Range(Integer.valueOf(cx5Var.a), Integer.valueOf(cx5Var.b));
                } else if (gf6Var instanceof wuf) {
                    vufVar = ((wuf) gf6Var).a;
                }
            }
            if ((this instanceof wta) || tgc.l(this)) {
                k79VarJ.p(wv6.E, qr4Var);
            }
            k79VarJ.p(xjf.k0, range);
            int iOrdinal = vufVar.ordinal();
            if (iOrdinal == 0) {
                k79VarJ.p(xjf.q0, 0);
                k79VarJ.p(xjf.r0, 0);
            } else if (iOrdinal == 1) {
                k79VarJ.p(xjf.q0, 1);
                k79VarJ.p(xjf.r0, 1);
            } else if (iOrdinal == 2) {
                k79VarJ.p(xjf.q0, 0);
                k79VarJ.p(xjf.r0, 2);
            } else if (iOrdinal == 3) {
                k79VarJ.p(xjf.q0, 2);
                k79VarJ.p(xjf.r0, 0);
            }
        }
        return u(ng1Var, m(k79VarJ));
    }

    public final void p() {
        this.e = 1;
        r();
    }

    public final void q() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nif) it.next()).c(this);
        }
    }

    public final void r() {
        int iB = kv2.B(this.e);
        HashSet hashSet = this.b;
        if (iB == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((nif) it.next()).e(this);
            }
        } else {
            if (iB != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((nif) it2.next()).r(this);
            }
        }
    }

    public xjf u(ng1 ng1Var, wjf wjfVar) {
        return wjfVar.o();
    }

    public void v() {
        this.a = true;
    }

    public void w() {
        this.a = false;
    }

    public hq0 x(qh2 qh2Var) {
        hq0 hq0Var = this.j;
        if (hq0Var == null) {
            s8f.i("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        hc2 hc2VarB = hq0Var.b();
        hc2VarB.g = qh2Var;
        return hc2VarB.c();
    }

    public abstract hq0 y(hq0 hq0Var, hq0 hq0Var2);

    public abstract void z();

    public void s() {
    }

    public void t() {
    }
}
