package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wjg {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ yt0 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ yt0 f;

    public wjg(yt0 yt0Var, int i, Bundle bundle) {
        this.f = yt0Var;
        Boolean bool = Boolean.TRUE;
        this.c = yt0Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);
}
