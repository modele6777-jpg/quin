package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oqe implements zhc {
    public final /* synthetic */ zhc a;
    public final mx3 b;
    public final mx3 c;

    public oqe(zhc zhcVar, final pqe pqeVar) {
        this.a = zhcVar;
        final int i = 0;
        this.b = zrd.b(new x16() { // from class: nqe
            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                pqe pqeVar2 = pqeVar;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(pqeVar2.a.j() < pqeVar2.b.j());
                    default:
                        return Boolean.valueOf(pqeVar2.a.j() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = zrd.b(new x16() { // from class: nqe
            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                pqe pqeVar2 = pqeVar;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(pqeVar2.a.j() < pqeVar2.b.j());
                    default:
                        return Boolean.valueOf(pqeVar2.a.j() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.zhc
    public final Object b(s89 s89Var, l26 l26Var, zn2 zn2Var) {
        return this.a.b(s89Var, l26Var, zn2Var);
    }

    @Override // defpackage.zhc
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return this.a.e(f);
    }
}
