package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hxf implements rxf, aw2 {
    public final /* synthetic */ aw2 a;
    public final Surface b;

    public hxf(aw2 aw2Var, qxf qxfVar) {
        this.a = aw2Var;
        this.b = qxfVar.a;
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
