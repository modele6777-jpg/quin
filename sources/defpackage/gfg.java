package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import com.google.android.play.core.assetpacks.b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gfg extends ffg {
    public final rch e;
    public final Context f;
    public final b g;
    public final dhg h;
    public final yfg i;
    public final tgg j;

    public gfg(Context context, b bVar, dhg dhgVar, yfg yfgVar, tgg tggVar) {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService", 0);
        this.e = new rch("AssetPackExtractionService");
        this.f = context;
        this.g = bVar;
        this.h = dhgVar;
        this.i = yfgVar;
        this.j = tggVar;
    }

    @Override // defpackage.ffg
    public final boolean G(Parcel parcel, int i) {
        String[] packagesForUid;
        chg chgVar = null;
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                chgVar = iInterfaceQueryLocalInterface instanceof chg ? (chg) iInterfaceQueryLocalInterface : new chg(strongBinder);
            }
            qfg.b(parcel);
            this.e.a("clearAssetPackStorage AIDL call", new Object[0]);
            Context context = this.f;
            if (!reg.a(context) || (packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
                chgVar.O(new Bundle());
                return true;
            }
            b.f(this.g.d());
            Bundle bundle = new Bundle();
            Parcel parcelD = chgVar.d();
            parcelD.writeInt(1);
            bundle.writeToParcel(parcelD, 0);
            chgVar.e(parcelD, 4);
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) qfg.a(parcel);
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            chgVar = iInterfaceQueryLocalInterface2 instanceof chg ? (chg) iInterfaceQueryLocalInterface2 : new chg(strongBinder2);
        }
        qfg.b(parcel);
        synchronized (this) {
            this.e.a("updateServiceState AIDL call", new Object[0]);
            if (reg.a(this.f)) {
                String[] packagesForUid2 = this.f.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid2 != null && Arrays.asList(packagesForUid2).contains("com.android.vending")) {
                    int i2 = bundle2.getInt("action_type");
                    yfg yfgVar = this.i;
                    synchronized (yfgVar.b) {
                        yfgVar.b.add(chgVar);
                    }
                    if (i2 == 1) {
                        this.j.b(bundle2);
                        this.h.a(true);
                        this.i.e = this.j.a(bundle2);
                        this.f.bindService(new Intent(this.f, (Class<?>) ExtractionForegroundService.class), this.i, 1);
                        return true;
                    }
                    if (i2 != 2) {
                        this.e.b("Unknown action type received: %d", Integer.valueOf(i2));
                        chgVar.O(new Bundle());
                        return true;
                    }
                    this.h.a(false);
                    yfg yfgVar2 = this.i;
                    yfgVar2.a.a("Stopping foreground installation service.", new Object[0]);
                    yfgVar2.c.unbindService(yfgVar2);
                    ExtractionForegroundService extractionForegroundService = yfgVar2.d;
                    if (extractionForegroundService != null) {
                        synchronized (extractionForegroundService) {
                            extractionForegroundService.stopForeground(true);
                            extractionForegroundService.stopSelf();
                        }
                    }
                    yfgVar2.a();
                    return true;
                }
            }
            chgVar.O(new Bundle());
            return true;
        }
    }
}
