package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.a;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qeg extends ehg {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ gle g;
    public final /* synthetic */ a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qeg(a aVar, gle gleVar, int i, String str, String str2, int i2, gle gleVar2, int i3) {
        super(gleVar);
        this.b = i3;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = i2;
        this.g = gleVar2;
        this.v = aVar;
    }

    @Override // defpackage.ehg
    public final void a() {
        int i = this.b;
        a aVar = this.v;
        int i2 = this.c;
        String str = this.d;
        String str2 = this.e;
        int i3 = this.f;
        gle gleVar = this.g;
        int i4 = 1;
        switch (i) {
            case 0:
                try {
                    ahg ahgVar = aVar.d.m;
                    String str3 = aVar.a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("session_id", i2);
                    bundle.putString("module_name", str);
                    bundle.putString("slice_id", str2);
                    bundle.putInt("chunk_number", i3);
                    Bundle bundleG = a.g();
                    yeg yegVar = new yeg(aVar, gleVar, 2);
                    bgg bggVar = (bgg) ahgVar;
                    Parcel parcelD = bggVar.d();
                    parcelD.writeString(str3);
                    int i5 = qfg.a;
                    parcelD.writeInt(1);
                    bundle.writeToParcel(parcelD, 0);
                    parcelD.writeInt(1);
                    bundleG.writeToParcel(parcelD, 0);
                    parcelD.writeStrongBinder(yegVar);
                    bggVar.e(parcelD, 6);
                } catch (RemoteException e) {
                    a.g.d(e, "notifyChunkTransferred", new Object[0]);
                }
                break;
            default:
                try {
                    ahg ahgVar2 = aVar.d.m;
                    String str4 = aVar.a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("session_id", i2);
                    bundle2.putString("module_name", str);
                    bundle2.putString("slice_id", str2);
                    bundle2.putInt("chunk_number", i3);
                    Bundle bundleG2 = a.g();
                    yeg yegVar2 = new yeg(aVar, gleVar, i4);
                    bgg bggVar2 = (bgg) ahgVar2;
                    Parcel parcelD2 = bggVar2.d();
                    parcelD2.writeString(str4);
                    int i6 = qfg.a;
                    parcelD2.writeInt(1);
                    bundle2.writeToParcel(parcelD2, 0);
                    parcelD2.writeInt(1);
                    bundleG2.writeToParcel(parcelD2, 0);
                    parcelD2.writeStrongBinder(yegVar2);
                    bggVar2.e(parcelD2, 11);
                } catch (RemoteException e2) {
                    a.g.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
                    gleVar.b(new RuntimeException(e2));
                    return;
                }
                break;
        }
    }
}
