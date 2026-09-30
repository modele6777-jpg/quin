package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fhg implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fhg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                khg khgVar = (khg) obj;
                khgVar.b.e("reportBinderDeath", new Object[0]);
                if (khgVar.i.get() != null) {
                    r3.f();
                    return;
                }
                khgVar.b.e("%s : Binder has died.", khgVar.c);
                for (ehg ehgVar : khgVar.d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(khgVar.c).concat(" : Binder has died."));
                    gle gleVar = ehgVar.a;
                    if (gleVar != null) {
                        gleVar.b(remoteException);
                    }
                }
                khgVar.d.clear();
                synchronized (khgVar.f) {
                    khgVar.e();
                    break;
                }
                return;
            default:
                reh rehVar = (reh) obj;
                rehVar.b.d("reportBinderDeath", new Object[0]);
                if (rehVar.i.get() != null) {
                    r3.f();
                    return;
                }
                rehVar.b.d("%s : Binder has died.", rehVar.c);
                for (w4h w4hVar : rehVar.d) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(rehVar.c).concat(" : Binder has died."));
                    gle gleVar2 = w4hVar.a;
                    if (gleVar2 != null) {
                        gleVar2.b(remoteException2);
                    }
                }
                rehVar.d.clear();
                synchronized (rehVar.f) {
                    rehVar.c();
                    break;
                }
                return;
        }
    }
}
