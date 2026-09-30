package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class id {
    public final kp a;
    public final Set b;
    public eyf c;
    public final kzf d;

    public id(kp kpVar, Set set, aw2 aw2Var, p59 p59Var) {
        kpVar.getClass();
        aw2Var.getClass();
        this.a = kpVar;
        this.b = set;
        this.d = new kzf(aw2Var, new v6(1, p59Var, this));
        ynb.V(aw2Var, null, null, new hd(this, null), 3);
    }

    public final h99 a() {
        kzf kzfVar = this.d;
        synchronized (kzfVar.c) {
            try {
                if (kzfVar.f) {
                    return null;
                }
                int i = kzfVar.d + 1;
                kzfVar.d = i;
                if (i == 1) {
                    lyd lydVar = kzfVar.e;
                    if (lydVar != null) {
                        lydVar.h(null);
                    }
                    kzfVar.e = null;
                }
                return new h99(kzfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(zn2 zn2Var) {
        Object objC = tm7.C(this.a.u, new jp(2, null), zn2Var);
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (objC != bw2Var) {
            objC = wefVar;
        }
        return objC == bw2Var ? objC : wefVar;
    }

    public final void c() {
        this.d.a();
        this.a.a();
    }

    public final wef d(eyf eyfVar, h99 h99Var) {
        wef wefVar = wef.a;
        eyf eyfVar2 = this.c;
        this.c = eyfVar;
        if (eyfVar2 != null) {
            eyfVar2.a(null);
        }
        s0e s0eVar = this.a.u;
        synchronized (eyfVar.e) {
            if (eyfVar.f) {
                h99Var.b();
            } else {
                eyfVar.k = ynb.V(eyfVar.c, null, null, new dyf(s0eVar, eyfVar, null), 3);
                eyfVar.l = h99Var;
            }
        }
        return wefVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) ig1.b(this.a.a));
        sb.append(")@");
        int iHashCode = hashCode();
        tq.o(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
