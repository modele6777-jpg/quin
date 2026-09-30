package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.a;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class teg extends ehg {
    public final /* synthetic */ int b;
    public final /* synthetic */ gle c;
    public final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teg(a aVar, gle gleVar, int i, gle gleVar2) {
        super(gleVar);
        this.b = i;
        this.c = gleVar2;
        this.d = aVar;
    }

    @Override // defpackage.ehg
    public final void a() {
        a aVar = this.d;
        try {
            ahg ahgVar = aVar.d.m;
            String str = aVar.a;
            int i = this.b;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            Bundle bundleG = a.g();
            yeg yegVar = new yeg(aVar, this.c, 3);
            bgg bggVar = (bgg) ahgVar;
            Parcel parcelD = bggVar.d();
            parcelD.writeString(str);
            int i2 = qfg.a;
            parcelD.writeInt(1);
            bundle.writeToParcel(parcelD, 0);
            parcelD.writeInt(1);
            bundleG.writeToParcel(parcelD, 0);
            parcelD.writeStrongBinder(yegVar);
            bggVar.e(parcelD, 9);
        } catch (RemoteException e) {
            a.g.d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
