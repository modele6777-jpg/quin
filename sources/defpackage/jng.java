package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jng extends Exception {
    public final ConnectionResult zza;

    public jng(ConnectionResult connectionResult) {
        oa7.u("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.b == 0 || connectionResult.c == null) ? false : true);
        this.zza = connectionResult;
    }
}
