package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.adjust.sdk.sig.r3;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.b1;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import tech.chatmind.api.Period;
import tech.chatmind.api.PeriodUnit;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y41 {
    public static final dd2 d;
    public static final dd2 e;
    public static Map p;
    public static final dd2 a = new dd2(new gd2(11), false, 8538263);
    public static final dd2 b = new dd2(new a7(23), false, 393747899);
    public static final dd2 c = new dd2(new ed2(1), false, -642107515);
    public static final int[] f = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] g = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] h = {64, 112, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 192, 224, 256, 384, 448, 512, 640, 768, 896, UserMetadata.MAX_ATTRIBUTE_SIZE, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] i = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] j = {5, 8, 10, 12};
    public static final int[] k = {6, 9, 12, 15};
    public static final int[] l = {2, 4, 6, 8};
    public static final int[] m = {9, 11, 13, 16};
    public static final int[] n = {5, 8, 10, 12};
    public static final Object o = new Object();

    static {
        int i2 = 20;
        d = new dd2(new xd2(i2), false, -1110249952);
        e = new dd2(new ce2(i2), false, 755225592);
    }

    public static final j09 A(j09 j09Var, sn7 sn7Var, k08 k08Var, ks9 ks9Var, boolean z) {
        return j09Var.D(new n08(sn7Var, k08Var, ks9Var, z));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[PHI: r6
  0x00db: PHI (r6v22 java.lang.String) = (r6v21 java.lang.String), (r6v34 java.lang.String) binds: [B:46:0x00c3, B:50:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    public static void B(Intent intent) {
        int iIntValue;
        int i2;
        String string;
        mu8 mu8Var;
        String string2;
        byte b2;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j2;
        long j3;
        ff5 ff5VarD;
        wf5 wf5Var;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (R(intent)) {
            C("_nr", intent.getExtras());
        }
        int i3 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : i()) {
            y3f y3fVar = (y3f) FirebaseMessaging.m.get();
            if (y3fVar == null) {
                b1.d("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            ou8 ou8Var = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            b1.l("FirebaseMessaging", "Invalid TTL: " + obj);
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            ff5 ff5VarD2 = ff5.d();
                            try {
                                Object obj2 = nf5.l;
                                string = (String) Tasks.a(((nf5) ff5VarD2.b(of5.class)).c());
                            } catch (InterruptedException e2) {
                                e = e2;
                                yg5.p(e);
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            e = e3;
                        }
                    }
                    String str10 = string;
                    ff5 ff5VarD3 = ff5.d();
                    ff5VarD3.a();
                    String packageName = ff5VarD3.a.getPackageName();
                    if (vd9.A(extras)) {
                        mu8Var = mu8.DISPLAY_NOTIFICATION;
                    } else {
                        mu8Var = mu8.DATA_MESSAGE;
                    }
                    mu8 mu8Var2 = mu8Var;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if (Constants.HIGH.equals(string2)) {
                            b2 = 1;
                        } else if (Constants.NORMAL.equals(string2)) {
                            b2 = 2;
                        } else {
                            b2 = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        b2 = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if (Constants.HIGH.equals(string2)) {
                            b2 = 1;
                        } else if (Constants.NORMAL.equals(string2)) {
                            b2 = 2;
                        } else {
                            b2 = 0;
                        }
                    }
                    if (b2 == 2) {
                        i3 = 5;
                    } else if (b2 == 1) {
                        i3 = 10;
                    }
                    int i4 = i3;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j2 = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e4) {
                            b1.n("FirebaseMessaging", "error parsing project number", e4);
                            ff5VarD = ff5.d();
                            wf5Var = ff5VarD.c;
                            ff5VarD.a();
                            str6 = wf5Var.e;
                            if (str6 != null) {
                                try {
                                    j2 = Long.parseLong(str6);
                                } catch (NumberFormatException e5) {
                                    b1.n("FirebaseMessaging", "error parsing sender ID", e5);
                                    ff5VarD.a();
                                    str7 = wf5Var.b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j2 = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j2 = 0;
                                            } else {
                                                try {
                                                    j2 = Long.parseLong(str8);
                                                } catch (NumberFormatException e6) {
                                                    b1.n("FirebaseMessaging", "error parsing app ID", e6);
                                                    j2 = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j2 = Long.parseLong(str7);
                                        } catch (NumberFormatException e7) {
                                            b1.n("FirebaseMessaging", "error parsing app ID", e7);
                                            j2 = 0;
                                        }
                                    }
                                }
                            } else {
                                ff5VarD.a();
                                str7 = wf5Var.b;
                                if (str7.startsWith("1:")) {
                                    j2 = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j2 = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j2 = 0;
                                        } else {
                                            j2 = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        ff5VarD = ff5.d();
                        wf5Var = ff5VarD.c;
                        ff5VarD.a();
                        str6 = wf5Var.e;
                        if (str6 != null) {
                            j2 = Long.parseLong(str6);
                        } else {
                            ff5VarD.a();
                            str7 = wf5Var.b;
                            if (str7.startsWith("1:")) {
                                j2 = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j2 = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j2 = 0;
                                    } else {
                                        j2 = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    if (j2 > 0) {
                        j3 = j2;
                    } else {
                        j3 = 0;
                    }
                    ou8Var = new ou8(j3, str, str10, mu8Var2, packageName, str3, i4, i2, str2, str4, str5);
                }
                i2 = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    ff5 ff5VarD4 = ff5.d();
                    Object obj3 = nf5.l;
                    string = (String) Tasks.a(((nf5) ff5VarD4.b(of5.class)).c());
                }
                String str11 = string;
                ff5 ff5VarD5 = ff5.d();
                ff5VarD5.a();
                String packageName2 = ff5VarD5.a.getPackageName();
                if (vd9.A(extras)) {
                    mu8Var = mu8.DISPLAY_NOTIFICATION;
                } else {
                    mu8Var = mu8.DATA_MESSAGE;
                }
                mu8 mu8Var3 = mu8Var;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if (Constants.HIGH.equals(string2)) {
                        b2 = 1;
                    } else if (Constants.NORMAL.equals(string2)) {
                        b2 = 2;
                    } else {
                        b2 = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    b2 = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if (Constants.HIGH.equals(string2)) {
                        b2 = 1;
                    } else if (Constants.NORMAL.equals(string2)) {
                        b2 = 2;
                    } else {
                        b2 = 0;
                    }
                }
                if (b2 == 2) {
                    i3 = 5;
                } else if (b2 == 1) {
                    i3 = 10;
                }
                int i5 = i3;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j2 = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    ff5VarD = ff5.d();
                    wf5Var = ff5VarD.c;
                    ff5VarD.a();
                    str6 = wf5Var.e;
                    if (str6 != null) {
                        j2 = Long.parseLong(str6);
                    } else {
                        ff5VarD.a();
                        str7 = wf5Var.b;
                        if (str7.startsWith("1:")) {
                            j2 = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j2 = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j2 = 0;
                                } else {
                                    j2 = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j2 > 0) {
                    j3 = j2;
                } else {
                    j3 = 0;
                }
                ou8Var = new ou8(j3, str, str11, mu8Var3, packageName2, str3, i5, i2, str2, str4, str5);
            }
            if (ou8Var == null) {
                return;
            }
            try {
                ((z3f) y3fVar).a("FCM_CLIENT_EVENT_LOGGING", new jv4("proto"), new ho7(13)).a(new vo0(new pu8(ou8Var), lua.a, new yp0(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new cva(25));
            } catch (RuntimeException e8) {
                b1.n("FirebaseMessaging", "Failed to send big query analytics payload.", e8);
            }
        }
    }

    public static void C(String str, Bundle bundle) {
        try {
            ff5.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    b1.n("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e3) {
                    b1.n("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = vd9.A(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            ml mlVar = (ml) ff5.d().b(ml.class);
            if (mlVar != null) {
                ((nl) mlVar).a("fcm", str, bundle2);
            } else {
                b1.l("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            b1.d("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:36:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object D(Context context, ji8 ji8Var, String str, String str2, String str3, String str4, zn2 zn2Var) {
        spb spbVar;
        String str5;
        String str6;
        Context context2;
        String str7;
        Object objP0;
        String str8;
        uh8 uh8Var;
        Context context3;
        String str9;
        Object objP1;
        if (zn2Var instanceof spb) {
            spbVar = (spb) zn2Var;
            int i2 = spbVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                spbVar.label = i2 - Integer.MIN_VALUE;
            } else {
                spbVar = new spb(zn2Var);
            }
        } else {
            spbVar = new spb(zn2Var);
        }
        Object objT = spbVar.result;
        int i3 = spbVar.label;
        Object obj = wef.a;
        int i4 = 1;
        bw2 bw2Var = bw2.a;
        if (i3 == 0) {
            jzb.q(objT);
            vi8 vi8VarE = E(context, ji8Var, str4);
            spbVar.L$0 = context;
            str5 = str;
            spbVar.L$1 = str5;
            spbVar.L$2 = str2;
            str6 = str3;
            spbVar.L$3 = str6;
            spbVar.label = 1;
            pl1 pl1Var = new pl1(1, k99.D(spbVar));
            pl1Var.v();
            vi8VarE.b(new ppb(pl1Var, 0));
            vi8VarE.a(new ppb(pl1Var, i4));
            objT = pl1Var.t();
            if (objT != bw2Var) {
                context2 = context;
                str7 = str2;
            }
            return bw2Var;
        }
        if (i3 == 1) {
            String str10 = (String) spbVar.L$3;
            String str11 = (String) spbVar.L$2;
            String str12 = (String) spbVar.L$1;
            context2 = (Context) spbVar.L$0;
            jzb.q(objT);
            str6 = str10;
            str7 = str11;
            str5 = str12;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uh8 uh8Var2 = (uh8) spbVar.L$0;
                jzb.q(objT);
                return uh8Var2;
            }
            uh8Var = (uh8) spbVar.L$3;
            str9 = (String) spbVar.L$2;
            str8 = (String) spbVar.L$1;
            context3 = (Context) spbVar.L$0;
            jzb.q(objT);
        }
        spbVar.L$0 = uh8Var;
        spbVar.L$1 = null;
        spbVar.L$2 = null;
        spbVar.L$3 = null;
        spbVar.label = 3;
        if (!uh8Var.f.isEmpty()) {
            js3 js3Var = ga4.a;
            Context context4 = context3;
            objP1 = ynb.p0(hr3.c, new qpb(uh8Var, context4, str8, str9, null), spbVar);
            if (objP1 == bw2Var) {
                obj = objP1;
            }
        }
        if (obj != bw2Var) {
            return bw2Var;
        }
        return uh8Var;
        uh8 uh8Var3 = (uh8) objT;
        spbVar.L$0 = context2;
        spbVar.L$1 = str7;
        spbVar.L$2 = str6;
        spbVar.L$3 = uh8Var3;
        spbVar.label = 2;
        if (uh8Var3.d.isEmpty()) {
            objP0 = obj;
        } else {
            js3 js3Var2 = ga4.a;
            objP0 = ynb.p0(hr3.c, new rpb(uh8Var3, context2, str5, null), spbVar);
            if (objP0 != bw2Var) {
                objP0 = obj;
            }
        }
        if (objP0 != bw2Var) {
            str8 = str7;
            uh8Var = uh8Var3;
            context3 = context2;
            str9 = str6;
            spbVar.L$0 = uh8Var;
            spbVar.L$1 = null;
            spbVar.L$2 = null;
            spbVar.L$3 = null;
            spbVar.label = 3;
            if (!uh8Var.f.isEmpty()) {
                js3 js3Var3 = ga4.a;
                Context context5 = context3;
                objP1 = ynb.p0(hr3.c, new qpb(uh8Var, context5, str8, str9, null), spbVar);
                if (objP1 == bw2Var) {
                    obj = objP1;
                }
            }
            if (obj != bw2Var) {
                return uh8Var;
            }
        }
        return bw2Var;
    }

    public static final vi8 E(final Context context, ji8 ji8Var, final String str) {
        if (ji8Var instanceof hi8) {
            if (!pa7.t(str, "__LottieInternalDefaultCacheKey__")) {
                final int i2 = ((hi8) ji8Var).a;
                HashMap map = zh8.a;
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                return zh8.a(str, new Callable() { // from class: xh8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i3 = i2;
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        String str2 = str;
                        uh8 uh8VarA = str2 == null ? null : vh8.b.a(str2);
                        if (uh8VarA != null) {
                            return new ti8(uh8VarA);
                        }
                        try {
                            yhb yhbVar = new yhb(z5c.K(context2.getResources().openRawResource(i3)));
                            int i4 = 1;
                            if (zh8.g(yhbVar, zh8.c).booleanValue()) {
                                return zh8.e(context2, new ZipInputStream(new e41(yhbVar, i4)), str2);
                            }
                            if (!zh8.g(yhbVar, zh8.d).booleanValue()) {
                                String[] strArr = cj7.e;
                                return zh8.c(new kj7(yhbVar), str2, true);
                            }
                            try {
                                return zh8.d(z5c.K(new GZIPInputStream(new e41(yhbVar, i4))), str2);
                            } catch (IOException e2) {
                                return new ti8(e2);
                            }
                        } catch (Resources.NotFoundException e3) {
                            return new ti8(e3);
                        }
                    }
                }, null);
            }
            final int i3 = ((hi8) ji8Var).a;
            HashMap map2 = zh8.a;
            final String strH = ub3.h(i3, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
            final WeakReference weakReference2 = new WeakReference(context);
            final Context applicationContext2 = context.getApplicationContext();
            return zh8.a(strH, new Callable() { // from class: xh8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i4 = i3;
                    Context context2 = (Context) weakReference2.get();
                    if (context2 == null) {
                        context2 = applicationContext2;
                    }
                    String str2 = strH;
                    uh8 uh8VarA = str2 == null ? null : vh8.b.a(str2);
                    if (uh8VarA != null) {
                        return new ti8(uh8VarA);
                    }
                    try {
                        yhb yhbVar = new yhb(z5c.K(context2.getResources().openRawResource(i4)));
                        int i5 = 1;
                        if (zh8.g(yhbVar, zh8.c).booleanValue()) {
                            return zh8.e(context2, new ZipInputStream(new e41(yhbVar, i5)), str2);
                        }
                        if (!zh8.g(yhbVar, zh8.d).booleanValue()) {
                            String[] strArr = cj7.e;
                            return zh8.c(new kj7(yhbVar), str2, true);
                        }
                        try {
                            return zh8.d(z5c.K(new GZIPInputStream(new e41(yhbVar, i5))), str2);
                        } catch (IOException e2) {
                            return new ti8(e2);
                        }
                    } catch (Resources.NotFoundException e3) {
                        return new ti8(e3);
                    }
                }
            }, null);
        }
        if (ji8Var instanceof ii8) {
            final int i4 = 0;
            if (!pa7.t(str, "__LottieInternalDefaultCacheKey__")) {
                final String str2 = ((ii8) ji8Var).a;
                return zh8.a(str, new Callable() { // from class: wh8
                    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        uh8 uh8Var;
                        Throwable th;
                        Exception exc;
                        ti8 ti8Var;
                        uh8 uh8Var2;
                        Pair pair;
                        ti8 ti8VarE;
                        kd9 kd9Var;
                        vr3 vr3Var = null;
                        vr3Var = null;
                        switch (i4) {
                            case 0:
                                Context context2 = context;
                                String str3 = str2;
                                String str4 = str;
                                vd9 vd9Var = y7h.l;
                                boolean z = false;
                                if (vd9Var == null) {
                                    synchronized (vd9.class) {
                                        try {
                                            vd9Var = y7h.l;
                                            if (vd9Var == null) {
                                                Context applicationContext3 = context2.getApplicationContext();
                                                kd9 kd9Var2 = y7h.m;
                                                if (kd9Var2 == null) {
                                                    synchronized (kd9.class) {
                                                        try {
                                                            kd9Var = y7h.m;
                                                            if (kd9Var == null) {
                                                                kd9Var = new kd9(0, new cu7(applicationContext3));
                                                                y7h.m = kd9Var;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    kd9Var2 = kd9Var;
                                                }
                                                vd9Var = new vd9(kd9Var2, new gec(24));
                                                y7h.l = vd9Var;
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                if (str4 != null) {
                                    try {
                                        File fileE = ((kd9) vd9Var.b).E(str3);
                                        if (fileE == null) {
                                            pair = null;
                                        } else {
                                            FileInputStream fileInputStreamB = a.b(fileE, new FileInputStream(fileE));
                                            id5 id5Var = fileE.getAbsolutePath().endsWith(".zip") ? id5.ZIP : fileE.getAbsolutePath().endsWith(".gz") ? id5.GZIP : id5.JSON;
                                            fileE.getAbsolutePath();
                                            gf8.a();
                                            pair = new Pair(id5Var, fileInputStreamB);
                                        }
                                    } catch (FileNotFoundException unused) {
                                    }
                                    if (pair == null) {
                                        uh8Var = null;
                                    } else {
                                        id5 id5Var2 = (id5) pair.first;
                                        InputStream inputStream = (InputStream) pair.second;
                                        int iOrdinal = id5Var2.ordinal();
                                        if (iOrdinal == 1) {
                                            ti8VarE = zh8.e(context2, new ZipInputStream(inputStream), str4);
                                        } else if (iOrdinal != 2) {
                                            ti8VarE = zh8.d(z5c.K(inputStream), str4);
                                        } else {
                                            try {
                                                ti8VarE = zh8.d(z5c.K(new GZIPInputStream(inputStream)), str4);
                                            } catch (IOException e2) {
                                                ti8VarE = new ti8(e2);
                                            }
                                        }
                                        uh8Var = ti8VarE.a;
                                        if (uh8Var == null) {
                                            uh8Var = null;
                                        }
                                    }
                                    break;
                                } else {
                                    uh8Var = null;
                                }
                                if (uh8Var != null) {
                                    ti8Var = new ti8(uh8Var);
                                } else {
                                    gf8.a();
                                    gf8.a();
                                    try {
                                        try {
                                            vr3 vr3VarA = gec.A(str3);
                                            try {
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) vr3VarA.b;
                                                try {
                                                    if (httpURLConnection.getResponseCode() / 100 == 2) {
                                                        z = true;
                                                    }
                                                } catch (IOException unused2) {
                                                }
                                                if (z) {
                                                    ti8Var = vd9Var.n(context2, str3, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str4);
                                                    uh8 uh8Var3 = ti8Var.a;
                                                    gf8.a();
                                                } else {
                                                    ti8Var = new ti8(new IllegalArgumentException(vr3VarA.b()));
                                                }
                                                try {
                                                    vr3VarA.close();
                                                } catch (IOException e3) {
                                                    gf8.c("LottieFetchResult close failed ", e3);
                                                }
                                                break;
                                            } catch (Exception e4) {
                                                exc = e4;
                                                vr3Var = vr3VarA;
                                                ti8 ti8Var2 = new ti8(exc);
                                                if (vr3Var != null) {
                                                    try {
                                                        vr3Var.close();
                                                    } catch (IOException e5) {
                                                        gf8.c("LottieFetchResult close failed ", e5);
                                                    }
                                                }
                                                ti8Var = ti8Var2;
                                                break;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                vr3Var = vr3VarA;
                                                if (vr3Var == null) {
                                                    throw th;
                                                }
                                                try {
                                                    vr3Var.close();
                                                    throw th;
                                                } catch (IOException e6) {
                                                    gf8.c("LottieFetchResult close failed ", e6);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Exception e7) {
                                        exc = e7;
                                    }
                                }
                                if (str4 != null && (uh8Var2 = ti8Var.a) != null) {
                                    vh8.b.a.d(str4, uh8Var2);
                                }
                                return ti8Var;
                            default:
                                Context context3 = context;
                                String str5 = str2;
                                String str6 = str;
                                uh8 uh8VarA = str6 != null ? vh8.b.a(str6) : null;
                                if (uh8VarA != null) {
                                    return new ti8(uh8VarA);
                                }
                                try {
                                    return zh8.b(context3, context3.getAssets().open(str5), str6);
                                } catch (IOException e8) {
                                    return new ti8(e8);
                                }
                        }
                    }
                }, null);
            }
            final String str3 = ((ii8) ji8Var).a;
            HashMap map3 = zh8.a;
            final String strConcat = "url_".concat(str3);
            return zh8.a(strConcat, new Callable() { // from class: wh8
                /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    uh8 uh8Var;
                    Throwable th;
                    Exception exc;
                    ti8 ti8Var;
                    uh8 uh8Var2;
                    Pair pair;
                    ti8 ti8VarE;
                    kd9 kd9Var;
                    vr3 vr3Var = null;
                    vr3Var = null;
                    switch (i4) {
                        case 0:
                            Context context2 = context;
                            String str4 = str3;
                            String str5 = strConcat;
                            vd9 vd9Var = y7h.l;
                            boolean z = false;
                            if (vd9Var == null) {
                                synchronized (vd9.class) {
                                    try {
                                        vd9Var = y7h.l;
                                        if (vd9Var == null) {
                                            Context applicationContext3 = context2.getApplicationContext();
                                            kd9 kd9Var2 = y7h.m;
                                            if (kd9Var2 == null) {
                                                synchronized (kd9.class) {
                                                    try {
                                                        kd9Var = y7h.m;
                                                        if (kd9Var == null) {
                                                            kd9Var = new kd9(0, new cu7(applicationContext3));
                                                            y7h.m = kd9Var;
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                    break;
                                                }
                                                kd9Var2 = kd9Var;
                                            }
                                            vd9Var = new vd9(kd9Var2, new gec(24));
                                            y7h.l = vd9Var;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                            if (str5 != null) {
                                try {
                                    File fileE = ((kd9) vd9Var.b).E(str4);
                                    if (fileE == null) {
                                        pair = null;
                                    } else {
                                        FileInputStream fileInputStreamB = a.b(fileE, new FileInputStream(fileE));
                                        id5 id5Var = fileE.getAbsolutePath().endsWith(".zip") ? id5.ZIP : fileE.getAbsolutePath().endsWith(".gz") ? id5.GZIP : id5.JSON;
                                        fileE.getAbsolutePath();
                                        gf8.a();
                                        pair = new Pair(id5Var, fileInputStreamB);
                                    }
                                } catch (FileNotFoundException unused) {
                                }
                                if (pair == null) {
                                    uh8Var = null;
                                } else {
                                    id5 id5Var2 = (id5) pair.first;
                                    InputStream inputStream = (InputStream) pair.second;
                                    int iOrdinal = id5Var2.ordinal();
                                    if (iOrdinal == 1) {
                                        ti8VarE = zh8.e(context2, new ZipInputStream(inputStream), str5);
                                    } else if (iOrdinal != 2) {
                                        ti8VarE = zh8.d(z5c.K(inputStream), str5);
                                    } else {
                                        try {
                                            ti8VarE = zh8.d(z5c.K(new GZIPInputStream(inputStream)), str5);
                                        } catch (IOException e2) {
                                            ti8VarE = new ti8(e2);
                                        }
                                    }
                                    uh8Var = ti8VarE.a;
                                    if (uh8Var == null) {
                                        uh8Var = null;
                                    }
                                }
                                break;
                            } else {
                                uh8Var = null;
                            }
                            if (uh8Var != null) {
                                ti8Var = new ti8(uh8Var);
                            } else {
                                gf8.a();
                                gf8.a();
                                try {
                                    try {
                                        vr3 vr3VarA = gec.A(str4);
                                        try {
                                            HttpURLConnection httpURLConnection = (HttpURLConnection) vr3VarA.b;
                                            try {
                                                if (httpURLConnection.getResponseCode() / 100 == 2) {
                                                    z = true;
                                                }
                                            } catch (IOException unused2) {
                                            }
                                            if (z) {
                                                ti8Var = vd9Var.n(context2, str4, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str5);
                                                uh8 uh8Var3 = ti8Var.a;
                                                gf8.a();
                                            } else {
                                                ti8Var = new ti8(new IllegalArgumentException(vr3VarA.b()));
                                            }
                                            try {
                                                vr3VarA.close();
                                            } catch (IOException e3) {
                                                gf8.c("LottieFetchResult close failed ", e3);
                                            }
                                            break;
                                        } catch (Exception e4) {
                                            exc = e4;
                                            vr3Var = vr3VarA;
                                            ti8 ti8Var2 = new ti8(exc);
                                            if (vr3Var != null) {
                                                try {
                                                    vr3Var.close();
                                                } catch (IOException e5) {
                                                    gf8.c("LottieFetchResult close failed ", e5);
                                                }
                                            }
                                            ti8Var = ti8Var2;
                                            break;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            vr3Var = vr3VarA;
                                            if (vr3Var == null) {
                                                throw th;
                                            }
                                            try {
                                                vr3Var.close();
                                                throw th;
                                            } catch (IOException e6) {
                                                gf8.c("LottieFetchResult close failed ", e6);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Exception e7) {
                                    exc = e7;
                                }
                            }
                            if (str5 != null && (uh8Var2 = ti8Var.a) != null) {
                                vh8.b.a.d(str5, uh8Var2);
                            }
                            return ti8Var;
                        default:
                            Context context3 = context;
                            String str6 = str3;
                            String str7 = strConcat;
                            uh8 uh8VarA = str7 != null ? vh8.b.a(str7) : null;
                            if (uh8VarA != null) {
                                return new ti8(uh8VarA);
                            }
                            try {
                                return zh8.b(context3, context3.getAssets().open(str6), str7);
                            } catch (IOException e8) {
                                return new ti8(e8);
                            }
                    }
                }
            }, null);
        }
        if (!(ji8Var instanceof gi8)) {
            ap.c();
            return null;
        }
        final int i5 = 1;
        if (!pa7.t(str, "__LottieInternalDefaultCacheKey__")) {
            final String str4 = ((gi8) ji8Var).a;
            HashMap map4 = zh8.a;
            final Context applicationContext3 = context.getApplicationContext();
            return zh8.a(str, new Callable() { // from class: wh8
                /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    uh8 uh8Var;
                    Throwable th;
                    Exception exc;
                    ti8 ti8Var;
                    uh8 uh8Var2;
                    Pair pair;
                    ti8 ti8VarE;
                    kd9 kd9Var;
                    vr3 vr3Var = null;
                    vr3Var = null;
                    switch (i5) {
                        case 0:
                            Context context2 = applicationContext3;
                            String str5 = str4;
                            String str6 = str;
                            vd9 vd9Var = y7h.l;
                            boolean z = false;
                            if (vd9Var == null) {
                                synchronized (vd9.class) {
                                    try {
                                        vd9Var = y7h.l;
                                        if (vd9Var == null) {
                                            Context applicationContext4 = context2.getApplicationContext();
                                            kd9 kd9Var2 = y7h.m;
                                            if (kd9Var2 == null) {
                                                synchronized (kd9.class) {
                                                    try {
                                                        kd9Var = y7h.m;
                                                        if (kd9Var == null) {
                                                            kd9Var = new kd9(0, new cu7(applicationContext4));
                                                            y7h.m = kd9Var;
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                    break;
                                                }
                                                kd9Var2 = kd9Var;
                                            }
                                            vd9Var = new vd9(kd9Var2, new gec(24));
                                            y7h.l = vd9Var;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                            if (str6 != null) {
                                try {
                                    File fileE = ((kd9) vd9Var.b).E(str5);
                                    if (fileE == null) {
                                        pair = null;
                                    } else {
                                        FileInputStream fileInputStreamB = a.b(fileE, new FileInputStream(fileE));
                                        id5 id5Var = fileE.getAbsolutePath().endsWith(".zip") ? id5.ZIP : fileE.getAbsolutePath().endsWith(".gz") ? id5.GZIP : id5.JSON;
                                        fileE.getAbsolutePath();
                                        gf8.a();
                                        pair = new Pair(id5Var, fileInputStreamB);
                                    }
                                } catch (FileNotFoundException unused) {
                                }
                                if (pair == null) {
                                    uh8Var = null;
                                } else {
                                    id5 id5Var2 = (id5) pair.first;
                                    InputStream inputStream = (InputStream) pair.second;
                                    int iOrdinal = id5Var2.ordinal();
                                    if (iOrdinal == 1) {
                                        ti8VarE = zh8.e(context2, new ZipInputStream(inputStream), str6);
                                    } else if (iOrdinal != 2) {
                                        ti8VarE = zh8.d(z5c.K(inputStream), str6);
                                    } else {
                                        try {
                                            ti8VarE = zh8.d(z5c.K(new GZIPInputStream(inputStream)), str6);
                                        } catch (IOException e2) {
                                            ti8VarE = new ti8(e2);
                                        }
                                    }
                                    uh8Var = ti8VarE.a;
                                    if (uh8Var == null) {
                                        uh8Var = null;
                                    }
                                }
                                break;
                            } else {
                                uh8Var = null;
                            }
                            if (uh8Var != null) {
                                ti8Var = new ti8(uh8Var);
                            } else {
                                gf8.a();
                                gf8.a();
                                try {
                                    try {
                                        vr3 vr3VarA = gec.A(str5);
                                        try {
                                            HttpURLConnection httpURLConnection = (HttpURLConnection) vr3VarA.b;
                                            try {
                                                if (httpURLConnection.getResponseCode() / 100 == 2) {
                                                    z = true;
                                                }
                                            } catch (IOException unused2) {
                                            }
                                            if (z) {
                                                ti8Var = vd9Var.n(context2, str5, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str6);
                                                uh8 uh8Var3 = ti8Var.a;
                                                gf8.a();
                                            } else {
                                                ti8Var = new ti8(new IllegalArgumentException(vr3VarA.b()));
                                            }
                                            try {
                                                vr3VarA.close();
                                            } catch (IOException e3) {
                                                gf8.c("LottieFetchResult close failed ", e3);
                                            }
                                            break;
                                        } catch (Exception e4) {
                                            exc = e4;
                                            vr3Var = vr3VarA;
                                            ti8 ti8Var2 = new ti8(exc);
                                            if (vr3Var != null) {
                                                try {
                                                    vr3Var.close();
                                                } catch (IOException e5) {
                                                    gf8.c("LottieFetchResult close failed ", e5);
                                                }
                                            }
                                            ti8Var = ti8Var2;
                                            break;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            vr3Var = vr3VarA;
                                            if (vr3Var == null) {
                                                throw th;
                                            }
                                            try {
                                                vr3Var.close();
                                                throw th;
                                            } catch (IOException e6) {
                                                gf8.c("LottieFetchResult close failed ", e6);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Exception e7) {
                                    exc = e7;
                                }
                            }
                            if (str6 != null && (uh8Var2 = ti8Var.a) != null) {
                                vh8.b.a.d(str6, uh8Var2);
                            }
                            return ti8Var;
                        default:
                            Context context3 = applicationContext3;
                            String str7 = str4;
                            String str8 = str;
                            uh8 uh8VarA = str8 != null ? vh8.b.a(str8) : null;
                            if (uh8VarA != null) {
                                return new ti8(uh8VarA);
                            }
                            try {
                                return zh8.b(context3, context3.getAssets().open(str7), str8);
                            } catch (IOException e8) {
                                return new ti8(e8);
                            }
                    }
                }
            }, null);
        }
        final String str5 = ((gi8) ji8Var).a;
        HashMap map5 = zh8.a;
        final String strI = ub3.i("asset_", str5);
        final Context applicationContext4 = context.getApplicationContext();
        return zh8.a(strI, new Callable() { // from class: wh8
            /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                uh8 uh8Var;
                Throwable th;
                Exception exc;
                ti8 ti8Var;
                uh8 uh8Var2;
                Pair pair;
                ti8 ti8VarE;
                kd9 kd9Var;
                vr3 vr3Var = null;
                vr3Var = null;
                switch (i5) {
                    case 0:
                        Context context2 = applicationContext4;
                        String str6 = str5;
                        String str7 = strI;
                        vd9 vd9Var = y7h.l;
                        boolean z = false;
                        if (vd9Var == null) {
                            synchronized (vd9.class) {
                                try {
                                    vd9Var = y7h.l;
                                    if (vd9Var == null) {
                                        Context applicationContext5 = context2.getApplicationContext();
                                        kd9 kd9Var2 = y7h.m;
                                        if (kd9Var2 == null) {
                                            synchronized (kd9.class) {
                                                try {
                                                    kd9Var = y7h.m;
                                                    if (kd9Var == null) {
                                                        kd9Var = new kd9(0, new cu7(applicationContext5));
                                                        y7h.m = kd9Var;
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                                break;
                                            }
                                            kd9Var2 = kd9Var;
                                        }
                                        vd9Var = new vd9(kd9Var2, new gec(24));
                                        y7h.l = vd9Var;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        if (str7 != null) {
                            try {
                                File fileE = ((kd9) vd9Var.b).E(str6);
                                if (fileE == null) {
                                    pair = null;
                                } else {
                                    FileInputStream fileInputStreamB = a.b(fileE, new FileInputStream(fileE));
                                    id5 id5Var = fileE.getAbsolutePath().endsWith(".zip") ? id5.ZIP : fileE.getAbsolutePath().endsWith(".gz") ? id5.GZIP : id5.JSON;
                                    fileE.getAbsolutePath();
                                    gf8.a();
                                    pair = new Pair(id5Var, fileInputStreamB);
                                }
                            } catch (FileNotFoundException unused) {
                            }
                            if (pair == null) {
                                uh8Var = null;
                            } else {
                                id5 id5Var2 = (id5) pair.first;
                                InputStream inputStream = (InputStream) pair.second;
                                int iOrdinal = id5Var2.ordinal();
                                if (iOrdinal == 1) {
                                    ti8VarE = zh8.e(context2, new ZipInputStream(inputStream), str7);
                                } else if (iOrdinal != 2) {
                                    ti8VarE = zh8.d(z5c.K(inputStream), str7);
                                } else {
                                    try {
                                        ti8VarE = zh8.d(z5c.K(new GZIPInputStream(inputStream)), str7);
                                    } catch (IOException e2) {
                                        ti8VarE = new ti8(e2);
                                    }
                                }
                                uh8Var = ti8VarE.a;
                                if (uh8Var == null) {
                                    uh8Var = null;
                                }
                            }
                            break;
                        } else {
                            uh8Var = null;
                        }
                        if (uh8Var != null) {
                            ti8Var = new ti8(uh8Var);
                        } else {
                            gf8.a();
                            gf8.a();
                            try {
                                try {
                                    vr3 vr3VarA = gec.A(str6);
                                    try {
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) vr3VarA.b;
                                        try {
                                            if (httpURLConnection.getResponseCode() / 100 == 2) {
                                                z = true;
                                            }
                                        } catch (IOException unused2) {
                                        }
                                        if (z) {
                                            ti8Var = vd9Var.n(context2, str6, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str7);
                                            uh8 uh8Var3 = ti8Var.a;
                                            gf8.a();
                                        } else {
                                            ti8Var = new ti8(new IllegalArgumentException(vr3VarA.b()));
                                        }
                                        try {
                                            vr3VarA.close();
                                        } catch (IOException e3) {
                                            gf8.c("LottieFetchResult close failed ", e3);
                                        }
                                        break;
                                    } catch (Exception e4) {
                                        exc = e4;
                                        vr3Var = vr3VarA;
                                        ti8 ti8Var2 = new ti8(exc);
                                        if (vr3Var != null) {
                                            try {
                                                vr3Var.close();
                                            } catch (IOException e5) {
                                                gf8.c("LottieFetchResult close failed ", e5);
                                            }
                                        }
                                        ti8Var = ti8Var2;
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        vr3Var = vr3VarA;
                                        if (vr3Var == null) {
                                            throw th;
                                        }
                                        try {
                                            vr3Var.close();
                                            throw th;
                                        } catch (IOException e6) {
                                            gf8.c("LottieFetchResult close failed ", e6);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Exception e7) {
                                exc = e7;
                            }
                        }
                        if (str7 != null && (uh8Var2 = ti8Var.a) != null) {
                            vh8.b.a.d(str7, uh8Var2);
                        }
                        return ti8Var;
                    default:
                        Context context3 = applicationContext4;
                        String str8 = str5;
                        String str9 = strI;
                        uh8 uh8VarA = str9 != null ? vh8.b.a(str9) : null;
                        if (uh8VarA != null) {
                            return new ti8(uh8VarA);
                        }
                        try {
                            return zh8.b(context3, context3.getAssets().open(str8), str9);
                        } catch (IOException e8) {
                            return new ti8(e8);
                        }
                }
            }
        }, null);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:1: B:79:0x01f9->B:162:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    public static final Object F(tt7 tt7Var, a8f a8fVar, n26 n26Var) {
        jua juaVarU;
        jua juaVarS;
        boolean z;
        ex5 ex5VarF;
        j22 j22VarH;
        Object vl7Var;
        List list;
        Iterator it;
        wl7 wl7Var;
        boolean z2;
        tt7 tt7Var2;
        a8f a8fVar2;
        Object objF;
        bj5 bj5VarR;
        gec gecVar = gec.y;
        tt7Var.getClass();
        n26Var.getClass();
        if (oa7.V(tt7Var)) {
            i69 i69Var = fbe.a;
            oa7.V(tt7Var);
            xr7 xr7VarP = o7c.p(tt7Var);
            h10 annotations = tt7Var.getAnnotations();
            tt7 tt7VarN = oa7.N(tt7Var);
            List listL = oa7.L(tt7Var);
            List listP = oa7.P(tt7Var);
            ArrayList arrayList = new ArrayList(t72.u(listP, 10));
            Iterator it2 = listP.iterator();
            while (it2.hasNext()) {
                arrayList.add(((i8f) it2.next()).b());
            }
            e7f.b.getClass();
            e7f e7fVar = e7f.c;
            j7f j7fVarH = fbe.a.h();
            oa7.S(tt7Var);
            tt7 tt7VarB = ((i8f) s72.F0(tt7Var.Z())).b();
            tt7VarB.getClass();
            ArrayList arrayListR0 = s72.R0(arrayList, rxg.T(e7fVar, j7fVarH, t72.H(new dzd(tt7VarB)), false));
            tjd tjdVarP = o7c.p(tt7Var).p();
            tjdVarP.getClass();
            return F(oa7.I(xr7VarP, annotations, tt7VarN, listL, arrayListR0, tjdVarP, false).l0(tt7Var.i0()), a8fVar, n26Var);
        }
        tjd tjdVarS = db6.s(tt7Var);
        if (tjdVarS == null && ((bj5VarR = db6.r(tt7Var)) == null || (tjdVarS = db6.u0(bj5VarR)) == null)) {
            tjdVarS = db6.s(tt7Var);
            tjdVarS.getClass();
        }
        j7f j7fVarD1 = db6.d1(tjdVarS);
        if (db6.d0(j7fVarD1)) {
            j7fVarD1.getClass();
            if (j7fVarD1 instanceof j7f) {
                y22 y22VarM = j7fVarD1.m();
                y22VarM.getClass();
                juaVarU = xr7.u((u09) y22VarM);
            } else {
                qc0.o(tec.j(job.a, j7fVarD1.getClass(), ks0.o("ClassicTypeSystemContext couldn't handle: ", j7fVarD1, ", ")));
                juaVarU = null;
            }
            if (juaVarU != null) {
                switch (juaVarU.ordinal()) {
                    case 0:
                        wl7Var = xl7.a;
                        break;
                    case 1:
                        wl7Var = xl7.b;
                        break;
                    case 2:
                        wl7Var = xl7.c;
                        break;
                    case 3:
                        wl7Var = xl7.d;
                        break;
                    case 4:
                        wl7Var = xl7.e;
                        break;
                    case 5:
                        wl7Var = xl7.f;
                        break;
                    case 6:
                        wl7Var = xl7.g;
                        break;
                    case 7:
                        wl7Var = xl7.h;
                        break;
                    default:
                        ap.c();
                        return null;
                }
                if (db6.n0(tt7Var)) {
                    z2 = true;
                } else {
                    dx5 dx5Var = pj7.q;
                    dx5Var.getClass();
                    if (db6.X(tt7Var, dx5Var)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                vl7Var = q6c.a(wl7Var, z2);
            } else {
                j7fVarD1.getClass();
                if (j7fVarD1 instanceof j7f) {
                    y22 y22VarM2 = j7fVarD1.m();
                    y22VarM2.getClass();
                    juaVarS = xr7.s((u09) y22VarM2);
                } else {
                    qc0.o(tec.j(job.a, j7fVarD1.getClass(), ks0.o("ClassicTypeSystemContext couldn't handle: ", j7fVarD1, ", ")));
                    juaVarS = null;
                }
                if (juaVarS != null) {
                    StringBuilder sb = new StringBuilder("[");
                    al7 al7Var = (al7) al7.x.get(juaVarS);
                    if (al7Var == null) {
                        al7.a(6);
                        throw null;
                    }
                    sb.append(al7Var.c());
                    vl7Var = hj6.r(sb.toString());
                } else {
                    j7fVarD1.getClass();
                    if (j7fVarD1 instanceof j7f) {
                        y22 y22VarM3 = j7fVarD1.m();
                        if (y22VarM3 != null && xr7.J(y22VarM3)) {
                            z = true;
                        }
                        if (z) {
                            j7fVarD1.getClass();
                            if (j7fVarD1 instanceof j7f) {
                                y22 y22VarM4 = j7fVarD1.m();
                                y22VarM4.getClass();
                                int i2 = qz3.a;
                                ex5VarF = oz3.f((u09) y22VarM4);
                                ex5VarF.getClass();
                            } else {
                                qc0.o(tec.j(job.a, j7fVarD1.getClass(), ks0.o("ClassicTypeSystemContext couldn't handle: ", j7fVarD1, ", ")));
                                ex5VarF = null;
                            }
                            String str = qf7.a;
                            j22VarH = qf7.h(ex5VarF);
                            if (j22VarH == null) {
                                vl7Var = null;
                            } else {
                                if (!a8fVar.d && ((list = qf7.o) == null || !list.isEmpty())) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((pf7) it.next()).a.equals(j22VarH)) {
                                                vl7Var = null;
                                            }
                                        }
                                    }
                                }
                                vl7Var = new vl7(gk7.c(j22VarH));
                            }
                        } else {
                            vl7Var = null;
                        }
                    } else {
                        qc0.o(tec.j(job.a, j7fVarD1.getClass(), ks0.o("ClassicTypeSystemContext couldn't handle: ", j7fVarD1, ", ")));
                    }
                    z = false;
                    if (z) {
                        j7fVarD1.getClass();
                        if (j7fVarD1 instanceof j7f) {
                            y22 y22VarM5 = j7fVarD1.m();
                            y22VarM5.getClass();
                            int i3 = qz3.a;
                            ex5VarF = oz3.f((u09) y22VarM5);
                            ex5VarF.getClass();
                        } else {
                            qc0.o(tec.j(job.a, j7fVarD1.getClass(), ks0.o("ClassicTypeSystemContext couldn't handle: ", j7fVarD1, ", ")));
                            ex5VarF = null;
                        }
                        String str2 = qf7.a;
                        j22VarH = qf7.h(ex5VarF);
                        if (j22VarH == null) {
                            vl7Var = null;
                        } else {
                            if (!a8fVar.d) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((pf7) it.next()).a.equals(j22VarH)) {
                                            vl7Var = null;
                                        }
                                    }
                                }
                            }
                            vl7Var = new vl7(gk7.c(j22VarH));
                        }
                    } else {
                        vl7Var = null;
                    }
                }
            }
        } else {
            vl7Var = null;
        }
        if (vl7Var != null) {
            Object objA = q6c.a(vl7Var, a8fVar.a);
            n26Var.m(tt7Var, objA, a8fVar);
            return objA;
        }
        j7f j7fVarC0 = tt7Var.c0();
        if (j7fVarC0 instanceof ca7) {
            ca7 ca7Var = (ca7) j7fVarC0;
            tt7 tt7Var3 = ca7Var.a;
            if (tt7Var3 != null) {
                return F(o7c.z(tt7Var3), a8fVar, n26Var);
            }
            qc0.i("There should be no intersection type in existing descriptors, but found: ".concat(s72.D0(ca7Var.b, null, null, null, null, 63)));
            return null;
        }
        y22 y22VarM6 = j7fVarC0.m();
        if (y22VarM6 == null) {
            s8f.n(tt7Var, "no descriptor for type constructor of ");
            return null;
        }
        if (sy4.f(y22VarM6)) {
            return new vl7("error/NonExistentClass");
        }
        boolean z3 = y22VarM6 instanceof u09;
        if (z3 && xr7.z(tt7Var)) {
            if (tt7Var.Z().size() != 1) {
                s8f.i("arrays must have one type argument");
                return null;
            }
            i8f i8fVar = (i8f) tt7Var.Z().get(0);
            tt7 tt7VarB2 = i8fVar.b();
            tt7VarB2.getClass();
            if (i8fVar.a() == dsf.IN_VARIANCE) {
                objF = new vl7("java/lang/Object");
            } else {
                dsf dsfVarA = i8fVar.a();
                dsfVarA.getClass();
                int iOrdinal = dsfVarA.ordinal();
                if (iOrdinal == 0 ? (a8fVar2 = a8fVar.f) != null : iOrdinal == 1 ? (a8fVar2 = a8fVar.e) != null : (a8fVar2 = a8fVar.c) != null) {
                    a8fVar = a8fVar2;
                }
                objF = F(tt7VarB2, a8fVar, n26Var);
            }
            return hj6.r("[".concat(hj6.E((xl7) objF)));
        }
        if (!z3) {
            if (y22VarM6 instanceof c8f) {
                tt7 tt7VarQ = o7c.q((c8f) y22VarM6);
                if (tt7Var.i0()) {
                    tt7VarQ = w8f.h(tt7VarQ, true);
                }
                return F(tt7VarQ, a8fVar, ib1.f);
            }
            if ((y22VarM6 instanceof s04) && a8fVar.g) {
                return F(((s04) y22VarM6).E0(), a8fVar, n26Var);
            }
            s8f.n(tt7Var, "Unknown type ");
            return null;
        }
        if (n37.a(y22VarM6) && !a8fVar.b && (tt7Var2 = (tt7) feg.w(tt7Var, new HashSet())) != null) {
            return F(tt7Var2, new a8f(a8fVar.a, true, a8fVar.c, a8fVar.d, a8fVar.e, a8fVar.f, a8fVar.g, a8fVar.h), n26Var);
        }
        u09 u09Var = (u09) y22VarM6;
        u09Var.a().getClass();
        if (u09Var.E() == l22.ENUM_ENTRY) {
            bm3 bm3VarK = u09Var.k();
            bm3VarK.getClass();
            u09Var = (u09) bm3VarK;
        }
        u09 u09VarA0 = u09Var.a();
        u09VarA0.getClass();
        vl7 vl7Var2 = new vl7(f(u09VarA0, gecVar));
        n26Var.m(tt7Var, vl7Var2, a8fVar);
        return vl7Var2;
    }

    public static si6 G(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            qc0.j("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr3[i3] == null) {
                qc0.j("Headers cannot be null");
                return null;
            }
            strArr3[i3] = v4e.o0(strArr2[i3]).toString();
        }
        int iG = z7f.G(0, strArr3.length - 1, 2);
        if (iG >= 0) {
            while (true) {
                String str = strArr3[i2];
                String str2 = strArr3[i2 + 1];
                xdc.p(str);
                xdc.q(str2, str);
                if (i2 == iG) {
                    break;
                }
                i2 += 2;
            }
        }
        return new si6(strArr3);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x024f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0251  */
    /* JADX WARN: Code duplicated, block: B:120:0x0254  */
    /* JADX WARN: Code duplicated, block: B:122:0x0257  */
    /* JADX WARN: Code duplicated, block: B:123:0x025b  */
    /* JADX WARN: Code duplicated, block: B:125:0x026f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:129:0x0284  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e A[LOOP:2: B:54:0x011c->B:55:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d A[LOOP:4: B:59:0x013b->B:60:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee A[LOOP:8: B:98:0x01ec->B:99:0x01ee, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x0225, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x025b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    public static sq4 H(byte[] bArr) throws l0a {
        int i2;
        int i3;
        int i4;
        boolean zF;
        int iG;
        int iG2;
        int[] iArr;
        int i5;
        String str;
        int iG3;
        long jN;
        int i6;
        int i7;
        int i8;
        int i9;
        ?? r19;
        ?? r12;
        boolean zF2;
        int iG4;
        String str2;
        boolean zF3;
        int length;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int length2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? r13;
        ?? F;
        int iG5;
        int iG6;
        int[] iArr3;
        int i20;
        int i21;
        int iV;
        int iG7;
        int i22;
        boolean zF4;
        zu1 zu1VarU = u(bArr);
        zu1VarU.o(40);
        int iG8 = zu1VarU.g(2);
        if (zu1VarU.f()) {
            i2 = 20;
            i3 = 12;
        } else {
            i2 = 16;
            i3 = 8;
        }
        zu1VarU.o(i3);
        int i23 = 1;
        int iG9 = zu1VarU.g(i2) + 1;
        boolean zF5 = zu1VarU.f();
        if (zF5) {
            iG2 = zu1VarU.g(2);
            iG = (zu1VarU.g(3) + 1) * 512;
            if (zu1VarU.f()) {
                zu1VarU.o(36);
            }
            int iG10 = zu1VarU.g(3) + 1;
            int iG11 = zu1VarU.g(3) + 1;
            if (iG10 != 1 || iG11 != 1) {
                throw l0a.b("Multiple audio presentations or assets not supported");
            }
            int i24 = iG8 + 1;
            int iG12 = zu1VarU.g(i24);
            for (int i25 = 0; i25 < i24; i25++) {
                if (((iG12 >> i25) & 1) == 1) {
                    zu1VarU.o(8);
                }
            }
            i4 = 0;
            zF = zu1VarU.f();
            if (zF) {
                zu1VarU.o(2);
                int iG13 = (zu1VarU.g(2) + 1) << 2;
                int iG14 = zu1VarU.g(2) + 1;
                iArr = new int[iG14];
                for (int i26 = 0; i26 < iG14; i26++) {
                    iArr[i26] = v(zu1VarU.g(iG13));
                }
            }
            zu1VarU.o(i2);
            zu1VarU.o(12);
            if (zF5) {
                if (zu1VarU.f()) {
                    zu1VarU.o(4);
                }
                if (zu1VarU.f()) {
                    zu1VarU.o(24);
                }
                if (zu1VarU.f()) {
                    zu1VarU.p(zu1VarU.g(10) + 1);
                }
                i7 = 5;
                zu1VarU.o(5);
                i5 = i[zu1VarU.g(4)];
                iG3 = zu1VarU.g(8) + 1;
                i8 = 6;
                if (zu1VarU.f()) {
                    if (iG3 > 2) {
                        zF4 = zu1VarU.f();
                    } else {
                        r13 = i4;
                    }
                    if (iG3 > 6) {
                        r13 = zF4;
                        F = zu1VarU.f();
                    } else {
                        r13 = zF4;
                        F = i4;
                    }
                    if (zu1VarU.f()) {
                        iG5 = (zu1VarU.g(2) + 1) << 2;
                        zu1VarU.o(iG5);
                    } else {
                        iG5 = i4;
                    }
                    iG6 = zu1VarU.g(3);
                    iArr3 = new int[iG6];
                    for (i20 = i4; i20 < iG6; i20++) {
                        iArr3[i20] = zu1VarU.g(iG5);
                    }
                    i21 = i4;
                    while (i21 < iG6) {
                        iV = v(iArr3[i21]);
                        int i27 = i7;
                        iG7 = zu1VarU.g(i7) + 1;
                        i22 = i4;
                        while (i22 < iV) {
                            zu1VarU.o(Integer.bitCount(zu1VarU.g(iG7)) * 5);
                            i22++;
                            iArr3 = iArr3;
                        }
                        i21++;
                        i7 = i27;
                    }
                    i9 = i7;
                    r12 = r13;
                    r19 = F;
                } else {
                    i9 = 5;
                    i23 = 1;
                    zu1VarU.o(3);
                    int i28 = i4;
                    r19 = i28 == true ? 1 : 0;
                    r12 = i28;
                }
                zF2 = zu1VarU.f();
                if (zF2) {
                    zu1VarU.o(8);
                }
                if (zu1VarU.f()) {
                    zu1VarU.o(i9);
                }
                if (zF2 && r12 != 0) {
                    zu1VarU.o(8);
                }
                if (zF && zu1VarU.f()) {
                    iArr.getClass();
                    zu1VarU.o(7);
                    if (zu1VarU.g(2) < 3) {
                        zu1VarU.o(3);
                    } else {
                        zu1VarU.o(8);
                    }
                    zF3 = zu1VarU.f();
                    length = iArr.length;
                    i10 = i4;
                    while (i10 < length) {
                        i18 = iArr[i10];
                        if (zF3) {
                            zu1VarU.o(i18 * 6);
                            i19 = i8;
                        } else {
                            i19 = i8;
                            zu1VarU.o(i19);
                        }
                        i10++;
                        i8 = i19;
                    }
                    i11 = i8;
                    iArr2 = new int[3];
                    iArr2[i4] = iG3;
                    if (r19 != 0) {
                        iArr2[i23] = i11;
                        i12 = 2;
                    } else {
                        i12 = i23;
                    }
                    if (r12 != 0) {
                        iArr2[i12] = 2;
                        i12++;
                    }
                    length2 = iArr.length;
                    for (i13 = i4; i13 < length2; i13++) {
                        i14 = iArr[i13];
                        for (i15 = i4; i15 < i12; i15++) {
                            i16 = iArr2[i15];
                            i17 = i4;
                            while (i17 < i16) {
                                zu1VarU.o(Integer.bitCount(zu1VarU.g(i14)) * 6);
                                i17++;
                                iArr2 = iArr2;
                            }
                        }
                    }
                }
                iG4 = zu1VarU.g(2);
                str2 = "audio/vnd.dts.hd";
                if (iG4 != 0) {
                    if (iG4 != i23) {
                        if (iG4 != 2) {
                            throw l0a.a(null, "Unsupported coding mode in DTS HD header: " + iG4);
                        }
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    }
                } else if ((zu1VarU.g(12) & 256) != 0) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
                str = str2;
            } else {
                i5 = -2147483647;
                str = null;
                iG3 = -1;
            }
            int i29 = i5;
            if (zF5) {
                if (iG2 != 0) {
                    i6 = 32000;
                } else if (iG2 != 1) {
                    i6 = 44100;
                } else {
                    if (iG2 == 2) {
                        throw l0a.a(null, "Unsupported reference clock code in DTS HD header: " + iG2);
                    }
                    i6 = 48000;
                }
                long j2 = i6;
                String str3 = pqf.a;
                jN = pqf.N(iG, 1000000L, j2, RoundingMode.DOWN);
            } else {
                jN = -9223372036854775807L;
            }
            return new sq4(iG3, i29, iG9, jN, str);
        }
        i4 = 0;
        zF = false;
        iG = 0;
        iG2 = -1;
        iArr = null;
        zu1VarU.o(i2);
        zu1VarU.o(12);
        if (zF5) {
            if (zu1VarU.f()) {
                zu1VarU.o(4);
            }
            if (zu1VarU.f()) {
                zu1VarU.o(24);
            }
            if (zu1VarU.f()) {
                zu1VarU.p(zu1VarU.g(10) + 1);
            }
            i7 = 5;
            zu1VarU.o(5);
            i5 = i[zu1VarU.g(4)];
            iG3 = zu1VarU.g(8) + 1;
            i8 = 6;
            if (zu1VarU.f()) {
                if (iG3 > 2) {
                    zF4 = zu1VarU.f();
                } else {
                    r13 = i4;
                }
                if (iG3 > 6) {
                    r13 = zF4;
                    F = zu1VarU.f();
                } else {
                    r13 = zF4;
                    F = i4;
                }
                if (zu1VarU.f()) {
                    iG5 = (zu1VarU.g(2) + 1) << 2;
                    zu1VarU.o(iG5);
                } else {
                    iG5 = i4;
                }
                iG6 = zu1VarU.g(3);
                iArr3 = new int[iG6];
                while (i20 < iG6) {
                    iArr3[i20] = zu1VarU.g(iG5);
                }
                i21 = i4;
                while (i21 < iG6) {
                    iV = v(iArr3[i21]);
                    int i210 = i7;
                    iG7 = zu1VarU.g(i7) + 1;
                    i22 = i4;
                    while (i22 < iV) {
                        zu1VarU.o(Integer.bitCount(zu1VarU.g(iG7)) * 5);
                        i22++;
                        iArr3 = iArr3;
                    }
                    i21++;
                    i7 = i210;
                }
                i9 = i7;
                r12 = r13;
                r19 = F;
            } else {
                i9 = 5;
                i23 = 1;
                zu1VarU.o(3);
                int i211 = i4;
                r19 = i211 == true ? 1 : 0;
                r12 = i211;
            }
            zF2 = zu1VarU.f();
            if (zF2) {
                zu1VarU.o(8);
            }
            if (zu1VarU.f()) {
                zu1VarU.o(i9);
            }
            if (zF2) {
                zu1VarU.o(8);
            }
            if (zF) {
                iArr.getClass();
                zu1VarU.o(7);
                if (zu1VarU.g(2) < 3) {
                    zu1VarU.o(3);
                } else {
                    zu1VarU.o(8);
                }
                zF3 = zu1VarU.f();
                length = iArr.length;
                i10 = i4;
                while (i10 < length) {
                    i18 = iArr[i10];
                    if (zF3) {
                        zu1VarU.o(i18 * 6);
                        i19 = i8;
                    } else {
                        i19 = i8;
                        zu1VarU.o(i19);
                    }
                    i10++;
                    i8 = i19;
                }
                i11 = i8;
                iArr2 = new int[3];
                iArr2[i4] = iG3;
                if (r19 != 0) {
                    iArr2[i23] = i11;
                    i12 = 2;
                } else {
                    i12 = i23;
                }
                if (r12 != 0) {
                    iArr2[i12] = 2;
                    i12++;
                }
                length2 = iArr.length;
                while (i13 < length2) {
                    i14 = iArr[i13];
                    while (i15 < i12) {
                        i16 = iArr2[i15];
                        i17 = i4;
                        while (i17 < i16) {
                            zu1VarU.o(Integer.bitCount(zu1VarU.g(i14)) * 6);
                            i17++;
                            iArr2 = iArr2;
                        }
                    }
                }
            }
            iG4 = zu1VarU.g(2);
            str2 = "audio/vnd.dts.hd";
            if (iG4 != 0) {
                if (iG4 != i23) {
                    if (iG4 != 2) {
                        throw l0a.a(null, "Unsupported coding mode in DTS HD header: " + iG4);
                    }
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
            } else if ((zu1VarU.g(12) & 256) != 0) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            }
            str = str2;
        } else {
            i5 = -2147483647;
            str = null;
            iG3 = -1;
        }
        int i212 = i5;
        if (zF5) {
            if (iG2 != 0) {
                i6 = 32000;
            } else if (iG2 != 1) {
                i6 = 44100;
            } else {
                if (iG2 == 2) {
                    throw l0a.a(null, "Unsupported reference clock code in DTS HD header: " + iG2);
                }
                i6 = 48000;
            }
            long j3 = i6;
            String str4 = pqf.a;
            jN = pqf.N(iG, 1000000L, j3, RoundingMode.DOWN);
        } else {
            jN = -9223372036854775807L;
        }
        return new sq4(iG3, i212, iG9, jN, str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0221  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long I(String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        long j3;
        char cCharAt;
        gr4 gr4Var;
        char cCharAt2;
        gr4 gr4Var2;
        long jD;
        int i9;
        int iMin;
        int i10;
        int i11;
        int i12;
        int iMin2;
        int i13;
        int i14;
        int i15;
        int i16;
        double d2;
        long jM;
        char cCharAt3;
        int i17;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i18;
        int i19;
        char cCharAt7;
        if (str.length() == 0) {
            qc0.j("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i20 = 1;
        char c2 = '-';
        char c3 = '+';
        if (cCharAt8 != '+') {
            i3 = cCharAt8 != '-' ? 0 : 1;
            i2 = i3;
        } else {
            i2 = 0;
            i3 = 1;
        }
        if (str.length() <= i3) {
            qc0.j("No components");
            return 0L;
        }
        if (str.charAt(i3) != 'P') {
            qc0.j("");
            return 0L;
        }
        int i21 = i3 + 1;
        if (i21 == str.length()) {
            qc0.j("");
            return 0L;
        }
        int i22 = 0;
        gr4 gr4Var3 = null;
        long jB = 0;
        long j4 = 0;
        while (i21 < str.length()) {
            char cCharAt9 = str.charAt(i21);
            if (cCharAt9 != 'T') {
                pf8 pf8Var = pf8.c;
                int i23 = i20;
                char cCharAt10 = str.charAt(i21);
                if (cCharAt10 != c3) {
                    if (cCharAt10 != c2) {
                        i4 = i21;
                    } else {
                        i4 = i21 + 1;
                        i5 = -1;
                    }
                    while (i4 < str.length() && str.charAt(i4) == '0') {
                        i4++;
                    }
                    j2 = 0;
                    while (true) {
                        if (i4 < str.length()) {
                            cCharAt6 = str.charAt(i4);
                            i6 = i21;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i18 = cCharAt6 - '0';
                                i19 = i2;
                                long j5 = pf8Var.a;
                                if (j2 > j5 || (j2 == j5 && i18 > pf8Var.b)) {
                                    i7 = i19;
                                    while (i4 < str.length() && '0' <= (cCharAt7 = str.charAt(i4)) && cCharAt7 < ':') {
                                        i4++;
                                    }
                                    if (i4 != str.length()) {
                                        if (i4 != i6 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i23 : 0)) {
                                            j2 = 4611686018427387903L;
                                        }
                                    }
                                    qc0.j("");
                                    return 0L;
                                }
                                j2 = (j2 << 3) + (j2 << i23) + ((long) i18);
                                i4++;
                                i21 = i6;
                                pf8Var = pf8Var;
                                i2 = i19;
                            }
                            j3 = j2;
                            cCharAt = str.charAt(i4);
                            gr4Var = gr4.SECONDS;
                            if (cCharAt == '.') {
                                i9 = i4 + 1;
                                iMin = Math.min(i4 + 7, str.length());
                                i11 = 0;
                                for (i10 = i9; i10 < iMin; i10++) {
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i12 = 0; i12 < 6 - (i10 - i9); i12++) {
                                            i11 = (i11 << 1) + (i11 << 3);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i13 = i10;
                                        i14 = 0;
                                        while (true) {
                                            if (i13 < iMin2) {
                                                i17 = iMin2;
                                                cCharAt4 = str.charAt(i13);
                                                i15 = i13;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                                    i13 = i15 + 1;
                                                    iMin2 = i17;
                                                }
                                            } else {
                                                i15 = i13;
                                            }
                                        }
                                        for (i16 = 0; i16 < 9 - (i15 - i10); i16++) {
                                            i14 = (i14 << 1) + (i14 << 3);
                                        }
                                        i4 = i15;
                                        while (i4 < str.length() && '0' <= (cCharAt3 = str.charAt(i4)) && cCharAt3 < ':') {
                                            i4++;
                                        }
                                        if (i4 != i9 || i4 == str.length() || str.charAt(i4) != 'S') {
                                            qc0.j("");
                                            return 0L;
                                        }
                                        long j6 = (((long) i11) * 1000000000) + ((long) i14);
                                        long j7 = i5;
                                        double d3 = j6;
                                        switch (gr4Var.ordinal()) {
                                            case 0:
                                                d2 = 1.0E-15d;
                                                jM = ym8.M(d3 * d2);
                                                break;
                                            case 1:
                                                d2 = 1.0E-12d;
                                                jM = ym8.M(d3 * d2);
                                                break;
                                            case 2:
                                                d2 = 1.0E-9d;
                                                jM = ym8.M(d3 * d2);
                                                break;
                                            case 3:
                                                d2 = 1.0E-6d;
                                                jM = ym8.M(d3 * d2);
                                                break;
                                            case 4:
                                                d2 = 6.0E-5d;
                                                jM = ym8.M(d3 * d2);
                                                break;
                                            case 5:
                                                d2 = 0.0036d;
                                                jM = ym8.M(d3 * d2);
                                                break;
                                            case 6:
                                                d2 = 0.0864d;
                                                jM = ym8.M(d3 * d2);
                                                break;
                                            default:
                                                pd4.i(gr4Var, "Unknown unit: ");
                                                jM = 0;
                                                break;
                                        }
                                        j4 = jM * j7;
                                    } else {
                                        i11 = (cCharAt5 - '0') + (i11 << 3) + (i11 << 1);
                                    }
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i13 = i10;
                                i14 = 0;
                                while (true) {
                                    if (i13 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i13);
                                        i15 = i13;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i15 = i13;
                                    }
                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                    i13 = i15 + 1;
                                    iMin2 = i17;
                                }
                                while (i16 < 9 - (i15 - i10)) {
                                    i14 = (i14 << 1) + (i14 << 3);
                                }
                                i4 = i15;
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                if (i4 != i9) {
                                }
                                qc0.j("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i4);
                            gr4Var2 = gr4.DAYS;
                            if (cCharAt2 == 'D') {
                                gr4Var = gr4Var2;
                            } else if (cCharAt2 == 'H') {
                                gr4Var = gr4.HOURS;
                            } else if (cCharAt2 == 'M') {
                                gr4Var = gr4.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                gr4Var = null;
                            }
                            if (gr4Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                            }
                            if (gr4Var3 == null && gr4Var3.compareTo(gr4Var) <= 0) {
                                qc0.j("Unexpected order of duration components");
                                return 0L;
                            }
                            if (gr4Var == gr4Var2) {
                                if (i22 != 0) {
                                    qc0.j("");
                                    return 0L;
                                }
                                jB = af1.B(j3, gr4Var) * ((long) i5);
                            } else {
                                if (i22 == 0) {
                                    qc0.j("");
                                    return 0L;
                                }
                                jD = d(jB, af1.B(j3, gr4Var) * ((long) i5));
                                if (jD == 9223372036854759646L) {
                                    qc0.j("");
                                    return 0L;
                                }
                                jB = jD;
                            }
                            i21 = i4 + 1;
                            gr4Var3 = gr4Var;
                            i20 = i23;
                            i2 = i7;
                            c2 = '-';
                            c3 = '+';
                        } else {
                            i6 = i21;
                        }
                        i7 = i2;
                        if (i4 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i8 = i23;
                            } else {
                                i8 = 0;
                            }
                            if (i4 == i6 + i8) {
                            }
                            j3 = j2;
                            cCharAt = str.charAt(i4);
                            gr4Var = gr4.SECONDS;
                            if (cCharAt == '.') {
                                i9 = i4 + 1;
                                iMin = Math.min(i4 + 7, str.length());
                                i11 = 0;
                                while (i10 < iMin) {
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i12 < 6 - (i10 - i9)) {
                                        i11 = (i11 << 1) + (i11 << 3);
                                    }
                                    iMin2 = Math.min(i10 + 9, str.length());
                                    i13 = i10;
                                    i14 = 0;
                                    while (true) {
                                        if (i13 < iMin2) {
                                            i17 = iMin2;
                                            cCharAt4 = str.charAt(i13);
                                            i15 = i13;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i15 = i13;
                                        }
                                        i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                        i13 = i15 + 1;
                                        iMin2 = i17;
                                    }
                                    while (i16 < 9 - (i15 - i10)) {
                                        i14 = (i14 << 1) + (i14 << 3);
                                    }
                                    i4 = i15;
                                    while (i4 < str.length()) {
                                        i4++;
                                    }
                                    if (i4 != i9) {
                                    }
                                    qc0.j("");
                                    return 0L;
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i13 = i10;
                                i14 = 0;
                                while (true) {
                                    if (i13 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i13);
                                        i15 = i13;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i15 = i13;
                                    }
                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                    i13 = i15 + 1;
                                    iMin2 = i17;
                                }
                                while (i16 < 9 - (i15 - i10)) {
                                    i14 = (i14 << 1) + (i14 << 3);
                                }
                                i4 = i15;
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                if (i4 != i9) {
                                }
                                qc0.j("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i4);
                            gr4Var2 = gr4.DAYS;
                            if (cCharAt2 == 'D') {
                                gr4Var = gr4Var2;
                            } else if (cCharAt2 == 'H') {
                                gr4Var = gr4.HOURS;
                            } else if (cCharAt2 == 'M') {
                                gr4Var = gr4.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                gr4Var = null;
                            }
                            if (gr4Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                            }
                            if (gr4Var3 == null) {
                            }
                            if (gr4Var == gr4Var2) {
                                if (i22 != 0) {
                                    qc0.j("");
                                    return 0L;
                                }
                                jB = af1.B(j3, gr4Var) * ((long) i5);
                            } else {
                                if (i22 == 0) {
                                    qc0.j("");
                                    return 0L;
                                }
                                jD = d(jB, af1.B(j3, gr4Var) * ((long) i5));
                                if (jD == 9223372036854759646L) {
                                    qc0.j("");
                                    return 0L;
                                }
                                jB = jD;
                            }
                            i21 = i4 + 1;
                            gr4Var3 = gr4Var;
                            i20 = i23;
                            i2 = i7;
                            c2 = '-';
                            c3 = '+';
                        }
                        qc0.j("");
                        return 0L;
                    }
                }
                i4 = i21 + 1;
                i5 = i23;
                while (i4 < str.length()) {
                    i4++;
                }
                j2 = 0;
                while (true) {
                    if (i4 < str.length()) {
                        cCharAt6 = str.charAt(i4);
                        i6 = i21;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i6 = i21;
                    }
                    i7 = i2;
                    if (i4 == str.length()) {
                        if (cCharAt9 != '+') {
                            i8 = i23;
                        } else {
                            i8 = i23;
                        }
                        if (i4 == i6 + i8) {
                        }
                        j3 = j2;
                        cCharAt = str.charAt(i4);
                        gr4Var = gr4.SECONDS;
                        if (cCharAt == '.') {
                            i9 = i4 + 1;
                            iMin = Math.min(i4 + 7, str.length());
                            i11 = 0;
                            while (i10 < iMin) {
                                cCharAt5 = str.charAt(i10);
                                if ('0' <= cCharAt5) {
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i13 = i10;
                                i14 = 0;
                                while (true) {
                                    if (i13 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i13);
                                        i15 = i13;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i15 = i13;
                                    }
                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                    i13 = i15 + 1;
                                    iMin2 = i17;
                                }
                                while (i16 < 9 - (i15 - i10)) {
                                    i14 = (i14 << 1) + (i14 << 3);
                                }
                                i4 = i15;
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                if (i4 != i9) {
                                }
                                qc0.j("");
                                return 0L;
                            }
                            while (i12 < 6 - (i10 - i9)) {
                                i11 = (i11 << 1) + (i11 << 3);
                            }
                            iMin2 = Math.min(i10 + 9, str.length());
                            i13 = i10;
                            i14 = 0;
                            while (true) {
                                if (i13 < iMin2) {
                                    i17 = iMin2;
                                    cCharAt4 = str.charAt(i13);
                                    i15 = i13;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i15 = i13;
                                }
                                i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                i13 = i15 + 1;
                                iMin2 = i17;
                            }
                            while (i16 < 9 - (i15 - i10)) {
                                i14 = (i14 << 1) + (i14 << 3);
                            }
                            i4 = i15;
                            while (i4 < str.length()) {
                                i4++;
                            }
                            if (i4 != i9) {
                            }
                            qc0.j("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i4);
                        gr4Var2 = gr4.DAYS;
                        if (cCharAt2 == 'D') {
                            gr4Var = gr4Var2;
                        } else if (cCharAt2 == 'H') {
                            gr4Var = gr4.HOURS;
                        } else if (cCharAt2 == 'M') {
                            gr4Var = gr4.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            gr4Var = null;
                        }
                        if (gr4Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                        }
                        if (gr4Var3 == null) {
                        }
                        if (gr4Var == gr4Var2) {
                            if (i22 != 0) {
                                qc0.j("");
                                return 0L;
                            }
                            jB = af1.B(j3, gr4Var) * ((long) i5);
                        } else {
                            if (i22 == 0) {
                                qc0.j("");
                                return 0L;
                            }
                            jD = d(jB, af1.B(j3, gr4Var) * ((long) i5));
                            if (jD == 9223372036854759646L) {
                                qc0.j("");
                                return 0L;
                            }
                            jB = jD;
                        }
                        i21 = i4 + 1;
                        gr4Var3 = gr4Var;
                        i20 = i23;
                        i2 = i7;
                        c2 = '-';
                        c3 = '+';
                    }
                    qc0.j("");
                    return 0L;
                    j2 = (j2 << 3) + (j2 << i23) + ((long) i18);
                    i4++;
                    i21 = i6;
                    pf8Var = pf8Var;
                    i2 = i19;
                }
            } else {
                if (i22 != 0 || (i21 = i21 + 1) == str.length()) {
                    qc0.j("");
                    return 0L;
                }
                i22 = i20;
            }
        }
        int i24 = i2;
        long jG = ar4.g(U(jB, gr4.MILLISECONDS), U(j4, gr4.NANOSECONDS));
        return (i24 == 0 || jG == ar4.e) ? jG : ar4.j(jG);
    }

    public static int J(zu1 zu1Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zu1Var.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zu1Var.g(iArr[i2]) + i4;
    }

    public static final fi8 K(ji8 ji8Var, String str, l46 l46Var, int i2, int i3) {
        l46Var.g0(-1248473602);
        String str2 = (i3 & 2) != 0 ? null : str;
        tpb tpbVar = new tpb(3, null);
        Context context = (Context) l46Var.k(uq.b);
        l46Var.g0(1388713953);
        int i4 = (i2 & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i4 > 4 && l46Var.g(ji8Var)) || (i2 & 6) == 4;
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (z2 || objR == i8cVar) {
            objR = q1c.f(new fi8());
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        l46Var.r(false);
        l46Var.g0(1388714244);
        if ((i4 <= 4 || !l46Var.g(ji8Var)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zG = l46Var.g("__LottieInternalDefaultCacheKey__") | z;
        Object objR2 = l46Var.R();
        if (zG || objR2 == i8cVar) {
            objR2 = E(context, ji8Var, "__LottieInternalDefaultCacheKey__");
            l46Var.p0(objR2);
        }
        l46Var.r(false);
        af1.p(ji8Var, "__LottieInternalDefaultCacheKey__", new upb(tpbVar, context, ji8Var, str2, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", e89Var, null), l46Var);
        fi8 fi8Var = (fi8) e89Var.getValue();
        l46Var.r(false);
        return fi8Var;
    }

    public static final Object L(t7 t7Var, Context context, boolean z, x16 x16Var) {
        t7Var.getClass();
        context.getClass();
        if (((mo3) t7Var).b() || z) {
            return x16Var.invoke();
        }
        jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_require_login));
        hkg.O0(context);
        return null;
    }

    public static final boolean M(t7 t7Var, Context context, boolean z, a26 a26Var) {
        Boolean bool;
        t7Var.getClass();
        context.getClass();
        a26Var.getClass();
        if (((mo3) t7Var).b() || z) {
            a26Var.d(t7Var);
            bool = Boolean.TRUE;
        } else {
            jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_require_login));
            hkg.O0(context);
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean N(t7 t7Var, Context context, a26 a26Var, int i2) {
        if ((i2 & 4) != 0) {
            a26Var = new z4(3);
        }
        return M(t7Var, context, false, a26Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object O(x16 x16Var, l26 l26Var, zn2 zn2Var) {
        zm zmVar;
        if (zn2Var instanceof zm) {
            zmVar = (zm) zn2Var;
            int i2 = zmVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zmVar.label = i2 - Integer.MIN_VALUE;
            } else {
                zmVar = new zm(zn2Var);
            }
        } else {
            zmVar = new zm(zn2Var);
        }
        Object obj = zmVar.result;
        int i3 = zmVar.label;
        try {
            if (i3 == 0) {
                jzb.q(obj);
                hn hnVar = new hn(x16Var, l26Var, null);
                zmVar.label = 1;
                Object objO = jgb.O(hnVar, zmVar);
                bw2 bw2Var = bw2.a;
                if (objO == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (pm unused) {
        }
        return wef.a;
    }

    public static final Collection P(Collection collection, a26 a26Var) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        dqd dqdVar = new dqd();
        while (!linkedList.isEmpty()) {
            Object objV0 = s72.v0(linkedList);
            dqd dqdVar2 = new dqd();
            ArrayList arrayListG = iu9.g(objV0, linkedList, a26Var, new x(28, dqdVar2));
            if (arrayListG.size() == 1 && dqdVar2.isEmpty()) {
                Object objW0 = s72.W0(arrayListG);
                objW0.getClass();
                dqdVar.add(objW0);
            } else {
                Object objS = iu9.s(arrayListG, a26Var);
                ca1 ca1Var = (ca1) a26Var.d(objS);
                for (Object obj : arrayListG) {
                    obj.getClass();
                    if (!iu9.k(ca1Var, (ca1) a26Var.d(obj))) {
                        dqdVar2.add(obj);
                    }
                }
                if (!dqdVar2.isEmpty()) {
                    dqdVar.addAll(dqdVar2);
                }
                dqdVar.add(objS);
            }
        }
        return dqdVar;
    }

    public static final Typeface Q(Typeface typeface, zq5 zq5Var, Context context) {
        ThreadLocal threadLocal = b9f.a;
        if (typeface == null) {
            return null;
        }
        if (zq5Var.a.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = b9f.a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(xq.B(zq5Var, context));
        return paint.getTypeface();
    }

    public static boolean R(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final String S(Object obj) {
        return ib8.j(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final long T(int i2, gr4 gr4Var) {
        if (gr4Var.compareTo(gr4.SECONDS) > 0) {
            return U(i2, gr4Var);
        }
        long jConvert = gr4.NANOSECONDS.a().convert(i2, gr4Var.a());
        qfc qfcVar = ar4.b;
        long j2 = jConvert << 1;
        int i3 = dr4.a;
        return j2;
    }

    public static final long U(long j2, gr4 gr4Var) {
        TimeUnit timeUnitA = gr4Var.a();
        gr4 gr4Var2 = gr4.NANOSECONDS;
        long jConvert = timeUnitA.convert(4611686018426999999L, gr4Var2.a());
        if ((-jConvert) <= j2 && j2 <= jConvert) {
            long jConvert2 = gr4Var2.a().convert(j2, gr4Var.a());
            qfc qfcVar = ar4.b;
            long j3 = jConvert2 << 1;
            int i2 = dr4.a;
            return j3;
        }
        gr4 gr4Var3 = gr4.MILLISECONDS;
        if (gr4Var.compareTo(gr4Var3) < 0) {
            return k(mh3.q(gr4Var3.a().convert(j2, gr4Var.a()), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j2);
        if (j2 < -9223372036854775807L) {
            j2 = -9223372036854775807L;
        }
        return k(af1.B(Math.abs(j2), gr4Var) * jSignum);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    public static rr5 V(m95 m95Var, int i2, rr5 rr5Var) {
        zu1 zu1VarU;
        int i3;
        int iG;
        String str;
        d0a d0aVar = new d0a(i2);
        if (m95Var.d(d0aVar.a, 0, i2, true)) {
            m95Var.k();
            int i4 = d0aVar.i();
            if (s(i4) != 1) {
                if (s(i4) == 2 && d0aVar.a() >= 7) {
                    int i5 = d0aVar.b;
                    byte[] bArr = new byte[7];
                    d0aVar.k(bArr, 0, 7);
                    d0aVar.M(i5);
                    zu1VarU = u(bArr);
                    zu1VarU.o(42);
                    if (zu1VarU.f()) {
                        i3 = 12;
                    } else {
                        i3 = 8;
                    }
                    iG = zu1VarU.g(i3) + 1;
                    if (iG > 0 && d0aVar.a() >= iG) {
                        byte[] bArr2 = new byte[iG];
                        d0aVar.k(bArr2, 0, iG);
                        str = (String) H(bArr2).e;
                        if (str == null) {
                            str = "audio/vnd.dts.hd";
                        }
                        if (Objects.equals(rr5Var.p, str)) {
                            return rr5Var;
                        }
                        qr5 qr5VarA = rr5Var.a();
                        qr5VarA.o = qv8.l(str);
                        return new rr5(qr5VarA);
                    }
                }
            } else if (d0aVar.a() >= 10) {
                byte[] bArr3 = new byte[10];
                d0aVar.k(bArr3, 0, 10);
                int iR = r(bArr3);
                if (iR > 0 && d0aVar.c >= iR + 4) {
                    d0aVar.M(iR);
                    i4 = d0aVar.i();
                    if (s(i4) == 2) {
                        int i6 = d0aVar.b;
                        byte[] bArr4 = new byte[7];
                        d0aVar.k(bArr4, 0, 7);
                        d0aVar.M(i6);
                        zu1VarU = u(bArr4);
                        zu1VarU.o(42);
                        if (zu1VarU.f()) {
                            i3 = 12;
                        } else {
                            i3 = 8;
                        }
                        iG = zu1VarU.g(i3) + 1;
                        if (iG > 0) {
                            byte[] bArr5 = new byte[iG];
                            d0aVar.k(bArr5, 0, iG);
                            str = (String) H(bArr5).e;
                            if (str == null) {
                                str = "audio/vnd.dts.hd";
                            }
                            if (Objects.equals(rr5Var.p, str)) {
                                return rr5Var;
                            }
                            qr5 qr5VarA2 = rr5Var.a();
                            qr5VarA2.o = qv8.l(str);
                            return new rr5(qr5VarA2);
                        }
                    }
                }
            }
        }
        return rr5Var;
    }

    public static final Object W(a26 a26Var, zn2 zn2Var) {
        if (zn2Var.getContext().F0(af8.E0) == null) {
            return tm7.J(zn2Var.getContext()).g0(zn2Var, a26Var);
        }
        r3.f();
        return null;
    }

    public static final void a(String str, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        str.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(1483888079);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            oy0 oy0Var = (oy0) z5c.G(job.a.b(oy0.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            long j2 = oy0Var.c.j();
            boolean zBooleanValue = ((Boolean) oy0Var.e.getValue()).booleanValue();
            boolean zI = l46Var.i(oy0Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new cy0(oy0Var, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            bzd.l(null, ((Boolean) oy0Var.f.getValue()).booleanValue(), 0L, null, null, af1.b0(25523083, new by0(oy0Var, str, j2, zBooleanValue, a26Var, x16Var), l46Var), l46Var, 1572864, 61);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, str, a26Var, x16Var, 7);
        }
    }

    public static final void b(String str, long j2, boolean z, x16 x16Var, a26 a26Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        l46Var.h0(-54526544);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.f(j2) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536) | (l46Var.i(x16Var3) ? 1048576 : 524288);
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            ym8.j(g21.J(g09.a), afc.q(R.string.auth_login_code_hint, l46Var), 0, false, x16Var3, af1.b0(384167107, new by0(str, z, j2, x16Var, x16Var2, a26Var), l46Var), l46Var, (i3 & 3670016) | 12585984, 52);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dc(str, j2, z, x16Var, a26Var, x16Var2, x16Var3, i2);
        }
    }

    public static final void c(ob5 ob5Var, j09 j09Var, l46 l46Var, int i2) {
        rp1 rp1VarP;
        ob5Var.getClass();
        l46Var.h0(-71628347);
        int i3 = (l46Var.g(ob5Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            int iOrdinal = ((e8b) l46Var.k(pr4Var)).C.ordinal();
            if (iOrdinal == 0) {
                l46Var.f0(-1785686617);
                rp1VarP = z5c.p(((e8b) l46Var.k(pr4Var)).g, 0L, l46Var, 24576, 14);
                l46Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw tec.d(-1785689226, l46Var, false);
                }
                l46Var.f0(-1785683557);
                rp1VarP = z5c.p(y72.j, ((e8b) l46Var.k(pr4Var)).r, l46Var, 24582, 12);
                l46Var.r(false);
            }
            bzd.d(j09Var, null, rp1VarP, null, null, af1.b0(2136514103, new g20(12, ob5Var), l46Var), l46Var, 196614, 26);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(ob5Var, j09Var, i2, 16);
        }
    }

    public static final long d(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : mh3.q(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j3 || j3 >= 4611686018427387903L) && (j3 ^ j2) < 0) {
            return 9223372036854759646L;
        }
        return j2;
    }

    public static final void e(long j2, ks9 ks9Var) {
        if (ks9Var == ks9.a) {
            if (kl2.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            l37.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (kl2.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            l37.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final String f(u09 u09Var, gec gecVar) {
        gecVar.getClass();
        bm3 bm3VarK = u09Var.k();
        bm3VarK.getClass();
        t99 name = u09Var.getName();
        t99 t99Var = sud.a;
        if (name == null || name.b) {
            name = sud.c;
        }
        String strC = name.c();
        if (bm3VarK instanceof kw9) {
            dx5 dx5Var = ((lw9) ((kw9) bm3VarK)).f;
            if (dx5Var.a.c()) {
                return strC;
            }
            return c5e.z(dx5Var.a.a, '.', '/') + '/' + strC;
        }
        u09 u09Var2 = bm3VarK instanceof u09 ? (u09) bm3VarK : null;
        if (u09Var2 == null) {
            s8f.k("Unexpected container: ", bm3VarK, " for ", u09Var);
            return null;
        }
        return f(u09Var2, gecVar) + '$' + strC;
    }

    public static final b00 g(b00 b00Var) {
        b00 b00VarC = b00Var.c();
        int iB = b00VarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            b00VarC.e(i2, b00Var.a(i2));
        }
        return b00VarC;
    }

    public static final e89 h(ka9 ka9Var, l46 l46Var) {
        return jzb.i(if9.m(ka9Var.b.z), null, l46Var, 48, 2);
    }

    public static boolean i() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            ff5.d();
            ff5 ff5VarD = ff5.d();
            ff5VarD.a();
            Context context = ff5VarD.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final j09 j(j09 j09Var, lo loVar, l26 l26Var) {
        return j09Var.D(new dl4(loVar, l26Var));
    }

    public static final long k(long j2) {
        long j3 = (j2 << 1) + 1;
        ar4.b.getClass();
        int i2 = dr4.a;
        return j3;
    }

    public static final String l(String str) {
        if (str == null || v4e.Q(str)) {
            return null;
        }
        return v4e.I(str, '/') ? str : str.concat("/");
    }

    public static final long m(float f2, int i2, long j2, boolean z) {
        int iH = ((z || i2 == 2 || i2 == 4 || i2 == 5) && kl2.d(j2)) ? kl2.h(j2) : Integer.MAX_VALUE;
        if (kl2.j(j2) != iH) {
            iH = mh3.o(gdc.c(f2), kl2.j(j2), iH);
        }
        return pa7.S(0, iH, 0, kl2.g(j2));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method n(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r11;
        boolean z;
        int length = methodArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            method = methodArr[i2];
            if (str.equals(method.getName()) || c5e.C(method.getName(), str.concat("-"), z2)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z3 = z2;
                    ?? r12 = z3;
                    while (r11 < length2) {
                        Class<?> cls = parameterTypes[r11];
                        int i3 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        if (af1.U(cls).equals(af1.U(cls2)) || cls.isAssignableFrom(cls2)) {
                            r11 = z3;
                            r11 = z3;
                            z = true;
                        } else {
                            r11 = z3;
                            z = false;
                        }
                        arrayList.add(Boolean.valueOf(z));
                        r12 = i3;
                        r11++;
                    }
                    r11 = z3;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i2++;
            z2 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method o(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i2++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                z67 z67VarC0 = mh3.c0(0, iCeil);
                ArrayList arrayList2 = new ArrayList(t72.u(z67VarC0, 10));
                Iterator it = z67VarC0.iterator();
                while (((y67) it).c) {
                    ((q67) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                mx mxVar = new mx(3);
                ArrayList arrayList3 = mxVar.a;
                mxVar.c(clsArr);
                mxVar.b(l46.class);
                mxVar.c(clsArr2);
                return n(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!pa7.t(method.getName(), str)) {
                        if (!c5e.C(method.getName(), str + "-", false)) {
                        }
                    }
                    return method;
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }

    public static final iy9 p(String str, Object[] objArr) {
        if (objArr.length == 0) {
            return new iy9(str, null);
        }
        Object obj = objArr.length == 0 ? null : objArr[objArr.length - 1];
        Throwable th = obj instanceof Throwable ? (Throwable) obj : null;
        int i2 = 0;
        if (th != null) {
            objArr = qd0.f0(objArr, 0, objArr.length - 1);
        }
        if (objArr.length == 0) {
            return new iy9(str, th);
        }
        StringBuilder sb = new StringBuilder((objArr.length * 8) + str.length());
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i2 + 1;
            if (i4 >= str.length() || str.charAt(i2) != '{' || str.charAt(i4) != '}' || i3 >= objArr.length) {
                sb.append(str.charAt(i2));
                i2 = i4;
            } else {
                sb.append(String.valueOf(objArr[i3]));
                i2 += 2;
                i3++;
            }
        }
        return new iy9(sb.toString(), th);
    }

    public static String q(int i2) {
        return tec.f(i2, "activity with result code: ", " indicating not RESULT_OK");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int r(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            if (z) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (z) {
            return (i3 * 16) / 14;
        }
        return i3;
    }

    public static int s(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static pa1 t(na1 na1Var) {
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = na1Var.getClass();
        try {
            Object objX = na1Var.x(la1Var);
            if (objX == null) {
                return pa1Var;
            }
            la1Var.a = objX;
            return pa1Var;
        } catch (Exception e2) {
            pa1Var.a(e2);
            return pa1Var;
        }
    }

    public static zu1 u(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zu1(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        zu1 zu1Var = new zu1(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            zu1 zu1Var2 = new zu1(bArrCopyOf, bArrCopyOf.length);
            while (zu1Var2.b() >= 16) {
                zu1Var2.o(2);
                int iG = zu1Var2.g(14) & 16383;
                int iMin = Math.min(8 - zu1Var.d, 14);
                int i4 = zu1Var.d;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = zu1Var.b;
                int i6 = zu1Var.c;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                bArr3[i6] = (byte) (b5 | ((iG >>> i7) << i5));
                int i8 = i6 + 1;
                while (true) {
                    bArr2 = zu1Var.b;
                    if (i7 > 8) {
                        bArr2[i8] = (byte) (iG >>> (i7 - 8));
                        i7 -= 8;
                        i8++;
                    }
                }
                int i9 = 8 - i7;
                byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b6;
                bArr2[i8] = (byte) (((iG & ((1 << i7) - 1)) << i9) | b6);
                zu1Var.o(14);
                zu1Var.a();
            }
        }
        zu1Var.l(bArrCopyOf, bArrCopyOf.length);
        return zu1Var;
    }

    public static int v(int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : 0;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & 4096) != 0) {
            i3++;
        }
        if ((i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public static final boolean w(QuotaUsage quotaUsage) {
        boolean z;
        quotaUsage.getClass();
        Boolean seasonalReadingUnlocked = quotaUsage.getSeasonalReadingUnlocked();
        if (seasonalReadingUnlocked != null) {
            return seasonalReadingUnlocked.booleanValue();
        }
        if (quotaUsage.getSeasonalReadingCount() <= 0) {
            SubscriptionInfo subscription = quotaUsage.getSubscription();
            if (subscription != null) {
                if (pa7.t(subscription.getPlan(), "v4")) {
                    Period period = subscription.getPeriod();
                    if ((period != null ? drb.g(period) : null) == PeriodUnit.QUARTER) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                u7e u7eVarM35getSubscriptionType = subscription.m35getSubscriptionType();
                boolean z2 = (u7eVarM35getSubscriptionType != null ? u7eVarM35getSubscriptionType.e() : null) == g7e.d;
                if (z || z2) {
                }
            }
            return false;
        }
        return true;
    }

    public static void x(String str, String str2, l46 l46Var, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodO = o(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodO != null) {
                methodO.setAccessible(true);
                if (Modifier.isStatic(methodO.getModifiers())) {
                    y(methodO, null, l46Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    y(methodO, cls.getConstructor(null).newInstance(null), l46Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + "." + str2 + " not found");
        } catch (Exception e2) {
            b1.n("PreviewLogger", tec.m("Failed to invoke Composable Method '", str, ".", str2, "'"), null);
            throw e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    public static void y(Method method, Object obj, l46 l46Var, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i2 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (pa7.t(parameterTypes[length], l46.class)) {
                    i2 = length;
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length = i3;
                }
            }
        }
        int i4 = i2 + 1;
        int iCeil = (i2 != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i2)) / 10.0d) : 1) + i4;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i2) / 31.0d) : 0) + iCeil != length2) {
            qc0.p("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            if (i5 < 0 || i5 >= i2) {
                if (i5 == i2) {
                    objValueOf = l46Var;
                } else if (i4 <= i5 && i5 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i5 || i5 >= length2) {
                        qc0.p("Unexpected index");
                        return;
                    }
                    objValueOf = 2097151;
                }
            } else if (i5 < 0 || i5 >= objArr.length) {
                switch (method.getParameterTypes()[i5].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i5];
            }
            objArr2[i5] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static boolean z(String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }
}
