package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xta implements vpb {
    public final f6d a;
    public final ks b;

    public xta(f6d f6dVar) {
        this.a = f6dVar;
        this.b = f6dVar != null ? new ks(f6dVar.a) : null;
    }

    @Override // defpackage.vpb
    public final void a() throws PendingIntent.CanceledException {
        f6d f6dVar = this.a;
        if (f6dVar != null) {
            f6dVar.close();
        }
    }

    @Override // defpackage.vpb
    public final void c() throws PendingIntent.CanceledException {
        f6d f6dVar = this.a;
        if (f6dVar != null) {
            f6dVar.close();
        }
    }

    @Override // defpackage.vpb
    public final void d() {
    }
}
