package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y87 extends n16 {
    public final /* synthetic */ int J;

    @Override // defpackage.n16
    public xb6 v(Context context, Looper looper, hbc hbcVar, Object obj, cc6 cc6Var, dc6 dc6Var) {
        switch (this.J) {
            case 1:
                Object obj2 = hbcVar.e;
                Integer num = (Integer) hbcVar.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new jgd(context, looper, hbcVar, bundle, cc6Var, dc6Var);
            case 2:
                throw ks0.e(obj);
            case 3:
            case 4:
            case 6:
            case 8:
            default:
                return super.v(context, looper, hbcVar, obj, cc6Var, dc6Var);
            case 5:
                return new gjg(context, looper, hbcVar, (fjg) obj, (rhg) cc6Var, (rhg) dc6Var);
            case 7:
                return new hjg(context, looper, hbcVar, (GoogleSignInOptions) obj, (rhg) cc6Var, (rhg) dc6Var);
            case 9:
                return new g7h(context, looper, 51, hbcVar, cc6Var, dc6Var);
        }
    }

    @Override // defpackage.n16
    public xb6 w(Context context, Looper looper, hbc hbcVar, Object obj, rhg rhgVar, rhg rhgVar2) {
        switch (this.J) {
            case 0:
                context.getClass();
                looper.getClass();
                ((j60) obj).getClass();
                return new tu6(context, looper, 352, hbcVar, rhgVar, rhgVar2);
            case 1:
            case 2:
            case 5:
            case 7:
            default:
                return super.w(context, looper, hbcVar, obj, rhgVar, rhgVar2);
            case 3:
                return new phg(context, looper, 449, hbcVar, rhgVar, rhgVar2);
            case 4:
                return new uig(context, looper, hbcVar, (ple) obj, rhgVar, rhgVar2);
            case 6:
                return new ajg(context, looper, hbcVar, rhgVar, rhgVar2);
            case 8:
                return new zvg(context, looper, 457, hbcVar, rhgVar, rhgVar2);
        }
    }
}
