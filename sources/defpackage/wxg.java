package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wxg extends w4h {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public wxg(jhg jhgVar, IBinder iBinder) {
        this.c = iBinder;
        this.d = jhgVar;
    }

    @Override // defpackage.w4h
    public final void a() {
        HashMap map;
        xxg svgVar = null;
        switch (this.b) {
            case 0:
                try {
                    p3h p3hVar = (p3h) this.d;
                    xxg xxgVar = p3hVar.a.m;
                    String str = p3hVar.b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = v4h.a;
                    synchronized (v4h.class) {
                        map = v4h.a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    m1h m1hVar = new m1h((p3h) this.d, (gle) this.c);
                    svg svgVar2 = (svg) xxgVar;
                    svgVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = dtg.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(m1hVar);
                    try {
                        svgVar2.d.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e) {
                    p3h p3hVar2 = (p3h) this.d;
                    ue1 ue1Var = p3h.c;
                    Object[] objArr = {p3hVar2.b};
                    ue1Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        b1.e("PlayCore", ue1.f(ue1Var.a, "error requesting in-app review for %s", objArr), e);
                    }
                    ((gle) this.c).b(new RuntimeException(e));
                    return;
                }
            default:
                reh rehVar = (reh) ((jhg) this.d).b;
                IBinder iBinder = (IBinder) this.c;
                int i2 = exg.e;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    svgVar = iInterfaceQueryLocalInterface instanceof xxg ? (xxg) iInterfaceQueryLocalInterface : new svg(iBinder);
                }
                rehVar.m = svgVar;
                ue1 ue1Var2 = rehVar.b;
                ue1Var2.d("linkToDeath", new Object[0]);
                try {
                    ((svg) rehVar.m).d.linkToDeath(rehVar.j, 0);
                    break;
                } catch (RemoteException e2) {
                    Object[] objArr2 = new Object[0];
                    ue1Var2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        b1.e("PlayCore", ue1.f(ue1Var2.a, "linkToDeath failed", objArr2), e2);
                    }
                }
                rehVar.g = false;
                Iterator it = rehVar.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                rehVar.d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxg(p3h p3hVar, gle gleVar, gle gleVar2) {
        super(gleVar);
        this.c = gleVar2;
        this.d = p3hVar;
    }
}
