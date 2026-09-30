package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t04 extends k2 {
    public final a0b X;
    public final uz3 Y;
    public final lp0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public t04(lp0 lp0Var, a0b a0bVar, int i) {
        dsf dsfVar;
        ge8 ge8Var = ((tz3) lp0Var.b).a;
        bm3 bm3Var = (bm3) lp0Var.d;
        g10 g10Var = hj6.c;
        t99 t99VarV = i7h.v((u99) lp0Var.c, a0bVar.I());
        zza zzaVarM = a0bVar.M();
        zzaVarM.getClass();
        int iOrdinal = zzaVarM.ordinal();
        if (iOrdinal == 0) {
            dsfVar = dsf.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            dsfVar = dsf.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                ap.c();
                throw null;
            }
            dsfVar = dsf.INVARIANT;
        }
        dsf dsfVar2 = dsfVar;
        boolean zJ = a0bVar.J();
        if (ge8Var == null) {
            k2.k0(0);
            throw null;
        }
        if (bm3Var == null) {
            k2.k0(1);
            throw null;
        }
        super(i, g10Var, bm3Var, ge8Var, t99VarV, dsfVar2, zJ);
        this.z = lp0Var;
        this.X = a0bVar;
        this.Y = new uz3(ge8Var, new j5(19, this));
    }

    @Override // defpackage.p5
    public final List E0() {
        lp0 lp0Var = this.z;
        List listA0 = feg.a0(this.X, (bu3) lp0Var.e);
        if (listA0.isEmpty()) {
            return t72.H(qz3.e(this).n());
        }
        o7f o7fVar = (o7f) lp0Var.w;
        ArrayList arrayList = new ArrayList(t72.u(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            arrayList.add(o7fVar.g((vza) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.m4, defpackage.f00
    public final h10 getAnnotations() {
        return this.Y;
    }
}
