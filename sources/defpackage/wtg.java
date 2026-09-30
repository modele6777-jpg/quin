package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wtg extends ffg {
    public final ysg e;
    public final Boolean f;
    public final int g;
    public final /* synthetic */ ox0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtg(ox0 ox0Var, ysg ysgVar, Boolean bool, int i) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback", 3);
        this.h = ox0Var;
        this.e = ysgVar;
        this.f = bool;
        this.g = i;
    }

    @Override // defpackage.ffg
    public final boolean H(Parcel parcel, int i) {
        utg rugVar;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) jrg.a(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(tec.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        if (bundle == null) {
            zsg.h("BillingClient", "Response bundle is null.");
            M(this.e, swg.f, z5h.NULL_BUNDLE_RETURNED_BY_PHONESKY, this.f.booleanValue(), null, this.g);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zsg.h("BillingClient", "Response bundle doesn't contain a response code");
            M(this.e, swg.f, z5h.RESPONSE_CODE_NOT_SET_IN_BUNDLE, this.f.booleanValue(), null, this.g);
            return true;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            M(this.e, swg.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), z5h.NON_OK_CODE_RETURNED_BY_PHONESKY, this.f.booleanValue(), tec.e(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), this.g);
            return true;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            zsg.h("BillingClient", "Billing API version not found in response bundle.");
            M(this.e, swg.f, z5h.BILLING_API_VERSION_NOT_SET_IN_BUNDLE, this.f.booleanValue(), null, this.g);
            return true;
        }
        int i2 = bundle.getInt("BILLING_API_VERSION_KEY");
        ox0 ox0Var = this.h;
        ox0.m(ox0Var, i2);
        ox0Var.k = i2 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable th) {
                zsg.i("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
            }
            try {
                bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th2) {
                zsg.i("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                p8c.a = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th3) {
                zsg.i("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                p8c.b = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable th4) {
                zsg.i("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                p8c.c = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
            } catch (Throwable th5) {
                zsg.i("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            Object[] objArrCopyOf = new Object[4];
            int i3 = 0;
            for (txg txgVar : txg.values()) {
                if (bundle3.getBoolean(txgVar.name(), false)) {
                    int length = objArrCopyOf.length;
                    int i4 = i3 + 1;
                    int iP = q6c.p(length, i4);
                    if (iP > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iP);
                    }
                    objArrCopyOf[i3] = txgVar;
                    i3 = i4;
                }
            }
            ox0 ox0Var2 = this.h;
            if (i3 == 0) {
                rugVar = nug.x;
            } else if (i3 != 1) {
                rugVar = utg.m(i3, objArrCopyOf);
                rugVar.size();
            } else {
                Object obj = objArrCopyOf[0];
                Objects.requireNonNull(obj);
                rugVar = new rug(obj);
            }
            ox0Var2.z = rugVar;
            if (ox0Var2.f != null) {
                ox0Var2.f.g = ox0Var2.z;
            }
        }
        ox0 ox0Var3 = this.h;
        if (ox0Var3.l < 3) {
            zsg.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
            M(this.e, swg.a, z5h.ONE_TIME_PRODUCT_NOT_SUPPORTED, this.f.booleanValue(), null, this.g);
        } else {
            ysg ysgVar = this.e;
            Boolean bool = this.f;
            int i5 = this.g;
            boolean zBooleanValue = bool.booleanValue();
            ox0.n(ox0Var3, 0);
            synchronized (ox0Var3.a) {
                try {
                    if (ox0Var3.b != 3) {
                        ysgVar.c(i5, zBooleanValue);
                        ysgVar.d(swg.g);
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
        return true;
    }

    public final void M(ysg ysgVar, tx0 tx0Var, z5h z5hVar, boolean z, String str, int i) {
        this.h.x(0);
        ysgVar.b(tx0Var, z5hVar, str, z, i);
        ysgVar.d(tx0Var);
    }
}
