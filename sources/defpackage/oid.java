package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.m;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oid implements ro8, cfg, wt0, ye, pch {
    public final /* synthetic */ int a;
    public Object b;

    public oid(int i) {
        this.a = i;
        switch (i) {
            case 3:
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                this.b = new gfh();
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        switch (this.a) {
            case 5:
                Context context = (Context) ((ysd) ((oid) this.b).b).b;
                oeg oegVar = new oeg();
                context.getPackageName();
                return oegVar;
            case 6:
                return new m((b) ((bfg) this.b).a());
            default:
                return (Context) ((ysd) this.b).b;
        }
    }

    @Override // defpackage.ro8
    public void b(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.pch
    public void c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        c8h c8hVar = (c8h) this.b;
        if (zIsEmpty) {
            c8hVar.E0("auto", "_err", bundle);
        } else {
            qc0.p("Unexpected call on client side");
        }
    }

    @Override // defpackage.ro8
    public void d(int i, n03 n03Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, n03Var.i, j, i2);
    }

    @Override // defpackage.ro8
    public void e(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.wt0
    public void f(ConnectionResult connectionResult) {
        ((dc6) this.b).f(connectionResult);
    }

    public void h(int i, String str, List list, boolean z, boolean z2) {
        tz0 tz0Var;
        w3h w3hVar = (w3h) ((y2h) this.b).b;
        int i2 = i - 1;
        if (i2 == 0) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            tz0Var = w0hVar.Y;
        } else if (i2 != 1) {
            if (i2 == 3) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                tz0Var = w0hVar2.Z;
            } else if (i2 != 4) {
                w0h w0hVar3 = w3hVar.f;
                w3h.h(w0hVar3);
                tz0Var = w0hVar3.X;
            } else if (z) {
                w0h w0hVar4 = w3hVar.f;
                w3h.h(w0hVar4);
                tz0Var = w0hVar4.y;
            } else if (z2) {
                w0h w0hVar5 = w3hVar.f;
                w3h.h(w0hVar5);
                tz0Var = w0hVar5.x;
            } else {
                w0h w0hVar6 = w3hVar.f;
                w3h.h(w0hVar6);
                tz0Var = w0hVar6.z;
            }
        } else if (z) {
            w0h w0hVar7 = w3hVar.f;
            w3h.h(w0hVar7);
            tz0Var = w0hVar7.v;
        } else if (z2) {
            w0h w0hVar8 = w3hVar.f;
            w3h.h(w0hVar8);
            tz0Var = w0hVar8.g;
        } else {
            w0h w0hVar9 = w3hVar.f;
            w3h.h(w0hVar9);
            tz0Var = w0hVar9.w;
        }
        int size = list.size();
        if (size == 1) {
            tz0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            tz0Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            tz0Var.a(str);
        } else {
            tz0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public boolean i() {
        w0h w0hVar = ((w3h) this.b).f;
        w3h.h(w0hVar);
        return Log.isLoggable(w0hVar.G0(), 3);
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        xe xeVar = (xe) obj;
        Intent intent = xeVar.b;
        int i = zsg.e(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.U0;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = xeVar.a;
        if (i2 != -1 || i != 0) {
            zsg.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // defpackage.ro8
    public void flush() {
    }

    @Override // defpackage.ro8
    public void g() {
    }

    @Override // defpackage.ro8
    public void shutdown() {
    }

    @Override // defpackage.ro8
    public void start() {
    }

    public oid(a6h a6hVar, w3h w3hVar) {
        this.a = 13;
        this.b = w3hVar;
    }

    public /* synthetic */ oid(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
