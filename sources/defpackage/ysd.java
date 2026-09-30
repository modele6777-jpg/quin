package defpackage;

import android.content.Intent;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Size;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.play.core.assetpacks.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ysd implements ssf, kn9, vt0, ypb, ye {
    public final /* synthetic */ int a;
    public final Object b;

    public ysd(float f, float f2, b00 b00Var) {
        c00 g5bVar;
        this.a = 2;
        int[] iArr = qsf.a;
        if (b00Var == null && f == 1.0f && f2 == 1500.0f) {
            g5bVar = ct3.a;
        } else if (b00Var != null) {
            fnb fnbVar = new fnb();
            int iB = b00Var.b();
            tj5[] tj5VarArr = new tj5[iB];
            for (int i = 0; i < iB; i++) {
                tj5VarArr[i] = new tj5(f, f2, b00Var.a(i));
            }
            fnbVar.a = tj5VarArr;
            g5bVar = fnbVar;
        } else {
            g5bVar = new g5b(f, f2);
        }
        this.b = new kxa(g5bVar);
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        b bVar = (b) this.b;
        List list = (List) obj;
        int iA = bVar.b.a();
        for (File file : bVar.e()) {
            if (!list.contains(file.getName()) && b.b(file) != iA) {
                b.f(file);
            }
        }
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 7:
                xig xigVar = new xig((gle) obj2);
                qjg qjgVar = (qjg) ((ajg) obj).l();
                Parcel parcelF = qjgVar.f();
                int i2 = ejg.a;
                parcelF.writeStrongBinder(xigVar);
                ejg.c(parcelF, (ex0) obj3);
                qjgVar.G(parcelF, 1);
                break;
            default:
                d7h d7hVar = (d7h) ((g7h) obj).l();
                i6h i6hVar = new i6h((w6h) obj3, (gle) obj2);
                Parcel parcelJ = d7hVar.J();
                lsg.c(parcelJ, i6hVar);
                d7hVar.K(parcelJ, 27);
                break;
        }
    }

    @Override // defpackage.ssf, defpackage.psf
    public boolean b() {
        return false;
    }

    @Override // defpackage.psf
    public long c(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((kxa) this.b).c(b00Var, b00Var2, b00Var3);
    }

    @Override // defpackage.vt0
    public void d(int i) {
        ((cc6) this.b).d(i);
    }

    @Override // defpackage.vt0
    public void e() {
        ((cc6) this.b).e();
    }

    public Size[] f(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
        return null;
    }

    public Integer[] g() {
        int[] outputFormats;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
            outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        } catch (IllegalArgumentException e) {
            b21.X("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        } catch (NullPointerException e2) {
            b21.X("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
        }
        if (outputFormats != null) {
            return qd0.J0(outputFormats);
        }
        return null;
    }

    public long h(int i, Size size) {
        size.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    @Override // defpackage.psf
    public b00 i(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((kxa) this.b).i(j, b00Var, b00Var2, b00Var3);
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        xe xeVar = (xe) obj;
        Intent intent = xeVar.b;
        int i = xeVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zsg.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", z5h.ERROR_IN_ACTIVITY_RESULT.a());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i);
        }
        int i2 = zsg.e(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.T0;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            zsg.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (i2 != 0) {
            zsg.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    public Size[] k(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.b;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    public wah l(String str, boolean z) {
        return new wah(str, (gn2) this.b, z);
    }

    public boolean m() {
        w3h w3hVar = (w3h) this.b;
        try {
            return rcg.a(w3hVar.a).b(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, "com.android.vending").versionCode >= 80837300;
        } catch (Exception e) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void n(o5h o5hVar, int i) {
        sqg sqgVar;
        if (i == -30) {
            sqgVar = sqg.TCF;
        } else if (i == -20) {
            sqgVar = sqg.API;
        } else if (i == -10) {
            sqgVar = sqg.MANIFEST;
        } else if (i != 0) {
            sqgVar = i != 30 ? sqg.UNSET : sqg.INITIALIZATION;
        } else {
            sqgVar = sqg.API;
        }
        ((EnumMap) this.b).put(o5hVar, sqgVar);
    }

    public void o(o5h o5hVar, sqg sqgVar) {
        ((EnumMap) this.b).put(o5hVar, sqgVar);
    }

    @Override // defpackage.psf
    public b00 t(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((kxa) this.b).t(j, b00Var, b00Var2, b00Var3);
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder("1");
                for (o5h o5hVar : o5h.values()) {
                    sqg sqgVar = (sqg) ((EnumMap) this.b).get(o5hVar);
                    if (sqgVar == null) {
                        sqgVar = sqg.UNSET;
                    }
                    sb.append(sqgVar.b());
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.psf
    public b00 u(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((kxa) this.b).u(b00Var, b00Var2, b00Var3);
    }

    public /* synthetic */ ysd(zig zigVar, ex0 ex0Var) {
        this.a = 7;
        this.b = ex0Var;
    }

    public ysd(ich ichVar) {
        this.a = 10;
        this.b = ichVar.z;
    }

    public /* synthetic */ ysd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ysd(int i) {
        this.a = i;
        switch (i) {
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = new HashMap();
                break;
            default:
                this.b = new EnumMap(o5h.class);
                break;
        }
    }

    public ysd(EnumMap enumMap) {
        this.a = 8;
        EnumMap enumMap2 = new EnumMap(o5h.class);
        this.b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public ysd(View view) {
        this.a = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            xsd xsdVar = new xsd(3, view);
            xsdVar.c = view;
            this.b = xsdVar;
            return;
        }
        this.b = new vrb(3, view);
    }
}
