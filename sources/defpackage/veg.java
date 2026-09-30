package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class veg extends ehg {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public veg(a aVar, gle gleVar, gle gleVar2) {
        super(gleVar);
        this.c = gleVar2;
        this.d = aVar;
    }

    @Override // defpackage.ehg
    public final void a() {
        ahg bggVar;
        int i = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                try {
                    ahg ahgVar = aVar.e.m;
                    String str = aVar.a;
                    Bundle bundleG = a.g();
                    afg afgVar = new afg(aVar, (gle) obj, 1);
                    bgg bggVar2 = (bgg) ahgVar;
                    Parcel parcelD = bggVar2.d();
                    parcelD.writeString(str);
                    int i2 = qfg.a;
                    parcelD.writeInt(1);
                    bundleG.writeToParcel(parcelD, 0);
                    parcelD.writeStrongBinder(afgVar);
                    bggVar2.e(parcelD, 10);
                } catch (RemoteException e) {
                    a.g.d(e, "keepAlive", new Object[0]);
                    return;
                }
                break;
            default:
                khg khgVar = (khg) ((jhg) obj2).b;
                IBinder iBinder = (IBinder) obj;
                int i3 = ngg.e;
                if (iBinder == null) {
                    bggVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
                    bggVar = iInterfaceQueryLocalInterface instanceof ahg ? (ahg) iInterfaceQueryLocalInterface : new bgg(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService", 0);
                }
                khgVar.m = bggVar;
                rch rchVar = khgVar.b;
                rchVar.e("linkToDeath", new Object[0]);
                try {
                    ((meg) khgVar.m).e.linkToDeath(khgVar.j, 0);
                } catch (RemoteException e2) {
                    rchVar.d(e2, "linkToDeath failed", new Object[0]);
                }
                khgVar.g = false;
                Iterator it = khgVar.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                khgVar.d.clear();
                break;
        }
    }

    public veg(jhg jhgVar, IBinder iBinder) {
        this.c = iBinder;
        this.d = jhgVar;
    }
}
