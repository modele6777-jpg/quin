package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yfg implements ServiceConnection {
    public final rch a = new rch("ExtractionForegroundServiceConnection");
    public final ArrayList b = new ArrayList();
    public final Context c;
    public ExtractionForegroundService d;
    public Notification e;

    public yfg(Context context) {
        this.c = context;
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
            this.b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            chg chgVar = (chg) arrayList.get(i);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel parcelD = chgVar.d();
                int i2 = qfg.a;
                parcelD.writeInt(1);
                bundle.writeToParcel(parcelD, 0);
                parcelD.writeInt(1);
                bundle2.writeToParcel(parcelD, 0);
                chgVar.e(parcelD, 2);
            } catch (RemoteException unused) {
                this.a.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((xfg) iBinder).d;
        this.d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.e);
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
