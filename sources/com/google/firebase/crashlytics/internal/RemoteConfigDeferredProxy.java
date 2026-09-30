package com.google.firebase.crashlytics.internal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.bqb;
import defpackage.gi2;
import defpackage.i1b;
import defpackage.kxa;
import defpackage.lg5;
import defpackage.ou3;
import defpackage.r45;
import defpackage.wh2;
import defpackage.yr9;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigDeferredProxy {
    private final ou3 remoteConfigInteropDeferred;

    public RemoteConfigDeferredProxy(ou3 ou3Var) {
        this.remoteConfigInteropDeferred = ou3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setupListener$0(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, i1b i1bVar) {
        kxa kxaVar = ((bqb) ((lg5) i1bVar.get())).b("firebase").i;
        ((Set) kxaVar.d).add(crashlyticsRemoteConfigListener);
        Task taskB = ((wh2) kxaVar.a).b();
        taskB.e((Executor) kxaVar.c, new gi2(kxaVar, taskB, crashlyticsRemoteConfigListener, 8));
        Logger.getLogger().d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().w("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(userMetadata);
        ((yr9) this.remoteConfigInteropDeferred).a(new r45(18, crashlyticsRemoteConfigListener));
    }
}
