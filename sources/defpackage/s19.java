package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.divination.k;
import ai.askquin.ui.web.WebViewActivity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Spannable;
import android.util.Base64;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s19 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s19(yx9 yx9Var, cv7 cv7Var) {
        this.a = 6;
        this.c = yx9Var;
        this.b = cv7Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x01ab A[Catch: Exception -> 0x0081, TryCatch #9 {Exception -> 0x0081, blocks: (B:8:0x003a, B:11:0x0042, B:15:0x0056, B:23:0x006f, B:27:0x0076, B:29:0x007a, B:32:0x0085, B:33:0x0089, B:35:0x00a8, B:22:0x0069, B:36:0x00bf, B:44:0x00d8, B:47:0x00de, B:49:0x00e2, B:57:0x0100, B:58:0x0107, B:55:0x00f5, B:43:0x00d2, B:59:0x0119, B:62:0x0123, B:64:0x0129, B:71:0x013d, B:75:0x0144, B:77:0x0148, B:78:0x014f, B:70:0x0137, B:79:0x015b, B:82:0x0165, B:83:0x0171, B:86:0x017b, B:88:0x0183, B:91:0x0188, B:93:0x018c, B:94:0x0190, B:101:0x01a5, B:103:0x01ab, B:104:0x01b4, B:100:0x01a0, B:105:0x01c6, B:113:0x01de, B:117:0x01e5, B:119:0x01e9, B:120:0x01f0, B:112:0x01d8, B:121:0x01fd, B:124:0x0210, B:126:0x0216, B:133:0x022a, B:137:0x0231, B:139:0x0235, B:140:0x023b, B:141:0x024c, B:143:0x0253, B:145:0x0260, B:146:0x0264, B:132:0x0224, B:123:0x0205, B:147:0x026f, B:7:0x0035, B:39:0x00c9, B:128:0x021b, B:3:0x002d, B:66:0x012e, B:108:0x01cf, B:18:0x0060, B:51:0x00e9, B:96:0x0197), top: B:158:0x002d, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0205 A[Catch: Exception -> 0x0081, TryCatch #9 {Exception -> 0x0081, blocks: (B:8:0x003a, B:11:0x0042, B:15:0x0056, B:23:0x006f, B:27:0x0076, B:29:0x007a, B:32:0x0085, B:33:0x0089, B:35:0x00a8, B:22:0x0069, B:36:0x00bf, B:44:0x00d8, B:47:0x00de, B:49:0x00e2, B:57:0x0100, B:58:0x0107, B:55:0x00f5, B:43:0x00d2, B:59:0x0119, B:62:0x0123, B:64:0x0129, B:71:0x013d, B:75:0x0144, B:77:0x0148, B:78:0x014f, B:70:0x0137, B:79:0x015b, B:82:0x0165, B:83:0x0171, B:86:0x017b, B:88:0x0183, B:91:0x0188, B:93:0x018c, B:94:0x0190, B:101:0x01a5, B:103:0x01ab, B:104:0x01b4, B:100:0x01a0, B:105:0x01c6, B:113:0x01de, B:117:0x01e5, B:119:0x01e9, B:120:0x01f0, B:112:0x01d8, B:121:0x01fd, B:124:0x0210, B:126:0x0216, B:133:0x022a, B:137:0x0231, B:139:0x0235, B:140:0x023b, B:141:0x024c, B:143:0x0253, B:145:0x0260, B:146:0x0264, B:132:0x0224, B:123:0x0205, B:147:0x026f, B:7:0x0035, B:39:0x00c9, B:128:0x021b, B:3:0x002d, B:66:0x012e, B:108:0x01cf, B:18:0x0060, B:51:0x00e9, B:96:0x0197), top: B:158:0x002d, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object a(Object obj, Object obj2, Object obj3) {
        Object dzbVar;
        Object dzbVar2;
        Object dzbVar3;
        Object dzbVar4;
        Throwable thA;
        Object dzbVar5;
        Object dzbVar6;
        Object dzbVar7;
        final azd azdVar = (azd) this.b;
        Context context = (Context) this.c;
        final String str = (String) obj;
        String str2 = (String) obj2;
        final String str3 = (String) obj3;
        wef wefVar = wef.a;
        str.getClass();
        str2.getClass();
        str3.getClass();
        azdVar.d().f("JavaScript callback - method: {}, id: {}, jsonContent: {}", str, str3, str2);
        try {
            try {
                dzbVar = new JSONObject(str2);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (ezb.a(dzbVar) == null) {
                JSONObject jSONObject = (JSONObject) dzbVar;
                final int i = 1;
                final int i2 = 0;
                Object objDecodeByteArray = null;
                switch (str.hashCode()) {
                    case -2142325601:
                        if (!str.equals("saveImagesToAlbum")) {
                            azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        } else if (!xo1.o(context)) {
                            azdVar.b(str, str3, "PERMISSION_DENIED", "Storage permission not granted");
                        } else {
                            try {
                                dzbVar2 = jSONObject.getJSONArray("imageUrls");
                            } catch (Throwable th2) {
                                dzbVar2 = new dzb(th2);
                            }
                            if (!(dzbVar2 instanceof dzb)) {
                                objDecodeByteArray = dzbVar2;
                            }
                            JSONArray jSONArray = (JSONArray) objDecodeByteArray;
                            if (jSONArray != null) {
                                z67 z67VarC0 = mh3.c0(0, jSONArray.length());
                                ArrayList arrayList = new ArrayList();
                                Iterator it = z67VarC0.iterator();
                                while (((y67) it).c) {
                                    String strOptString = jSONArray.optString(((q67) it).nextInt());
                                    if (strOptString != null) {
                                        arrayList.add(strOptString);
                                    }
                                }
                                azdVar.b.z(arrayList, new a26() { // from class: uyd
                                    @Override // defpackage.a26
                                    public final Object d(Object obj4) {
                                        int i3 = i2;
                                        wef wefVar2 = wef.a;
                                        String str4 = str3;
                                        String str5 = str;
                                        azd azdVar2 = azdVar;
                                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                        switch (i3) {
                                            case 0:
                                                if (!zBooleanValue) {
                                                    azdVar2.b(str5, str4, "DOWNLOAD_FAILED", "Failed to save images");
                                                } else {
                                                    azdVar2.e(str5, str4, new JSONObject());
                                                }
                                                break;
                                            default:
                                                if (!zBooleanValue) {
                                                    azdVar2.b(str5, str4, "DOWNLOAD_FAILED", "Failed to save video");
                                                } else {
                                                    azdVar2.e(str5, str4, new JSONObject());
                                                }
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                });
                            } else {
                                azdVar.b(str, str3, "INVALID_PARAMS", "Missing imageUrls parameter");
                            }
                        }
                        break;
                    case 110532135:
                        if (!str.equals("toast")) {
                            azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        } else {
                            try {
                                dzbVar3 = jSONObject.getString("message");
                            } catch (Throwable th3) {
                                dzbVar3 = new dzb(th3);
                            }
                            if (!(dzbVar3 instanceof dzb)) {
                                objDecodeByteArray = dzbVar3;
                            }
                            String str4 = (String) objDecodeByteArray;
                            if (str4 != null) {
                                jcc.k(0, str4);
                                azdVar.e(str, str3, new JSONObject());
                            } else {
                                azdVar.b(str, str3, "INVALID_PARAMS", "Missing message parameter");
                            }
                        }
                        break;
                    case 615143330:
                        if (!str.equals("openAppStoreReview")) {
                            azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        } else {
                            Object objOpt = jSONObject.opt("source");
                            if (objOpt == null || objOpt == JSONObject.NULL) {
                                try {
                                    azdVar.e.d(objDecodeByteArray);
                                    dzbVar4 = wefVar;
                                } catch (Throwable th4) {
                                    dzbVar4 = new dzb(th4);
                                }
                                thA = ezb.a(dzbVar4);
                                if (thA != null) {
                                    azdVar.d().c("Failed to track app store review request", thA);
                                }
                                azdVar.a.d(new wca(new AtomicBoolean(false), azdVar, str, str3, 2));
                            } else if (!(objOpt instanceof String)) {
                                azdVar.b(str, str3, "INVALID_PARAMS", "source must be a string");
                            } else {
                                objDecodeByteArray = (String) objOpt;
                                azdVar.e.d(objDecodeByteArray);
                                dzbVar4 = wefVar;
                                thA = ezb.a(dzbVar4);
                                if (thA != null) {
                                    azdVar.d().c("Failed to track app store review request", thA);
                                }
                                azdVar.a.d(new wca(new AtomicBoolean(false), azdVar, str, str3, 2));
                            }
                        }
                        break;
                    case 1011447450:
                        if (!str.equals("getSupportedMethods")) {
                            azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        } else {
                            azdVar.e(str, str3, new JSONArray((Collection) azd.y));
                        }
                        break;
                    case 1361029590:
                        if (!str.equals("saveVideoToAlbum")) {
                            azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        } else if (!xo1.o(context)) {
                            azdVar.b(str, str3, "PERMISSION_DENIED", "Storage permission not granted");
                        } else {
                            try {
                                dzbVar5 = jSONObject.getString("videoUrl");
                            } catch (Throwable th5) {
                                dzbVar5 = new dzb(th5);
                            }
                            if (!(dzbVar5 instanceof dzb)) {
                                objDecodeByteArray = dzbVar5;
                            }
                            String str5 = (String) objDecodeByteArray;
                            if (str5 != null) {
                                azdVar.c.z(str5, new a26() { // from class: uyd
                                    @Override // defpackage.a26
                                    public final Object d(Object obj4) {
                                        int i3 = i;
                                        wef wefVar2 = wef.a;
                                        String str6 = str3;
                                        String str7 = str;
                                        azd azdVar2 = azdVar;
                                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                        switch (i3) {
                                            case 0:
                                                if (!zBooleanValue) {
                                                    azdVar2.b(str7, str6, "DOWNLOAD_FAILED", "Failed to save images");
                                                } else {
                                                    azdVar2.e(str7, str6, new JSONObject());
                                                }
                                                break;
                                            default:
                                                if (!zBooleanValue) {
                                                    azdVar2.b(str7, str6, "DOWNLOAD_FAILED", "Failed to save video");
                                                } else {
                                                    azdVar2.e(str7, str6, new JSONObject());
                                                }
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                });
                            } else {
                                azdVar.b(str, str3, "INVALID_PARAMS", "Missing videoUrl parameter");
                            }
                        }
                        break;
                    case 1463552847:
                        if (!str.equals("openSharePanel")) {
                            azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        } else {
                            try {
                                dzbVar6 = jSONObject.getString("imageData");
                            } catch (Throwable th6) {
                                dzbVar6 = new dzb(th6);
                            }
                            if (dzbVar6 instanceof dzb) {
                                dzbVar6 = null;
                            }
                            String str6 = (String) dzbVar6;
                            if (str6 != null) {
                                try {
                                    byte[] bArrDecode = Base64.decode(str6, 0);
                                    objDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                                } catch (Exception e) {
                                    azdVar.d().c("Failed to decode base64 image", e);
                                }
                                if (objDecodeByteArray != null) {
                                    azdVar.d.d(objDecodeByteArray);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("opened", true);
                                    azdVar.e(str, str3, jSONObject2);
                                } else {
                                    azdVar.b(str, str3, "INVALID_PARAMS", "Failed to decode image data");
                                }
                            } else {
                                azdVar.b(str, str3, "INVALID_PARAMS", "Missing imageData parameter");
                            }
                        }
                        break;
                    case 1849099727:
                        if (!str.equals("openExternalLink")) {
                            azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        } else {
                            try {
                                dzbVar7 = jSONObject.getString("url");
                            } catch (Throwable th7) {
                                dzbVar7 = new dzb(th7);
                            }
                            if (!(dzbVar7 instanceof dzb)) {
                                objDecodeByteArray = dzbVar7;
                            }
                            String str7 = (String) objDecodeByteArray;
                            if (str7 != null) {
                                Uri uri = Uri.parse(str7);
                                try {
                                    uri.getClass();
                                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                                    intent.addFlags(268435456);
                                    context.startActivity(intent);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("opened", true);
                                    azdVar.e(str, str3, jSONObject3);
                                } catch (ActivityNotFoundException unused) {
                                    azdVar.b(str, str3, "APP_NOT_INSTALLED", "No app handles " + uri.getScheme());
                                }
                            } else {
                                azdVar.b(str, str3, "INVALID_PARAMS", "Missing url parameter");
                            }
                        }
                        break;
                    default:
                        azdVar.b(str, str3, "UNKNOWN_METHOD", "Method not supported: ".concat(str));
                        break;
                }
            } else {
                azdVar.b(str, str3, "INVALID_PARAMS", "Params must be a JSON object");
            }
        } catch (Exception e2) {
            azdVar.d().d("Error handling callback method: {}", str, e2);
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            azdVar.b(str, str3, "NATIVE_HANDLER_ERROR", message);
        }
        return wefVar;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        final h0e h0eVar = (h0e) this.b;
        final xzf xzfVar = (xzf) this.c;
        xw9 xw9Var = (xw9) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xw9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            final List listJ1 = s72.j1(rzf.c);
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            j09 j09VarY = ynb.Y(b.c, xw9Var);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            rs0.e(0, l46Var, null, ks0.h(24.0f, R.string.onboarding_wanna_know_title, l46Var, l46Var, g09Var));
            String strH = ks0.h(8.0f, R.string.multi_selector_tips, l46Var, l46Var, g09Var);
            mue mueVar = pue.a;
            nte.b(strH, null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 131066);
            l46 l46Var2 = l46Var;
            o5c.f(l46Var2, b.d(g09Var, 24.0f));
            i8c i8cVar = sf2.a;
            if (zF) {
                l46Var2.f0(846171631);
                j09 j09VarC = b.c(g09Var, 1.0f);
                boolean zI = l46Var2.i(listJ1) | l46Var2.g(h0eVar) | l46Var2.i(xzfVar);
                Object objR = l46Var2.R();
                if (zI || objR == i8cVar) {
                    z2 = false;
                    final byte b = 0 == true ? 1 : 0;
                    objR = new a26() { // from class: szf
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            int i = b;
                            wef wefVar = wef.a;
                            h0e h0eVar2 = h0eVar;
                            xzf xzfVar2 = xzfVar;
                            List list = listJ1;
                            switch (i) {
                                case 0:
                                    v08 v08Var = (v08) obj4;
                                    v08Var.getClass();
                                    v08Var.X(list.size(), new bdf(2, new cwe(6), list), new gj(20, list, false), new dd2(new uzf(list, list, xzfVar2, h0eVar2), true, 2039820996));
                                    break;
                                default:
                                    sw7 sw7Var = (sw7) obj4;
                                    sw7Var.getClass();
                                    sw7Var.W(list.size(), new bdf(3, new ksf(16), list), new gj(21, list, false), new dd2(new yj3(list, xzfVar2, h0eVar2, 2), true, -1117249557));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var2.p0(objR);
                } else {
                    z2 = false;
                }
                af1.s(j09VarC, null, null, null, null, null, false, null, (a26) objR, l46Var2, 6, 510);
                l46Var2.r(z2);
                z = true;
            } else {
                l46Var2.f0(846907633);
                ye6 ye6Var = new ye6(2);
                final int i = 1;
                uc0 uc0Var = new uc0(8.0f, true, new qc0(0));
                uc0 uc0Var2 = new uc0(8.0f, true, new qc0(0));
                bx9 bx9Var = new bx9(24.0f, 24.0f, 24.0f, 24.0f);
                boolean zI2 = l46Var2.i(listJ1) | l46Var2.g(h0eVar) | l46Var2.i(xzfVar);
                Object objR2 = l46Var2.R();
                if (zI2 || objR2 == i8cVar) {
                    objR2 = new a26() { // from class: szf
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            int i2 = i;
                            wef wefVar = wef.a;
                            h0e h0eVar2 = h0eVar;
                            xzf xzfVar2 = xzfVar;
                            List list = listJ1;
                            switch (i2) {
                                case 0:
                                    v08 v08Var = (v08) obj4;
                                    v08Var.getClass();
                                    v08Var.X(list.size(), new bdf(2, new cwe(6), list), new gj(20, list, false), new dd2(new uzf(list, list, xzfVar2, h0eVar2), true, 2039820996));
                                    break;
                                default:
                                    sw7 sw7Var = (sw7) obj4;
                                    sw7Var.getClass();
                                    sw7Var.W(list.size(), new bdf(3, new ksf(16), list), new gj(21, list, false), new dd2(new yj3(list, xzfVar2, h0eVar2, 2), true, -1117249557));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var2.p0(objR2);
                }
                z = true;
                an1.e(ye6Var, null, null, bx9Var, uc0Var2, uc0Var, null, false, null, (a26) objR2, l46Var2, 1772544, 918);
                l46Var2 = l46Var2;
                l46Var2.r(false);
            }
            l46Var2.r(z);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        WebViewActivity webViewActivity = (WebViewActivity) this.b;
        e89 e89Var = (e89) this.c;
        xw9 xw9Var = (xw9) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = WebViewActivity.T0;
        xw9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
        }
        int i2 = 0;
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = (String) webViewActivity.K0.getValue();
            j09 j09VarY = ((x0g) webViewActivity.M0.getValue()) == x0g.a ? b.c : ynb.Y(b.c, xw9Var);
            boolean zI = l46Var.i(webViewActivity);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                ihf ihfVar = new ihf(0, webViewActivity, WebViewActivity.class, "finish", "finish()V", 0, 3);
                l46Var.p0(ihfVar);
                objR = ihfVar;
            }
            ym7 ym7Var = (ym7) objR;
            boolean zI2 = l46Var.i(webViewActivity);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                objR2 = new n0g(webViewActivity, i2);
                l46Var.p0(objR2);
            }
            a26 a26Var = (a26) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new w77(e89Var, 24);
                l46Var.p0(objR3);
            }
            qk2.p(str, j09VarY, a26Var, null, (a26) objR3, (x16) ym7Var, l46Var, 24576, 40);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        d3g d3gVar = (d3g) this.b;
        o8b o8bVar = (o8b) this.c;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((oz) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            i3g.a(tm7.N(0.0f, d3gVar.a, g09Var, 1), l46Var, 0);
            boolean zI = l46Var.i(o8bVar);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new h2e(22, o8bVar);
                l46Var.p0(objR);
            }
            vtb.i(null, (x16) objR, l46Var, 0, 1);
            String strQ = afc.q(R.string.onboarding_quin_pronunciation_tips, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 0, 0, 131070);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        d3g d3gVar = (d3g) this.b;
        bq9 bq9Var = (bq9) this.c;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((oz) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            j09 j09VarG = k8b.g(tm7.N(0.0f, d3gVar.b, g09.a, 1), new agb(18), l46Var, 0);
            boolean zI = l46Var.i(bq9Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                ihf ihfVar = new ihf(0, bq9Var, bq9.class, "invoke", "invoke()V", 0, 4);
                l46Var.p0(ihfVar);
                objR = ihfVar;
            }
            vtb.j(0, (x16) ((ym7) objR), l46Var, j09VarG);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        c3g c3gVar = (c3g) this.b;
        x16 x16Var = (x16) this.c;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((oz) obj).getClass();
        boolean z = false;
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zG = l46Var.g(c3gVar) | l46Var.g(x16Var);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new fhf(c3gVar, x16Var, z, 4);
                l46Var.p0(objR);
            }
            i3g.d(0, (x16) objR, l46Var, null, !((Boolean) c3gVar.c.getValue()).booleanValue());
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:300:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:301:0x0ab1  */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        char c;
        float f;
        Typeface typeface;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        int i2 = 14;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                z19 z19Var = (z19) obj5;
                yx9 yx9Var = (yx9) obj4;
                c31 c31Var = (c31) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(c31Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    m93.h(z19Var.d, yx9Var, c31Var.b(g09Var), 0.0f, 0.0f, l46Var, 0);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                x16 x16Var = (x16) obj5;
                p29 p29Var = (p29) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bm8.h(x16Var, null, p29Var instanceof o29, null, null, m93.c, l46Var2, 1572864, 58);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                gj9 gj9Var = (gj9) obj5;
                h0e h0eVar = (h0e) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strQ = afc.q(R.string.notification_settings_msg_title, l46Var3);
                    String strQ2 = afc.q(R.string.notification_settings_msg_subtitle, l46Var3);
                    boolean z = ((qi9) h0eVar.getValue()).j && ((qi9) h0eVar.getValue()).a;
                    boolean z2 = ((qi9) h0eVar.getValue()).a;
                    boolean zI = l46Var3.i(gj9Var);
                    Object objR = l46Var3.R();
                    if (zI || objR == i8cVar) {
                        vx7 vx7Var = new vx7(1, gj9Var, gj9.class, "toggleMsg", "toggleMsg(Z)V", 0, 7);
                        l46Var3.p0(vx7Var);
                        objR = vx7Var;
                    }
                    pi9.b(strQ, strQ2, z, z2, (a26) ((ym7) objR), l46Var3, 0, 0);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                bx9 bx9Var = (bx9) obj5;
                x16 x16Var2 = (x16) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    k.i(0, x16Var2, l46Var4, ynb.Y(g09Var, bx9Var));
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                bx9 bx9Var2 = (bx9) obj5;
                OverviewItem.UserMessageItem userMessageItem = (OverviewItem.UserMessageItem) obj4;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    jgb.g(null, g21.W(bx9Var2, ynb.q(0.0f, 12.0f, 1), l46Var5), af1.b0(-39344442, new g20(25, userMessageItem), l46Var5), l46Var5, 384);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                OverviewItem.ServerMessageItem serverMessageItem = (OverviewItem.ServerMessageItem) obj5;
                a26 a26Var = (a26) obj4;
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    jgb.b(null, af1.b0(533953780, new rk6(17, serverMessageItem, a26Var), l46Var6), l46Var6, 48, 1);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                yx9 yx9Var2 = (yx9) obj4;
                cv7 cv7Var = (cv7) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zG = m93.G(yx9Var2, fFloatValue);
                if (yx9Var2.k().e != ks9.a && cv7Var != cv7.a) {
                    zG = !zG;
                }
                int i3 = yx9Var2.k().b;
                float fY = i3 == 0 ? 0.0f : m93.y(yx9Var2) / i3;
                float f2 = fY - ((int) fY);
                if (Math.abs(fFloatValue) < yx9Var2.n.p0(400.0f)) {
                    c = 0;
                } else {
                    c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
                }
                if (c == 0) {
                    if (Math.abs(f2) <= 0.5f) {
                        float fAbs = Math.abs(fY);
                        sw3 sw3Var = yx9Var2.n;
                        zx9 zx9Var = ay9.a;
                        if (fAbs < Math.abs(Math.min(sw3Var.p0(56.0f), yx9Var2.m() / 2.0f) / yx9Var2.m()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zG) {
                            f = fFloatValue3;
                        } else {
                            f = fFloatValue2;
                        }
                    } else if (zG) {
                        f = fFloatValue3;
                    } else {
                        f = fFloatValue2;
                    }
                } else if (c == 1) {
                    f = fFloatValue3;
                } else if (c == 2) {
                    f = fFloatValue2;
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case 7:
                jx4 jx4Var = (jx4) obj5;
                a26 a26Var2 = (a26) obj4;
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    j09 j09VarN = tm7.N(0.0f, (-((Configuration) l46Var7.k(uq.a)).screenHeightDp) * 0.05f, g09Var, 1);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var7, 48);
                    int iHashCode = Long.hashCode(l46Var7.T);
                    u8a u8aVarM = l46Var7.m();
                    j09 j09VarJ = m93.J(l46Var7, j09VarN);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, c92VarA);
                    dec.l(hj6.y, l46Var7, u8aVarM);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ);
                    j09 j09VarB0 = ynb.b0(32.0f, 0.0f, g09Var, 2);
                    String strQ3 = afc.q(R.string.personality_who_are_you, l46Var7);
                    mue mueVar = pue.a;
                    nte.b(strQ3, j09VarB0, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.q(l46Var7), 0L, 0L, null, ((y8b) l46Var7.k(x8b.a)).a, 0L, null, 0, w6c.k(22.5d), null, null, 16646111), l46Var7, 48, 0, 130044);
                    o5c.f(l46Var7, b.d(g09Var, 32.0f));
                    j09 j09VarB1 = ynb.b0(32.0f, 0.0f, g09Var, 2);
                    l46Var7.f0(-417474811);
                    i00 i00Var = new i00();
                    i00Var.f(afc.q(R.string.personality_start_revealing, l46Var7));
                    i00Var.f("\n");
                    i00Var.f(afc.q(R.string.personality_your, l46Var7));
                    if (c5e.C(vd8.a(), "en", false)) {
                        i00Var.f("\n");
                    }
                    l46Var7.f0(-417465897);
                    int iK = i00Var.k(new xtd(((m82) l46Var7.k(o82.a)).a, w6c.l(40), null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65532));
                    try {
                        i00Var.f(afc.q(R.string.personality_tarot_personality, l46Var7));
                        i00Var.h(iK);
                        l46Var7.r(false);
                        k00 k00VarL = i00Var.l();
                        l46Var7.r(false);
                        nte.c(k00VarL, j09VarB1, 0L, 0L, null, null, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, pue.m(l46Var7), l46Var7, 48, 0, 261116);
                        l46Var7.r(true);
                        FillElement fillElement = b.c;
                        fy9 fy9VarA = od4.A(R.drawable.card_cover, 0, l46Var7);
                        boolean zI2 = l46Var7.i(jx4Var) | l46Var7.g(a26Var2);
                        Object objR2 = l46Var7.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new ek9(12, jx4Var, a26Var2);
                            l46Var7.p0(objR2);
                        }
                        m93.k(fillElement, fy9VarA, 30, 0.0f, 0.0f, (x16) objR2, l46Var7, 454);
                    } catch (Throwable th) {
                        i00Var.h(iK);
                        throw th;
                    }
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 8:
                kxa kxaVar = (kxa) obj4;
                int iIntValue8 = ((Integer) obj).intValue();
                String str = (String) obj2;
                ub9 ub9Var = (ub9) obj3;
                str.getClass();
                ub9Var.getClass();
                Object obj6 = ((Map) obj5).get(str);
                obj6.getClass();
                List list = (List) obj6;
                int iOrdinal = (((ub9Var instanceof r72) || ((xn7) kxaVar.a).e().j(iIntValue8)) ? f7c.b : f7c.a).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        kxaVar.a(str, (String) it.next());
                    }
                } else {
                    if (list.size() != 1) {
                        StringBuilder sbP = tec.p("Expected one value for argument ", str, ", found ");
                        sbP.append(list.size());
                        sbP.append("values instead.");
                        throw new IllegalArgumentException(sbP.toString().toString());
                    }
                    kxaVar.c = ((String) kxaVar.c) + '/' + ((String) s72.v0(list));
                }
                return wefVar;
            case 9:
                use useVar = (use) obj5;
                pmc pmcVar = (pmc) obj4;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var8 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= l46Var8.g(xw9Var) ? 4 : 2;
                }
                if (l46Var8.W(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    j09 j09VarB2 = ynb.b0(24.0f, 0.0f, mh3.d0(eb3.E(ynb.Y(b.c(g09Var, 1.0f), xw9Var), xw9Var), mh3.T(l46Var8), false, 14), 2);
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var8, 48);
                    int iHashCode2 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM2 = l46Var8.m();
                    j09 j09VarJ2 = m93.J(l46Var8, j09VarB2);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var8, c92VarA2);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var8, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var8, numValueOf);
                    dec.k(l46Var8);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var8, j09VarJ2);
                    xxb.i(0, l46Var8, null, ks0.h(24.0f, R.string.seasonal_question_title, l46Var8, l46Var8, g09Var));
                    String strH = ks0.h(12.0f, R.string.seasonal_question_subtitle, l46Var8, l46Var8, g09Var);
                    mue mueVar2 = pue.a;
                    nte.b(strH, b.c(g09Var, 1.0f), l8b.d(l46Var8), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var8), l46Var8, 48, 0, 130040);
                    o5c.f(l46Var8, b.d(g09Var, 24.0f));
                    pr4 pr4Var = l8b.a;
                    y6c y6cVarB = a7c.b(k8b.f((e8b) l46Var8.k(pr4Var)) ? 0.0f : 20.0f);
                    j09 j09VarW = db6.w(tm7.o(b.b(0.0f, 140.0f, b.c(g09Var, 1.0f), 1), ((e8b) l46Var8.k(pr4Var)).f, y6cVarB), 0.5f, ((e8b) l46Var8.k(pr4Var)).B, y6cVarB);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode3 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM3 = l46Var8.m();
                    j09 j09VarJ3 = m93.J(l46Var8, j09VarW);
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(he2Var, l46Var8, xn8VarC);
                    dec.l(he2Var2, l46Var8, u8aVarM3);
                    ib8.s(iHashCode3, l46Var8, he2Var3, l46Var8);
                    dec.l(he2Var4, l46Var8, j09VarJ3);
                    tv0.b(useVar, ynb.Z(b.c(g09Var, 1.0f), 24.0f), false, pmcVar, mue.a(pue.c(l46Var8), l8b.b(l46Var8), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, null, new xpe(0, 2), null, null, new dtd(l8b.b(l46Var8)), new aoc(useVar), null, l46Var8, 100687920, 0, 22220);
                    int i4 = 1;
                    ib8.t(l46Var8, true, g09Var, 20.0f, l46Var8);
                    boolean zG2 = l46Var8.g(useVar);
                    Object objR3 = l46Var8.R();
                    if (zG2 || objR3 == i8cVar) {
                        objR3 = new vkc(useVar, i4);
                        l46Var8.p0(objR3);
                    }
                    rrb.e(0, (a26) objR3, l46Var8, null);
                    tec.u(g09Var, 24.0f, l46Var8, true);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                x16 x16Var3 = (x16) obj5;
                fpc fpcVar = (fpc) obj4;
                l46 l46Var9 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var9.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    bm8.h(x16Var3, null, fpcVar != null, null, null, jgb.j, l46Var9, 1572864, 58);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                x16 x16Var4 = (x16) obj5;
                a26 a26Var3 = (a26) obj4;
                l46 l46Var10 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var10.f0(759876635);
                Object objR4 = l46Var10.R();
                if (objR4 == i8cVar) {
                    objR4 = zrd.b(x16Var4);
                    l46Var10.p0(objR4);
                }
                h0e h0eVar2 = (h0e) objR4;
                Object objR5 = l46Var10.R();
                if (objR5 == i8cVar) {
                    hl9 hl9Var = (hl9) h0eVar2.getValue();
                    long j = hl9Var.a;
                    objR5 = new jx(hl9Var, xvc.b, new hl9(xvc.c), 8);
                    l46Var10.p0(objR5);
                }
                jx jxVar = (jx) objR5;
                boolean zI3 = l46Var10.i(jxVar);
                Object objR6 = l46Var10.R();
                if (zI3 || objR6 == i8cVar) {
                    objR6 = new wvc(h0eVar2, jxVar, null);
                    l46Var10.p0(objR6);
                }
                af1.o((l26) objR6, l46Var10, wefVar);
                wz wzVar = jxVar.c;
                boolean zG3 = l46Var10.g(wzVar);
                Object objR7 = l46Var10.R();
                if (zG3 || objR7 == i8cVar) {
                    objR7 = new zk1(i2, wzVar);
                    l46Var10.p0(objR7);
                }
                j09 j09Var = (j09) a26Var3.d((x16) objR7);
                l46Var10.r(false);
                return j09Var;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                dc9 dc9Var = (dc9) obj5;
                qna qnaVar = (qna) obj4;
                l46 l46Var11 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var11.W(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    c4d c4dVar = c4d.F0;
                    boolean zI4 = l46Var11.i(dc9Var);
                    Object objR8 = l46Var11.R();
                    if (zI4 || objR8 == i8cVar) {
                        objR8 = new l8(dc9Var, 9);
                        l46Var11.p0(objR8);
                    }
                    b4d.f(null, c4dVar, null, null, (x16) objR8, l46Var11, 48, 29);
                    jgb.t(0, 0, l46Var11, ynb.b0(we6.e(l46Var11) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                    c4d c4dVar2 = c4d.G0;
                    dd2 dd2VarB0 = af1.b0(234872636, new wf8(25, qnaVar), l46Var11);
                    boolean zI5 = l46Var11.i(dc9Var);
                    Object objR9 = l46Var11.R();
                    if (zI5 || objR9 == i8cVar) {
                        objR9 = new l8(dc9Var, 10);
                        l46Var11.p0(objR9);
                    }
                    b4d.f(null, c4dVar2, null, dd2VarB0, (x16) objR9, l46Var11, 24624, 13);
                    l46Var11.f0(798310049);
                    l46Var11.r(false);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj5;
                x16 x16Var5 = (x16) obj4;
                l46 l46Var12 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var12.W(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    l46Var12.Z();
                } else if (k8b.e((e8b) l46Var12.k(l8b.a))) {
                    l46Var12.f0(-622724653);
                    b4d.a(tarotSkinIdentify, x16Var5, l46Var12, 0);
                    l46Var12.r(false);
                } else {
                    l46Var12.f0(-622660142);
                    b4d.d(tarotSkinIdentify, x16Var5, l46Var12, 0);
                    l46Var12.r(false);
                }
                return wefVar;
            case 14:
                dc9 dc9Var2 = (dc9) obj5;
                Context context = (Context) obj4;
                l46 l46Var13 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var13.W(1 & iIntValue13, (iIntValue13 & 17) != 16)) {
                    c4d c4dVar3 = c4d.X;
                    boolean zI6 = l46Var13.i(dc9Var2);
                    Object objR10 = l46Var13.R();
                    if (zI6 || objR10 == i8cVar) {
                        objR10 = new l8(dc9Var2, 13);
                        l46Var13.p0(objR10);
                    }
                    b4d.f(null, c4dVar3, null, null, (x16) objR10, l46Var13, 48, 29);
                    jgb.t(0, 0, l46Var13, ynb.b0(we6.e(l46Var13) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                    c4d c4dVar4 = c4d.Y;
                    boolean zI7 = l46Var13.i(context);
                    Object objR11 = l46Var13.R();
                    if (zI7 || objR11 == i8cVar) {
                        objR11 = new y3d(context, 5);
                        l46Var13.p0(objR11);
                    }
                    b4d.f(null, c4dVar4, null, null, (x16) objR11, l46Var13, 48, 29);
                    jgb.t(0, 0, l46Var13, ynb.b0(we6.e(l46Var13) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                    c4d c4dVar5 = c4d.Z;
                    boolean zI8 = l46Var13.i(dc9Var2);
                    Object objR12 = l46Var13.R();
                    if (zI8 || objR12 == i8cVar) {
                        objR12 = new l8(dc9Var2, i2);
                        l46Var13.p0(objR12);
                    }
                    b4d.f(null, c4dVar5, null, null, (x16) objR12, l46Var13, 48, 29);
                    jgb.t(0, 0, l46Var13, ynb.b0(we6.e(l46Var13) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                    c4d c4dVar6 = c4d.E0;
                    boolean zI9 = l46Var13.i(dc9Var2);
                    Object objR13 = l46Var13.R();
                    if (zI9 || objR13 == i8cVar) {
                        objR13 = new l8(dc9Var2, 15);
                        l46Var13.p0(objR13);
                    }
                    b4d.f(null, c4dVar6, null, null, (x16) objR13, l46Var13, 48, 29);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 15:
                zke zkeVar = (zke) obj5;
                a26 a26Var4 = (a26) obj4;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var14 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= l46Var14.g(xw9Var2) ? 4 : 2;
                }
                if (l46Var14.W(1 & iIntValue14, (iIntValue14 & 19) != 18)) {
                    j09 j09VarY = ynb.Y(g09Var, xw9Var2);
                    List listB1 = s72.b1(zkeVar.b, new kv8(i2));
                    boolean zG4 = l46Var14.g(a26Var4);
                    Object objR14 = l46Var14.R();
                    if (zG4 || objR14 == i8cVar) {
                        objR14 = new hy0(a26Var4, 17);
                        l46Var14.p0(objR14);
                    }
                    aic.a(0, (a26) objR14, l46Var14, j09VarY, listB1);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Spannable spannable = (Spannable) obj5;
                wt wtVar = (wt) obj4;
                xtd xtdVar = (xtd) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int iIntValue16 = ((Integer) obj3).intValue();
                yp5 yp5Var = xtdVar.f;
                ar5 ar5Var = xtdVar.c;
                if (ar5Var == null) {
                    ar5Var = ar5.w;
                }
                wq5 wq5Var = xtdVar.d;
                int i5 = wq5Var != null ? wq5Var.a : 0;
                xq5 xq5Var = xtdVar.e;
                int i6 = xq5Var != null ? xq5Var.a : 65535;
                xt xtVar = (xt) wtVar.b;
                l9f l9fVarB = ((zp5) xtVar.e).b(yp5Var, ar5Var, i5, i6);
                if (l9fVarB instanceof k9f) {
                    Object obj7 = ((k9f) l9fVarB).a;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                } else {
                    psd psdVar = new psd(l9fVarB, xtVar.x);
                    xtVar.x = psdVar;
                    Object obj8 = psdVar.c;
                    obj8.getClass();
                    typeface = (Typeface) obj8;
                }
                spannable.setSpan(new bq5(1, typeface), iIntValue15, iIntValue16, 33);
                return wefVar;
            case 17:
                return a(obj, obj2, obj3);
            case 18:
                fl0 fl0Var = (fl0) obj5;
                t69 t69Var = (t69) obj4;
                l46 l46Var15 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var15.f0(-102778667);
                Object objR15 = l46Var15.R();
                if (objR15 == i8cVar) {
                    objR15 = af1.E(l46Var15);
                    l46Var15.p0(objR15);
                }
                aw2 aw2Var = (aw2) objR15;
                Object objR16 = l46Var15.R();
                if (objR16 == i8cVar) {
                    objR16 = q1c.f(null);
                    l46Var15.p0(objR16);
                }
                e89 e89Var = (e89) objR16;
                e89 e89VarI = q1c.i(fl0Var, l46Var15);
                boolean zG5 = l46Var15.g(t69Var);
                Object objR17 = l46Var15.R();
                if (zG5 || objR17 == i8cVar) {
                    objR17 = new i2e(8, e89Var, t69Var);
                    l46Var15.p0(objR17);
                }
                af1.g(t69Var, (a26) objR17, l46Var15);
                boolean zI10 = l46Var15.i(aw2Var) | l46Var15.g(t69Var) | l46Var15.g(e89VarI);
                Object objR18 = l46Var15.R();
                if (zI10 || objR18 == i8cVar) {
                    pl4 pl4Var = new pl4(aw2Var, e89Var, t69Var, e89VarI, 2);
                    l46Var15.p0(pl4Var);
                    objR18 = pl4Var;
                }
                j09 j09VarA = ibe.a(g09Var, t69Var, (PointerInputEventHandler) objR18);
                l46Var15.r(false);
                return j09VarA;
            case 19:
                return e(obj, obj2, obj3);
            case 20:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return i(obj, obj2, obj3);
            default:
                o8b o8bVar = (o8b) obj5;
                c3g c3gVar = (c3g) obj4;
                l46 l46Var16 = (l46) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var16.W(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var16, 54);
                    int iHashCode4 = Long.hashCode(l46Var16.T);
                    u8a u8aVarM4 = l46Var16.m();
                    j09 j09VarJ4 = m93.J(l46Var16, j09VarC);
                    lf2.q.getClass();
                    l46Var16.j0();
                    if (l46Var16.S) {
                        l46Var16.l(ov7Var);
                    } else {
                        l46Var16.s0();
                    }
                    dec.l(hj6.z, l46Var16, c92VarA3);
                    dec.l(hj6.y, l46Var16, u8aVarM4);
                    dec.l(hj6.X, l46Var16, Integer.valueOf(iHashCode4));
                    dec.k(l46Var16);
                    dec.l(hj6.x, l46Var16, j09VarJ4);
                    vtb.i(null, null, l46Var16, 0, 3);
                    String strQ4 = afc.q(R.string.onboarding_welcome_journey_tips, l46Var16);
                    mue mueVar3 = pue.a;
                    nte.b(strQ4, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var16), l46Var16, 0, 0, 131070);
                    String strQ5 = afc.q(R.string.onboarding_pronunciation_button, l46Var16);
                    boolean z3 = !((Boolean) c3gVar.c.getValue()).booleanValue();
                    boolean zG6 = l46Var16.g(c3gVar);
                    Object objR19 = l46Var16.R();
                    if (zG6 || objR19 == i8cVar) {
                        objR19 = new ihf(0, c3gVar, c3g.class, "start", "start()Z", 0, 5);
                        l46Var16.p0(objR19);
                    }
                    vtb.a(strQ5, "onboarding_opening_page", null, 0.0f, o8bVar, z3, (x16) ((ym7) objR19), null, l46Var16, 3120, 132);
                    l46Var16.r(true);
                } else {
                    l46Var16.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ s19(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
