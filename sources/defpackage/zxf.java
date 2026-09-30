package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zxf implements nif {
    public final HashSet a;
    public final akf e;
    public final pg1 f;
    public final pg1 g;
    public final HashSet w;
    public final HashMap x;
    public final oxb y;
    public final oxb z;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final ie1 v = new ie1(this);

    public zxf(pg1 pg1Var, pg1 pg1Var2, HashSet hashSet, akf akfVar, r45 r45Var) {
        this.f = pg1Var;
        this.g = pg1Var2;
        this.e = akfVar;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            oif oifVar = (oif) it.next();
            map.put(oifVar, oifVar.o(pg1Var.q(), null, oifVar.g(true, akfVar)));
        }
        this.x = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.w = hashSet2;
        this.y = new oxb(pg1Var, hashSet2);
        if (this.g != null) {
            this.z = new oxb(this.g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            oif oifVar2 = (oif) it2.next();
            this.d.put(oifVar2, Boolean.FALSE);
            this.c.put(oifVar2, new xxf(pg1Var, this, r45Var));
        }
    }

    public static void t(iae iaeVar, lu3 lu3Var, zzc zzcVar) {
        iaeVar.d();
        try {
            p8c.m();
            iaeVar.a();
            hae haeVar = iaeVar.l;
            haeVar.g(lu3Var, new cae(haeVar, 0));
        } catch (ju3 unused) {
            xzc xzcVar = zzcVar.f;
            if (xzcVar != null) {
                xzcVar.a(zzcVar);
            }
        }
    }

    public static lu3 u(oif oifVar) {
        List listB = oifVar instanceof hv6 ? oifVar.p.b() : Collections.unmodifiableList(oifVar.p.g.a);
        ok8.o(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (lu3) listB.get(0);
        }
        return null;
    }

    @Override // defpackage.nif
    public final void c(oif oifVar) {
        lu3 lu3VarU;
        p8c.m();
        iae iaeVarW = w(oifVar);
        if (x(oifVar) && (lu3VarU = u(oifVar)) != null) {
            t(iaeVarW, lu3VarU, oifVar.p);
        }
    }

    @Override // defpackage.nif
    public final void e(oif oifVar) {
        p8c.m();
        if (x(oifVar)) {
            return;
        }
        this.d.put(oifVar, Boolean.TRUE);
        lu3 lu3VarU = u(oifVar);
        if (lu3VarU != null) {
            t(w(oifVar), lu3VarU, oifVar.p);
        }
    }

    @Override // defpackage.nif
    public final void h(oif oifVar) {
        p8c.m();
        if (x(oifVar)) {
            iae iaeVarW = w(oifVar);
            lu3 lu3VarU = u(oifVar);
            if (lu3VarU != null) {
                t(iaeVarW, lu3VarU, oifVar.p);
                return;
            }
            p8c.m();
            iaeVarW.a();
            iaeVarW.l.a();
        }
    }

    @Override // defpackage.nif
    public final void r(oif oifVar) {
        p8c.m();
        if (x(oifVar)) {
            this.d.put(oifVar, Boolean.FALSE);
            iae iaeVarW = w(oifVar);
            p8c.m();
            iaeVarW.a();
            iaeVarW.l.a();
        }
    }

    public final qp0 s(oif oifVar, oxb oxbVar, pg1 pg1Var, iae iaeVar, int i, boolean z) {
        int i2;
        int iP = pg1Var.b().p(i);
        boolean zE = s2f.e(iaeVar.b);
        xjf xjfVar = (xjf) this.x.get(oifVar);
        Objects.requireNonNull(xjfVar);
        tsa tsaVarB = oxbVar.b(xjfVar, iaeVar.d, s2f.b(iaeVar.b), z);
        Rect rect = tsaVarB.a;
        Size size = tsaVarB.b;
        int i3 = s2f.i((iaeVar.i + pg1Var.b().p(((ew6) oifVar.i).A(0))) - iP);
        boolean zN = oifVar.n(pg1Var) ^ zE;
        if (oifVar instanceof wta) {
            i2 = 1;
        } else {
            i2 = oifVar instanceof hv6 ? 4 : 2;
        }
        return new qp0(UUID.randomUUID(), i2, oifVar instanceof hv6 ? 256 : 34, rect, s2f.g(i3, size), i3, zN);
    }

    public final HashMap v(iae iaeVar, boolean z) {
        HashMap map = new HashMap();
        for (oif oifVar : this.a) {
            xjf xjfVar = (xjf) this.x.get(oifVar);
            Objects.requireNonNull(xjfVar);
            Size size = this.y.b(xjfVar, iaeVar.d, s2f.b(iaeVar.b), z).c;
            map.put(oifVar, size);
            b21.q("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + oifVar);
        }
        return map;
    }

    public final iae w(oif oifVar) {
        iae iaeVar = (iae) this.b.get(oifVar);
        Objects.requireNonNull(iaeVar);
        return iaeVar;
    }

    public final boolean x(oif oifVar) {
        Boolean bool = (Boolean) this.d.get(oifVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap map, HashMap map2) {
        HashMap map3 = this.b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            oif oifVar = (oif) entry.getKey();
            iae iaeVar = (iae) entry.getValue();
            oifVar.A(iaeVar.d);
            oifVar.m = new Matrix(iaeVar.b);
            hc2 hc2VarB = iaeVar.g.b();
            Size size = (Size) map2.get(oifVar);
            if (size != null) {
                hc2VarB.c = size;
            }
            oifVar.D(hc2VarB.c(), null);
            oifVar.r();
        }
    }
}
