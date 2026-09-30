package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i6h extends jsg {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public i6h(gle gleVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.e = gleVar;
    }

    @Override // defpackage.jsg
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (this.d) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) lsg.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                lsg.d(parcel);
                gle gleVar = (gle) this.e;
                if (status.c()) {
                    try {
                        hmg hmgVar = hmg.a;
                        int i2 = slg.a;
                        hcc.m(status, qah.t(bArrCreateByteArray, hmg.b), gleVar);
                    } catch (bng e) {
                        gleVar.a.r(e);
                    }
                } else {
                    hcc.m(status, null, gleVar);
                }
                return true;
            case 1:
                gle gleVar2 = (gle) this.e;
                switch (i) {
                    case 1:
                        Status status2 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status2, null, gleVar2);
                        break;
                    case 2:
                        Status status3 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status3, null, gleVar2);
                        break;
                    case 3:
                        Status status4 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status4, null, gleVar2);
                        break;
                    case 4:
                        Status status5 = (Status) lsg.a(parcel, Status.CREATOR);
                        j5h j5hVar = (j5h) lsg.a(parcel, j5h.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status5, j5hVar, gleVar2);
                        break;
                    case 5:
                        Status status6 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status6, null, gleVar2);
                        break;
                    case 6:
                        Status status7 = (Status) lsg.a(parcel, Status.CREATOR);
                        r5h r5hVar = (r5h) lsg.a(parcel, r5h.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status7, r5hVar, gleVar2);
                        break;
                    case 7:
                        Status status8 = (Status) lsg.a(parcel, Status.CREATOR);
                        n5h n5hVar = (n5h) lsg.a(parcel, n5h.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status8, n5hVar, gleVar2);
                        break;
                    case 8:
                        Status status9 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status9, null, gleVar2);
                        break;
                    case 9:
                        Status status10 = (Status) lsg.a(parcel, Status.CREATOR);
                        u5h u5hVar = (u5h) lsg.a(parcel, u5h.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status10, u5hVar, gleVar2);
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        Status status11 = (Status) lsg.a(parcel, Status.CREATOR);
                        j5h j5hVar2 = (j5h) lsg.a(parcel, j5h.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status11, j5hVar2, gleVar2);
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        Status status12 = (Status) lsg.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        lsg.d(parcel);
                        hcc.m(status12, null, gleVar2);
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        Status status13 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status13, null, gleVar2);
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        Status status14 = (Status) lsg.a(parcel, Status.CREATOR);
                        b6h b6hVar = (b6h) lsg.a(parcel, b6h.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status14, b6hVar, gleVar2);
                        break;
                    case 14:
                        Status status15 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status15, null, gleVar2);
                        break;
                    case 15:
                        Status status16 = (Status) lsg.a(parcel, Status.CREATOR);
                        lsg.d(parcel);
                        hcc.m(status16, null, gleVar2);
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        Status status17 = (Status) lsg.a(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        lsg.d(parcel);
                        hcc.m(status17, Long.valueOf(j), gleVar2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                lsg.d(parcel);
                yea yeaVar = new yea(this, bArrCreateByteArray2);
                gn2 gn2Var = (gn2) this.e;
                ((dd7) gn2Var.a).execute(new v36(23, gn2Var, yeaVar));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6h(w6h w6hVar, gn2 gn2Var) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.e = gn2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6h(w6h w6hVar, gle gleVar) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.e = gleVar;
    }
}
