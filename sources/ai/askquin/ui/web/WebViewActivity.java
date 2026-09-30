package ai.askquin.ui.web;

import ai.askquin.ui.web.WebViewActivity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.a26;
import defpackage.ace;
import defpackage.ap;
import defpackage.azd;
import defpackage.bm8;
import defpackage.bzd;
import defpackage.c1g;
import defpackage.c5e;
import defpackage.ct6;
import defpackage.dd2;
import defpackage.dec;
import defpackage.e8b;
import defpackage.eb3;
import defpackage.eu2;
import defpackage.g09;
import defpackage.g21;
import defpackage.gec;
import defpackage.hf8;
import defpackage.hj6;
import defpackage.ib8;
import defpackage.j09;
import defpackage.jk9;
import defpackage.jme;
import defpackage.jw7;
import defpackage.l46;
import defpackage.l8b;
import defpackage.lf2;
import defpackage.lw7;
import defpackage.m82;
import defpackage.m93;
import defpackage.mh3;
import defpackage.mue;
import defpackage.n0g;
import defpackage.n3d;
import defpackage.ndb;
import defpackage.nte;
import defpackage.o0g;
import defpackage.o82;
import defpackage.ojb;
import defpackage.ozd;
import defpackage.pa7;
import defpackage.ps4;
import defpackage.pue;
import defpackage.r0g;
import defpackage.r19;
import defpackage.rzb;
import defpackage.s7c;
import defpackage.t7c;
import defpackage.tec;
import defpackage.tm7;
import defpackage.u8a;
import defpackage.v4e;
import defpackage.vb2;
import defpackage.wb2;
import defpackage.x0g;
import defpackage.x16;
import defpackage.xc0;
import defpackage.xu4;
import defpackage.y72;
import defpackage.ynb;
import defpackage.z18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class WebViewActivity extends vb2 implements hf8 {
    public static final /* synthetic */ int T0 = 0;
    public final ace K0;
    public final ace L0;
    public final ace M0;
    public WebView N0;
    public c1g O0;
    public final lw7 P0;
    public final lw7 Q0;
    public final lw7 R0;
    public a26 S0;

    public WebViewActivity() {
        final int i = 0;
        this.K0 = new ace(new x16(this) { // from class: m0g
            public final /* synthetic */ WebViewActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                WebViewActivity webViewActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = WebViewActivity.T0;
                        String stringExtra = webViewActivity.getIntent().getStringExtra("extra_url");
                        return stringExtra == null ? "" : stringExtra;
                    case 1:
                        int i4 = WebViewActivity.T0;
                        ozd ozdVar = (ozd) dj6.M(webViewActivity.getIntent(), "extra_action_type", ozd.class);
                        return ozdVar == null ? ozd.a : ozdVar;
                    default:
                        int i5 = WebViewActivity.T0;
                        return (x0g) dj6.M(webViewActivity.getIntent(), "extra_preset", x0g.class);
                }
            }
        });
        final int i2 = 1;
        this.L0 = new ace(new x16(this) { // from class: m0g
            public final /* synthetic */ WebViewActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                WebViewActivity webViewActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = WebViewActivity.T0;
                        String stringExtra = webViewActivity.getIntent().getStringExtra("extra_url");
                        return stringExtra == null ? "" : stringExtra;
                    case 1:
                        int i5 = WebViewActivity.T0;
                        ozd ozdVar = (ozd) dj6.M(webViewActivity.getIntent(), "extra_action_type", ozd.class);
                        return ozdVar == null ? ozd.a : ozdVar;
                    default:
                        int i6 = WebViewActivity.T0;
                        return (x0g) dj6.M(webViewActivity.getIntent(), "extra_preset", x0g.class);
                }
            }
        });
        final int i3 = 2;
        this.M0 = new ace(new x16(this) { // from class: m0g
            public final /* synthetic */ WebViewActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                WebViewActivity webViewActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = WebViewActivity.T0;
                        String stringExtra = webViewActivity.getIntent().getStringExtra("extra_url");
                        return stringExtra == null ? "" : stringExtra;
                    case 1:
                        int i6 = WebViewActivity.T0;
                        ozd ozdVar = (ozd) dj6.M(webViewActivity.getIntent(), "extra_action_type", ozd.class);
                        return ozdVar == null ? ozd.a : ozdVar;
                    default:
                        int i7 = WebViewActivity.T0;
                        return (x0g) dj6.M(webViewActivity.getIntent(), "extra_preset", x0g.class);
                }
            }
        });
        this.P0 = eb3.N(z18.c, new r0g(this, i3));
        r0g r0gVar = new r0g(this, i);
        z18 z18Var = z18.a;
        this.Q0 = eb3.N(z18Var, r0gVar);
        this.R0 = eb3.N(z18Var, new r0g(this, i2));
    }

    @Override // defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        c1g gecVar;
        String host;
        super.onCreate(bundle);
        String string = null;
        num = null;
        num = null;
        Integer num = null;
        string = null;
        string = null;
        string = null;
        int i = 3;
        ps4.a(this, null, 3);
        ct6 ct6Var = rzb.b().c;
        Iterator it = ((ArrayList) jk9.a.d(ct6Var)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((eu2) next).a, "quin-auth"));
        eu2 eu2Var = (eu2) next;
        if (eu2Var != null) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setCookie(ct6Var.i, eu2Var.a + "=" + eu2Var.b);
            d().f("Synced auth cookie to WebView for {}", ct6Var);
            cookieManager.flush();
        }
        int iOrdinal = ((ozd) this.L0.getValue()).ordinal();
        int i2 = 0;
        int i3 = 1;
        if (iOrdinal == 0) {
            gecVar = new gec(25);
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
            Uri uri = Uri.parse(rzb.b().c.i);
            String scheme = uri.getScheme();
            if (scheme != null) {
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = scheme.toLowerCase(locale);
                lowerCase.getClass();
                if (!lowerCase.equals("http") && !lowerCase.equals(Constants.SCHEME)) {
                    lowerCase = null;
                }
                if (lowerCase != null && (host = uri.getHost()) != null) {
                    String lowerCase2 = host.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (v4e.Q(lowerCase2)) {
                        lowerCase2 = null;
                    }
                    if (lowerCase2 != null) {
                        if (v4e.G(lowerCase2, ':') && !v4e.e0(lowerCase2, '[')) {
                            lowerCase2 = ib8.j("[", lowerCase2, "]");
                        }
                        int port = uri.getPort();
                        Integer numValueOf = Integer.valueOf(port);
                        if (port != -1 && ((!lowerCase.equals("http") || port != 80) && (!lowerCase.equals(Constants.SCHEME) || port != 443))) {
                            num = numValueOf;
                        }
                        StringBuilder sbP = tec.p(lowerCase, "://", lowerCase2);
                        if (num != null) {
                            sbP.append(":" + num.intValue());
                        }
                        string = sbP.toString();
                    }
                }
            }
            Set setP = xu4.a;
            if (string != null && c5e.C(string, "https://", false)) {
                setP = n3d.p(string);
            }
            int i4 = 2;
            gecVar = new azd(setP, new n0g(this, i3), new o0g(this, i4), new o0g(this, i), new n0g(this, i4));
        }
        this.O0 = gecVar;
        wb2.a(this, new dd2(new o0g(this, i2), true, -1448013448));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        c1g c1gVar = this.O0;
        if (c1gVar != null) {
            c1gVar.a();
        }
        this.N0 = null;
        super.onDestroy();
    }

    public final void q(String str, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        long j;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var2.h0(1441487545);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16) | (l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(this) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 1171) != 1170)) {
            j09 j09VarD = b.d(mh3.W(b.c(g09.a, 1.0f)), 44.0f);
            if (((x0g) this.M0.getValue()) == x0g.a) {
                l46Var2.f0(-2022284322);
                l46Var2.r(false);
                j = y72.j;
            } else {
                l46Var2.f0(-2022235125);
                j = ((m82) l46Var2.k(o82.a)).n;
                l46Var2.r(false);
            }
            j09 j09VarO = tm7.o(j09VarD, j, g21.f);
            t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            bm8.h(x16Var, null, false, null, null, bzd.g, l46Var, ((i2 >> 3) & 14) | 1572864, 62);
            l46Var2 = l46Var;
            if (str == null) {
                l46Var2.f0(1041636659);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1041636660);
                long j2 = ((e8b) l46Var2.k(l8b.a)).q;
                j09 j09VarB0 = ynb.b0(16.0f, 0.0f, new jw7(1.0f, true), 2);
                mue mueVar = pue.a;
                nte.b(str, j09VarB0, j2, 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, pue.b(l46Var2), l46Var, 0, 24960, 109560);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            bm8.h(x16Var2, null, false, null, null, bzd.h, l46Var2, ((i2 >> 6) & 14) | 1572864, 62);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(this, str, x16Var, x16Var2, i, 19);
        }
    }
}
