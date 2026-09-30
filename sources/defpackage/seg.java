package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.a;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class seg extends ehg {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gle d;
    public final /* synthetic */ int e;
    public final /* synthetic */ a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seg(a aVar, gle gleVar, int i, String str, gle gleVar2, int i2) {
        super(gleVar);
        this.b = i;
        this.c = str;
        this.d = gleVar2;
        this.e = i2;
        this.f = aVar;
    }

    @Override // defpackage.ehg
    public final void a() {
        a aVar = this.f;
        try {
            ahg ahgVar = aVar.d.m;
            String str = aVar.a;
            int i = this.b;
            String str2 = this.c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            Bundle bundleG = a.g();
            dfg dfgVar = new dfg(aVar, this.d, this.b, this.c, this.e);
            bgg bggVar = (bgg) ahgVar;
            Parcel parcelD = bggVar.d();
            parcelD.writeString(str);
            int i2 = qfg.a;
            parcelD.writeInt(1);
            bundle.writeToParcel(parcelD, 0);
            parcelD.writeInt(1);
            bundleG.writeToParcel(parcelD, 0);
            parcelD.writeStrongBinder(dfgVar);
            bggVar.e(parcelD, 7);
        } catch (RemoteException e) {
            a.g.d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
