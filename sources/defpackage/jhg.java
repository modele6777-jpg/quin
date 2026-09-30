package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jhg implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jhg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        wrg lrgVar;
        switch (this.a) {
            case 0:
                khg khgVar = (khg) this.b;
                khgVar.b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                khgVar.a().post(new veg(this, iBinder));
                break;
            case 1:
                zsg.g("BillingClientTesting", "Billing Override Service connected.");
                fwg fwgVar = (fwg) this.b;
                int i = mrg.e;
                if (iBinder == null) {
                    lrgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    lrgVar = iInterfaceQueryLocalInterface instanceof wrg ? (wrg) iInterfaceQueryLocalInterface : new lrg(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 4);
                }
                fwgVar.F = lrgVar;
                fwgVar.E = 2;
                fwgVar.H(26);
                break;
            default:
                reh rehVar = (reh) this.b;
                rehVar.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                rehVar.a().post(new wxg(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 1;
        switch (this.a) {
            case 0:
                khg khgVar = (khg) this.b;
                khgVar.b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                khgVar.a().post(new hhg(1, this));
                break;
            case 1:
                zsg.h("BillingClientTesting", "Billing Override Service disconnected.");
                fwg fwgVar = (fwg) this.b;
                fwgVar.F = null;
                fwgVar.E = 0;
                break;
            default:
                reh rehVar = (reh) this.b;
                rehVar.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                rehVar.a().post(new cah(i, this));
                break;
        }
    }
}
