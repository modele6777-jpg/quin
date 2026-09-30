package io.sentry.android.replay.screenshot;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                if (!jVar.g.isRecycled()) {
                    synchronized (jVar.g) {
                        if (!jVar.g.isRecycled()) {
                            jVar.g.recycle();
                        }
                        break;
                    }
                }
                jVar.j.close();
                return;
            default:
                try {
                    jVar.a.C0(jVar.g);
                    return;
                } finally {
                    jVar.h();
                }
        }
    }
}
