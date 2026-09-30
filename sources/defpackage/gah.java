package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gah implements ServiceConnection, vt0, wt0 {
    public volatile boolean a;
    public volatile k0h b;
    public final /* synthetic */ lah c;

    public gah(lah lahVar) {
        this.c = lahVar;
    }

    @Override // defpackage.vt0
    public final void d(int i) {
        w3h w3hVar = (w3h) this.c.b;
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.F0();
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Y.a("Service connection suspended");
        m3h m3hVar2 = w3hVar.g;
        w3h.h(m3hVar2);
        m3hVar2.J0(new jfg(12, this));
    }

    @Override // defpackage.vt0
    public final void e() {
        m3h m3hVar = ((w3h) this.c.b).g;
        w3h.h(m3hVar);
        m3hVar.F0();
        synchronized (this) {
            boolean z = false;
            try {
                oa7.A(this.b);
                hzg hzgVar = (hzg) this.b.l();
                m3h m3hVar2 = ((w3h) this.c.b).g;
                w3h.h(m3hVar2);
                m3hVar2.J0(new w36(this, hzgVar, z, 27));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // defpackage.wt0
    public final void f(ConnectionResult connectionResult) {
        int i;
        lah lahVar = this.c;
        m3h m3hVar = ((w3h) lahVar.b).g;
        w3h.h(m3hVar);
        m3hVar.F0();
        w0h w0hVar = ((w3h) lahVar.b).f;
        if (w0hVar == null || !w0hVar.c) {
            w0hVar = null;
        }
        if (w0hVar != null) {
            w0hVar.Z.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            i = 0;
            this.a = false;
            this.b = null;
        }
        m3h m3hVar2 = ((w3h) this.c.b).g;
        w3h.h(m3hVar2);
        m3hVar2.J0(new fah(i, this, connectionResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m3h m3hVar = ((w3h) this.c.b).g;
        w3h.h(m3hVar);
        m3hVar.F0();
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                w0h w0hVar = ((w3h) this.c.b).f;
                w3h.h(w0hVar);
                w0hVar.g.a("Service connected with null binder");
                return;
            }
            Object czgVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    czgVar = iInterfaceQueryLocalInterface instanceof hzg ? (hzg) iInterfaceQueryLocalInterface : new czg(iBinder);
                    w0h w0hVar2 = ((w3h) this.c.b).f;
                    w3h.h(w0hVar2);
                    w0hVar2.Z.a("Bound to IMeasurementService interface");
                } else {
                    w0h w0hVar3 = ((w3h) this.c.b).f;
                    w3h.h(w0hVar3);
                    w0hVar3.g.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                w0h w0hVar4 = ((w3h) this.c.b).f;
                w3h.h(w0hVar4);
                w0hVar4.g.a("Service connect failed to get IMeasurementService");
            }
            if (czgVar == null) {
                this.a = false;
                try {
                    jk2 jk2VarB = jk2.b();
                    lah lahVar = this.c;
                    jk2VarB.c(((w3h) lahVar.b).a, lahVar.d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                m3h m3hVar2 = ((w3h) this.c.b).g;
                w3h.h(m3hVar2);
                m3hVar2.J0(new n6h(6, this, czgVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        w3h w3hVar = (w3h) this.c.b;
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.F0();
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Y.a("Service disconnected");
        m3h m3hVar2 = w3hVar.g;
        w3h.h(m3hVar2);
        m3hVar2.J0(new w36(this, componentName, false, 26));
    }
}
