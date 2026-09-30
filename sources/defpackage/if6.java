package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class if6 implements ume {
    public final ume a;
    public final jf6 b;
    public tme c;
    public tme d;

    public if6(ume umeVar, jf6 jf6Var) {
        umeVar.getClass();
        this.a = umeVar;
        this.b = jf6Var;
    }

    @Override // defpackage.ume
    public final tme a0() {
        if (!((Boolean) this.b.invoke()).booleanValue()) {
            return tme.b;
        }
        tme tmeVarA0 = this.a.a0();
        if (tmeVarA0 == this.c) {
            tme tmeVar = this.d;
            if (tmeVar != null) {
                return tmeVar;
            }
            qc0.p("Required value was null.");
            return null;
        }
        List<sme> list = tmeVarA0.a;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (sme bneVar : list) {
            if (bneVar instanceof bne) {
                Object obj = bneVar.a;
                bne bneVar2 = (bne) bneVar;
                bneVar = new bne(obj, bneVar2.b, bneVar2.c, new so5(6, this, bneVar2));
            }
            arrayList.add(bneVar);
        }
        tme tmeVar2 = new tme(arrayList);
        this.c = tmeVarA0;
        this.d = tmeVar2;
        return tmeVar2;
    }

    @Override // defpackage.ume
    public final long j(bv7 bv7Var) {
        bv7Var.getClass();
        return this.a.j(bv7Var);
    }

    @Override // defpackage.ume
    public final hkb n(bv7 bv7Var) {
        return this.a.n(bv7Var);
    }
}
