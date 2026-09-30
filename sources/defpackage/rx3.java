package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rx3 extends xnb {
    public final fob c;
    public final fob d;
    public final fob e;
    public final fob f;
    public final fob g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx3(dm7 dm7Var) {
        super(dm7Var);
        dm7Var.getClass();
        int i = 0;
        this.c = lmg.m0(null, new ox3(this, i));
        int i2 = 1;
        this.d = lmg.m0(null, new ox3(this, i2));
        this.e = lmg.m0(null, new ox3(this, 2));
        this.f = lmg.m0(null, new px3(this, dm7Var, i));
        this.g = lmg.m0(null, new px3(this, dm7Var, i2));
    }

    @Override // defpackage.wnb
    public final boolean E() {
        return pa7.t(G().getVisibility(), je7.a);
    }

    public abstract zy3 F();

    public abstract ea1 G();

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        Object objInvoke = this.c.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        Object objInvoke = this.e.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        Object objInvoke = this.f.invoke();
        objInvoke.getClass();
        return (yn7) objInvoke;
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        Object objInvoke = this.g.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        rz3 visibility = G().getVisibility();
        visibility.getClass();
        dx5 dx5Var = sqf.a;
        if (visibility.equals(sz3.e)) {
            return jo7.a;
        }
        if (visibility.equals(sz3.c)) {
            return jo7.b;
        }
        if (visibility.equals(sz3.d)) {
            return jo7.c;
        }
        if (visibility.equals(sz3.a) || visibility.equals(sz3.b)) {
            return jo7.d;
        }
        return null;
    }

    @Override // defpackage.wnb
    public final d09 i() {
        d09 d09Var = this.a.b;
        if (d09Var != null) {
            return d09Var;
        }
        e09 e09VarI = G().i();
        e09VarI.getClass();
        int iOrdinal = e09VarI.ordinal();
        if (iOrdinal == 0) {
            return d09.FINAL;
        }
        if (iOrdinal == 1) {
            return d09.SEALED;
        }
        if (iOrdinal == 2) {
            return d09.OPEN;
        }
        if (iOrdinal == 3) {
            return d09.ABSTRACT;
        }
        ap.c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    public final ArrayList y(boolean z) {
        iy9 iy9Var;
        Collection collection;
        ea1 ea1VarG = G();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (z) {
            nw7 nw7VarH = sqf.h(this);
            if (nw7VarH != null) {
                arrayList.add(new ey3(this, arrayList.size(), on7.a, new qx3(nw7VarH, 0)));
            }
            if (ea1VarG instanceof r04) {
                r04 r04Var = (r04) ea1VarG;
                iy9Var = new iy9(r04Var.U0, r04Var.T0.a0());
            } else if (ea1VarG instanceof q04) {
                q04 q04Var = (q04) ea1VarG;
                iy9Var = new iy9(q04Var.R0, q04Var.Q0.k0());
            } else if (ea1VarG instanceof uxa) {
                wxa wxaVar = ((uxa) ea1VarG).w;
                q04 q04Var2 = wxaVar instanceof q04 ? (q04) wxaVar : null;
                if (q04Var2 != null) {
                    iy9Var = new iy9(q04Var2.R0, q04Var2.Q0.k0());
                } else {
                    iy9Var = null;
                }
            } else {
                iy9Var = null;
            }
            if (iy9Var == null) {
                collection = pu4.a;
            } else {
                u99 u99Var = (u99) iy9Var.a();
                List list = (List) iy9Var.b();
                List listT = ea1VarG.T();
                listT.getClass();
                ArrayList arrayList2 = new ArrayList(t72.u(listT, 10));
                int i2 = 0;
                for (Object obj : listT) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        t72.Z();
                        throw null;
                    }
                    nw7 nw7Var = (nw7) obj;
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new xrf(ea1VarG, null, i2, nw7Var.getAnnotations(), t99.d(u99Var.getString(((d0b) list.get(i2)).I())), nw7Var.getType(), false, false, false, null, ntd.T));
                    arrayList2 = arrayList3;
                    i2 = i3;
                    u99Var = u99Var;
                    list = list;
                }
                collection = arrayList2;
            }
            int size = collection.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new ey3(this, arrayList.size(), on7.b, new zt2(collection, i4, i)));
            }
            nw7 nw7VarO = ea1VarG.O();
            if (nw7VarO != null) {
                arrayList.add(new ey3(this, arrayList.size(), on7.c, new qx3(nw7VarO, 1)));
            }
        }
        int size2 = ea1VarG.G().size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList.add(new ey3(this, arrayList.size(), on7.d, new zt2(ea1VarG, i5, 2)));
        }
        if (ynb.P(this) && (ea1VarG instanceof vd7) && arrayList.size() > 1) {
            w72.f0(arrayList, new ww2(20));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
