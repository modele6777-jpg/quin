package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.sentry.android.core.b1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class axg extends oxg {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axg(ya5 ya5Var, Activity activity, fug fugVar) {
        super((vxg) ya5Var.b, true);
        this.g = activity;
        this.v = fugVar;
        this.f = ya5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.oxg
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle = null;
        mug mugVarAsInterface = null;
        switch (this.e) {
            case 0:
                try {
                    Context context = (Context) this.g;
                    oa7.A(context);
                    String strN = ndc.n(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strN)) {
                        strN = ndc.n(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strN);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    vxg vxgVar = (vxg) this.f;
                    try {
                        mugVarAsInterface = kug.asInterface(cs4.c(context, (boolValueOf == null || !boolValueOf.booleanValue()) != false ? cs4.c : cs4.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (zr4 e) {
                        vxgVar.d(e, true, false);
                    }
                    vxgVar.f = mugVarAsInterface;
                    if (vxgVar.f != null) {
                        int iA = cs4.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = cs4.d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iA, iD);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iD < iA;
                        long j = iMax;
                        vxgVar.g = j;
                        gwg gwgVar = new gwg(161000L, j, z, (Bundle) this.v, ndc.n(context));
                        byte b = vxgVar.g >= 169;
                        mug mugVar = vxgVar.f;
                        if (b != true) {
                            oa7.A(mugVar);
                            mugVar.initialize(new tk9(context), gwgVar, this.a);
                        } else {
                            oa7.A(mugVar);
                            mugVar.initializeWithElapsedTime(new tk9(context), gwgVar, this.a, this.b);
                        }
                    } else {
                        b1.l("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((vxg) this.f).d(e2, true, false);
                    return;
                }
                break;
            case 1:
                mug mugVar2 = ((vxg) this.f).f;
                oa7.A(mugVar2);
                mugVar2.getMaxUserProperties((String) this.g, (fug) this.v);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.v;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                mug mugVar3 = ((vxg) ((ya5) this.f).b).f;
                oa7.A(mugVar3);
                mugVar3.onActivityCreatedByScionActivityInfo(iwg.c((Activity) this.g), bundle, this.b);
                break;
            default:
                mug mugVar4 = ((vxg) ((ya5) this.f).b).f;
                oa7.A(mugVar4);
                mugVar4.onActivitySaveInstanceStateByScionActivityInfo(iwg.c((Activity) this.g), (fug) this.v, this.b);
                break;
        }
    }

    @Override // defpackage.oxg
    public void b() {
        switch (this.e) {
            case 1:
                ((fug) this.v).x(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axg(ya5 ya5Var, Bundle bundle, Activity activity) {
        super((vxg) ya5Var.b, true);
        this.v = bundle;
        this.g = activity;
        this.f = ya5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axg(vxg vxgVar, Context context, Bundle bundle) {
        super(vxgVar, true);
        this.g = context;
        this.v = bundle;
        this.f = vxgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axg(vxg vxgVar, String str, fug fugVar) {
        super(vxgVar, true);
        this.g = str;
        this.v = fugVar;
        Objects.requireNonNull(vxgVar);
        this.f = vxgVar;
    }
}
