package defpackage;

import android.content.Intent;
import android.graphics.Region;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.adjust.sdk.sig.r3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.v;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fnb implements a8e, bc0, or8, c00, cfg, ypb, ye, xm9 {
    public Object a;

    public fnb(int i) {
        switch (i) {
            case 3:
                this.a = new qfc();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                this.a = new ConcurrentHashMap();
                break;
            default:
                this.a = new Region();
                break;
        }
    }

    @Override // defpackage.or8
    public void B(qr8 qr8Var) {
        Toolbar toolbar = (Toolbar) this.a;
        yc ycVar = toolbar.a.L0;
        if (ycVar == null || !ycVar.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.Y0.c).iterator();
            while (it.hasNext()) {
                ((sx5) it.next()).a.t();
            }
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        return ((cfg) this.a).a();
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        gle gleVar = (gle) obj2;
        nig nigVar = (nig) ((phg) obj).l();
        ohg ohgVar = (ohg) this.a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(nigVar.f);
        int i = xhg.a;
        parcelObtain.writeInt(1);
        ohgVar.writeToParcel(parcelObtain, 0);
        try {
            nigVar.e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            gleVar.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public void b(a77 a77Var) {
        ((Region) this.a).set(a77Var.a, a77Var.b, a77Var.c, a77Var.d);
    }

    @Override // defpackage.or8
    public boolean c(qr8 qr8Var, MenuItem menuItem) {
        return false;
    }

    public void d(String str, Bundle bundle) {
        String string;
        w3h w3hVar = (w3h) this.a;
        m3h m3hVar = w3hVar.g;
        c2h c2hVar = w3hVar.e;
        w3h.h(m3hVar);
        m3hVar.A0();
        if (w3hVar.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        w3h.f(c2hVar);
        c2hVar.M0.D(string);
        v vVar = c2hVar.N0;
        w3hVar.y.getClass();
        vVar.b(System.currentTimeMillis());
    }

    @Override // defpackage.bc0
    public Object e(fhc fhcVar, Float f, Float f2, a26 a26Var, zqd zqdVar) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objW = ynb.w(fhcVar, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, g21.a(0.0f, fFloatValue2, 28), (vz) this.a, a26Var, zqdVar);
        return objW == bw2.a ? objW : (sz) objW;
    }

    public boolean f() {
        if (!g()) {
            return false;
        }
        w3h w3hVar = (w3h) this.a;
        w3hVar.y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c2h c2hVar = w3hVar.e;
        w3h.f(c2hVar);
        return jCurrentTimeMillis - c2hVar.N0.a() > w3hVar.d.I0(null, bzg.i0);
    }

    public boolean g() {
        c2h c2hVar = ((w3h) this.a).e;
        w3h.f(c2hVar);
        return c2hVar.N0.a() > 0;
    }

    @Override // defpackage.c00
    public mj5 get(int i) {
        return ((tj5[]) this.a)[i];
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        xe xeVar = (xe) obj;
        Intent intent = xeVar.b;
        int i = zsg.e(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.Q0;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = xeVar.a;
        if (i2 != -1 || i != 0) {
            zsg.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // defpackage.xm9
    public /* synthetic */ void k(Task task) {
        k7h k7hVar = (k7h) this.a;
        if (task.k()) {
            k7hVar.cancel(false);
            return;
        }
        if (task.m()) {
            k7hVar.m(task.i());
            return;
        }
        Exception excH = task.h();
        if (excH != null) {
            k7hVar.n(excH);
        } else {
            r3.l();
        }
    }

    public /* synthetic */ fnb(Object obj) {
        this.a = obj;
    }
}
