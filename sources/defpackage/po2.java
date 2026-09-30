package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb2 b;
    public final /* synthetic */ q7b c;

    public /* synthetic */ po2(vb2 vb2Var, q7b q7bVar, int i) {
        this.a = i;
        this.b = vb2Var;
        this.c = q7bVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        final q7b q7bVar = this.c;
        final vb2 vb2Var = this.b;
        ra4 ra4Var = (ra4) obj;
        switch (i) {
            case 0:
                ra4Var.getClass();
                final int i2 = 0;
                yl2 yl2Var = new yl2() { // from class: wo2
                    @Override // defpackage.yl2
                    public final void accept(Object obj2) {
                        int i3 = i2;
                        q7b q7bVar2 = q7bVar;
                        vb2 vb2Var2 = vb2Var;
                        Intent intent = (Intent) obj2;
                        switch (i3) {
                            case 0:
                                intent.getClass();
                                vb2Var2.setIntent(intent);
                                wq2.p(vb2Var2, q7bVar2);
                                break;
                            default:
                                intent.getClass();
                                vb2Var2.setIntent(intent);
                                wq2.q(vb2Var2, q7bVar2);
                                break;
                        }
                    }
                };
                vb2Var.z.add(yl2Var);
                return new oe0(7, vb2Var, yl2Var);
            default:
                ra4Var.getClass();
                final int i3 = 1;
                yl2 yl2Var2 = new yl2() { // from class: wo2
                    @Override // defpackage.yl2
                    public final void accept(Object obj2) {
                        int i4 = i3;
                        q7b q7bVar2 = q7bVar;
                        vb2 vb2Var2 = vb2Var;
                        Intent intent = (Intent) obj2;
                        switch (i4) {
                            case 0:
                                intent.getClass();
                                vb2Var2.setIntent(intent);
                                wq2.p(vb2Var2, q7bVar2);
                                break;
                            default:
                                intent.getClass();
                                vb2Var2.setIntent(intent);
                                wq2.q(vb2Var2, q7bVar2);
                                break;
                        }
                    }
                };
                vb2Var.z.add(yl2Var2);
                return new oe0(8, vb2Var, yl2Var2);
        }
    }
}
