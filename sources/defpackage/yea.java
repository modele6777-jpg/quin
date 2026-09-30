package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.reviewreward.ReviewRewardState;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.sig.r3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yea implements is7, avf, czc, f1b, bd, cfg, kn9, ye, lg0, pch {
    public Object a;

    public yea(int i) {
        switch (i) {
            case 4:
                this.a = new ReviewRewardStore((Map) null, 1, (rp3) (0 == true ? 1 : 0));
                break;
            case 7:
                this.a = new ace(new ond(this));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Object obj = ac6.d;
                this.a = new SparseIntArray();
                break;
            case 15:
                this.a = new ArrayDeque(16);
                break;
            default:
                this.a = Build.VERSION.SDK_INT >= 28 ? new gfa() : new y25(18);
                break;
        }
    }

    public static yea l(String str) {
        return new yea((TextUtils.isEmpty(str) || str.length() > 1) ? k5h.UNINITIALIZED : q5h.e(str.charAt(0)));
    }

    @Override // defpackage.czc
    public Object B(FileInputStream fileInputStream) throws mw2 {
        Object dzbVar;
        iy9 iy9Var;
        try {
            nh7 nh7VarE = fzc.a.e(new String(lmg.p0(fileInputStream), ox1.a));
            ti7 ti7Var = nh7VarE instanceof ti7 ? (ti7) nh7VarE : null;
            if (ti7Var == null) {
                throw new mw2("Review reward store root must be an object", null);
            }
            Object obj = ti7Var.get("accountStates");
            ti7 ti7Var2 = obj instanceof ti7 ? (ti7) obj : null;
            if (ti7Var2 == null) {
                throw new mw2("Review reward accountStates must be an object", null);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ti7Var2.a.entrySet()) {
                String str = (String) entry.getKey();
                nh7 nh7Var = (nh7) entry.getValue();
                if (v4e.Q(str)) {
                    iy9Var = null;
                } else {
                    try {
                        dzbVar = new iy9(str, ((ReviewRewardState) fzc.a.a(ReviewRewardState.Companion.serializer(), nh7Var)).recoverPreparedStoreLaunch());
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                    if (ezb.a(dzbVar) != null) {
                        dzbVar = new iy9(str, new ReviewRewardState(3, (w57) null, true, false, false, (String) null, (Long) null, 0, 250, (rp3) null));
                    }
                    iy9Var = (iy9) dzbVar;
                }
                if (iy9Var != null) {
                    arrayList.add(iy9Var);
                }
            }
            return new ReviewRewardStore(bm8.W(arrayList));
        } catch (Exception e) {
            throw new mw2("Review reward store is malformed", e);
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        bfg bfgVar = (bfg) this.a;
        if (bfgVar != null) {
            return bfgVar.a();
        }
        r3.l();
        return null;
    }

    @Override // defpackage.avf
    public int b(View view) {
        return (view.getTop() - ((ukb) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((ukb) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.pch
    public void c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ich ichVar = (ich) this.a;
        if (!zIsEmpty) {
            ichVar.Z().J0(new qu1(this, str, str2, bundle, 13));
            return;
        }
        w3h w3hVar = ichVar.z;
        if (w3hVar != null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.b(str2, "AppId not known when logging event");
        }
    }

    @Override // defpackage.lg0
    public m88 call() {
        s5f s5fVar = new s5f((Callable) this.a);
        f94.a.execute(s5fVar);
        return s5fVar;
    }

    @Override // defpackage.czc
    public Object e() {
        return (ReviewRewardStore) this.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public void f(String str, JSONObject jSONObject) throws JSONException {
        String string;
        hf8.Q.getClass();
        ef8.a("StandardWebViewStrategy").a("===== method: {}, payloadJson: {}", str, jSONObject);
        Object objOpt = jSONObject.opt("params");
        if (objOpt == null) {
            string = "{}";
        } else {
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt == null || (string = objOpt.toString()) == null) {
                string = "{}";
            }
        }
        String string2 = jSONObject.getString("id");
        s19 s19Var = (s19) this.a;
        string2.getClass();
        s19Var.m(str, string, string2);
    }

    public int g(Context context, xb6 xb6Var) {
        int i;
        int iB;
        oa7.A(context);
        oa7.A(xb6Var);
        int i2 = xb6Var.i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(i2, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.a;
        synchronized (sparseIntArray2) {
            iB = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i3);
                    if (iKeyAt > i2 && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iB == -1) {
                iB = ac6.e.b(context, i2);
            }
            sparseIntArray2.put(i2, iB);
        }
        return iB;
    }

    @Override // defpackage.h1b
    public Object get() {
        return new k1d((ldd) ((f1b) this.a).get());
    }

    @Override // defpackage.is7
    public void h(t99 t99Var, Object obj) {
        rdb rdbVar = (rdb) this.a;
        String strB = t99Var.b();
        if ("version".equals(strB)) {
            if (obj instanceof int[]) {
                rdbVar.a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            rdbVar.b = obj instanceof String ? (String) obj : null;
        }
    }

    public void i() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + r());
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        xe xeVar = (xe) obj;
        Intent intent = xeVar.b;
        int i = zsg.e(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.V0;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = xeVar.a;
        if (i2 != -1 || i != 0) {
            zsg.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // defpackage.avf
    public int k() {
        return ((tkb) this.a).A();
    }

    @Override // defpackage.is7
    public js7 n(t99 t99Var) {
        String strB = t99Var.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new qdb(this, 0);
        }
        if ("strings".equals(strB)) {
            return new qdb(this, 1);
        }
        return null;
    }

    @Override // defpackage.avf
    public int o() {
        tkb tkbVar = (tkb) this.a;
        return tkbVar.n - tkbVar.x();
    }

    public void q(long j) throws IOException {
        long jR = r();
        if (jR != j) {
            if (jR != -1) {
                if (jR != -2) {
                    return;
                } else {
                    jR = -2;
                }
            }
            StringBuilder sbP = ub3.p("expected non-string scope or scope ", " but found ", j);
            sbP.append(jR);
            throw new IOException(sbP.toString());
        }
    }

    public long r() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // defpackage.is7
    public is7 t(j22 j22Var, t99 t99Var) {
        return null;
    }

    @Override // defpackage.avf
    public View u(int i) {
        return ((tkb) this.a).t(i);
    }

    @Override // defpackage.avf
    public int v(View view) {
        return view.getBottom() + ((ukb) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((ukb) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.czc
    public Object v0(Object obj, abf abfVar, ke5 ke5Var) {
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(hr3.c, new t2c(abfVar, (ReviewRewardStore) obj, null), ke5Var);
        return objP0 == bw2.a ? objP0 : wef.a;
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        ((gle) ((yea) this.a).a).a.s();
    }

    @Override // defpackage.is7
    public void d() {
    }

    @Override // defpackage.is7
    public void m(t99 t99Var, m22 m22Var) {
    }

    public /* synthetic */ yea(Object obj, Object obj2) {
        this.a = obj2;
    }

    public /* synthetic */ yea(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.is7
    public void p(t99 t99Var, j22 j22Var, t99 t99Var2) {
    }
}
