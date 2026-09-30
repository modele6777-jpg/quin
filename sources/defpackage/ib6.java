package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ib6 extends er8 {
    public static final /* synthetic */ wn7[] d = {new aya(ib6.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    public final i0 b;
    public final ee8 c;

    public ib6(ge8 ge8Var, i0 i0Var) {
        ge8Var.getClass();
        this.b = i0Var;
        this.c = new ee8(ge8Var, new j5(22, this));
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        if (!ez3Var.a(ez3.n.b)) {
            return pu4.a;
        }
        return (List) gdc.f(this.c, d[0]);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        List list = (List) gdc.f(this.c, d[0]);
        if (list.isEmpty()) {
            return pu4.a;
        }
        cqd cqdVar = new cqd();
        for (Object obj : list) {
            if ((obj instanceof hjd) && pa7.t(((hjd) obj).getName(), t99Var)) {
                cqdVar.add(obj);
            }
        }
        return cqdVar;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        List list = (List) gdc.f(this.c, d[0]);
        if (list.isEmpty()) {
            return pu4.a;
        }
        cqd cqdVar = new cqd();
        for (Object obj : list) {
            if ((obj instanceof wxa) && pa7.t(((wxa) obj).getName(), t99Var)) {
                cqdVar.add(obj);
            }
        }
        return cqdVar;
    }

    public abstract List h();
}
