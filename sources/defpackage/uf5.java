package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uf5 implements kn9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ uf5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // defpackage.kn9
    public final void a(Object obj) {
        boolean z;
        int i = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (i) {
            case 0:
                o0f o0fVar = (o0f) obj;
                if (!firebaseMessaging.f.s() || o0fVar.g.a() == null) {
                    return;
                }
                synchronized (o0fVar) {
                    z = o0fVar.f;
                }
                if (z) {
                    return;
                }
                o0fVar.c(0L);
                return;
            default:
                i62 i62Var = (i62) obj;
                if (i62Var != null) {
                    y41.B(i62Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
