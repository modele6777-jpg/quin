package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2h implements ServiceConnection {
    public final String a;
    public final /* synthetic */ ysd b;

    public f2h(ysd ysdVar, String str) {
        Objects.requireNonNull(ysdVar);
        this.b = ysdVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ysd ysdVar = this.b;
        if (iBinder == null) {
            w0h w0hVar = ((w3h) ysdVar.b).f;
            w3h.h(w0hVar);
            w0hVar.x.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = psg.d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            qsg nsgVar = iInterfaceQueryLocalInterface instanceof qsg ? (qsg) iInterfaceQueryLocalInterface : new nsg(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 5);
            w3h w3hVar = (w3h) ysdVar.b;
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.Z.a("Install Referrer Service connected");
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.J0(new v36(this, nsgVar, this));
        } catch (RuntimeException e) {
            w0h w0hVar3 = ((w3h) ysdVar.b).f;
            w3h.h(w0hVar3);
            w0hVar3.x.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        w0h w0hVar = ((w3h) this.b.b).f;
        w3h.h(w0hVar);
        w0hVar.Z.a("Install Referrer Service disconnected");
    }
}
