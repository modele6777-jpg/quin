package defpackage;

import android.content.Context;
import android.view.Choreographer;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wca implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wca(ghc ghcVar, e89 e89Var, s69 s69Var, e89 e89Var2) {
        this.a = 7;
        this.c = ghcVar;
        this.b = e89Var;
        this.d = s69Var;
        this.e = e89Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a26
    public final Object d(Object obj) throws JSONException {
        boolean z = true;
        switch (this.a) {
            case 0:
                eda edaVar = (eda) this.c;
                aw2 aw2Var = (aw2) this.d;
                ted tedVar = (ted) this.e;
                e89 e89Var = (e89) this.b;
                List list = (List) obj;
                list.getClass();
                int i = eda.e;
                edaVar.f(list, false);
                ynb.V(aw2Var, null, null, new cda(tedVar, e89Var, null), 3);
                return wef.a;
            case 1:
                cb9 cb9Var = (cb9) this.c;
                Context context = (Context) this.d;
                orc orcVar = (orc) this.e;
                e89 e89Var2 = (e89) this.b;
                ((ra4) obj).getClass();
                m65 m65Var = u04.a;
                u04.a = new m65(cb9Var, context, orcVar, e89Var2);
                return new ou(5);
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                azd azdVar = (azd) this.d;
                String str = (String) this.e;
                String str2 = (String) this.b;
                ya0 ya0Var = (ya0) obj;
                wef wefVar = wef.a;
                if (atomicBoolean.compareAndSet(false, true)) {
                    if (ya0Var == null) {
                        azdVar.b(str, str2, "STORE_UNAVAILABLE", "No supported app review flow is available");
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("store", "googleplay");
                        jSONObject.put("native", true);
                        azdVar.e(str, str2, jSONObject);
                    }
                }
                return wefVar;
            case 3:
                f2e f2eVar = (f2e) this.c;
                nu3 nu3Var = (nu3) this.d;
                y1e y1eVar = (y1e) this.e;
                ajf ajfVar = (ajf) this.b;
                Throwable th = (Throwable) obj;
                if ((th instanceof jv6) && ((jv6) th).a() == 3) {
                    ynb.V(f2eVar.b.f, null, null, new a2e(f2eVar, ajfVar, y1eVar, null), 3);
                } else {
                    ya2 ya2Var = y1eVar.d;
                    nu3Var.getClass();
                    ya2Var.getClass();
                    if (th == null) {
                        ((za2) ya2Var).R(nu3Var.l());
                    } else if (th instanceof CancellationException) {
                        ((rg7) ya2Var).v((CancellationException) th);
                    } else {
                        ((za2) ya2Var).i0(th);
                    }
                }
                return wef.a;
            case 4:
                x48 x48Var = (x48) this.c;
                lge lgeVar = (lge) this.d;
                Choreographer choreographer = (Choreographer) this.e;
                waf wafVar = (waf) this.b;
                ((ra4) obj).getClass();
                imb imbVar = new imb();
                ufe ufeVar = new ufe(imbVar, lgeVar, choreographer);
                ff ffVar = new ff(lgeVar, imbVar, choreographer, ufeVar, 2);
                x48Var.k().a(ffVar);
                return new vfe(imbVar, x48Var, ffVar, choreographer, ufeVar, wafVar);
            case 5:
                x16 x16Var = (x16) this.c;
                x16 x16Var2 = (x16) this.d;
                jse jseVar = (jse) this.e;
                sue sueVar = (sue) this.b;
                hne hneVar = (hne) obj;
                x16Var.invoke();
                if (x16Var2 != null ? ((Boolean) x16Var2.invoke()).booleanValue() : true) {
                    hneVar.close();
                }
                jseVar.x(sueVar);
                return wef.a;
            case 6:
                c6d c6dVar = (c6d) this.c;
                sw3 sw3Var = (sw3) this.d;
                j09 j09Var = (j09) this.e;
                zt ztVar = (zt) this.b;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                List list2 = c6dVar.f;
                zdf zdfVar = zdf.a;
                v08Var.X(list2.size(), new gj(list2, 19), new bdf(z ? 1 : 0, new k8f(8), list2), new dd2(new zk6(list2, sw3Var, j09Var, ztVar, c6dVar, 2), true, 802480018));
                return wef.a;
            case 7:
                ghc ghcVar = (ghc) this.c;
                e89 e89Var3 = (e89) this.b;
                s69 s69Var = (s69) this.d;
                e89 e89Var4 = (e89) this.e;
                if (!((Boolean) e89Var3.getValue()).booleanValue()) {
                    ((sz9) s69Var).k(ghcVar.a.j());
                }
                ((x16) e89Var4.getValue()).invoke();
                return wef.a;
            default:
                mhf mhfVar = (mhf) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.b;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("upgrade_paywall", "pathway");
                l1fVar.a(mhfVar.R0 == 1 ? "five_card_remaining_one" : "five_card_exhausted", "triggered_by");
                if (str3.equals("popup_view")) {
                    l1fVar.a("subscription_paywall", "popup");
                }
                if (str4 != null) {
                    l1fVar.a(str4, "action");
                }
                if (str5 != null) {
                    l1fVar.a(str5, "product_id");
                }
                return wef.a;
        }
    }

    public /* synthetic */ wca(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
