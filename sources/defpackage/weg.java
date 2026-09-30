package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class weg extends ffg implements IInterface {
    public final gle e;
    public final /* synthetic */ a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public weg(a aVar, gle gleVar) {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback", 0);
        this.f = aVar;
        this.e = gleVar;
    }

    @Override // defpackage.ffg
    public final boolean G(Parcel parcel, int i) {
        khg khgVar = this.f.d;
        gle gleVar = this.e;
        switch (i) {
            case 2:
                int i2 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onStartDownload(%d)", Integer.valueOf(i2));
                return true;
            case 3:
                int i3 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onCancelDownload(%d)", Integer.valueOf(i3));
                return true;
            case 4:
                int i4 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onGetSession(%d)", Integer.valueOf(i4));
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                qfg.b(parcel);
                O(arrayListCreateTypedArrayList);
                return true;
            case 6:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle = (Bundle) qfg.a(parcel);
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
                return true;
            case 7:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) qfg.a(parcel);
                qfg.b(parcel);
                M(bundle2);
                return true;
            case 8:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) qfg.a(parcel);
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onNotifyModuleCompleted(%s, sessionId=%d)", bundle3.getString("module_name"), Integer.valueOf(bundle3.getInt("session_id")));
                return true;
            case 9:
            default:
                return false;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) qfg.a(parcel);
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onNotifySessionFailed(%d)", Integer.valueOf(bundle4.getInt("session_id")));
                return true;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Parcelable.Creator creator8 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) qfg.a(parcel);
                Bundle bundle6 = (Bundle) qfg.a(parcel);
                qfg.b(parcel);
                P(bundle5, bundle6);
                return true;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Parcelable.Creator creator9 = Bundle.CREATOR;
                Bundle bundle7 = (Bundle) qfg.a(parcel);
                Bundle bundle8 = (Bundle) qfg.a(parcel);
                qfg.b(parcel);
                N(bundle7, bundle8);
                return true;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Parcelable.Creator creator10 = Bundle.CREATOR;
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onRequestDownloadInfo()", new Object[0]);
                return true;
            case 14:
                Parcelable.Creator creator11 = Bundle.CREATOR;
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onRemoveModule()", new Object[0]);
                return true;
            case 15:
                Parcelable.Creator creator12 = Bundle.CREATOR;
                qfg.b(parcel);
                khgVar.d(gleVar);
                a.g.e("onCancelDownloads()", new Object[0]);
                return true;
        }
    }

    public void M(Bundle bundle) {
        khg khgVar = this.f.d;
        gle gleVar = this.e;
        khgVar.d(gleVar);
        int i = bundle.getInt("error_code");
        a.g.b("onError(%d)", Integer.valueOf(i));
        gleVar.b(new se0(i));
    }

    public void N(Bundle bundle, Bundle bundle2) {
        this.f.d.d(this.e);
        a.g.e("onGetChunkFileDescriptor", new Object[0]);
    }

    public void O(List list) {
        this.f.d.d(this.e);
        a.g.e("onGetSessionStates", new Object[0]);
    }

    public void P(Bundle bundle, Bundle bundle2) {
        this.f.e.d(this.e);
        a.g.e("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }
}
