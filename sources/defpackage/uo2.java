package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import ai.askquin.ui.feedback.FeedbackReason;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import com.adjust.sdk.sig.r3;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uo2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uo2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x16
    public final Object invoke() throws InterruptedException {
        kz5 kz5Var;
        Bitmap.Config config;
        int i = this.a;
        int i2 = 3;
        int i3 = 0;
        wef wefVar = wef.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a06 a06Var = (a06) obj;
                a06Var.getClass();
                if (!a06Var.b) {
                    a06Var.b = true;
                    zp2.a.d("later");
                    a06Var.a.invoke();
                }
                return wefVar;
            case 1:
                return Boolean.valueOf(((rab) ((wt2) obj).b).e());
            case 2:
                x1f x1fVar = x1f.a;
                x1f.h("conversation_established", m1f.a, new xq2(i3, (Map) obj));
                return wefVar;
            case 3:
                return db6.A0(((mmb) obj).element);
            case 4:
                return ((r38) obj).d();
            case 5:
                return new pqe((ks9) obj, 0.0f);
            case 6:
                return ((c13) obj).a();
            case 7:
                return db6.A0((DailyCardBasicInfo) obj);
            case 8:
                return Float.valueOf(mh3.n(((cod) obj).c, 0.0f, 1.0f));
            case 9:
                return Float.valueOf(((hmd) obj).b);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return Float.valueOf(((ak3) obj).d);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Float.valueOf(((zj3) obj).c);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((hne) obj).close();
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                fcb fcbVar = (fcb) obj;
                ynb.V(fcbVar.b, null, null, new ecb(fcbVar, null), 3);
                return wefVar;
            case 14:
                kzd kzdVar = (kzd) obj;
                ynb.V(hwf.a(kzdVar.b), null, null, new jzd(kzdVar, null), 3);
                return wefVar;
            case 15:
                ((bo5) ((xn5) obj)).c(8, true, true);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new bo4((DrawablePainter) obj);
            case 17:
                return db6.A0((TarotSkinIdentify) obj);
            case 18:
                return Boolean.valueOf(((jsd) obj).contains(FeedbackReason.Other));
            case 19:
                ((vg5) obj).a.await();
                return wefVar;
            case 20:
                ((oo5) obj).n1();
                return wefVar;
            case 21:
                return db6.A0((yic) obj);
            case 22:
                lz5 lz5Var = (lz5) obj;
                Context context = lz5Var.a;
                String str = lz5Var.b;
                if (str == null || !lz5Var.d) {
                    kz5Var = new kz5(context, lz5Var.b, new kb6(16), lz5Var.c, lz5Var.e);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    kz5Var = new kz5(context, new File(noBackupFilesDir, str).getAbsolutePath(), new kb6(16), lz5Var.c, lz5Var.e);
                }
                kz5Var.setWriteAheadLoggingEnabled(lz5Var.g);
                return kz5Var;
            case 23:
                p76 p76Var = (p76) obj;
                ax6 ax6Var = p76Var.a;
                as9 as9Var = p76Var.b;
                ax6 ax6VarR = kn2.R(ax6Var, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(ax6VarR.P0().Y0());
                    cgg.t(ax6VarR, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        qc0.p("Failed to decode GIF.");
                        return null;
                    }
                    if (movieDecodeStream.isOpaque() && ((Boolean) b21.A(as9Var, yw6.g)).booleanValue()) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = qk2.G(yw6.a(as9Var)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) b21.A(as9Var, yw6.b);
                    }
                    h49 h49Var = new h49(movieDecodeStream, config, as9Var.c);
                    q95 q95Var = tw6.a;
                    if (((Number) b21.A(as9Var, q95Var)).intValue() != -2) {
                        int iIntValue = ((Number) b21.A(as9Var, q95Var)).intValue();
                        if (iIntValue < -1) {
                            qc0.o(tec.e(iIntValue, "Invalid repeatCount: "));
                            return null;
                        }
                        h49Var.F0 = iIntValue;
                    }
                    x16 x16Var = (x16) b21.A(as9Var, tw6.c);
                    x16 x16Var2 = (x16) b21.A(as9Var, tw6.d);
                    if (x16Var != null || x16Var2 != null) {
                        h49Var.e.add(new arf(x16Var, x16Var2));
                    }
                    if (b21.A(as9Var, tw6.b) != null) {
                        r3.f();
                        return null;
                    }
                    h49Var.G0 = null;
                    h49Var.H0 = aea.a;
                    h49Var.I0 = false;
                    h49Var.invalidateSelf();
                    return new jm3(y7h.k(h49Var), false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        cgg.t(ax6VarR, th);
                        throw th2;
                    }
                }
            case 24:
                return q1c.f((wa6) obj);
            case 25:
                int iOrdinal = ((gf6) obj).a().ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal == 1) {
                    i2 = 1;
                } else if (iOrdinal == 2) {
                    i2 = 2;
                } else if (iOrdinal != 3) {
                    i2 = 4;
                    if (iOrdinal != 4) {
                        ap.c();
                        return null;
                    }
                }
                return Integer.valueOf(i2);
            case 26:
                return new wh6((xh6) obj);
            case 27:
                gi6 gi6Var = (gi6) obj;
                boolean zIsEmpty = gi6Var.Z.e.isEmpty();
                lyd lydVar = gi6Var.F0;
                if (zIsEmpty) {
                    if (lydVar != null) {
                        lydVar.h(null);
                    }
                    gi6Var.F0 = null;
                } else if (lydVar == null || !lydVar.b()) {
                    gi6Var.F0 = gi6Var.l1();
                }
                return wefVar;
            case 28:
                ol6 ol6Var = (ol6) obj;
                String str2 = ol6Var.f;
                if (str2 != null) {
                    String str3 = ol6Var.g;
                    if (!((Boolean) ol6Var.w.getValue()).booleanValue() && ((Boolean) ol6Var.v.getValue()).booleanValue()) {
                        a62 a62VarA = hwf.a(ol6Var);
                        js3 js3Var = ga4.a;
                        ol6Var.x = ynb.V(a62VarA, hr3.c, null, new kl6(ol6Var, str3, str2, null), 2);
                    }
                }
                return wefVar;
            default:
                ds6 ds6Var = (ds6) obj;
                ds6Var.getClass();
                try {
                    ds6Var.L0.E(2, 0, false);
                    break;
                } catch (IOException e) {
                    ay4 ay4Var = ay4.PROTOCOL_ERROR;
                    ds6Var.b(ay4Var, ay4Var, e);
                }
                return wefVar;
        }
    }
}
