package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xig extends ffg {
    public final /* synthetic */ int e = 1;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xig(gle gleVar) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 2);
        this.f = gleVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ffg
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strE;
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) ejg.a(parcel, Status.CREATOR);
                fx0 fx0Var = (fx0) ejg.a(parcel, fx0.CREATOR);
                ejg.b(parcel);
                hcc.m(status, fx0Var, (gle) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    M();
                    mjg.O(revocationBoundService).P();
                    return true;
                }
                M();
                l2e l2eVarA = l2e.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = l2eVarA.b();
                GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.y;
                if (googleSignInAccountB != null) {
                    String strE2 = l2eVarA.e("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strE2) || (strE = l2eVarA.e(l2e.f("googleSignInOptions", strE2))) == null) {
                        googleSignInOptionsC = null;
                    } else {
                        try {
                            googleSignInOptionsC = GoogleSignInOptions.c(strE);
                        } catch (JSONException unused) {
                            googleSignInOptionsC = null;
                        }
                    }
                }
                oa7.A(googleSignInOptionsC);
                a97 a97Var = new a97(revocationBoundService, el0.a, googleSignInOptionsC, new yb6(new qfc(), Looper.getMainLooper()));
                int i3 = 15;
                Context context = a97Var.a;
                thg thgVar = a97Var.i;
                if (googleSignInAccountB == null) {
                    boolean z = a97Var.d() == 3;
                    os osVar = ljg.a;
                    if (osVar.b <= 3) {
                        Log.d((String) osVar.c, ((String) osVar.d).concat("Signing out"));
                    }
                    ljg.a(context);
                    if (z) {
                        t1e t1eVar = new t1e(thgVar);
                        t1eVar.e(Status.e);
                        basePendingResult = t1eVar;
                    } else {
                        kjg kjgVar = new kjg(thgVar, 0);
                        thgVar.a(kjgVar);
                        basePendingResult = kjgVar;
                    }
                    basePendingResult.a(new tig(basePendingResult, new gle(), new pzd(i3)));
                    return true;
                }
                boolean z2 = a97Var.d() == 3;
                os osVar2 = ljg.a;
                if (osVar2.b <= 3) {
                    Log.d((String) osVar2.c, ((String) osVar2.d).concat("Revoking access"));
                }
                String strE3 = l2e.a(context).e("refreshToken");
                ljg.a(context);
                if (!z2) {
                    kjg kjgVar2 = new kjg(thgVar, 1);
                    thgVar.a(kjgVar2);
                    basePendingResult2 = kjgVar2;
                } else if (strE3 == null) {
                    os osVar3 = cjg.c;
                    Status status2 = new Status(4, null, null, null);
                    oa7.u("Status code must not be SUCCESS", !status2.c());
                    cig cigVar = new cig(status2);
                    cigVar.e(status2);
                    basePendingResult2 = cigVar;
                } else {
                    cjg cjgVar = new cjg(strE3);
                    new Thread(cjgVar).start();
                    basePendingResult2 = cjgVar.b;
                }
                basePendingResult2.a(new tig(basePendingResult2, new gle(), new pzd(i3)));
                return true;
        }
    }

    public void M() {
        if (!fbc.i((RevocationBoundService) this.f, Binder.getCallingUid())) {
            throw new SecurityException(tec.f(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    public xig(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 2);
        this.f = revocationBoundService;
    }
}
