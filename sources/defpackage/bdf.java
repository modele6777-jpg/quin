package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bdf implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bdf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                zt ztVar = (zt) obj3;
                if (ztVar == null) {
                    ((vv7) im2Var).a();
                } else {
                    int i2 = ((d6d) obj2).c;
                    xl1 xl1Var = ((vv7) im2Var).a;
                    ta0 ta0Var = xl1Var.b;
                    long jZ = ta0Var.z();
                    ta0Var.p().g();
                    try {
                        vd9.J((vd9) ta0Var.c, 0.0f, -i2, 1);
                        ta0 ta0Var2 = xl1Var.b;
                        long jZ2 = ta0Var2.z();
                        ta0Var2.p().g();
                        try {
                            ((vd9) ta0Var2.c).k(ztVar, 1);
                            ta0 ta0Var3 = xl1Var.b;
                            long jZ3 = ta0Var3.z();
                            ta0Var3.p().g();
                            try {
                                vd9.J((vd9) ta0Var3.c, 0.0f, i2, 1);
                                ((vv7) im2Var).a();
                                ta0Var3.p().o();
                                ta0Var3.R(jZ3);
                                ta0Var2.p().o();
                                ta0Var2.R(jZ2);
                                ks0.t(ta0Var, jZ);
                            } catch (Throwable th) {
                                ta0Var3.p().o();
                                ta0Var3.R(jZ3);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            ta0Var2.p().o();
                            ta0Var2.R(jZ2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        ks0.t(ta0Var, jZ);
                        throw th3;
                    }
                }
                return wefVar;
            case 1:
                ((k8f) obj3).d(((List) obj2).get(((Number) obj).intValue()));
                return "share-bitmap-preview-strip";
            case 2:
                int iIntValue = ((Number) obj).intValue();
                return ((cwe) obj3).z(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 3:
                return ((ksf) obj3).d(((List) obj2).get(((Number) obj).intValue()));
            default:
                Throwable th4 = (Throwable) obj;
                if (th4 instanceof sbg) {
                    ((v88) obj3).c.compareAndSet(-256, ((sbg) th4).getReason());
                }
                ((m88) obj2).cancel(false);
                return wefVar;
        }
    }
}
