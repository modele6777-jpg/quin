package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f36 extends hjd {
    public f36(bm3 bm3Var, f36 f36Var, int i, boolean z) {
        super(bm3Var, f36Var, hj6.c, tr9.g, i, ntd.T);
        this.Y = true;
        this.K0 = z;
        this.L0 = false;
    }

    @Override // defpackage.hjd, defpackage.e36
    public final e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        bm3Var.getClass();
        if (i == 0) {
            throw null;
        }
        h10Var.getClass();
        return new f36(bm3Var, (f36) c36Var, i, this.K0);
    }

    @Override // defpackage.e36
    public final e36 G0(d36 d36Var) {
        t99 t99Var;
        f36 f36Var = (f36) super.G0(d36Var);
        if (f36Var == null) {
            return null;
        }
        List listG = f36Var.G();
        listG.getClass();
        if (listG.isEmpty()) {
            return f36Var;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            tt7 type = ((xrf) it.next()).getType();
            type.getClass();
            if (oa7.K(type) != null) {
                List listG2 = f36Var.G();
                listG2.getClass();
                ArrayList arrayList = new ArrayList(t72.u(listG2, 10));
                Iterator it2 = listG2.iterator();
                while (it2.hasNext()) {
                    tt7 type2 = ((xrf) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(oa7.K(type2));
                }
                int size = f36Var.G().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listG3 = f36Var.G();
                    listG3.getClass();
                    ArrayList<iy9> arrayListR1 = s72.r1(arrayList, listG3);
                    if (arrayListR1.isEmpty()) {
                        return f36Var;
                    }
                    for (iy9 iy9Var : arrayListR1) {
                        if (!pa7.t((t99) iy9Var.a(), ((xrf) iy9Var.b()).getName())) {
                        }
                    }
                    return f36Var;
                }
                List<xrf> listG4 = f36Var.G();
                listG4.getClass();
                ArrayList arrayList2 = new ArrayList(t72.u(listG4, 10));
                for (xrf xrfVar : listG4) {
                    t99 name = xrfVar.getName();
                    name.getClass();
                    int i = xrfVar.g;
                    int i2 = i - size;
                    if (i2 >= 0 && (t99Var = (t99) arrayList.get(i2)) != null) {
                        name = t99Var;
                    }
                    arrayList2.add(xrfVar.D0(f36Var, name, i));
                }
                d36 d36VarJ0 = f36Var.J0(q8f.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((t99) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                d36VarJ0.K0 = Boolean.valueOf(z);
                d36VarJ0.g = arrayList2;
                d36VarJ0.e = f36Var.C0();
                e36 e36VarG0 = super.G0(d36VarJ0);
                e36VarG0.getClass();
                return e36VarG0;
            }
        }
        return f36Var;
    }

    @Override // defpackage.e36, defpackage.tq8
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.e36, defpackage.c36
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.e36, defpackage.c36
    public final boolean z() {
        return false;
    }
}
