package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eag extends Binder {
    public final vd9 d;

    public eag(vd9 vd9Var) {
        this.d = vd9Var;
    }

    public final void a(fag fagVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = fagVar.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.d.b;
        gle gleVar = new gle();
        firebaseMessagingService.a.execute(new c0(firebaseMessagingService, intent, gleVar, 17));
        gleVar.a.c(new mc0(1), new r45(28, fagVar));
    }
}
