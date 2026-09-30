package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.aq0;
import defpackage.bq0;
import defpackage.j5c;
import defpackage.k5c;
import defpackage.t72;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener;", "Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;", "userMetadata", "<init>", "(Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;)V", "Lk5c;", "rolloutsState", "Lwef;", "onRolloutsStateChanged", "(Lk5c;)V", "Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class CrashlyticsRemoteConfigListener {
    private final UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata) {
        userMetadata.getClass();
        this.userMetadata = userMetadata;
    }

    public void onRolloutsStateChanged(k5c rolloutsState) {
        rolloutsState.getClass();
        UserMetadata userMetadata = this.userMetadata;
        HashSet<j5c> hashSet = ((bq0) rolloutsState).a;
        ArrayList arrayList = new ArrayList(t72.u(hashSet, 10));
        for (j5c j5cVar : hashSet) {
            String str = ((aq0) j5cVar).b;
            aq0 aq0Var = (aq0) j5cVar;
            arrayList.add(RolloutAssignment.create(str, aq0Var.d, aq0Var.e, aq0Var.c, aq0Var.f));
        }
        userMetadata.updateRolloutsState(arrayList);
        Logger.getLogger().d("Updated Crashlytics Rollout State");
    }
}
