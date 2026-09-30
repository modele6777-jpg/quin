package defpackage;

import ai.askquin.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.sig.r3;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.sentry.android.core.b1;
import java.io.EOFException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 implements s36, oq4, rsd, yb3, f1b, na1 {
    public static volatile ta0 e;
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static final a67 v;
    public static final a67 w;
    public static final ta0 x;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    static {
        long j = -9223372036854775807L;
        v = new a67(2, j);
        w = new a67(3, j);
        Object obj = null;
        x = new ta0(obj, obj, obj, 3);
    }

    public ta0(int i) {
        this.a = i;
        int i2 = 2;
        switch (i) {
            case 7:
                jqe jqeVar = new jqe();
                jqeVar.a = Float.NaN;
                this.c = jqeVar;
                this.d = new ih3();
                break;
            case 8:
                this.c = new ej8(16);
                long[] jArr = jec.a;
                this.d = new w79();
                this.b = new g3e(i2);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                this.d = new eu4(i2);
                break;
            case 21:
                this.c = new ssg(13);
                this.d = new ssg(13);
                this.b = new ssg(13);
                break;
            case 24:
                this.c = new w79();
                break;
            default:
                this.b = new g3e(i2);
                break;
        }
    }

    public static boolean D(qt4 qt4Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                h9f[] h9fVarArr = (h9f[]) editable.getSpans(selectionStart, iMin, h9f.class);
                if (h9fVarArr != null && h9fVarArr.length > 0) {
                    for (h9f h9fVar : h9fVarArr) {
                        int spanStart = editable.getSpanStart(h9fVar);
                        int spanEnd = editable.getSpanEnd(h9fVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    qt4Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    qt4Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static ta0 j(ta0 ta0Var, yf9 yf9Var, ste steVar, a08 a08Var, int i) {
        bv7 bv7Var = yf9Var;
        if ((i & 1) != 0) {
            bv7Var = (bv7) ta0Var.c;
        }
        if ((i & 2) != 0) {
            steVar = (ste) ta0Var.d;
        }
        if ((i & 4) != 0) {
            a08Var = (a08) ta0Var.b;
        }
        ta0Var.getClass();
        return new ta0(bv7Var, steVar, a08Var, 3);
    }

    public static boolean k(Editable editable, KeyEvent keyEvent, boolean z) {
        h9f[] h9fVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (h9fVarArr = (h9f[]) editable.getSpans(selectionStart, selectionEnd, h9f.class)) != null && h9fVarArr.length > 0) {
                for (h9f h9fVar : h9fVarArr) {
                    int spanStart = editable.getSpanStart(h9fVar);
                    int spanEnd = editable.getSpanEnd(h9fVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ta0 v(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new ta0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public View A(int i) {
        return ((RecyclerView) ((g5b) this.c).b).getChildAt(i);
    }

    @Override // defpackage.oq4
    public nq4 B(x4d x4dVar, long j, cv7 cv7Var, sn4 sn4Var, n4d n4dVar) {
        nq4 nq4Var;
        synchronized (this) {
            gv gvVar = (gv) this.b;
            if (gvVar == null) {
                gv gvVar2 = new gv(g21.f, 0L, cv7.a, 1.0f, null);
                this.b = gvVar2;
                gvVar = gvVar2;
            }
            gvVar.a = x4dVar;
            gvVar.b = j;
            gvVar.c = cv7Var;
            gvVar.d = sn4Var.getDensity();
            gvVar.e = new n4d(n4dVar.a, n4dVar.b, 0L, n4dVar.e, n4dVar.f, n4dVar.g, n4dVar.d);
            w79 w79Var = (w79) this.c;
            if (w79Var == null) {
                w79Var = new w79();
                this.c = w79Var;
            }
            nq4Var = (nq4) w79Var.g(gvVar);
            if (nq4Var == null) {
                nq4Var = new nq4(n4dVar, x4dVar.a(j, cv7Var, sn4Var));
                w79 w79Var2 = (w79) this.c;
                if (w79Var2 == null) {
                    w79Var2 = new w79();
                    this.c = w79Var2;
                }
                w79Var2.m(gv.a(gvVar), nq4Var);
            }
        }
        return nq4Var;
    }

    public int C() {
        return ((RecyclerView) ((g5b) this.c).b).getChildCount();
    }

    /* JADX WARN: Code duplicated, block: B:156:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:267:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x03b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x0142  */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109, types: [int] */
    /* JADX WARN: Type inference failed for: r0v192 */
    /* JADX WARN: Type inference failed for: r0v193 */
    /* JADX WARN: Type inference failed for: r0v194 */
    /* JADX WARN: Type inference failed for: r0v195 */
    public boolean E() {
        lv6 lv6Var;
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        IconCompat iconCompat;
        boolean z;
        int i;
        int identifier2;
        String string;
        if (((vd9) this.b).q("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.d;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strX = ((vd9) this.b).x("gcm.n.image");
        if (TextUtils.isEmpty(strX)) {
            lv6Var = null;
        } else {
            try {
                lv6Var = new lv6(new URL(strX));
            } catch (MalformedURLException unused) {
                b1.l("FirebaseMessaging", "Not downloading image, bad URL: " + strX);
                lv6Var = null;
            }
        }
        if (lv6Var != null) {
            ExecutorService executorService = (ExecutorService) this.c;
            gle gleVar = new gle();
            lv6Var.b = executorService.submit(new ny2(20, lv6Var, gleVar));
            lv6Var.c = gleVar.a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.d;
        vd9 vd9Var = (vd9) this.b;
        AtomicInteger atomicInteger = ia2.a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            b1.l("FirebaseMessaging", "Couldn't get own application info: " + e2);
        }
        Bundle bundle2 = bundle;
        String strX2 = vd9Var.x("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strX2 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strX2)) {
                    strX2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strX2)) {
                        b1.l("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strX2) == null) {
                        b1.l("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strX2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            b1.d("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strX2) == null) {
                    b1.l("FirebaseMessaging", "Notification Channel requested (" + strX2 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strX2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strX2)) {
                        b1.l("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strX2) == null) {
                        b1.l("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strX2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            b1.d("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = ia2.a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        ih9 ih9Var = new ih9(firebaseMessagingService2, strX2);
        String strU = vd9Var.u(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strU)) {
            ih9Var.e = ih9.b(strU);
        }
        String strU2 = vd9Var.u(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strU2)) {
            ih9Var.f = ih9.b(strU2);
            hh9 hh9Var = new hh9(4);
            hh9Var.c = ih9.b(strU2);
            ih9Var.e(hh9Var);
        }
        String strX3 = vd9Var.x("gcm.n.icon");
        if (TextUtils.isEmpty(strX3)) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier != 0 || !ia2.a(resources, identifier)) {
                try {
                } catch (PackageManager.NameNotFoundException e3) {
                    b1.l("FirebaseMessaging", "Couldn't get own application info: " + e3);
                }
            }
            if (identifier != 0 || !ia2.a(resources, identifier)) {
                identifier = 17301651;
            }
        } else {
            identifier = resources.getIdentifier(strX3, "drawable", packageName);
            if ((identifier == 0 || !ia2.a(resources, identifier)) && ((identifier = resources.getIdentifier(strX3, "mipmap", packageName)) == 0 || !ia2.a(resources, identifier))) {
                b1.l("FirebaseMessaging", "Icon resource " + strX3 + " not found. Notification will use default icon.");
                identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier = identifier != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier != 0) {
                    identifier = 17301651;
                } else {
                    identifier = 17301651;
                }
            }
        }
        ih9Var.v.icon = identifier;
        String strX4 = vd9Var.x("gcm.n.sound2");
        if (TextUtils.isEmpty(strX4)) {
            strX4 = vd9Var.x("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strX4)) {
            defaultUri = null;
        } else if ("default".equals(strX4) || resources.getIdentifier(strX4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strX4);
        }
        if (defaultUri != null) {
            Notification notification = ih9Var.v;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        String strX5 = vd9Var.x("gcm.n.click_action");
        if (TextUtils.isEmpty(strX5)) {
            String strX6 = vd9Var.x("gcm.n.link_android");
            if (TextUtils.isEmpty(strX6)) {
                strX6 = vd9Var.x("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strX6) ? Uri.parse(strX6) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    b1.l("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strX5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) vd9Var.b;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (vd9Var.q("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", vd9Var.D());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        ih9Var.g = activity;
        PendingIntent broadcast = !vd9Var.q("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(vd9Var.D())), 1140850688);
        if (broadcast != null) {
            ih9Var.v.deleteIntent = broadcast;
        }
        String strX7 = vd9Var.x("gcm.n.color");
        if (TextUtils.isEmpty(strX7)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strX7));
            } catch (IllegalArgumentException unused3) {
                b1.l("FirebaseMessaging", "Color is invalid: " + strX7 + ". Notification will use default color.");
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i));
                    } catch (Resources.NotFoundException unused4) {
                        b1.l("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            ih9Var.r = numValueOf.intValue();
        }
        ih9Var.c(16, !vd9Var.q("gcm.n.sticky"));
        ih9Var.m = vd9Var.q("gcm.n.local_only");
        String strX8 = vd9Var.x("gcm.n.ticker");
        if (strX8 != null) {
            ih9Var.v.tickerText = ih9.b(strX8);
        }
        Integer numS = vd9Var.s("gcm.n.notification_priority");
        if (numS == null) {
            numS = null;
        } else if (numS.intValue() < -2 || numS.intValue() > 2) {
            b1.l("FirebaseMessaging", "notificationPriority is invalid " + numS + ". Skipping setting notificationPriority.");
            numS = null;
        }
        if (numS != null) {
            ih9Var.j = numS.intValue();
        }
        Integer numS2 = vd9Var.s("gcm.n.visibility");
        if (numS2 == null) {
            numS2 = null;
        } else if (numS2.intValue() < -1 || numS2.intValue() > 1) {
            b1.l("NotificationParams", "visibility is invalid: " + numS2 + ". Skipping setting visibility.");
            numS2 = null;
        }
        if (numS2 != null) {
            ih9Var.s = numS2.intValue();
        }
        Integer numS3 = vd9Var.s("gcm.n.notification_count");
        if (numS3 == null) {
            numS3 = null;
        } else if (numS3.intValue() < 0) {
            b1.l("FirebaseMessaging", "notificationCount is invalid: " + numS3 + ". Skipping setting notificationCount.");
            numS3 = null;
        }
        if (numS3 != null) {
            ih9Var.i = numS3.intValue();
        }
        String strX9 = vd9Var.x("gcm.n.event_time");
        if (TextUtils.isEmpty(strX9)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strX9));
            } catch (NumberFormatException unused5) {
                b1.l("NotificationParams", "Couldn't parse value of " + vd9.K("gcm.n.event_time") + "(" + strX9 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            ih9Var.k = true;
            ih9Var.v.when = lValueOf.longValue();
        }
        JSONArray jSONArrayT = vd9Var.t("gcm.n.vibrate_timings");
        if (jSONArrayT == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayT.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayT.length();
                jArr = new long[length];
                for (int i2 = 0; i2 < length; i2++) {
                    jArr[i2] = jSONArrayT.optLong(i2);
                }
            } catch (NumberFormatException | JSONException unused6) {
                b1.l("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayT + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            ih9Var.v.vibrate = jArr;
        }
        JSONArray jSONArrayT2 = vd9Var.t("gcm.n.light_settings");
        if (jSONArrayT2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            try {
                if (jSONArrayT2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayT2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr[0] = color;
                iArr[1] = jSONArrayT2.optInt(1);
                iArr[2] = jSONArrayT2.optInt(2);
            } catch (IllegalArgumentException e4) {
                b1.l("NotificationParams", "LightSettings is invalid: " + jSONArrayT2 + ". " + e4.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused7) {
                b1.l("NotificationParams", "LightSettings is invalid: " + jSONArrayT2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            Notification notification2 = ih9Var.v;
            notification2.ledARGB = i3;
            notification2.ledOnMS = i4;
            notification2.ledOffMS = i5;
            notification2.flags = ((i4 == 0 || i5 == 0) ? 0 : 1) | ((-2) & notification2.flags);
        }
        boolean zQ = vd9Var.q("gcm.n.default_sound");
        ?? r0 = zQ;
        if (vd9Var.q("gcm.n.default_vibrate_timings")) {
            r0 = (zQ ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (vd9Var.q("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        Notification notification3 = ih9Var.v;
        notification3.defaults = r1;
        if ((r1 & 4) != 0) {
            notification3.flags |= 1;
        }
        String strX10 = vd9Var.x("gcm.n.tag");
        if (TextUtils.isEmpty(strX10)) {
            strX10 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strX10;
        if (lv6Var != null) {
            try {
                gfh gfhVar = lv6Var.c;
                oa7.A(gfhVar);
                Bitmap bitmap = (Bitmap) Tasks.await(gfhVar, 5L, TimeUnit.SECONDS);
                ih9Var.d(bitmap);
                gh9 gh9Var = new gh9(4);
                if (bitmap == null) {
                    iconCompat = null;
                    z = true;
                } else {
                    z = true;
                    iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                }
                gh9Var.c = iconCompat;
                gh9Var.d = null;
                gh9Var.e = z;
                ih9Var.e(gh9Var);
            } catch (InterruptedException unused8) {
                b1.l("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                lv6Var.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e5) {
                b1.l("FirebaseMessaging", "Failed to download image: " + e5.getCause());
            } catch (TimeoutException unused9) {
                b1.l("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                lv6Var.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.d).getSystemService("notification")).notify(str2, 0, ih9Var.a());
        return true;
    }

    public boolean F(CharSequence charSequence, int i, int i2, g9f g9fVar) {
        if ((g9fVar.c & 3) == 0) {
            wq3 wq3Var = (wq3) this.b;
            av8 av8VarB = g9fVar.b();
            int iB = av8VarB.b(8);
            if (iB != 0) {
                ((ByteBuffer) av8VarB.d).getShort(iB + av8VarB.a);
            }
            wq3Var.getClass();
            ThreadLocal threadLocal = wq3.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = wq3Var.a.hasGlyph(sb.toString());
            int i3 = g9fVar.c & 4;
            g9fVar.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (g9fVar.c & 3) == 2;
    }

    public void G(View view) {
        ((ArrayList) this.b).add(view);
        g5b g5bVar = (g5b) this.c;
        flb flbVarF = RecyclerView.F(view);
        if (flbVarF != null) {
            View view2 = flbVarF.a;
            RecyclerView recyclerView = (RecyclerView) g5bVar.b;
            int i = flbVarF.p;
            if (i != -1) {
                flbVarF.o = i;
            } else {
                WeakHashMap weakHashMap = nvf.a;
                flbVarF.o = view2.getImportantForAccessibility();
            }
            if (recyclerView.J()) {
                flbVarF.p = 4;
                recyclerView.F1.add(flbVarF);
            } else {
                WeakHashMap weakHashMap2 = nvf.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public void H(ac3 ac3Var, Uri uri, Map map, long j, long j2, lxa lxaVar) throws rff {
        l95 l95Var;
        rq3 rq3Var = new rq3(ac3Var, j, j2);
        this.b = rq3Var;
        if (((l95) this.d) != null) {
            return;
        }
        l95[] l95VarArrE = ((o95) this.c).e(uri, map);
        dy6 dy6VarN = jy6.n(l95VarArrE.length);
        boolean z = true;
        int i = 0;
        if (l95VarArrE.length == 1) {
            l95Var = l95VarArrE[0];
            this.d = l95Var;
        } else {
            for (l95 l95Var2 : l95VarArrE) {
                try {
                    if (l95Var2.b(rq3Var)) {
                        this.d = l95Var2;
                        rq3Var.f = 0;
                        break;
                    }
                    dy6VarN.d(l95Var2.d());
                    boolean z2 = ((l95) this.d) != null || rq3Var.d == j;
                    pa7.J(z2);
                    rq3Var.f = 0;
                } catch (EOFException unused) {
                    if (((l95) this.d) != null || rq3Var.d == j) {
                    }
                } catch (Throwable th) {
                    if (((l95) this.d) == null && rq3Var.d != j) {
                        z = false;
                    }
                    pa7.J(z);
                    rq3Var.f = 0;
                    throw th;
                }
                pa7.J(z2);
                rq3Var.f = 0;
            }
            l95 l95Var3 = (l95) this.d;
            if (l95Var3 == null) {
                String str = "None of the available extractors (" + new ue1(", ", 1).b(tq.P(jy6.p(l95VarArrE), new t51(i))) + ") could read the stream.";
                uri.getClass();
                throw new rff(str, uri, dy6VarN.g());
            }
            l95Var = l95Var3;
        }
        l95Var.f(lxaVar);
    }

    public boolean I() {
        return ((x98) this.d) != null;
    }

    public boolean J() {
        return !(((ktd) ((ssg) this.c).b).isEmpty() && ((ktd) ((ssg) this.b).b).isEmpty() && ((ktd) ((ssg) this.d).b).isEmpty());
    }

    public Object K(CharSequence charSequence, int i, int i2, int i3, boolean z, ut4 ut4Var) {
        int i4;
        char c;
        wt4 wt4Var = new wt4((dv8) ((szc) this.d).d);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zI = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zI) {
                    dv8 dv8Var = (dv8) ((dv8) wt4Var.f).a.get(iCodePointAt);
                    if (wt4Var.b == 2) {
                        if (dv8Var != null) {
                            wt4Var.f = dv8Var;
                            wt4Var.d++;
                        } else {
                            if (iCodePointAt == 65038) {
                                wt4Var.a();
                            } else if (iCodePointAt != 65039) {
                                dv8 dv8Var2 = (dv8) wt4Var.f;
                                if (dv8Var2.b != null) {
                                    if (wt4Var.d != 1) {
                                        wt4Var.g = dv8Var2;
                                        wt4Var.a();
                                    } else if (wt4Var.b()) {
                                        wt4Var.g = (dv8) wt4Var.f;
                                        wt4Var.a();
                                    } else {
                                        wt4Var.a();
                                    }
                                    c = 3;
                                } else {
                                    wt4Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (dv8Var == null) {
                        wt4Var.a();
                        c = 1;
                    } else {
                        wt4Var.b = 2;
                        wt4Var.f = dv8Var;
                        wt4Var.d = 1;
                        c = 2;
                    }
                    wt4Var.c = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && F(charSequence, i4, iCharCount, ((dv8) wt4Var.g).b)) {
                            break;
                        }
                        zI = ut4Var.i(charSequence, i4, iCharCount, ((dv8) wt4Var.g).b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (wt4Var.b == 2 && ((dv8) wt4Var.f).b != null && ((wt4Var.d > 1 || wt4Var.b()) && i5 < i3 && zI && (z || !F(charSequence, i4, iCharCount, ((dv8) wt4Var.f).b)))) {
            ut4Var.i(charSequence, i4, iCharCount, ((dv8) wt4Var.f).b);
        }
        return ut4Var.c();
    }

    public void L(mj mjVar) {
        uha uhaVar = (uha) ((HashMap) this.c).remove(mjVar);
        uhaVar.getClass();
        tr3 tr3Var = (tr3) ((ur3) this.b).n.get(uhaVar);
        if (tr3Var != null) {
            synchronized (tr3Var) {
                tr3Var.d--;
            }
        }
    }

    public u57 M(em7 em7Var, z3b z3bVar, z3b z3bVar2) {
        String value;
        em7Var.getClass();
        z3bVar2.getClass();
        StringBuilder sb = new StringBuilder(fm7.a(em7Var));
        sb.append(':');
        if (z3bVar == null || (value = z3bVar.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(z3bVar2);
        return (u57) ((ConcurrentHashMap) this.d).get(sb.toString());
    }

    public void N(String str) {
        if (str != null) {
            this.c = str;
        } else {
            r82.g("Null backendName");
        }
    }

    public void O(vl1 vl1Var) {
        ((xl1) this.b).a.c = vl1Var;
    }

    public void P(sw3 sw3Var) {
        ((xl1) this.b).a.a = sw3Var;
    }

    public void Q(cv7 cv7Var) {
        ((xl1) this.b).a.b = cv7Var;
    }

    public void R(long j) {
        ((xl1) this.b).a.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public jgf S(xmb xmbVar, tf7 tf7Var, boolean z) {
        jua juaVarE;
        szc szcVar = (szc) this.c;
        mf7 mf7Var = (mf7) szcVar.b;
        boolean z2 = tf7Var.d;
        snb snbVar = xmbVar.b;
        qnb qnbVar = snbVar instanceof qnb ? (qnb) snbVar : null;
        if (qnbVar != null) {
            Class cls = qnbVar.a;
            if (cls.equals(Void.TYPE)) {
                juaVarE = null;
            } else {
                juaVarE = al7.b(cls.getName()).e();
            }
        } else {
            juaVarE = null;
        }
        px7 px7Var = new px7(szcVar, xmbVar, true);
        if (juaVarE != null) {
            tjd tjdVarR = mf7Var.h.e.r(juaVarE);
            tt7 tt7VarY = o7c.y(tjdVarR, new j10(new h10[]{tjdVarR.getAnnotations(), px7Var}));
            tt7VarY.getClass();
            tjd tjdVar = (tjd) tt7VarY;
            return z2 ? tjdVar : rxg.E(tjdVar, tjdVar.l0(true));
        }
        tt7 tt7VarT = T(snbVar, vfh.Q(t8f.b, z2, null, 6));
        dsf dsfVar = dsf.INVARIANT;
        dsf dsfVar2 = dsf.OUT_VARIANCE;
        if (!z2) {
            return rxg.E(mf7Var.h.e.i(dsfVar, tt7VarT, px7Var), mf7Var.h.e.i(dsfVar2, tt7VarT, px7Var).l0(true));
        }
        if (z) {
            dsfVar = dsfVar2;
        }
        return mf7Var.h.e.i(dsfVar, tt7VarT, px7Var);
    }

    public tt7 T(snb snbVar, tf7 tf7Var) {
        mf7 mf7Var = (mf7) ((szc) this.c).b;
        if (snbVar instanceof qnb) {
            Class cls = ((qnb) snbVar).a;
            jua juaVarE = cls.equals(Void.TYPE) ? null : al7.b(cls.getName()).e();
            return juaVarE != null ? mf7Var.h.e.t(juaVarE) : mf7Var.h.e.x();
        }
        boolean z = false;
        if (!(snbVar instanceof hnb)) {
            if (snbVar instanceof xmb) {
                return S((xmb) snbVar, tf7Var, false);
            }
            if (snbVar instanceof vnb) {
                snb snbVarC = ((vnb) snbVar).c();
                return snbVarC != null ? T(snbVarC, tf7Var) : mf7Var.h.e.n();
            }
            if (snbVar == null) {
                return mf7Var.h.e.n();
            }
            s8f.n(snbVar, "Unsupported type: ");
            return null;
        }
        hnb hnbVar = (hnb) snbVar;
        Type type = hnbVar.a;
        if (!tf7Var.d && tf7Var.a != t8f.a) {
            z = true;
        }
        boolean zD = hnbVar.d();
        qy4 qy4Var = qy4.a;
        if (!zD && !z) {
            tjd tjdVarG = g(hnbVar, tf7Var, null);
            return tjdVarG != null ? tjdVarG : sy4.c(qy4Var, type.toString());
        }
        tjd tjdVarG2 = g(hnbVar, tf7.a(tf7Var, uf7.c, false, null, null, 61), null);
        if (tjdVarG2 == null) {
            return sy4.c(qy4Var, type.toString());
        }
        tjd tjdVarG3 = g(hnbVar, tf7.a(tf7Var, uf7.b, false, null, null, 61), tjdVarG2);
        if (tjdVarG3 == null) {
            return sy4.c(qy4Var, type.toString());
        }
        if (!zD) {
            return rxg.E(tjdVarG2, tjdVarG3);
        }
        mdb mdbVar = new mdb(tjdVarG2, tjdVarG3);
        vt7.a.b(tjdVarG2, tjdVarG3);
        return mdbVar;
    }

    public void U(View view) {
        if (((ArrayList) this.b).remove(view)) {
            g5b g5bVar = (g5b) this.c;
            flb flbVarF = RecyclerView.F(view);
            if (flbVarF != null) {
                RecyclerView recyclerView = (RecyclerView) g5bVar.b;
                int i = flbVarF.o;
                if (recyclerView.J()) {
                    flbVarF.p = i;
                    recyclerView.F1.add(flbVarF);
                } else {
                    View view2 = flbVarF.a;
                    WeakHashMap weakHashMap = nvf.a;
                    view2.setImportantForAccessibility(i);
                }
                flbVarF.o = 0;
            }
        }
    }

    @Override // defpackage.s36
    public void a(Object obj) {
        bm8.N(true, (m88) this.c, (la1) this.d, g94.a());
    }

    public void b(LayoutNode layoutNode, cb7 cb7Var) {
        ssg ssgVar = (ssg) this.c;
        ssg ssgVar2 = (ssg) this.d;
        ssg ssgVar3 = (ssg) this.b;
        int iOrdinal = cb7Var.ordinal();
        if (iOrdinal == 0) {
            ssgVar.D(layoutNode);
            ssgVar3.D(layoutNode);
            return;
        }
        if (iOrdinal == 1) {
            ssgVar2.D(layoutNode);
            ssgVar3.D(layoutNode);
            return;
        }
        if (iOrdinal == 2) {
            if (layoutNode.w != null) {
                ssgVar3.D(layoutNode);
                return;
            } else {
                ssgVar.D(layoutNode);
                return;
            }
        }
        if (iOrdinal != 3) {
            ap.c();
        } else if (layoutNode.w != null) {
            ssgVar3.D(layoutNode);
        } else {
            ssgVar2.D(layoutNode);
        }
    }

    public void c(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((g5b) this.c).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : y(i);
        ((zy1) this.d).v(childCount, z);
        if (z) {
            G(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.F(view);
    }

    public void d(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((g5b) this.c).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : y(i);
        ((zy1) this.d).v(childCount, z);
        if (z) {
            G(view);
        }
        flb flbVarF = RecyclerView.F(view);
        if (flbVarF != null) {
            if (!flbVarF.i() && !flbVarF.n()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(flbVarF);
                qc0.l(sb, recyclerView.w());
                return;
            }
            flbVarF.i &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // defpackage.rsd
    public mtd e() {
        return (yhb) this.d;
    }

    public qq0 f() {
        String strConcat = ((String) this.c) == null ? " backendName" : "";
        if (((lua) this.b) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new qq0((String) this.c, (byte[]) this.d, (lua) this.b);
        }
        qc0.p("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [j7f] */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    public tjd g(hnb hnbVar, tf7 tf7Var, tjd tjdVar) {
        e7f e7fVarR;
        szc szcVar;
        e7f e7fVar;
        tjd tjdVar2;
        j7f j7fVarH;
        j7f j7fVar;
        Iterator it;
        List list;
        int i;
        d7f dzdVar;
        szc szcVar2;
        Object next;
        List listJ1;
        ta0 ta0Var;
        j7f j7fVar2;
        i8f i8fVarM;
        u09 u09VarJ;
        dsf dsfVarX;
        ta0 ta0Var2 = this;
        hnb hnbVar2 = hnbVar;
        tf7 tf7Var2 = tf7Var;
        t8f t8fVar = tf7Var2.a;
        uf7 uf7Var = tf7Var2.b;
        boolean z = tf7Var2.d;
        szc szcVar3 = (szc) ta0Var2.c;
        mf7 mf7Var = (mf7) szcVar3.b;
        if (tjdVar == null || (e7fVarR = tjdVar.a0()) == null) {
            e7fVarR = jzb.r(new px7(szcVar3, hnbVar2, false));
        }
        xd7 xd7Var = hnbVar2.b;
        boolean z2 = xd7Var instanceof enb;
        dsf dsfVar = dsf.OUT_VARIANCE;
        t8f t8fVar2 = t8f.a;
        int i2 = 0;
        uf7 uf7Var2 = uf7.c;
        if (z2) {
            enb enbVar = (enb) xd7Var;
            tjdVar2 = null;
            dx5 dx5VarC = enbVar.c();
            if (dx5VarC == null) {
                throw new AssertionError("Class type should have a FQ name: " + xd7Var);
            }
            if (z && dx5VarC.equals(zf7.a)) {
                pob pobVar = mf7Var.i;
                wn7 wn7Var = pob.d[0];
                wn7Var.getClass();
                t99 t99VarE = t99.e(ym8.s(wn7Var.getName()));
                e7fVar = e7fVarR;
                szcVar = szcVar3;
                y22 y22VarE = ((dr8) pobVar.b.getValue()).e(t99VarE, lf9.b);
                u09 u09Var = y22VarE instanceof u09 ? (u09) y22VarE : null;
                u09VarJ = u09Var == null ? pobVar.a.J(new j22(tyd.i, t99VarE), t72.H(1)) : u09Var;
            } else {
                szcVar = szcVar3;
                e7fVar = e7fVarR;
                xr7 xr7Var = mf7Var.h.e;
                xr7Var.getClass();
                j22 j22VarG = qf7.g(dx5VarC);
                u09VarJ = j22VarG != null ? xr7Var.j(j22VarG.a()) : null;
                if (u09VarJ == null) {
                    u09VarJ = null;
                } else if (qf7.k.containsKey(oz3.f(u09VarJ))) {
                    if (uf7Var == uf7Var2 || t8fVar == t8fVar2) {
                        u09VarJ = af8.n(u09VarJ);
                    } else {
                        snb snbVar = (snb) s72.H0(hnbVar2.c());
                        vnb vnbVar = snbVar instanceof vnb ? (vnb) snbVar : null;
                        if (vnbVar != null && vnbVar.c() != null) {
                            Type[] upperBounds = vnbVar.a.getUpperBounds();
                            upperBounds.getClass();
                            if (pa7.t(qd0.m0(upperBounds), Object.class)) {
                                ex5 ex5VarF = oz3.f(u09VarJ);
                                String str = qf7.a;
                                dx5 dx5VarI = qf7.i(ex5VarF);
                                if (dx5VarI == null) {
                                    r3.m(u09VarJ, " is not a read-only collection", "Given class ");
                                    return null;
                                }
                                List parameters = qz3.e(u09VarJ).j(dx5VarI).h().getParameters();
                                parameters.getClass();
                                c8f c8fVar = (c8f) s72.H0(parameters);
                                if (c8fVar != null && (dsfVarX = c8fVar.x()) != null && dsfVarX != dsfVar) {
                                    u09VarJ = af8.n(u09VarJ);
                                }
                            }
                        }
                    }
                }
            }
            if (u09VarJ == null) {
                vd9 vd9Var = (vd9) mf7Var.f.a;
                if (vd9Var == null) {
                    pa7.g0("resolver");
                    throw null;
                }
                u09VarJ = vd9Var.E(enbVar);
            }
            if (u09VarJ == null || (j7fVarH = u09VarJ.h()) == null) {
                throw new UnsupportedOperationException("Type not found: " + hnbVar2.a);
            }
        } else {
            szcVar = szcVar3;
            e7fVar = e7fVarR;
            tjdVar2 = null;
            if (!(xd7Var instanceof tnb)) {
                yg5.r(xd7Var, "Unknown classifier kind: ");
                return null;
            }
            c8f c8fVarI = ((f8f) ta0Var2.d).i((tnb) xd7Var);
            j7fVarH = c8fVarI != null ? c8fVarI.h() : null;
        }
        if (j7fVarH == null) {
            return tjdVar2;
        }
        boolean z3 = (uf7Var == uf7Var2 || z || t8fVar == t8fVar2) ? false : true;
        if (pa7.t(tjdVar != null ? tjdVar.c0() : tjdVar2, j7fVarH) && !hnbVar2.d() && z3) {
            return tjdVar.l0(true);
        }
        boolean z4 = true;
        if (!hnbVar2.d()) {
            if (hnbVar2.c().isEmpty()) {
                List parameters2 = j7fVarH.getParameters();
                parameters2.getClass();
                if (parameters2.isEmpty()) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        }
        List<c8f> parameters3 = j7fVarH.getParameters();
        parameters3.getClass();
        if (z4) {
            ArrayList arrayList = new ArrayList(t72.u(parameters3, 10));
            for (c8f c8fVar2 : parameters3) {
                if (o7c.t(c8fVar2, tjdVar2, tf7Var2.e)) {
                    i8fVarM = w8f.l(c8fVar2, tf7Var2);
                    j7fVar2 = j7fVarH;
                    ta0Var = ta0Var2;
                } else {
                    j7f j7fVar3 = j7fVarH;
                    ta0Var = ta0Var2;
                    j7fVar2 = j7fVar3;
                    i8fVarM = jy4.m(c8fVar2, tf7.a(tf7Var, null, hnbVar.d(), null, null, 59), (vea) ta0Var.b, new c28(mf7Var.a, new yf7(ta0Var2, c8fVar2, tf7Var, j7fVar3, hnbVar2)));
                }
                arrayList.add(i8fVarM);
                hnbVar2 = hnbVar;
                tf7Var2 = tf7Var;
                ta0Var2 = ta0Var;
                j7fVarH = j7fVar2;
                tjdVar2 = null;
            }
            j7fVar = j7fVarH;
            listJ1 = arrayList;
        } else {
            j7fVar = j7fVarH;
            if (parameters3.size() != hnbVar.c().size()) {
                ArrayList arrayList2 = new ArrayList(t72.u(parameters3, 10));
                Iterator it2 = parameters3.iterator();
                while (it2.hasNext()) {
                    String strB = ((c8f) it2.next()).getName().b();
                    strB.getClass();
                    arrayList2.add(new dzd(sy4.c(qy4.F0, strB)));
                }
                listJ1 = s72.j1(arrayList2);
            } else {
                sd0 sd0VarQ1 = s72.q1(hnbVar.c());
                ArrayList arrayList3 = new ArrayList(t72.u(sd0VarQ1, 10));
                Iterator it3 = sd0VarQ1.iterator();
                while (true) {
                    iq4 iq4Var = (iq4) it3;
                    if (iq4Var.b.hasNext()) {
                        n17 n17Var = (n17) iq4Var.next();
                        int i3 = n17Var.a;
                        snb snbVar2 = (snb) n17Var.b;
                        parameters3.size();
                        c8f c8fVar3 = (c8f) parameters3.get(i3);
                        t8f t8fVar3 = t8f.b;
                        tf7 tf7VarQ = vfh.Q(t8fVar3, i2, null, 7);
                        c8fVar3.getClass();
                        boolean z5 = snbVar2 instanceof vnb;
                        dsf dsfVar2 = dsf.INVARIANT;
                        if (z5) {
                            vnb vnbVar2 = (vnb) snbVar2;
                            snb snbVarC = vnbVar2.c();
                            Type[] upperBounds2 = vnbVar2.a.getUpperBounds();
                            upperBounds2.getClass();
                            dsf dsfVar3 = !pa7.t(qd0.m0(upperBounds2), Object.class) ? dsfVar : dsf.IN_VARIANCE;
                            if (snbVarC == null || !(c8fVar3.x() == dsfVar2 || dsfVar3 == c8fVar3.x())) {
                                it = it3;
                                list = parameters3;
                                szcVar2 = szcVar;
                                i = 0;
                                dzdVar = w8f.l(c8fVar3, tf7VarQ);
                            } else {
                                if (vnbVar2.c() == null) {
                                    qc0.j("Nullability annotations on unbounded wildcards aren't supported");
                                    return null;
                                }
                                szcVar2 = szcVar;
                                Iterator it4 = new px7(szcVar2, vnbVar2, false).iterator();
                                while (true) {
                                    ue5 ue5Var = (ue5) it4;
                                    if (!ue5Var.hasNext()) {
                                        it = it3;
                                        list = parameters3;
                                        next = null;
                                        break;
                                    }
                                    next = ue5Var.next();
                                    u00 u00Var = (u00) next;
                                    it = it3;
                                    dx5[] dx5VarArr = jf7.b;
                                    list = parameters3;
                                    int length = dx5VarArr.length;
                                    int i4 = 0;
                                    while (i4 < length) {
                                        int i5 = i4;
                                        int i6 = length;
                                        if (pa7.t(u00Var.f(), dx5VarArr[i5])) {
                                            break;
                                        }
                                        i4 = i5 + 1;
                                        length = i6;
                                    }
                                    it3 = it;
                                    parameters3 = list;
                                }
                                u00 u00Var2 = (u00) next;
                                i = 0;
                                tt7 tt7VarT = ta0Var2.T(snbVarC, vfh.Q(t8fVar3, false, null, 7));
                                if (u00Var2 != null) {
                                    ArrayList arrayListP0 = s72.P0(tt7VarT.getAnnotations(), u00Var2);
                                    tt7VarT = o7c.y(tt7VarT, arrayListP0.isEmpty() ? hj6.c : new j10(i, arrayListP0));
                                }
                                dzdVar = o7c.m(tt7VarT, dsfVar3, c8fVar3);
                            }
                            szcVar = szcVar2;
                        } else {
                            it = it3;
                            list = parameters3;
                            i = 0;
                            dzdVar = new dzd(ta0Var2.T(snbVar2, tf7VarQ), dsfVar2);
                        }
                        arrayList3.add(dzdVar);
                        it3 = it;
                        i2 = i;
                        parameters3 = list;
                    } else {
                        listJ1 = s72.j1(arrayList3);
                    }
                }
            }
        }
        return rxg.T(e7fVar, j7fVar, listJ1, z3);
    }

    @Override // defpackage.h1b
    public Object get() {
        Context context = (Context) ((ze) this.c).a;
        pv2 pv2Var = (pv2) ((f1b) this.d).get();
        k0d k0dVar = (k0d) ((f1b) this.b).get();
        context.getClass();
        pv2Var.getClass();
        k0dVar.getClass();
        int i = 24;
        return hj6.q(k0dVar, new vrb(0, new ot1(i, k0dVar)), jgb.k(pv2Var), new u8(context, i));
    }

    public boolean h(LayoutNode layoutNode) {
        return !(layoutNode.w == null) && (((ktd) ((ssg) this.c).b).contains(layoutNode) || ((ktd) ((ssg) this.d).b).contains(layoutNode));
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
        boolean z = th instanceof CancellationException;
        la1 la1Var = (la1) this.d;
        if (z) {
            ok8.o(null, la1Var.d(new uae(((String) this.b).concat(" cancelled."), th)));
        } else {
            la1Var.b(null);
        }
    }

    public void l(int i) {
        flb flbVarF;
        int iY = y(i);
        ((zy1) this.d).w(iY);
        RecyclerView recyclerView = (RecyclerView) ((g5b) this.c).b;
        View childAt = recyclerView.getChildAt(iY);
        if (childAt != null && (flbVarF = RecyclerView.F(childAt)) != null) {
            if (flbVarF.i() && !flbVarF.n()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(flbVarF);
                qc0.l(sb, recyclerView.w());
                return;
            }
            flbVarF.a(256);
        }
        recyclerView.detachViewFromParent(iY);
    }

    @Override // defpackage.yb3
    public ac3 l0() {
        yb3 yb3Var = (yb3) this.b;
        ac3 ac3VarL0 = yb3Var != null ? yb3Var.l0() : null;
        yid yidVar = (yid) this.c;
        yidVar.getClass();
        return new f81(yidVar, ac3VarL0, ((eu4) this.d).l0(), ac3VarL0 != null ? new e81(yidVar) : null);
    }

    public void m(Bundle bundle) {
        HashSet hashSet = (HashSet) this.d;
        String string = ((Context) this.b).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (c37.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    o((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new zzd(e2);
            }
        }
    }

    public Object n(Class cls) {
        Object objO;
        synchronized (f) {
            try {
                objO = ((HashMap) this.c).get(cls);
                if (objO == null) {
                    objO = o(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objO;
    }

    public Object o(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.c;
        if (xdc.r()) {
            try {
                Trace.beginSection(xdc.v(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                c37 c37Var = (c37) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = c37Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            o(cls2, hashSet);
                        }
                    }
                }
                objB = c37Var.b((Context) this.b);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new zzd(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public vl1 p() {
        return ((xl1) this.b).a.c;
    }

    public View q(int i) {
        return ((RecyclerView) ((g5b) this.c).b).getChildAt(y(i));
    }

    public int r() {
        return ((RecyclerView) ((g5b) this.c).b).getChildCount() - ((ArrayList) this.b).size();
    }

    @Override // defpackage.rsd
    public wkd r0() {
        return (xhb) this.b;
    }

    public sd8 s() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((g3e) this.b)) {
            try {
                sd8 sd8Var = (sd8) this.d;
                if (sd8Var != null && localeList == ((LocaleList) this.c)) {
                    return sd8Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new rd8(localeList.get(i)));
                }
                sd8 sd8Var2 = new sd8(arrayList);
                this.c = localeList;
                this.d = sd8Var2;
                return sd8Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long t() {
        rq3 rq3Var = (rq3) this.b;
        if (rq3Var != null) {
            return rq3Var.d;
        }
        return -1L;
    }

    public String toString() {
        switch (this.a) {
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ((zy1) this.d).toString() + ", hidden list:" + ((ArrayList) this.b).size();
            default:
                return super.toString();
        }
    }

    public sw3 u() {
        return ((xl1) this.b).a.a;
    }

    public cv7 w() {
        return ((xl1) this.b).a.b;
    }

    @Override // defpackage.na1
    public Object x(la1 la1Var) {
        la1Var.a(new wwg(13, this), g94.a());
        ((zg6) this.b).a.set(la1Var);
        return "HandlerScheduledFuture-" + ((Callable) this.d).toString();
    }

    public int y(int i) {
        zy1 zy1Var = (zy1) this.d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((g5b) this.c).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iS = i - (i2 - zy1Var.s(i2));
            if (iS == 0) {
                while (zy1Var.u(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iS;
        }
        return -1;
    }

    public long z() {
        return ((xl1) this.b).a.d;
    }

    public /* synthetic */ ta0(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ ta0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ta0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ta0(Drawable.Callback callback, Map map) {
        this.a = 1;
        if (TextUtils.isEmpty(null)) {
            this.c = null;
            this.d = map;
            if (!(callback instanceof View)) {
                this.b = null;
                return;
            } else {
                this.b = ((View) callback).getContext().getApplicationContext();
                return;
            }
        }
        throw null;
    }

    public /* synthetic */ ta0(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public ta0(szc szcVar) {
        this.a = 11;
        this.c = szcVar;
        this.d = bzd.o((at3) szcVar.d);
        this.b = bzd.n((zs3) szcVar.e);
    }

    public ta0(hr7 hr7Var) {
        this.a = 28;
        this.c = hr7Var;
        this.d = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }

    public ta0(szc szcVar, f8f f8fVar) {
        this.a = 29;
        f8fVar.getClass();
        this.c = szcVar;
        this.d = f8fVar;
        this.b = new vea(new jy4(21));
    }

    public ta0(g5b g5bVar) {
        this.a = 16;
        this.c = g5bVar;
        this.d = new zy1(0);
        this.b = new ArrayList();
    }

    public ta0(FirebaseMessagingService firebaseMessagingService, vd9 vd9Var, ExecutorService executorService) {
        this.a = 22;
        this.c = executorService;
        this.d = firebaseMessagingService;
        this.b = vd9Var;
    }

    public ta0(View view) {
        this.a = 27;
        this.c = view;
        this.d = eb3.N(z18.c, new zv6(1, this));
        this.b = new ysd(view);
    }

    public ta0(xl1 xl1Var) {
        this.a = 14;
        this.b = xl1Var;
        this.c = new vd9(9, this);
    }

    public ta0(Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
        this.d = new HashSet();
        this.c = new HashMap();
    }

    public ta0(szc szcVar, m8c m8cVar, wq3 wq3Var, Set set) {
        this.a = 23;
        this.c = m8cVar;
        this.d = szcVar;
        this.b = wq3Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            K(str, 0, str.length(), 1, true, new rch(str, 1));
        }
    }

    public ta0(ak0[] ak0VarArr) {
        this.a = 19;
        tid tidVar = new tid();
        tidVar.m = 0;
        tidVar.o = 0;
        tidVar.p = 0;
        byte[] bArr = pqf.b;
        tidVar.n = bArr;
        tidVar.q = bArr;
        jtd jtdVar = new jtd();
        jtdVar.b = 1.0f;
        jtdVar.c = 1.0f;
        wj0 wj0Var = wj0.e;
        jtdVar.d = wj0Var;
        jtdVar.e = wj0Var;
        jtdVar.f = wj0Var;
        jtdVar.g = wj0Var;
        ByteBuffer byteBuffer = ak0.a;
        jtdVar.j = byteBuffer;
        jtdVar.k = byteBuffer;
        ak0[] ak0VarArr2 = new ak0[ak0VarArr.length + 2];
        this.c = ak0VarArr2;
        System.arraycopy(ak0VarArr, 0, ak0VarArr2, 0, ak0VarArr.length);
        this.d = tidVar;
        this.b = jtdVar;
        ak0VarArr2[ak0VarArr.length] = tidVar;
        ak0VarArr2[ak0VarArr.length + 1] = jtdVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ta0(String str) {
        this.a = 2;
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = pqf.a;
        this(2, new f39(Executors.newSingleThreadExecutor(new hh2(strConcat, 1)), new ho7(5), 1));
    }

    public ta0(x16 x16Var, s84 s84Var, dd2 dd2Var) {
        this.a = 10;
        this.c = x16Var;
        this.d = s84Var;
        this.b = dd2Var;
    }

    public ta0(ur3 ur3Var, uha uhaVar) {
        this.a = 20;
        this.b = ur3Var;
        this.c = new HashMap();
        this.d = uhaVar;
    }
}
