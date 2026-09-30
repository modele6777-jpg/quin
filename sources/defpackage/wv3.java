package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ mjg d;

    public /* synthetic */ wv3(yv3 yv3Var, Runnable runnable, mjg mjgVar, int i) {
        this.a = i;
        this.b = yv3Var;
        this.c = runnable;
        this.d = mjgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final mjg mjgVar = this.d;
        final Runnable runnable = this.c;
        yv3 yv3Var = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                yv3Var.a.execute(new Runnable() { // from class: uv3
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        mjg mjgVar2 = mjgVar;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((aw3) mjgVar2.a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((aw3) mjgVar2.a).l(e2);
                                    return;
                                }
                            default:
                                aw3 aw3Var = (aw3) mjgVar2.a;
                                try {
                                    runnable2.run();
                                    aw3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    aw3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                yv3Var.a.execute(new Runnable() { // from class: uv3
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        mjg mjgVar2 = mjgVar;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((aw3) mjgVar2.a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((aw3) mjgVar2.a).l(e2);
                                    return;
                                }
                            default:
                                aw3 aw3Var = (aw3) mjgVar2.a;
                                try {
                                    runnable2.run();
                                    aw3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    aw3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                yv3Var.a.execute(new Runnable() { // from class: uv3
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        mjg mjgVar2 = mjgVar;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((aw3) mjgVar2.a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((aw3) mjgVar2.a).l(e2);
                                    return;
                                }
                            default:
                                aw3 aw3Var = (aw3) mjgVar2.a;
                                try {
                                    runnable2.run();
                                    aw3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    aw3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
