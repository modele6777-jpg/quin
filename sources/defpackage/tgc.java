package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.util.Size;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tgc {
    public static final void a(zke zkeVar, a26 a26Var, a26 a26Var2, x16 x16Var, l46 l46Var, int i) {
        zkeVar.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        x16Var.getClass();
        l46Var.h0(-1313437098);
        int i2 = i | (l46Var.g(zkeVar) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            dnd dndVar = (dnd) z5c.G(job.a.b(dnd.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | l46Var.i(dndVar) | ((i2 & 896) == 256);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new slc(a26Var, x16Var, dndVar, a26Var2);
                l46Var.p0(objR);
            }
            b(zkeVar, (a26) objR, l46Var, i2 & 14);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(zkeVar, a26Var, a26Var2, x16Var, i);
        }
    }

    public static final void b(zke zkeVar, a26 a26Var, l46 l46Var, int i) {
        l46Var.h0(-1491262147);
        int i2 = 16;
        int i3 = i | (l46Var.g(zkeVar) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            xdc.a(null, af1.b0(629572609, new k50(a26Var, i2), l46Var), null, null, null, 0, ((e8b) l46Var.k(l8b.a)).e, 0L, null, af1.b0(-89229748, new s19(15, zkeVar, a26Var), l46Var), l46Var, 805306416, 445);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(zkeVar, a26Var, i, 10);
        }
    }

    public static int c(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static final boolean d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oif oifVar = (oif) it.next();
            if (oifVar != null && l(oifVar)) {
                return true;
            }
        }
        return false;
    }

    public static RectF e(t2f t2fVar, Size size) {
        float f = t2fVar.c;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = t2fVar.d;
        float f3 = Float.isNaN(f2) ? 0.0f : f2;
        float width = t2fVar.e;
        if (Float.isNaN(width)) {
            width = size.getWidth();
        }
        float height = t2fVar.f;
        if (Float.isNaN(height)) {
            height = size.getHeight();
        }
        return new RectF(f, f3, width, height);
    }

    public static final void f(WebView webView) {
        webView.getClass();
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setHapticFeedbackEnabled(true);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setLoadsImagesAutomatically(true);
        WebSettings settings2 = webView.getSettings();
        settings2.setAllowFileAccess(false);
        settings2.setAllowUniversalAccessFromFileURLs(false);
        settings2.setAllowFileAccessFromFileURLs(false);
        settings2.setMediaPlaybackRequiresUserGesture(false);
    }

    public static final hkb g(bea beaVar, int i, w2f w2fVar, ste steVar, boolean z, int i2) {
        hkb hkbVarC = steVar != null ? steVar.c(w2fVar.b.v(i)) : hkb.e;
        int iD0 = beaVar.D0(2.0f);
        float f = hkbVarC.a;
        return hkb.b(hkbVarC, z ? (i2 - f) - iD0 : f, z ? i2 - f : iD0 + f, 0.0f, 10);
    }

    public static final String h(int i, l46 l46Var) {
        l46Var.k(uq.a);
        return ((Context) l46Var.k(uq.b)).getResources().getString(i);
    }

    public static final vuf i(ArrayList arrayList, a26 a26Var) {
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iY = ((xjf) a26Var.d((oif) it.next())).y();
            if (iY != 0) {
                if (i2 != iY && i2 != 0) {
                    b21.W("UseCaseUtil", kv2.h(i2, iY, "Unexpected configurations: Overwriting current previewStabilizationMode(", ") with useCasePreviewStabilization(", ")!"));
                }
                i2 = iY;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iT = ((xjf) a26Var.d((oif) it2.next())).t();
            if (iT != 0) {
                if (i != iT && i != 0) {
                    b21.W("UseCaseUtil", kv2.h(i, iT, "Unexpected configurations: Overwriting current videoStabilizationMode(", ") with useCaseVideoStabilization(", ")!"));
                }
                i = iT;
            }
        }
        vuf.a.getClass();
        if (i2 == 1 || i == 1) {
            return vuf.c;
        }
        if (i2 == 2) {
            return vuf.e;
        }
        return i == 2 ? vuf.d : vuf.b;
    }

    public static final boolean j(Throwable th, boolean z) {
        Integer numValueOf;
        th.getClass();
        Throwable thB = nzc.b(th);
        if (thB instanceof qs6) {
            numValueOf = Integer.valueOf(((qs6) thB).a());
        } else {
            numValueOf = thB instanceof jzc ? Integer.valueOf(((jzc) thB).getCode()) : null;
        }
        jzc jzcVar = thB instanceof jzc ? (jzc) thB : null;
        Integer numValueOf2 = jzcVar != null ? Integer.valueOf(jzcVar.getErrorCode()) : null;
        String message = thB.getMessage();
        String string = message != null ? v4e.o0(message).toString() : null;
        if (numValueOf != null && numValueOf.intValue() == 401) {
            return true;
        }
        if ((numValueOf2 != null && numValueOf2.intValue() == 401) || c5e.v(string, "No auth", true)) {
            return true;
        }
        return z && numValueOf != null && numValueOf.intValue() == 404;
    }

    public static final boolean k(ServerResponse serverResponse) {
        serverResponse.getClass();
        return serverResponse.getErrorCode() == 401 || c5e.v(v4e.o0(serverResponse.getErrorMessage()).toString(), "No auth", true);
    }

    public static final boolean l(oif oifVar) {
        oifVar.getClass();
        if (oifVar.i.h(xjf.p0)) {
            return oifVar.i.s() == zjf.d;
        }
        b21.v("UseCaseUtil", oifVar + " UseCase does not have capture type.");
        return false;
    }

    public static final void m(ywc ywcVar, int i, d60 d60Var) {
        p89 p89Var = new p89(0, new ywc[16]);
        List listI = ywcVar.i(false, false);
        while (true) {
            p89Var.d(p89Var.c, listI);
            while (true) {
                int i2 = p89Var.c;
                if (i2 == 0) {
                    return;
                }
                ywc ywcVar2 = (ywc) p89Var.k(i2 - 1);
                boolean zX = x57.X(ywcVar2);
                twc twcVar = ywcVar2.d;
                w79 w79Var = twcVar.a;
                if (!zX && !w79Var.c(cxc.j)) {
                    yf9 yf9VarD = ywcVar2.d();
                    if (yf9VarD == null) {
                        throw kv2.d("Expected semantics node to have a coordinator.");
                    }
                    a77 a77VarU = n16.U(vd0.N(yf9VarD, true));
                    if (a77VarU.a < a77VarU.c && a77VarU.b < a77VarU.d) {
                        Object objG = twcVar.a.g(swc.e);
                        if (objG == null) {
                            objG = null;
                        }
                        l26 l26Var = (l26) objG;
                        Object objG2 = w79Var.g(cxc.w);
                        rgc rgcVar = (rgc) (objG2 != null ? objG2 : null);
                        if (l26Var == null || rgcVar == null || ((Number) rgcVar.b.invoke()).floatValue() <= 0.0f) {
                            listI = ywcVar2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            d60Var.d(new sgc(ywcVar2, i3, a77VarU, yf9VarD));
                            m(ywcVar2, i3, d60Var);
                        }
                    }
                }
            }
        }
    }

    public static void n(int i, int i2) {
        String strR;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strR = rrb.r("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    qc0.j(ub3.h(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strR = rrb.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strR);
        }
    }

    public static void o(int i, int i2, int i3) {
        String strP;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strP = p(i, i3, "start index");
            } else {
                strP = (i2 < 0 || i2 > i3) ? p(i2, i3, "end index") : rrb.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    public static String p(int i, int i2, String str) {
        if (i < 0) {
            return rrb.r("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return rrb.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        qc0.j(ub3.h(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
