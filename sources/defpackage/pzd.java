package defpackage;

import ai.askquin.datastore.model.UserProfile;
import ai.askquin.ui.web.WebViewActivity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pzd implements ned, oo8, odc, ov2, hec, czc, fy2, ifg, cfg, j8e, pqg, msg {
    public final /* synthetic */ int a;
    public static final /* synthetic */ pzd b = new pzd(16);
    public static final /* synthetic */ pzd c = new pzd(18);
    public static final /* synthetic */ pzd d = new pzd(19);
    public static final /* synthetic */ pzd e = new pzd(20);
    public static final /* synthetic */ pzd f = new pzd(21);
    public static final /* synthetic */ pzd g = new pzd(22);
    public static final /* synthetic */ pzd v = new pzd(23);
    public static final /* synthetic */ pzd w = new pzd(24);
    public static final /* synthetic */ pzd x = new pzd(25);
    public static final /* synthetic */ pzd y = new pzd(26);
    public static final /* synthetic */ pzd z = new pzd(27);
    public static final /* synthetic */ pzd X = new pzd(28);
    public static final /* synthetic */ pzd Y = new pzd(29);

    public /* synthetic */ pzd(int i) {
        this.a = i;
    }

    public static MediaCodec c(hbc hbcVar) throws IOException {
        String str = ((to8) hbcVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static la5 g(int i) {
        mx4 mx4Var = la5.b;
        return (la5) mx4Var.get(mh3.o(i - 1, 0, mx4Var.c() - 1));
    }

    public static ale h(String str) {
        Object next;
        str.getClass();
        mx4 mx4Var = ale.d;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((ale) next).getId(), str)) {
                return (ale) next;
            }
        }
        next = null;
        return (ale) next;
    }

    public static void i(Context context, String str, ozd ozdVar, x0g x0gVar) {
        context.getClass();
        str.getClass();
        ozdVar.getClass();
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("extra_url", str);
        intent.putExtra("extra_action_type", ozdVar);
        intent.putExtra("extra_preset", x0gVar);
        context.startActivity(intent);
    }

    public static int k(int i) {
        if (i <= 5) {
            return 1;
        }
        return i <= 9 ? 2 : 3;
    }

    public static final zmg l(long j, Object obj) {
        zmg zmgVar = (zmg) iog.h(j, obj);
        if (((rlg) zmgVar).a) {
            return zmgVar;
        }
        int size = zmgVar.size();
        zmg zmgVarK0 = zmgVar.k0(size == 0 ? 10 : size + size);
        iog.i(j, obj, zmgVarK0);
        return zmgVarK0;
    }

    @Override // defpackage.czc
    public Object B(FileInputStream fileInputStream) {
        return fzc.a.b(UserProfile.Companion.serializer(), new String(lmg.p0(fileInputStream), ox1.a));
    }

    @Override // defpackage.pqg
    public /* synthetic */ String M(String str, String str2) {
        return null;
    }

    @Override // defpackage.odc
    public Object N(pcc pccVar, Object obj) {
        uzd uzdVar;
        ibf ibfVar = (ibf) obj;
        c78 c78VarW = t72.w();
        c78VarW.add(Integer.valueOf(ibfVar.a));
        jsd jsdVar = ibfVar.b;
        c78VarW.add(Integer.valueOf(jsdVar.size()));
        jsd jsdVar2 = ibfVar.c;
        c78VarW.add(Integer.valueOf(jsdVar2.size()));
        int size = jsdVar.size();
        int i = 0;
        while (true) {
            uzdVar = vue.i;
            if (i >= size) {
                break;
            }
            c78VarW.add(uzdVar.N(pccVar, jsdVar.get(i)));
            i++;
        }
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c78VarW.add(uzdVar.N(pccVar, jsdVar2.get(i2)));
        }
        return c78VarW.n();
    }

    @Override // defpackage.ned
    public wj5 a(c7e c7eVar) {
        return new sc3(2, led.a);
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 19:
                ((yog) tog.b.a.get()).getClass();
                return new Boolean(((Boolean) yog.b.get()).booleanValue());
            case 20:
                List list = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 21:
                List list2 = bzg.a;
                ((cpg) bpg.b.a.get()).getClass();
                return (String) cpg.b.get();
            case 22:
                List list3 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 23:
                List list4 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 24:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case 25:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 26:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 27:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(63, 43200000L, "measurement.upload.backoff_period").get();
            case 28:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(9, 1000L, "measurement.upload.debug_upload_interval").get();
            default:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
        }
    }

    @Override // defpackage.hec
    public q68 d(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = i + 3;
        if (i4 >= charSequence.length() || charSequence.charAt(i + 1) != '/' || charSequence.charAt(i + 2) != '/') {
            return null;
        }
        int i5 = -1;
        int i6 = -1;
        for (int i7 = i - 1; i7 >= i2; i7--) {
            char cCharAt = charSequence.charAt(i7);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt != '+' && cCharAt != '-' && cCharAt != '.') {
                        break;
                    }
                } else {
                    i6 = i7;
                }
            } else {
                i5 = i7;
            }
        }
        if (i5 > 0 && i5 - 1 == i6) {
            i5 = -1;
        }
        if (i5 == -1 || (i3 = iec.i(charSequence, i4)) == -1) {
            return null;
        }
        return new q68(s68.a, i5, i3 + 1);
    }

    @Override // defpackage.czc
    public Object e() {
        UserProfile.Companion.getClass();
        return UserProfile.EMPTY;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // defpackage.oo8
    public po8 f(hbc hbcVar) throws Throwable {
        MediaCodec mediaCodecC = null;
        try {
            mediaCodecC = c(hbcVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) hbcVar.d;
            mediaCodecC.configure((MediaFormat) hbcVar.b, surface, (MediaCrypto) hbcVar.e, (surface == null && ((to8) hbcVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecC.start();
            Trace.endSection();
            return new zi8(mediaCodecC, (zi8) hbcVar.f);
        } catch (IOException e2) {
            e = e2;
            if (mediaCodecC != null) {
                mediaCodecC.release();
            }
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            if (mediaCodecC != null) {
                mediaCodecC.release();
            }
            throw e;
        }
    }

    @Override // defpackage.j8e
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = w7c.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.d(bundle) : Tasks.d(null);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SharingStarted.Eagerly";
            case 1:
                return "ReusedSlotId";
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                int iHashCode = hashCode();
                tq.o(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return tec.m("CreationExtras.Key@", string, "<", job.a.b(Application.class).r(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.odc
    public Object v(Object obj) {
        uzd uzdVar;
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        int iIntValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        obj4.getClass();
        int iIntValue3 = ((Integer) obj4).intValue();
        c78 c78VarW = t72.w();
        int i = 3;
        while (true) {
            int i2 = iIntValue2 + 3;
            uzdVar = vue.i;
            if (i >= i2) {
                break;
            }
            c78VarW.add(uzdVar.v(list.get(i)));
            i++;
        }
        c78 c78VarN = c78VarW.n();
        c78 c78VarW2 = t72.w();
        while (i < iIntValue2 + iIntValue3 + 3) {
            c78VarW2.add(uzdVar.v(list.get(i)));
            i++;
        }
        return new ibf(c78VarN, c78VarW2.n(), iIntValue);
    }

    @Override // defpackage.czc
    public Object v0(Object obj, abf abfVar, ke5 ke5Var) {
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(hr3.c, new dpf(abfVar, (UserProfile) obj, null), ke5Var);
        return objP0 == bw2.a ? objP0 : wef.a;
    }

    @Override // defpackage.cfg
    public /* synthetic */ Object a() {
        return new egg();
    }

    @Override // defpackage.ifg
    public int a(int i) {
        return i;
    }
}
