package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class peg extends ehg {
    public final /* synthetic */ int b;
    public final /* synthetic */ gle c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peg(khg khgVar, gle gleVar, gle gleVar2, ehg ehgVar) {
        super(gleVar);
        this.b = 2;
        this.c = gleVar2;
        this.e = ehgVar;
        this.d = khgVar;
    }

    @Override // defpackage.ehg
    public final void a() {
        int i = 0;
        switch (this.b) {
            case 0:
                a aVar = (a) this.d;
                List<String> list = (List) this.e;
                ArrayList arrayList = new ArrayList(list.size());
                for (String str : list) {
                    Bundle bundle = new Bundle();
                    bundle.putString("module_name", str);
                    arrayList.add(bundle);
                }
                try {
                    ahg ahgVar = aVar.d.m;
                    String str2 = aVar.a;
                    Bundle bundleG = a.g();
                    yeg yegVar = new yeg(aVar, this.c, i);
                    bgg bggVar = (bgg) ahgVar;
                    Parcel parcelD = bggVar.d();
                    parcelD.writeString(str2);
                    parcelD.writeTypedList(arrayList);
                    int i2 = qfg.a;
                    parcelD.writeInt(1);
                    bundleG.writeToParcel(parcelD, 0);
                    parcelD.writeStrongBinder(yegVar);
                    bggVar.e(parcelD, 14);
                    return;
                } catch (RemoteException e) {
                    a.g.d(e, "cancelDownloads(%s)", list);
                    return;
                }
            case 1:
                gle gleVar = this.c;
                a aVar2 = (a) this.d;
                try {
                    ahg ahgVar2 = aVar2.d.m;
                    String str3 = aVar2.a;
                    Bundle bundleI = a.i((HashMap) this.e);
                    afg afgVar = new afg(aVar2, gleVar, i);
                    bgg bggVar2 = (bgg) ahgVar2;
                    Parcel parcelD2 = bggVar2.d();
                    parcelD2.writeString(str3);
                    int i3 = qfg.a;
                    parcelD2.writeInt(1);
                    bundleI.writeToParcel(parcelD2, 0);
                    parcelD2.writeStrongBinder(afgVar);
                    bggVar2.e(parcelD2, 5);
                    return;
                } catch (RemoteException e2) {
                    a.g.d(e2, "syncPacks", new Object[0]);
                    gleVar.b(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((khg) this.d).f) {
                    try {
                        khg khgVar = (khg) this.d;
                        gle gleVar2 = this.c;
                        khgVar.e.add(gleVar2);
                        gleVar2.a.b(new lqb(23, khgVar, gleVar2));
                        if (((khg) this.d).k.getAndIncrement() > 0) {
                            ((khg) this.d).b.e("Already connected to the service.", new Object[0]);
                        }
                        khg.b((khg) this.d, (ehg) this.e);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ peg(a aVar, gle gleVar, Object obj, gle gleVar2, int i) {
        super(gleVar);
        this.b = i;
        this.e = obj;
        this.c = gleVar2;
        this.d = aVar;
    }
}
