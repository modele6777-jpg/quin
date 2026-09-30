package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zig extends zb6 {
    public static final k47 m = new k47("Auth.Api.Identity.SignIn.API", new y87(6), new gec(11));
    public final String l;

    public zig(Context context, pjg pjgVar) {
        super(context, m, pjgVar, yb6.c);
        this.l = bjg.a();
    }

    public static kgd c(Intent intent) throws x60 {
        Status status = Status.g;
        if (intent == null) {
            throw new x60(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : jcc.d(byteArrayExtra, creator));
        if (status2 == null) {
            throw new x60(Status.w);
        }
        if (!status2.c()) {
            throw new x60(status2);
        }
        Parcelable.Creator<kgd> creator2 = kgd.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        kgd kgdVar = (kgd) (byteArrayExtra2 != null ? jcc.d(byteArrayExtra2, creator2) : null);
        if (kgdVar != null) {
            return kgdVar;
        }
        throw new x60(status);
    }
}
