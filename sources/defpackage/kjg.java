package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kjg extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjg(thg thgVar, int i) {
        super(thgVar);
        this.k = i;
        oa7.B(thgVar, "GoogleApiClient must not be null");
        oa7.B(el0.a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ hzb b(Status status) {
        int i = this.k;
        return status;
    }

    public final void f(xb6 xb6Var) {
        switch (this.k) {
            case 0:
                hjg hjgVar = (hjg) xb6Var;
                ojg ojgVar = (ojg) hjgVar.l();
                jjg jjgVar = new jjg(this, 0);
                GoogleSignInOptions googleSignInOptions = hjgVar.A;
                Parcel parcelF = ojgVar.f();
                int i = ejg.a;
                parcelF.writeStrongBinder(jjgVar);
                ejg.c(parcelF, googleSignInOptions);
                ojgVar.G(parcelF, 102);
                break;
            default:
                hjg hjgVar2 = (hjg) xb6Var;
                ojg ojgVar2 = (ojg) hjgVar2.l();
                jjg jjgVar2 = new jjg(this, 1);
                GoogleSignInOptions googleSignInOptions2 = hjgVar2.A;
                Parcel parcelF2 = ojgVar2.f();
                int i2 = ejg.a;
                parcelF2.writeStrongBinder(jjgVar2);
                ejg.c(parcelF2, googleSignInOptions2);
                ojgVar2.G(parcelF2, 103);
                break;
        }
    }

    public final void g(Status status) {
        oa7.u("Failed result must not be success", !status.c());
        e(b(status));
    }
}
