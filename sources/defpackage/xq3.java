package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xq3 implements bc2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3b b;

    public /* synthetic */ xq3(y3b y3bVar, int i) {
        this.a = i;
        this.b = y3bVar;
    }

    @Override // defpackage.bc2
    public final Object c(hbc hbcVar) {
        int i = this.a;
        y3b y3bVar = this.b;
        switch (i) {
            case 0:
                return new zq3((Context) hbcVar.a(Context.class), ((ff5) hbcVar.a(ff5.class)).e(), hbcVar.b(y3b.a(hj6.class)), hbcVar.e(du3.class), (Executor) hbcVar.r(y3bVar));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(y3bVar, hbcVar);
            case 2:
                return FirebasePerfRegistrar.lambda$getComponents$0(y3bVar, hbcVar);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(y3bVar, hbcVar);
        }
    }
}
