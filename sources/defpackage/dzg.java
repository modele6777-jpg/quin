package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dzg extends wjg {
    public final /* synthetic */ yt0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzg(yt0 yt0Var, int i, Bundle bundle) {
        super(yt0Var, i, bundle);
        this.g = yt0Var;
    }

    @Override // defpackage.wjg
    public final boolean a() {
        this.g.j.a(ConnectionResult.f);
        return true;
    }

    @Override // defpackage.wjg
    public final void b(ConnectionResult connectionResult) {
        this.g.j.a(connectionResult);
        System.currentTimeMillis();
    }
}
